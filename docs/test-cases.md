# Casos de Prueba – Saucedemo

## 1. Información General
- Aplicación: Saucedemo
- URL: https://www.saucedemo.com
- Tipo de pruebas: Funcionales / Regresión
- Prioridad: Alta (flujos críticos de usuario)

---

## 2. Casos de Prueba – Login

| ID | Nombre del Caso | Precondición | Pasos | Resultado Esperado | Prioridad |
|----|----------------|--------------|-------|--------------------|-----------|
| TC-LOGIN-01 | Login con credenciales válidas | Usuario registrado | 1. Ingresar usuario válido<br>2. Ingresar contraseña válida<br>3. Presionar botón Login | El usuario accede correctamente a la página de productos | Alta |
| TC-LOGIN-02 | Login con contraseña inválida | Usuario registrado | 1. Ingresar usuario válido<br>2. Ingresar contraseña inválida<br>3. Presionar Login | Se muestra mensaje de error indicando credenciales inválidas | Alta |
| TC-LOGIN-03 | Login con usuario vacío | Ninguna | 1. Dejar campo usuario vacío<br>2. Ingresar contraseña válida<br>3. Presionar Login | Se muestra mensaje de error | Media |
| TC-LOGIN-04 | Login con contraseña vacía | Ninguna | 1. Ingresar usuario válido<br>2. Dejar contraseña vacía<br>3. Presionar Login | Se muestra mensaje de error | Media |

---

## 3. Casos de Prueba – Productos

| ID | Nombre del Caso | Precondición | Pasos | Resultado Esperado | Prioridad |
|----|----------------|--------------|-------|--------------------|-----------|
| TC-PROD-01 | Visualizar lista de productos | Usuario logueado | 1. Acceder a la página de productos | Se muestra la lista de productos disponibles | Alta |
| TC-PROD-02 | Agregar producto al carrito | Usuario logueado | 1. Seleccionar un producto<br>2. Presionar "Add to cart" | El producto se agrega correctamente al carrito | Alta |
| TC-PROD-03 | Remover producto del carrito | Producto agregado al carrito | 1. Presionar "Remove" | El producto se elimina del carrito | Media |
| TC-PROD-04 | Ordenar productos por precio | Usuario logueado | 1. Seleccionar orden por precio | Los productos se ordenan correctamente | Media |

---

## 4. Casos de Prueba – Carrito

| ID | Nombre del Caso | Precondición | Pasos | Resultado Esperado | Prioridad |
|----|----------------|--------------|-------|--------------------|-----------|
| TC-CART-01 | Visualizar carrito | Usuario logueado | 1. Acceder al carrito | Se muestran los productos agregados | Alta |
| TC-CART-02 | Continuar a checkout | Producto en carrito | 1. Presionar botón Checkout | El usuario es redirigido al formulario de checkout | Alta |

---

## 5. Casos de Prueba – Checkout

| ID | Nombre del Caso | Precondición | Pasos | Resultado Esperado | Prioridad |
|----|----------------|--------------|-------|--------------------|-----------|
| TC-CHK-01 | Checkout con datos válidos | Producto en carrito | 1. Ingresar nombre<br>2. Ingresar apellido<br>3. Ingresar código postal<br>4. Continuar | Se muestra resumen de la compra | Alta |
| TC-CHK-02 | Finalizar compra | Checkout iniciado | 1. Presionar Finish | Se muestra mensaje de compra completada | Alta |

---

## 6. Casos de Prueba de Regresión
Los siguientes casos forman parte del set de pruebas de regresión:
- TC-LOGIN-01
- TC-PROD-01
- TC-PROD-02
- TC-CART-01
- TC-CHK-01
- TC-CHK-02
