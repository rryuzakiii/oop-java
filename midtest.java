public class midtest {

    public static void main (String [ ] args) {
        byte b ;
        int i = 257;
        double d = 323.142;
        System.out.println("conversion");
        b = (byte) i ;

        System.out.println("i and b "+i + " "+b);
        System.out.println("conversion 2");
        b = (byte )d;
        System.out.println("d and b "+d+" "+b);
    }
}