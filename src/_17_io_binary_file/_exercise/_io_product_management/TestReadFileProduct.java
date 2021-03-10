package _17_io_binary_file._exercise._io_product_management;

import java.io.*;
import java.util.List;

public class TestReadFileProduct {
    static final String FILE_PATH = "D:\\CodeGym\\C1220G2_TranHongGiaDong_Module2\\src\\_17_io_binary_file\\_exercise\\_io_product_management\\product_list.bin";

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> productList = (List<Product>) ois.readObject();
            for (Product product : productList) {
                System.out.println(product);
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
