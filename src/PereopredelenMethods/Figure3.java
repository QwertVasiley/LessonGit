package PereopredelenMethods;

public class Figure3 extends FigureNoName{
//    private double param1;
//    private double param2;

    public Figure3(double param1, double param2) {
        super(param1,param2);
    }
    public double PrintArea (){
        System.out.println("Деление параметров ");
        return param1/param2;
    }
}
