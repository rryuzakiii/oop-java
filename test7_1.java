import java.util.Scanner;

public class test7_1 {

    public static void main(String[]oa) {

        double l , b , h ;

        Scanner Sc = new Scanner(System.in); 
        
        code testSystem.out.println("value of length : ");
         l= Sc.nextDouble();
        if (l<0)
        {
        System.out.println("Error! Length must be > 0");
        System.exit(0);
        }
        
        System.out.println("value of breadth : ");
        b= Sc.nextDouble();
        if (b<0)
        {
        System.out.print("Error! Breadth must be > 0 ");
        System.exit(0);
        }
        

        h = Math.sqrt((l*l)+(b*b));
        System.out.println("the h = "+h);

        Sc.close();
        
    }
}