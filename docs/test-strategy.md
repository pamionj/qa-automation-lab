# Estrategia de Pruebas – QA Automation Lab (Saucedemo)

## 1. Introducción
Este documento describe la estrategia de pruebas para el proyecto QA Automation Lab.
El objetivo es definir el enfoque de testing, alcance, tipos de pruebas, herramientas
y responsabilidades para validar la funcionalidad y calidad de la aplicación web Saucedemo.

## 2. Sistema Bajo Prueba (SUT)
- Nombre de la aplicación: Saucedemo
- URL: https://www.saucedemo.com
- Tipo: Aplicación web (e-commerce demo)
- Navegadores soportados: Chrome, Firefox (enfoque principal en Chrome)

## 3. Objetivos de Pruebas
- Validar las funcionalidades principales del negocio, como inicio de sesión,
  visualización de productos, gestión del carrito y proceso de compra.
- Detectar defectos funcionales de manera temprana.
- Asegurar cobertura de regresión para flujos críticos del usuario.
- Validar respuestas de API y consistencia de datos cuando aplique.

## 4. Alcance de las Pruebas

### 4.1 Dentro del Alcance (In Scope)
- Funcionalidad de login (credenciales válidas e inválidas)
- Listado y ordenamiento de productos
- Agregar y eliminar productos del carrito
- Proceso de checkout
- Pruebas funcionales de interfaz de usuario (UI)
- Pruebas de regresión
- Pruebas de API (autenticación y obtención de datos)
- Validación básica de base de datos (con fines demostrativos)

### 4.2 Fuera del Alcance (Out of Scope)
- Pruebas de seguridad
- Pruebas cross-browser más allá de Chrome y Firefox
- Pruebas de accesibilidad
- Pruebas de rendimiento a nivel productivo

## 5. Tipos de Pruebas
- Pruebas manuales
- Pruebas funcionales
- Pruebas de regresión
- Pruebas automatizadas de UI (Selenium)
- Pruebas de API (Postman)
- Pruebas de base de datos (validaciones SQL)
- Pruebas básicas de rendimiento (exploratorias)

## 6. Enfoque de Pruebas

### 6.1 Pruebas Manuales
Los casos de prueba manuales serán diseñados a partir de los requerimientos funcionales.
Estos casos se ejecutarán antes de implementar la automatización para asegurar la estabilidad
de los escenarios.

### 6.2 Pruebas Automatizadas
- Se utilizará Selenium con Java para la automatización de la interfaz de usuario.
- Se aplicará el patrón de diseño Page Object Model (POM).
- La automatización se enfocará en escenarios estables, críticos y repetitivos.

### 6.3 Pruebas de API
Se utilizará Postman para validar servicios REST, verificando:
- Códigos de estado (status code)
- Cuerpo de la respuesta
- Tiempo de respuesta

### 6.4 Pruebas de Base de Datos
Se ejecutarán consultas SQL para validar consistencia y correcta persistencia de datos,
con fines demostrativos y académicos.

## 7. Entorno de Pruebas
- Sistema Operativo: Windows / Linux
- Navegador: Google Chrome (última versión)
- Herramientas de automatización: Selenium, Maven, JUnit/TestNG
- Herramienta de API: Postman
- IDE: VS Code / IntelliJ IDEA

## 8. Criterios de Entrada y Salida

### 8.1 Criterios de Entrada
- La aplicación debe estar accesible
- Los casos de prueba deben estar documentados y revisados
- El entorno de pruebas debe estar disponible

### 8.2 Criterios de Salida
- Todos los casos de prueba críticos ejecutados
- No existen defectos críticos abiertos
- Resultados de las pruebas documentados

## 9. Riesgos y Mitigación

| Riesgo | Mitigación |
|------|-----------|
| Inestabilidad del entorno de pruebas | Reejecutar pruebas y documentar incidencias |
| Limitaciones de la aplicación demo | Enfocarse en flujos funcionales principales |

## 10. Responsabilidades
- QA Engineer: Análisis, diseño de casos de prueba, ejecución y automatización
