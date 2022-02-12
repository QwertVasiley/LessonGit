package lesson9;

public class butterfly {
    public static void main(String[] args) {
        //нарисовать бабочку
        int array[][]=new int[18][18];
        int i,j;

        for (i=0;i<array.length/2;i++){ //номер строки
            for (j=0;j<array[i].length;j++){ //номер ячейки
                if ((j<i) || (j>=(array[i].length-i)))
                    array[i][j]=0;
                else
                    array[i][j]=1;
            }
        }
        for (i=array.length-1; i>=array.length/2+1; i--){
            for (j=0; j<array[i].length; j++){
                if ((j<(array[i].length-1-i)) || (j>i))
                    array[i][j]=0;
                else
                    array[i][j]=1;}
        }



        for (i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }


}