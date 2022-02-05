package array;

public class Lesson7_3 {
    public static void main(String[] args) {

    //сумма чисел массива

        int [] anArray = new  int[3];
        anArray[0] = 100;
        anArray [1] = 200;
        anArray [2] = 300;
        int sum = 0;
        for (int i=0; i<anArray.length ;i++) {
            sum += anArray [i];
            }
        System.out.println(sum);
    }
}
