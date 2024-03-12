import java.util.Scanner;

public class test12{

    public static void main(String [] args) {

        Scanner sc = new Scanner (System.in);
        String name = "";
        
        while(name.isBlank()){
            System.out.println("Please enter your name: ");
            name = sc.nextLine();  //Reads the whole line of text until a
        } 
        System.out.println("hello  " + name + ", nice to meet you!");
}}