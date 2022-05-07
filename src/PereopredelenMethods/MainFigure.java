package PereopredelenMethods;

public class MainFigure {
    public static void main(String[] args) {
        FigureNoName [] figureNoNames = new FigureNoName[4];
        figureNoNames [0] = new Figure1(5,3);
        figureNoNames [1] = new Figure2(10,20);
        figureNoNames [2] = new FigureNoName(30,10);
        figureNoNames [3] = new Figure3(40,3);

        for (FigureNoName figureNoName: figureNoNames) {
            System.out.println(figureNoName.PrintArea());
        }
    }
}
