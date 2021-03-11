package _17_io_binary_file._exercise._io_product_management;

import java.io.Serializable;

public class Product implements Serializable, Comparable {

    private String id;
    private String name;
    private String brand;
    private Double price;
    private String detail;

    public Product(String id, String name, String brand, double price, String detail) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID: " + id +
                " , Name: " + name +
                " , Brand: " + brand +
                " , Price: " + price +
                " , Detail: " + detail +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Product otherProduct = (Product) o;
        double result = this.price - otherProduct.price;
        if (result == 0) {
            return this.price.compareTo(otherProduct.price);
        }
        return (int) result;
    }
}
