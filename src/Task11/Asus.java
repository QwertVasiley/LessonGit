package Task11;

public class Asus implements Computer{

    @Override
    public void turnOff() {
        System.out.println("Comp Asus Off");
    }

    @Override
    public void turnOn() {
        System.out.println("Comp Asus On");
    }

    @Override
    public void turnReset() {
        System.out.println("Comp Asus Reset");
    }
}
