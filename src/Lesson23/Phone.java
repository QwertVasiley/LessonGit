package Lesson23;

public class Phone {
    private int numbers;
    private int weigth;
    private String model;
    private String sms;

    public Phone(int numbers, int weigth, String model) {
        this.numbers = numbers;
        this.weigth = weigth;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "numbers=" + numbers +
                ", weigth=" + weigth +
                ", model='" + model + '\'' +
                '}';
    }

    public int getNumbers() {
        return numbers;
    }



    //    public String receiveCall1 (Phone phone){
//        String str = "Абоненту " + this.numbers + "Звонит " +phone.getNumbers();
//        return str;
//    }
    public String senMess(Phone phone) {
        String mess = "Абонет с номером " + this.numbers + " Моделью " + this.model +
                "Отправиль соообщение на номер " + phone.getNumbers();
        return mess;
    }

}
