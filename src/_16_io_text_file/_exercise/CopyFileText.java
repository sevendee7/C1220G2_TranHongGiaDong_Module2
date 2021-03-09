package _16_io_text_file._exercise;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {

    public static void main(String[] args) throws IOException {
//        System.out.println("Nhập đường dẫn file gốc: ");
//        Scanner scanner = new Scanner(System.in);
//        String sourceFilePath = scanner.nextLine();
//        System.out.println("Nhập đường dẫn file cần ghi mới: ");
//        String targetFilePath = scanner.nextLine();
//
//        File file = new File(sourceFilePath);
//        Scanner scan = new Scanner(file);
//
//        String fileTargetContent = "";
//        while (scan.hasNextLine()) {
//            fileTargetContent = fileTargetContent.concat(scan.nextLine() + "\n");
//        }
//        System.out.println(fileTargetContent);
//        FileWriter writer = new FileWriter(targetFilePath);
//        writer.write(fileTargetContent);
//        writer.close();
        System.out.println("Nhập đường dẫn file gốc: ");
        Scanner scanner = new Scanner(System.in);
        String sourceFilePath = scanner.nextLine();
        System.out.println("Nhập đường dẫn file cần ghi mới: ");
        String targetFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        FileReader fileReader = new FileReader(sourceFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        File targetFile = new File(targetFilePath);
        FileWriter fileWriter = new FileWriter(targetFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
