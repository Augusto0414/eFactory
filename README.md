# API de Productos

Esta API permite gestionar productos en una base de datos. A continuación se detallan los endpoints disponibles y la estructura de los datos.

## Estructura del Producto

Cada producto tiene la siguiente estructura:

```json
{
  "id": 1,
  "description": "Laptop",
  "price": 799,
  "dbType": "Oracle"
}
```

## Endpoints

### 1. Agregar un Producto

Para agregar un nuevo producto, utiliza el siguiente endpoint:

```
POST http://localhost:8080/products/add
```

**Ejemplo de solicitud:**

```json
{
  "id": 1,
  "description": "Laptop",
  "price": 799,
  "dbType": "Oracle"
}
```

### 2. Obtener Todos los Productos

Para obtener todos los productos de un tipo específico de base de datos, utiliza el siguiente endpoint:

```
GET http://localhost:8080/products/all?dbType=Oracle
```

**Ejemplo de respuesta:**

```json
[
  {
    "id": 1,
    "description": "Laptop",
    "price": 799,
    "dbType": "Oracle"
  },
  {
    "id": 2,
    "description": "Smartphone",
    "price": 499,
    "dbType": "Oracle"
  }
]
```

## Notas

- Asegúrate de que el servidor esté en funcionamiento antes de realizar las solicitudes.
- Los datos deben ser enviados en formato JSON al agregar un producto.
- Puedes cambiar el valor de `dbType` en la consulta para obtener productos de diferentes bases de datos.
