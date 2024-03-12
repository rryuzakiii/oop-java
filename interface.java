public class main{

    public static void interface(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        }

}

public interface prey {
   void flee(); 
   
}
public class Rabbit implents  prey{
    @override 
    public void flee (){
        System.out.println("the rabbit is fleeing");
    }
}