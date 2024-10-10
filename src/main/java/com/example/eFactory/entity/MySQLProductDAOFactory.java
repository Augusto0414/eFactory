package com.example.eFactory.entity;

public class MySQLProductDAOFactory  extends DAOFactory {
    @Override
    public ProductoDAO crearProductoDAO() {
        return new BDMySQL();
    }
}
