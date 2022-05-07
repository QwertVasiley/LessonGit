package My_Window;
//панель игры
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Panel extends JPanel implements ActionListener {

    //создаём размер панели
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    //для отслеживания событий мышки, объявляем координаты переменной мышки
    public static int mouseX;
    public static int mouseY;

    public static enum STATES {MENUE, PLAY} //объявили перечисления
    public static STATES state = STATES.PLAY; //создали переменную STATE с помощью которой можно менять режим игры по умолчанию режим будет PLAY


    //создаем графические объекты
    private BufferedImage image; //ссылка на объект класса
    private Graphics2D g; //ссылка на объект класса


    Timer mainTimer = new Timer(30, this); // Создали таймер обновления всех событий окна GAME

    Back back = new Back();
    Player player = new Player();

    public void actionPerformed(ActionEvent e) { //сдесь будут все события игры

        if (state.equals(STATES.MENUE)) { //условие если state соответствует MENUE

        }
        if (state.equals(STATES.PLAY)) { //условие если state соответствует PLAY
            gameUpdate();
            gameRander();
            gameDraw();

        }
    }

    public Panel() {
        super(); //активируем конструктор родителя вызвав метод super()
        setFocusable(true); //передаём фокус на объект класса
        requestFocus(); // тут же ективирем фокус
        mainTimer.start(); //запускаем таймер

        image  = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB); //создаём объект буффера для ханения картинок
        g = (Graphics2D) image.getGraphics(); //графическому объекту присвоим элемент из буффера - картинка Graphics2D применив метод getGraphics()

        addMouseListener(new Listeners()); //добавляем обработчик событий клик мыши
        addKeyListener(new Listeners()); //добавляем обработчик событий клавиатуры
        addMouseMotionListener(new Listeners()); //добавляем обработчик событий перемещение мыши

    }
    public void gameRander (){ //метод для рисования отдельных объектов в виртуальном окне
        back.draw(g); // вызываем метод draw для объекта back
        player.draw(g); //вызываем метод draw для объекта Player и тем самым прорисуем его в виртуальном окне
    }
    private void gameDraw (){ //для прорисовки вертуальной картинки на панели
    Graphics g2 = this.getGraphics(); // переопределение Graphics2d на Graphics
        g2.drawImage(image, 0,0,null); // рисуем
        g2.dispose(); // команда для уборщика мусора
    }
    public void gameUpdate (){ //сдесь собираем все методы update отдельных отъектов
    player.update(); //вызвали метод для Player
    }
}
