package My_Window;

import javax.swing.*;
import java.awt.*;

public class Player {
    //координаты плеера на панели
    private double x; //координата X героя
    private double y; //координата Y героя
    private double w; //ширина объекта
    private double h; //высота объекта

    private int speed; //скорость перемещения плеера

    //стстические переменные - клавиши перемещения
    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;

    Image img = new ImageIcon("src/My_Window/img/icon2.png").getImage();

    //Constructor
    public Player() {
        //начальные координаты героя
        x = 620;
        y = 500;
        //размеры кортинки героя
        w = 64;
        h = 64;

        speed = 5; //скорость еремещения героя

        //начальные значения клавиш
        up = false;
        down = false;
        left = false;
        right = false;

    }

    //геттеры для получения размера и положения
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getW() {
        return w;
    }
    public double getH() {
        return h;
    }

    public void update() { //будет определять законы движения героя по нажатию клавиш клавиатуры
        if (up && y>20){
            y -= speed;
        }
        if (down && y<Panel.HEIGHT-h){
            y += speed;
        }
        if (left && x>0){
            x -= speed;
        }
        if (right && x<Panel.WIDTH-w){
            x += speed;
        }
    }
    public void draw (Graphics2D g){
        g.drawImage(img, (int )x,(int)y,null); //сдесь рисуем картинку
    }
}
