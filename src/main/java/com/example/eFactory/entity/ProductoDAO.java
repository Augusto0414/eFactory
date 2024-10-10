package com.example.eFactory.entity;

import java.util.List;

public abstract class ProductoDAO {
    public abstract void create(Producto producto);
    public abstract void update(Producto producto);
    public abstract void delete(int id);
    public abstract Producto search(int id);
    public abstract List<Producto> obtenerTodosLosProductos();
}
