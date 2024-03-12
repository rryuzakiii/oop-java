
public class objects{
    public static void main(String[] args) {

      car mycar = new car();
      System.out.println("mycar.model");
      mycar.drive();
    }

}
public class car{

    String make = "BMW";
    String model = "rq";
    int year = "54";
    int speed = "220";
    double price = 599909.32;

    void driver (){
        System.out.println("you drive my car");
    }
    void brake(){
        System.out.println("you stop my car");
    }

}