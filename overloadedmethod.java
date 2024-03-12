public class overloadedmethod{

    public static void main(String[]jsd){
        int f = 32;
        int j = 54;
        int h = 87;
        int g = 98;
        double b = add(f, j,h);
        System.out.println(b); 

    }
    static int add (int a ,int b){
       int z = a+b;
        System.out.println("first method"+ z);
        return  z ;
    }
      static int add (int a ,int b,int c){
       int z = a+b+c;
        System.out.println("second method"+ z);
        return  z ;
}
  static int add (int a ,int b,int c, int d){
        int z = a+b+c+d;
        System.out.println("third method"+ z);
        return  z ;
  }
  static double add (double a ,double b){
       double z = a+b;
        System.out.println("fourth method"+ z);
        return  z ;
    }
      static double add (double a ,double b,double c){
       double z = a+b+c;
        System.out.println("fifth method"+ z);
        return  z ;
}
  static double add (double a ,double b,double c, double d){
        double z = a+b+c+d;
        System.out.println("sixth method"+ z);
        return  z ;
  }
}