package _16_io_text_file._exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    static final String FILE_PATH = "D:\\CodeGym\\C1220G2_TranHongGiaDong_Module2\\src\\_16_io_text_file\\_exercise\\Nation.csv";

    public static void main(String[] args) {
        List<String> nationList = new ArrayList<>();
        File file = new File(FILE_PATH);
        FileReader fileReader;
        String line;
        String[] array;
        BufferedReader br = null;

            try {
                fileReader = new FileReader(file);
                br = new BufferedReader(fileReader);
                while ((line = br.readLine()) != null) {
                    array = line.split(",");
                    nationList.add(array[5] + "\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        System.out.print(nationList);
    }
}
