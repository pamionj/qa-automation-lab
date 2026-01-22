# 🧪 QA Automation Lab – Selenium + Java

![CI - Selenium Tests](https://github.com/pamionj/qa-automation-lab/actions/workflows/selenium-tests.yml/badge.svg)

Proyecto de laboratorio de **QA Automation** enfocado en demostrar habilidades prácticas en pruebas automatizadas **UI (End-to-End)** utilizando **Selenium WebDriver, Java y TestNG**, aplicando buenas prácticas usadas en entornos reales de trabajo.

El sistema bajo prueba (SUT) es **SauceDemo**:  
👉 https://www.saucedemo.com/

---

## 🎯 Objetivo del proyecto

Este proyecto fue creado con fines **educativos y profesionales**, para:

- Demostrar experiencia en **automatización de pruebas funcionales**
- Aplicar el patrón **Page Object Model (POM)**
- Diseñar y ejecutar **casos de prueba positivos y negativos**
- Validar flujos críticos del sistema (login)
- Mostrar estructura, código y documentación orientada a **roles QA en empresas**
- Este proyecto aplica el **flujo completo de QA**, desde el análisis de requerimientos hasta la ejecución de pruebas y gestión de defectos, integrando automatización como parte del proceso de aseguramiento de calidad.
---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java  
- **Framework de automatización:** Selenium WebDriver  
- **Framework de testing:** TestNG  
- **Gestión de dependencias:** Maven  
- **Patrón de diseño:** Page Object Model (POM)  
- **IDE:** IntelliJ IDEA Community Edition  
- **Navegador:** Google Chrome  
- **Gestión de drivers:** WebDriverManager  

---

## 📂 Estructura del proyecto

````text
qa-automation-lab/
├── selenium-ui-tests/
│   ├── src/
│   │   ├── test/
│   │   │   └── java/
│   │   │       ├── base/
│   │   │       │   └── BaseTest.java
│   │   │       ├── pages/
│   │   │       │   ├── LoginPage.java
│   │   │       │   └── InventoryPage.java
│   │   │       └── tests/
│   │   │           └── LoginTest.java
│   ├── pom.xml
├── docs/
│   └── qa-flow.md
└── README.md
````

---

## 🧠 Diseño del framework

### 🔹 BaseTest
- Maneja la inicialización y cierre del navegador
- Contiene métodos `@BeforeMethod` y `@AfterMethod`
- Centraliza la configuración del WebDriver

### 🔹 Pages (Page Object Model)
Cada página del sistema tiene su propia clase:
- `LoginPage`: acciones y validaciones del login
- `InventoryPage`: validaciones post-login

Esto permite:
- Tests más legibles
- Menor mantenimiento
- Reutilización de código

---

## ✅ Casos de prueba automatizados

### ✔ Login exitoso
- Usuario: `standard_user`
- Valida:
  - Visualización del inventario
  - Título correcto de la página (“Products”)

### ❌ Login con credenciales inválidas
- Usuario y contraseña incorrectos
- Valida:
  - Visualización del mensaje de error
  - Texto exacto del mensaje esperado

### 🚫 Login con usuario bloqueado
- Usuario: `locked_out_user`
- Valida:
  - Mensaje de usuario bloqueado
  - Manejo correcto del error por parte del sistema

---

## ▶️ Ejecución de los tests

### Desde IntelliJ IDEA
1. Abrir el proyecto
2. Ir a `LoginTest.java`
3. Click derecho → **Run 'LoginTest'**

### Resultado esperado

Tests run: 3
Passes: 3
Failures: 0


---

## 🔐 Manejo de credenciales y variables de entorno

Este proyecto no expone credenciales en el código fuente.

Las credenciales utilizadas en los tests se obtienen mediante variables de entorno, siguiendo buenas prácticas de seguridad y automatización profesional.

Esto permite:

- Evitar hardcodear usuarios y contraseñas en el repositorio

- Ejecutar los tests en distintos entornos (local, CI, server)

- Facilitar la integración con pipelines de CI/CD

Variables de entorno requeridas

Antes de ejecutar los tests, es necesario definir las siguientes variables de entorno:

Windows (PowerShell / CMD):

````text
setx SAUCE_USERNAME "standard_user"
setx SAUCE_PASSWORD "secret_sauce"

setx SAUCE_INVALID_USERNAME "usuario_invalido"
setx SAUCE_INVALID_PASSWORD "password_invalida"

setx SAUCE_LOCKED_USERNAME "locked_out_user"
````

⚠️ Nota: después de ejecutar setx, es necesario **cerrar y volver a abrir la terminal o el IDE** para que las variables estén disponibles.

Uso en el código:

El framework obtiene estas variables mediante una utilidad centralizada **(EnvUtils)**, lo que evita dependencias directas con valores sensibles y mantiene el código limpio y escalable. Este enfoque es utilizado en entornos reales de automatización y servidores CI.

---

### ⚙️ Ejecución en servidor / CI

Este framework de automatización está diseñado para ejecutarse **tanto en entornos locales como en servidores de integración continua (CI)**.

El proyecto **no depende de configuraciones locales específicas**, ya que:

- Utiliza **variables de entorno** para credenciales y datos sensibles

- La ejecución se realiza vía **Maven**, estándar en entornos CI

- El navegador puede ejecutarse en modo **headless**

- No requiere intervención manual ni UI local

#### Ejecución por línea de comandos (server / CI)

En un entorno de servidor o pipeline CI, los tests pueden ejecutarse mediante:

````text
mvn clean test
````
Siempre que las variables de entorno requeridas estén definidas previamente en el sistema o pipeline.

**Modo Headless (recomendado para CI)**

El framework permite ejecutar los tests en modo **headless**, lo cual es el comportamiento esperado en servidores sin interfaz gráfica.

Este modo puede activarse mediante una variable de entorno o parámetro de ejecución (ejemplo):

````text
mvn clean test -Dheadless=true
````
**Preparado para CI/CD**

Gracias a esta arquitectura, el proyecto es compatible con:

- GitHub Actions

- GitLab CI

- Jenkins

- Azure DevOps

- Servidores Linux sin entorno gráfico

La integración con pipelines CI/CD puede realizarse sin cambios en el código base.

---

## ⚙️ Ejecución en CI (GitHub Actions)

Este proyecto cuenta con **Integración Continua (CI)** mediante **GitHub Actions**, lo que permite ejecutar automáticamente los tests de Selenium en cada `push` o `pull request` al repositorio.

### ¿Qué ocurre en CI?

- GitHub Actions levanta un runner Linux (`ubuntu-latest`)
- Se configura Java y Maven
- Se ejecutan los tests con `mvn clean test`
- Selenium utiliza **Chrome en modo headless**
- El pipeline falla si algún test falla

Esto permite validar el correcto funcionamiento de los tests sin necesidad de ejecutar nada localmente.

### Workflow utilizado

El workflow se encuentra en la siguiente ruta:

.github/workflows/selenium-tests.yml


### Diferencia entre ejecución local y CI

- **Local**:  
  - Chrome se abre normalmente (modo gráfico)
  - Ideal para desarrollo y debugging

- **CI (GitHub Actions)**:  
  - Chrome se ejecuta en modo **headless**
  - Detectado automáticamente mediante la variable de entorno `CI`
  - No requiere cambios manuales ni flags adicionales

### Ejecución automática

Los tests se ejecutan automáticamente cuando:
- Se realiza un `push` al repositorio
- Se abre o actualiza un `pull request`

El estado del pipeline puede revisarse en la pestaña **Actions** del repositorio.

✔ Esto asegura que el proyecto es **ejecutable en servidor / CI**  
✔ No depende de entorno local  
✔ Es apto para flujos profesionales de QA Automation

---

## 📌 Buenas prácticas aplicadas

- Page Object Model (POM)
- Tests independientes y reutilizables
- Validaciones basadas en UI real (no solo URLs)
- Uso de selectores estables (`id`, `data-test`)
- Separación clara entre lógica de test y lógica de página
- Uso de esperas explícitas con WebDriverWait para estabilidad en UI.

---

## 🚀 Próximas mejoras (roadmap)

- Ejecución con **Docker**
- Refactor **SOLID**
- Captura de **screenshots en fallos**
- Integración con **Postman para API testing**
- Reportes de ejecución

---

## 👤 Autor

**Pablo Amion**  
Ingeniería Informática | Cybersecurity, QA & Automation Enthusiast  

---

 *Este proyecto forma parte de mi portafolio personal para hacer una demostración de QA / QA Automation.*
