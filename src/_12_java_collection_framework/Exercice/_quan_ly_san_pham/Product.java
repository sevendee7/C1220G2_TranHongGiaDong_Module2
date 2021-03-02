package _12_java_collection_framework.Exercice._quan_ly_san_pham;

public class Product implements Comparable {
    private String productName;
    private String productId;
    private Double productPrice;

    public Product(String name, String id, Double price) {
        this.productName = name;
        this.productId = id;
        this.productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{ " + "name= " + productName +
                ", id number = " + productId +
                ", price = " + productPrice + " }";
    }

    @Override
    public int compareTo(Object o) {
        Product otherProduct = (Product) o;
        double result = this.productPrice - otherProduct.productPrice;
        if (result == 0) {
            return this.productPrice.compareTo(otherProduct.productPrice);
        }
        return (int) result;
    }
}
