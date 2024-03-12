import java.util.Scanner;

public class test4 {

    public static void main (String[] jog)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("answer me -");
        String v =sc.nextLine();

        System.out.println("number");
        float b = sc.nextFloat();

        sc.nextLine(); 

        System.out.println("number2");
        int j = sc.nextInt();

        sc.nextLine();

        System.out.println("food");
        String m = sc.nextLine();

        System.out.println("food");
        String k = sc.nextLine();
        System.out.println("your name "+v+b+j+m+k);
    }
}