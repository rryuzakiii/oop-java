import java.util.ArrayList;

public class arraylist18{

    public static void main(String[] dks) {

    ArrayList<String> cars = new ArrayList();

    cars.add("bmw");
    cars.add("mercedes");
    cars.add("porshe");
    
    cars.set(0, "hellcat");
    cars.remove(0);
    cars.clear();
    cars.add("hellcat");
    
    for (int i = 0 ; i < cars.size() ; i++ ){
        System.out.println(cars.get(i));
    }
  }
}