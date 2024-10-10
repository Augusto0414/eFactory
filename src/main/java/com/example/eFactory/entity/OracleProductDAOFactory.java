package com.example.eFactory.entity;

public class OracleProductDAOFactory extends DAOFactory {

    @Override
    public ProductoDAO crearProductoDAO() {
        return new BDOracle();
    }
}
