package Task1;

public class Main {
    // 0 - статус OFF
    // 1 - статус ON
    // 2 - статус Restart
    public static void main(String[] args) {
        Mode mode = new Mode(2);
        mode.status();
    }
}