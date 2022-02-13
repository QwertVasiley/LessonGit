package Lesson_11;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//создаёт TXT с написанным текстом
public class TestReadTxt {
    public static void main (String[] args ) throws Exception { //Обязательно дописать "throws Exception"
        FileWriter nFile = new FileWriter("src/Lesson_11/file1.txt");

        nFile.write("Звонит одна пиявка другий и спрашивает: \nЯ тебя не отрываю?");
        nFile.close();


        FileReader readTxt = new FileReader("src/Lesson_11/file1.txt");
        Scanner txt = new Scanner(readTxt);
        System.out.println(txt.nextLine());
        System.out.println(txt.nextLine());
        readTxt.close();
    }
}
