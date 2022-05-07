package Nasledovanie;

public class Box {
    int widht; //ширина
    int height; //высота
    int depth; //глубина

    public Box() {
    }

    public Box(int widht, int height, int depth) {

        this.widht = widht;
        this.height = height;
        this.depth = depth;
    }
    public int volume (){
        int vol = widht*height*depth;
        return vol;
    }
}
