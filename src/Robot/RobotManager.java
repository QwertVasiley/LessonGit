package Robot;

public class RobotManager {
    public static void main(String[] args) {
        Robot robot = new Robot(); //создаём объект Robot
       //вперёд по X на 20 метров
        robot.forward(20);
        //вывожу новые координаты робота
        robot.printCoordinates();

        //Курс 90 градусов
        robot.setCourse(90);

        //вперёд на 20 метров
        robot.forward(20);
        //выводим координаты
        robot.printCoordinates();

        //курс 45 градусов
        robot.setCourse(45);
        //Вперёд на 20 метров
        robot.forward(20);
        //Выводим координаты
        robot.printCoordinates();

    }
}
