package com.example.eFactory.controller;

import com.example.eFactory.entity.Configure;
import com.example.eFactory.entity.DAOFactory;
import com.example.eFactory.entity.Producto;
import com.example.eFactory.entity.ProductoDAO;
import com.example.eFactory.http.dto.ProductoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @PostMapping("/add")
    public String addProduct(@RequestBody ProductoDTO productRequest) {
        DAOFactory factory = Configure.configureAdapterDB(productRequest.getDbType());
        ProductoDAO productDAO = factory.crearProductoDAO();

        Producto product = new Producto(productRequest.getId(), productRequest.getDescription(), productRequest.getPrice());
        productDAO.create(product);

        return "Product added successfully to " + productRequest.getDbType() + " database!";
    }

    @GetMapping("/all")
    public List<Producto> getAllProducts(@RequestParam String dbType) {
        DAOFactory factory = Configure.configureAdapterDB(dbType);
        ProductoDAO productDAO = factory.crearProductoDAO();

        return productDAO.obtenerTodosLosProductos();
    }

    @PutMapping("/update")
    public String updateProduct(@RequestBody ProductoDTO productRequest) {
        DAOFactory factory = Configure.configureAdapterDB(productRequest.getDbType());
        ProductoDAO productDAO = factory.crearProductoDAO();

        Producto product = new Producto(productRequest.getId(), productRequest.getDescription(), productRequest.getPrice());
        productDAO.update(product);

        return "Product updated successfully in " + productRequest.getDbType() + " database!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id, @RequestParam String dbType) {
        DAOFactory factory = Configure.configureAdapterDB(dbType);
        ProductoDAO productDAO = factory.crearProductoDAO();

        productDAO.delete(id);

        return "Product with ID " + id + " deleted successfully from " + dbType + " database!";
    }

}

