package com.example.eFactory.entity;

public class SimpleFactory {
    public static DAOFactory getFactory(String dbType) {
        return switch (dbType.toLowerCase()) {
            case "mysql" -> new MySQLProductDAOFactory();
            case "oracle" -> new OracleProductDAOFactory();
            default -> throw new UnsupportedOperationException("Database type not supported.");
        };
    }
}
