import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args){

        // Take user input via GUi which we will build right now
        String name = JOptionPane.showInputDialog("Enter your name");

        // Disply the name after accepting it
        JOptionPane.showMessageDialog(null, "Welcome, "+ name+"!");

        // Take user input again, this time we'll take a numerical input
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));

        // Display message to prove that you have recorded their age
        JOptionPane.showMessageDialog(null, "Wow, for someone at the age of "+age+", you sure are impressive");

        // Take user input, height
        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you? "));

        //Display their height to them
        JOptionPane.showMessageDialog(null, height+"cm tall. Fair Enough! Not bad at all !!");
    }
    
}
