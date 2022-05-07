package GameZmeyka2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 304;//размер поля
    private final int DOT_SIZE = 16;//размер одного звена или яблока
    private final int ALL_DOTS = 400;//количество возможных точек

    private Image dot;//картинка звена змейки
    private Image apple;//картинка яблока


    private int[] x = new int[ALL_DOTS];//координаты змейки
    private int[] y = new int[ALL_DOTS];

    private int appleX;//координаты яблока
    private int appleY;

    private int dots;//количество звеньев в змейке
    private Timer timer;//таймер, который определяет частоту обновления

    private boolean left = false;//булевые переменные, которые показывают куда движется змейка
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private boolean inGame = true;//переменная которая показывает что мы еще не проиграли

    private int score = 0; // добавим счетчик

    private String time;


    public void loadImage() {//подгружаем наши картинки
        ImageIcon iia = new ImageIcon("src/GameZmeyka2/Img/apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("src/GameZmeyka2/Img/dot.png");
        dot = iid.getImage();
    }

    public void createApple() {//определяем координаты яблока

        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
        for (int i = dots; i > 0; i--) {   //что бы яблоко появлялось там где нет змейки
            if (appleX == x[i] && appleY == y[i]) {
                createApple();
            }
        }
    }

    public void move() {//определяем логику движения змейки
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up) {
            y[0] += DOT_SIZE;
        }
        if (down) {
            y[0] -= DOT_SIZE;
        }
    }

    public void checkCollision() {//проверяем ситуации, когда наша змейка в проигрыше
        for (int i = dots; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > SIZE)
            inGame = false;
        if (x[0] < 0)
            inGame = false;
        if (y[0] > SIZE)
            inGame = false;
        if (y[0] < 0)
            inGame = false;
    }


    public void checkApple(){//проверяем съела ли наша змейка яблоко
        if (x[0]==appleX&&y[0]==appleY){
            dots++;
            score++;
            createApple();

        }
    }

    class FieldKeyListener extends KeyAdapter{//метод который слушает наши кнопки
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT && !right){
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left){
                right = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_UP && !down){
                down = true;
                left = false;
                right = false;
            }
            if (key == KeyEvent.VK_DOWN && !up){
                up = true;
                left = false;
                right = false;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g){//отрисовываем яблоки и змейку
        super.paintComponent(g);

        if (inGame){
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);

            }


        }else {
            String str = "GAME OVER";
            Font f = new Font("Serif",Font.PLAIN, 20); //Шрифт его размер и ЖИРНЫЙ
            g.setFont(f); //выбрал шрифт
            g.setColor(Color.RED); //выбрал цвет
            g.drawString(str, SIZE/3+16, SIZE/2); //положение надписи на игровом поле

            String sc = "Score: "+ score;
            g.setColor(Color.GREEN);
            g.drawString(sc, 6,16);
        }
    }

    public void initGame(){//инициализируем нашу игру(только при старте)
        dots = 3;
        for (int i = 0; i < dots; i++) {
            y[i] = 48;
            x[i] = 48 - i*DOT_SIZE;
        }
        timer = new Timer(220, this);
        timer.start();
        createApple();



    }

    @Override
    public void actionPerformed(ActionEvent e) {//метод который реагирует на наши изминения
        if (inGame){

            checkApple();
            checkCollision();
            move();

        }
        repaint();
    }
    public GameField(){//прописываем свойства нашего экрана

        setBackground(Color.BLACK);
        loadImage();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);  //теперь управление с клавиатуры на игровом поле

    }

}
