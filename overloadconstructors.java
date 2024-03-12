
public class pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    pizza (){


    }
    pizza (String bread){
        this.bread = bread;
    }
    }
public class main{

    public static void main(String afd[]){
        pizza pizza = new pizza ();

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza .bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.chesse);
        System.out.println(pizza.topping); 
    }
}