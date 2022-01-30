package lesson5;

public class Zerkal_chislo {
    public static void main(String[] args) {
        int x = 123;
        while (x>0){
            System.out.print(x%10); //выводим остаток от деления на (смещаем запятую)
            x/=10;
        }
    }
}
