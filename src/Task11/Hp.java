package Task11;

public class Hp implements Computer {


    @Override
    public void turnOff() {
        System.out.println("Comp HP Off");
    }

    @Override
    public void turnOn() {
        System.out.println("Comp HP On");
    }

    @Override
    public void turnReset() {
        System.out.println("Comp HP Reset");
    }
}
