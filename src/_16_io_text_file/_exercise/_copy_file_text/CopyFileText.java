package _16_io_text_file._exercise._copy_file_text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ReadAndWriteFunction readAndWrite = new ReadAndWriteFunction();
        System.out.println("Nhập đường dẫn file gốc: ");
        Scanner scanner = new Scanner(System.in);
        String sourceFilePath = scanner.nextLine();
        System.out.println("Nhập đường dẫn file cần ghi mới: ");
        String targetFilePath = scanner.nextLine();

        list = readAndWrite.readFile(sourceFilePath);
        readAndWrite.writeFile(targetFilePath, list);
    }
}
