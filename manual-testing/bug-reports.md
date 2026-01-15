# Reporte de Bugs – Saucedemo

## Información General
- Aplicación: Saucedemo
- URL: https://www.saucedemo.com
- Ambiente: QA / Demo
- Reportado por: QA Engineer
- Fecha: (completar)

---

## BUG-01

- **ID:** BUG-01  
- **Título:** Mensaje de error poco descriptivo al ingresar credenciales inválidas  
- **Módulo:** Login  
- **Severidad:** Media  
- **Prioridad:** Media  

### Descripción
Al ingresar credenciales inválidas, el mensaje de error mostrado no entrega información clara
al usuario sobre el motivo del fallo.

### Pasos para reproducir
1. Acceder a https://www.saucedemo.com  
2. Ingresar usuario válido  
3. Ingresar contraseña inválida  
4. Presionar botón Login  

### Resultado actual
Se muestra un mensaje de error genérico.

### Resultado esperado
El sistema debería mostrar un mensaje de error claro indicando que las credenciales son incorrectas.

---

## BUG-02

- **ID:** BUG-02  
- **Título:** No se valida campo código postal vacío durante checkout  
- **Módulo:** Checkout  
- **Severidad:** Alta  
- **Prioridad:** Alta  

### Descripción
El sistema permite avanzar en el proceso de checkout sin ingresar el código postal,
lo que podría generar inconsistencias en la información del pedido.

### Pasos para reproducir
1. Iniciar sesión con usuario válido  
2. Agregar un producto al carrito  
3. Ir al carrito y presionar Checkout  
4. Ingresar nombre y apellido  
5. Dejar campo código postal vacío  
6. Presionar Continue  

### Resultado actual
El sistema permite continuar al siguiente paso del checkout.

### Resultado esperado
El sistema debe mostrar un mensaje de validación indicando que el código postal es obligatorio.

---

## BUG-03

- **ID:** BUG-03  
- **Título:** El contador del carrito no se actualiza correctamente al remover productos  
- **Módulo:** Carrito  
- **Severidad:** Baja  
- **Prioridad:** Media  

### Descripción
Al remover un producto del carrito, el contador visual no se actualiza inmediatamente.

### Pasos para reproducir
1. Iniciar sesión  
2. Agregar dos productos al carrito  
3. Remover uno de los productos  

### Resultado actual
El contador del carrito mantiene el número anterior.

### Resultado esperado
El contador del carrito debe reflejar correctamente la cantidad de productos.

---

## Estado de Bugs

| ID | Estado | Comentarios |
|----|-------|-------------|
| BUG-01 | Abierto | Pendiente de mejora UX |
| BUG-02 | Abierto | Validación requerida |
| BUG-03 | Abierto | Error visual |
