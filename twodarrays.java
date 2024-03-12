
import java.util.*;
// import java.util.ArrayList;

public class twodarrays{

    public static void main ( String [] fjd ){

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

       ArrayList<String> shoppinglist = new ArrayList();
       shoppinglist.add("bottle");
       shoppinglist.add("surf");
       shoppinglist.add("soap");

       ArrayList<String> produceList = new ArrayList();
       produceList.add("dk");
       produceList.add("db");
       produceList.add("ds");

       ArrayList<String> drinkslist = new ArrayList();
     drinkslist.add("dks");
     drinkslist.add("dbm");
     drinkslist.add("dl");

    //    for (int i = 0;i<shoppingList.size;i++){
        groceryList.add(shoppinglist);
        groceryList.add(produceList);
        groceryList.add(drinkslist);

        System.out.println(shoppinglist.get(1).get(1));
       }
    }
