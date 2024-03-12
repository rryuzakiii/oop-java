public class abc {
    public static void main (String []ada){
        fruit apple = new  fruit("Apple", "Round");
        fruit banana = new  fruit("Banana","Long and Curvy");
        System.out.println(apple.shape);
    }
}

class fruit {
    String name ;
    String shape ; 

    fruit (String name,String  shape) {
        this.name = name ; 
        this.shape = shape;
    }
}