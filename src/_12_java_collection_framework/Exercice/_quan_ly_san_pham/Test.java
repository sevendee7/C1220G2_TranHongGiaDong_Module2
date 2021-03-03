package _12_java_collection_framework.Exercice._quan_ly_san_pham;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ProductManager item1 = new ProductManager("Iphone7", "002", 399.99);
        ProductManager item2 = new ProductManager("Iphone8", "001", 599.99);
        ProductManager item3 = new ProductManager("IphoneX", "004", 799.99);
        List<ProductManager> productList = new ArrayList<>();
        productList.add(item1);
        productList.add(item2);
        productList.add(item3);

        System.out.println("Choose function:" +
                "\n1. Add new product" +
                "\n2. Edit product's information by id number" +
                "\n3. Delete product by id number" +
                "\n4. Display product list" +
                "\n5. Search product by name" +
                "\n6. Sort product by ascending/decreasing by product's price");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                productList.get(0).addProduct(productList);
                break;
            case 2:
                boolean isEditable = false;
                System.out.println("Enter id number of product you want to edit: ");
                String idNumber = scan.next();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getProductId().equals(idNumber)) {
                        productList.get(i).editInformationById(i, productList);
                        isEditable = true;
                        break;
                    }
                }
                if (!isEditable) {
                    System.out.println("Product not found !");
                }
                break;
            case 3:
                System.out.println("Enter id number of product you want to delete: ");
                String idNumberDelete = scan.next();
                boolean isDeletable = false;
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getProductId().equals(idNumberDelete)) {
                        productList.get(i).deleteProductById(idNumberDelete, productList);
                        isDeletable = true;
                        break;
                    }
                }
                if (!isDeletable) {
                    System.out.println("Product not found ! ");
                }
                break;
            case 4:
                System.out.println("Product list:");
                for (ProductManager product : productList) {
                    System.out.println(product.toString());
                }
                break;
            case 5:
                System.out.println("Enter name of product: ");
                String searchByName = scan.next();
                boolean productIsFound = false;
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getProductName().equals(searchByName)) {
                        System.out.println(searchByName + " is found at " + (i + 1) + " in the list.");
                        for (ProductManager product : productList) {
                            System.out.println(product.toString());
                        }
                        productIsFound = true;
                        break;
                    }
                }
                if (!productIsFound) {
                    System.out.println("Product not found !");
                }
                break;
            case 6:
                System.out.println("Choose:" +
                        "\n1. Price Ascending" +
                        "\n2. Price Decresing");
                int chooseSort = scan.nextInt();
                switch (chooseSort) {
                    case 1:
                        Collections.sort(productList);
                        System.out.println("Product list after sort:");
                        for (ProductManager product : productList) {
                            System.out.println(product.toString());
                        }
                        break;
                    case 2:
                        Collections.reverse(productList);
                        System.out.println("Product list after sort:");
                        for (ProductManager product : productList) {
                            System.out.println(product.toString());
                        }
                        break;
                }
        }
    }
}