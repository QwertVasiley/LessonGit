package Phone;

public class Phone {
     int number;
     String model;
     String weight;

     @Override
     public String toString() {
          return "Phone{" +
                  "number=" + number +
                  ", model='" + model + '\'' +
                  ", weight='" + weight + '\'' +
                  '}';
     }
     void  receiveCall(String name){
          System.out.println("Вам звонит " + name);
     }


     public int getNumber() {
          return number;
     }
     public String getModel(){
          return model;
     }
}
