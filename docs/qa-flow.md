# 🧭 Flujo de Trabajo QA

Este documento describe el **flujo de trabajo de QA** aplicado en este proyecto, siguiendo prácticas comunes en equipos de desarrollo y testing en entornos reales.

---

## 1️⃣ Análisis de Requerimientos

Antes de diseñar o automatizar pruebas, se realiza un análisis funcional del sistema bajo prueba (SUT).

### Sistema bajo prueba
- Aplicación web: **SauceDemo**
- URL: https://www.saucedemo.com/

### Funcionalidad crítica analizada
- **Login de usuarios**

### Reglas identificadas
- El usuario debe autenticarse con credenciales válidas
- El sistema debe mostrar errores ante credenciales inválidas
- Usuarios bloqueados no deben acceder al sistema

---

## 2️⃣ Diseño de Casos de Prueba

A partir del análisis, se diseñan casos de prueba funcionales.

### Casos de prueba definidos

| ID | Caso de Prueba | Tipo |
|----|---------------|------|
| TC-LOGIN-001 | Login con credenciales válidas | Positivo |
| TC-LOGIN-002 | Login con credenciales inválidas | Negativo |
| TC-LOGIN-003 | Login con usuario bloqueado | Negativo |

### Criterios de validación
- Visualización correcta de elementos UI
- Mensajes de error esperados
- Acceso o bloqueo según reglas del negocio

---

## 3️⃣ Ejecución de Pruebas

Las pruebas se ejecutan mediante **automatización con Selenium WebDriver y TestNG**.

### Tipo de pruebas ejecutadas
- Pruebas funcionales
- Pruebas End-to-End (E2E)
- Pruebas de regresión (al reejecutar los tests)

### Herramientas utilizadas
- IntelliJ IDEA
- Maven
- Selenium WebDriver
- TestNG

---

## 4️⃣ Gestión y Reporte de Bugs

Cuando un caso de prueba falla, se considera un **defecto funcional**.

### Flujo de reporte simulado
1. Se identifica el fallo durante la ejecución del test
2. Se analiza el comportamiento esperado vs real
3. Se documenta el bug con:
   - Descripción clara
   - Pasos para reproducir
   - Resultado esperado
   - Resultado obtenido
   - Evidencia (si aplica)

> En un entorno real, este proceso se realiza usando herramientas como Jira, Azure DevOps o TestLink.

---

## 5️⃣ Pruebas de Regresión

Cada vez que se ejecuta la suite de pruebas:

- Se valida que funcionalidades críticas no se hayan visto afectadas
- Se asegura la estabilidad del sistema ante cambios

Las pruebas automatizadas permiten una regresión rápida y repetible.

---

## 📌 Conclusión

Este proyecto aplica el **flujo completo de QA**, desde el análisis de requerimientos hasta la ejecución de pruebas y gestión de defectos, integrando automatización como parte del proceso de aseguramiento de calidad.
