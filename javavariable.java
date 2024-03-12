import java.util.random;
public class javavariable{
    public static void main(string[]sgf) {

        DiceRoller diceroller = new DiceRoller();

    }
}

public class DiceROller{
     Random random ;
     int number = 0;


     DiceRoller()
{
   random = new Random();
    
    roll();
}

void roll(Random random ,int number)
{
    number =random.nextInt(6)+1;
    System.out.println(number);
}
}