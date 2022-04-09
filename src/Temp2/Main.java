package Temp2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Scool> deti = new ArrayList<>();

        deti.add(new Scool("Slavik",7, 13));
        deti.add(new Scool("Dimon",5,12));
        deti.add(new Scool("Vovan",9,15));

        for (Object o:deti) {
            System.out.println(o);
        }
    }
}
