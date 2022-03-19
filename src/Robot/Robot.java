package Robot;

public class Robot { //класс Robot для каких-то роботиков с указанием их координат

    private double x = 0; // начальные координаты робота
    private double y = 0;
    private double course = 0;

    void forward(int distznce) {
        x = x + distznce * Math.cos(course / 180 * Math.PI);
        y = y + distznce * Math.sin(course / 180 * Math.PI);
    }

    void printCoordinates() { //печать координат робота
        System.out.println(x + ", " + y);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
  public double getCourse(){
        return course;
  }
  public void setCourse (double course){
        this.course = course;
  }
}
