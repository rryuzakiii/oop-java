import java.io.FileWriter;
import java.io.IOException;

public class filewriter{
    public static void main(String dhga[]){

        try{

        FileWriter writer = new FileWriter("poem");
        writer.write("roses are red\nviolets are blue\nmegan is hot \n teri maa ki choot");
        writer.append ("\n (mulla mc)");
        writer.close();

        }
        catch(IOException e){
            System.out.println("false");
        }
    }
}