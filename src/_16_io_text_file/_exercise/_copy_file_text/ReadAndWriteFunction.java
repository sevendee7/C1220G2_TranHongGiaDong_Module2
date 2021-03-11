package _16_io_text_file._exercise._copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFunction {

    public List<String> readFile(String filePath) {
        File sourceFile = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        List<String> list = new ArrayList<>();
        try {
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeFile(String filePath, List<String> list) {
        File targetFile = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(targetFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++ ) {
                bufferedWriter.write(list.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
