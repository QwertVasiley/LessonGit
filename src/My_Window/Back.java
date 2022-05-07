package My_Window;

import javax.swing.*;
import java.awt.*;

//задний фон игровой панели
public class Back {
    Image img = new ImageIcon("src/My_Window/img/fon1.jpg").getImage();

    public void draw (Graphics2D g){
        g.drawImage(img,(int)0,(int)0,null); //отрисовываем элемент в координатах
    }
}

