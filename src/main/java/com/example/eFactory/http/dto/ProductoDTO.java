package com.example.eFactory.http.dto;

public class ProductoDTO {
    private int id;
    private String description;
    private double price;
    private String dbType;

    public ProductoDTO(String dbType, String description, int id, double price) {
        this.dbType = dbType;
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getDbType() {
        return this.dbType;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "dbType='" + dbType + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
