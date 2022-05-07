package My_Window;

import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {

        JFrame startFrame = new JFrame("GAME");  //создаём окно с названием GAME
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закрытие она при нажатии на крестик
        startFrame.setLocation(0,0); //местоположение фрейма
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //получим размер нашего экрана
        startFrame.setSize(screenSize); //установим его
        //startFrame.setSize(640,480); //установка своего размера окна
        startFrame.add(new Panel()); //запускаем конструктор класса Panel

        startFrame.setVisible(true); //окно видимое
    }
}
