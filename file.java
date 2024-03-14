import java.io.File;

public class file {
    public static void main(String asd []){
        File file = new File("poem");

        if (file.exists()){
            System.out.println("true");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }

        else{
            System.out.println("false");
        }
    }
}