package ReadTxt;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");
        FileReader fileReader = new FileReader(file);
        FileInputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileReader);
        String str = scanner.nextLine();
        System.out.println(str);

    }
}
