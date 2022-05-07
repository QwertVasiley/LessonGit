package AccesLevel;

public class Modificators {
    private int num1;   //закрытый уровень доступа (виденн только внутри класса)
    public int num2;    //открытый уровень доступа (виден отовсюду)
    int num3;           // Default уровень доступа (виден внутри пакета)
    protected int num4; //виден из наследника даже из другого пакета

    public Modificators(int num1, int num2, int num3 , int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum1() {
        return num1;
    }

}
