package PereopredelenMethods;

public class Figure2 extends FigureNoName{
//    private double param1;
//    private double param2;

    public Figure2(double param1, double param2) {
        super(param1,param2);
    }
    public double PrintArea (){
        System.out.println("Умножение параметров");
        return param1*param2;
    }
}
