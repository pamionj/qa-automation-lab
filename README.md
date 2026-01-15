# 🧪 QA Automation Lab – Selenium + Java

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

```markdown
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

## 📌 Buenas prácticas aplicadas

- Page Object Model (POM)
- Tests independientes y reutilizables
- Validaciones basadas en UI real (no solo URLs)
- Uso de selectores estables (`id`, `data-test`)
- Separación clara entre lógica de test y lógica de página

---

## 🚀 Próximas mejoras (roadmap)

- Agregar **esperas explícitas (WebDriverWait)**
- Captura de **screenshots en fallos**
- Integración con **Postman para API testing**
- Reportes de ejecución
- Ejecución en modo **headless / CI**

---

## 👤 Autor

**Pablo Amion**  
Ingeniería Informática | Cybersecurity, QA & Automation Enthusiast  

---

 *Este proyecto forma parte de mi portafolio personal para hacer una demostración de QA / QA Automation.*
