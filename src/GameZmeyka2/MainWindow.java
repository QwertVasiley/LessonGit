package GameZmeyka2;


import GameZmeyka.GameField;

import javax.swing.*;

public class MainWindow extends JFrame {
    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();
    }

    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //выходит из программы при закрытиии окна
        setSize(336, 359); //размер окна
        setLocation(400, 200); //место положения окна
        setResizable(false); //что бы окно не растягивалось
        add(new GameField()); //запускаем конструктор
        setVisible(true); //видимое окно
    }
}