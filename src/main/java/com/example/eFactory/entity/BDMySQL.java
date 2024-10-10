package com.example.eFactory.entity;

import java.util.ArrayList;
import java.util.List;

public class BDMySQL extends ProductoDAO{
    private static List<Producto> productos = new ArrayList<>();


    @Override
    public void create(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void update(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == producto.getId()) {
                productos.set(i, producto);
                System.out.println("Producto actualizado en MySQL: " + producto.getDescription());
                return;
            }
        }

    }

    @Override
    public void delete(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

    @Override
    public Producto search(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}
