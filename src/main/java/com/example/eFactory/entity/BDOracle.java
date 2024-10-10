package com.example.eFactory.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BDOracle extends ProductoDAO {

    private static Map<Integer, Producto> productMap = new HashMap<>();

    @Override
    public void create(Producto producto) {
        System.out.println("Agregando producto a MySQL: " + producto.getDescription());
        productMap.put(producto.getId(), producto);
    }

    @Override
    public void update(Producto producto) {
        productMap.put(producto.getId(), producto);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public Producto search(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productMap.values().stream().collect(Collectors.toList());
    }
}
