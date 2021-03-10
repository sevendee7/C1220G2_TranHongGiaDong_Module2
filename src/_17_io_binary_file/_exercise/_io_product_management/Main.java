package _17_io_binary_file._exercise._io_product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String FILE_PATH = "D:\\CodeGym\\C1220G2_TranHongGiaDong_Module2\\src\\_17_io_binary_file\\_exercise\\_io_product_management\\product_list.bin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("001","Car","Toyota",25000,"Made in Japan"));
        int choose;
        do {
            System.out.println("Main Menu" +
                    "\n 1. Add new product" +
                    "\n 2. Display product's list" +
                    "\n 3. Search product" +
                    "\n 4. Save to file" +
                    "\n 5. Exit" +
                    "\n Enter your choice: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    productList.add(productManager.addNewProduct());
                    break;
                case 2:
                    productManager.displayProductList(productList);
                    break;
                case 3:
                    productManager.searchProduct(productList);
                    break;
                case 4:
                    try {
                        FileOutputStream fos = new FileOutputStream(FILE_PATH,true);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(productList);
                        fos.close();
                        oos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Successful !");
                    choose = 5;
                    break;
                case 5:
                    break;
            }
        } while (choose != 5);
    }
}
