import javax.swing.JOptionPane;

public class test6{

    public static void main (String[]gui){

        String name = JOptionPane.showInputDialog("enter name ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter age "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height in cm "));
        
        JOptionPane.showMessageDialog(null,"Hello "+name);
        JOptionPane.showMessageDialog(null,"your age "+age+"years old");
        if(height >= 61 && height<=182 ){
        JOptionPane.showMessageDialog(null,"you are "+height+"cm short");
        }
        else if(height >= 182 && height <= 273){
            JOptionPane.showMessageDialog(null,"you are "+height+"cm tall");
        }
        else{
            JOptionPane.showMessageDialog(null,"chutiya mt bna");    
        }
    }
}