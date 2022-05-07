package My_Window;

import java.awt.event.*;

public class Listeners implements MouseListener, KeyListener, MouseMotionListener {

    @Override
    //проверка нажатой клавиши
    public void keyPressed (KeyEvent e){
    int key = e.getKeyCode(); // получить код нажатой клавиши

        //проверка клавиши
        if (key == KeyEvent.VK_W){ //определяем клавишу W для движения вверх
            Player.up = true;
        }
        if (key == KeyEvent.VK_S) { //для движения вниз
            Player.down = true;
        }
        if (key == KeyEvent.VK_A){ //влево
            Player.left = true;
        }
        if (key == KeyEvent.VK_D){ //в право
            Player.right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { //проверка отжатия и запрещение перемещения при отпускании клавиши
        int key = e.getKeyCode(); // получем код клавиши

        if (key == KeyEvent.VK_W){ //определяем клавишу W для вверх
            Player.up = false;
        }
        if (key == KeyEvent.VK_S) { //для вниз
            Player.down = false;
        }
        if (key == KeyEvent.VK_A){ //влево
            Player.left = false;
        }
        if (key == KeyEvent.VK_D){ //в право
            Player.right = false;
        }

    }
    @Override
    public void mouseMoved(MouseEvent e) { //метод перемещения мышки. Т.к. действия у нас происходят на панели,
        // то используем переменные для перемещения мышки по понели

        Panel.mouseX = e.getX(); // получить координату X при перемещении мышки
        Panel.mouseY = e.getY(); //получаем координату Y мышки
    }




    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }


}
