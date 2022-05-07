package Interfe;

public class MainPrintable {
    public static void main(String[] args) {
        Book book = new Book("Пушкин");
        Book book1 = new Book("Гоголь");
        Magazine magazine = new Magazine("Evroopt");
        Magazine magazine1 = new Magazine("Groshik");

        Printable [] prin = {book, book1, magazine, magazine1};

        for (Printable p: prin) {
            p.print();
        }
    }
}
