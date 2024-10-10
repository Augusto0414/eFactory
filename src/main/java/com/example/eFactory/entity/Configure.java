package com.example.eFactory.entity;

public class Configure {

    public Configure() {
    }
    public static DAOFactory configureAdapterDB(String dbType) {
        return SimpleFactory.getFactory(dbType);
    }
}
