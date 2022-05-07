package Konstruktor;

public class Box {
    int widht;
    int height;
    int depht;
    int volume;

    public Box(int w, int h, int d){
        widht = w;
        height = h;
        depht = d;

    }
    int getVolume (){
       volume = widht*height*depht;
       return  volume;
    }
}
