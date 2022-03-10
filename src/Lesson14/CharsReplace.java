package Lesson14;

public class CharsReplace {
    public static void main(String[] args) {

        // Необходимо заменить все точки на запятые

        String text = "Green. red. blue. yellow";
        String newText = replaceChar(text);
        printNewText(newText);

    }

    static String replaceChar(String line) { return line.replace('.', ','); }

    static void printNewText(String text) {
        System.out.println(text);
    }
}

