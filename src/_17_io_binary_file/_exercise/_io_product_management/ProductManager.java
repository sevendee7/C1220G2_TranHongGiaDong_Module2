package _17_io_binary_file._exercise._io_product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    static final String FILE_PATH = "D:\\CodeGym\\C1220G2_TranHongGiaDong_Module2\\src\\_17_io_binary_file\\_exercise\\_io_product_management\\product_list.bin";
    
    public Product addNewProduct() {
        System.out.println("Enter product's id number: ");
        String id = scanner.nextLine();
        System.out.println("Enter product's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product's brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter product's price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product's detail: ");
        String detail = scanner.nextLine();
        Product product = new Product(id, name, brand, price, detail);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        return product;
    }

    public void displayProductList(List<Product> productList) {
        System.out.println("Product List");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }

    public void searchProduct(List<Product> productList) {
        System.out.println("How you want to search " +
                "\n 1. Search by id" +
                "\n 2. Search by name" +
                "\n 3. Search by brand" +
                "\n 4. Search by price" +
                "\n Enter your choice: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Enter product's id: ");
                String productId = scanner.nextLine();
                boolean checkId = false;
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId().equals(productId)) {
                        System.out.println(productList.get(i));
                        checkId = true;
                    }
                }
                if (!checkId) {
                    System.out.println("Product not found !");
                }
                System.out.println();
                System.out.println();
                break;
            case 2:
                System.out.println("Enter product's name: ");
                String productName = scanner.nextLine();
                boolean checkName = false;
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getName().equals(productName)) {
                        System.out.println(productList.get(i));
                        checkName = true;
                    }
                }
                if (!checkName) {
                    System.out.println("Product not found !");
                }
                System.out.println();
                System.out.println();
                break;
            case 3:
                System.out.println("Enter product's brand: ");
                String productBrand = scanner.nextLine();
                boolean checkBrand = false;
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getBrand().equals(productBrand)) {
                        System.out.println(productList.get(i));
                        checkBrand = true;
                    }
                }
                if (!checkBrand) {
                    System.out.println("Product not found !");
                }
                System.out.println();
                System.out.println();
                break;
            case 4:
                System.out.println("Choose:" +
                        "\n1. Price Ascending" +
                        "\n2. Price Descending" +
                        "\nEnter your choice:");
                int chooseSort = scanner.nextInt();
                switch (chooseSort) {
                    case 1:
                        Collections.sort(productList);
                        System.out.println("Product list after sort:");
                        for (Product product : productList) {
                            System.out.println(product.toString());
                        }
                        break;
                    case 2:
                        Collections.reverse(productList);
                        System.out.println("Product list after sort:");
                        for (Product product : productList) {
                            System.out.println(product.toString());
                        }
                        break;
                }
                break;
        }
    }

    public void saveFile(List<Product> list) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Successful !");
    }
}
