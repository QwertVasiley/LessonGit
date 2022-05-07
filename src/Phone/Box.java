package Phone;

public class Box {
         int widht;
         int height;
         int depht;


    void setBox (int w, int h, int d) {
        widht = w;
        height = h;
        depht = d;

    }

    int getVolume () {
        return widht * height * depht;
    }
}



