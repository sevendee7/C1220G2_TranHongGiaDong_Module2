package _12_java_collection_framework.Exercice._quan_ly_san_pham;

import java.util.List;
import java.util.Scanner;

public class ProductManager extends Product {
    Scanner scan = new Scanner(System.in);

    public ProductManager(String name, String id, Double price) {
        super(name, id, price);
    }

    public boolean searchProductById(String idNumber, List<ProductManager> productList) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(idNumber)) {
                return true;
            }
        }
        return false;
    }

    public void addProduct(List<ProductManager> productList) {
        System.out.println("Enter product's id number: ");
        String newIdNumber = scan.next();
        String newName = "";
        Double newPrice = 0.0;
        if (searchProductById(newIdNumber, productList)) {
            System.out.println("Product's id number duplicated. Enter another id number: ");
            newIdNumber = scan.next();
            System.out.println("Enter product's name: ");
            newName = scan.next();
            System.out.println("Enter product's price: ");
            newPrice = scan.nextDouble();
        } else {
            System.out.println("Enter product's name: ");
            newName = scan.next();
            System.out.println("Enter product's price: ");
            newPrice = scan.nextDouble();
        }
        ProductManager newProduct = new ProductManager(newName, newIdNumber, newPrice);
        productList.add(newProduct);
        System.out.println("Add successful !");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void editInformationById(int index, List<ProductManager> productList) {
        System.out.println("Choose what you want to edit:" +
                "\n1. Product's name." +
                "\n2. Product's id number." +
                "\n3. Product's price.");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter new product's name: ");
                String editName = scan.next();
                productList.get(index).setProductName(editName);
                break;
            case 2:
                System.out.println("Enter new product's id number: ");
                String editId = scan.next();
                productList.get(index).setProductId(editId);
                break;
            case 3:
                System.out.println("Enter new product's price: ");
                double editPrice = scan.nextDouble();
                productList.get(index).setProductPrice(editPrice);
                break;
        }
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void deleteProductById(String idNumber, List<ProductManager> productList) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(idNumber)) {
                productList.remove(i);
            }
        }
        System.out.println("Delete successful ! ");
        System.out.println("Product list after delete:");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
}

