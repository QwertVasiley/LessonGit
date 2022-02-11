package lesson9;


public class butterfly2 {
    public static void main(String[] args) {
        //Бабочка
        //  1                1
        //  12              21
        //  123            321
        //  1234          4321
        //  12345        54321
        //  123456      654321
        //  1234567    7654321
        //  12345678  87654321
        //  123456789987654321
        //  12345678  87654321
        //  1234567    7654321
        //  123456      654321
        //  12345        54321
        //  1234          4321
        //  123            321
        //  12              21
        //  1                1


        int revers = 1;
        for (int i = -8; i <= 8; i++) {
            int num = 1;
            for (int j = 1; j <= 9 - Math.abs(i); j++) {
                System.out.print(num);
                num++;
            }
            for (int j = 1; j <= 2 * Math.abs(i); j++) {
                System.out.print(" ");
            }
            int number = revers;
            for (int j = 1; j <= 9 - Math.abs(i); j++) {
                System.out.print(number);
                number--;
                if (j < 9) {
                    revers = j + 1;
                } else {
                    revers = 8;   //не выижу, как восьмерка становится девяткой
                }
            }
            System.out.println();
        }
    }
}