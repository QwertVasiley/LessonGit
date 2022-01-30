package lesson5;

public class Piramida {
    public static void main(String[] args) {
        for (int a=1; a<=8; a++){
            for (int b=1; b<=8-a; b++){
                System.out.print(" ");
            }
            for (int c=1; c<=a*2-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
