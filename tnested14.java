import java.util.Scanner;

public class tnested14{

    public  static void main(String[] fds){

        Scanner sc = new Scanner(System.in);
        int r , c;
        String sym = "";

        System.out.println("enter no of rows ");
        r= sc.nextInt();
        System.out.println("enter no of coloumns ");
        c = sc.nextInt();
        System.out.println("enter the symmbol to use ");
        sym = sc.next();

        for (int i = 1 ; i <= r ; i++){
            System.out.println();
            for (int j = 1 ; j <=c ;j++ ){
                System.out.print(sym);

            }
        
        }
        
    }
}