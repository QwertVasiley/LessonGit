package Task1;

public class Mode implements Computer {
    public int number;

    public Mode(int number) {
        this.number = number;
    }

    @Override
    public void status() {
        if (this.number == 0) {
            System.out.println("Computer status OFF");
        } else if (this.number == 1) {
            System.out.println("Computer status ON");
        } else if (this.number == 2) {
            System.out.println("Computer status Restart");
        } else {
            System.out.println("Error status computer");
        }
    }
}
