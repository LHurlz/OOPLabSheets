package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name="",course="", snacksAsString;
        int snacks=0;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        snacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");
        snacks=Integer.parseInt(snacksAsString);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nCourse: " + course +
                                      "\nSnacks: " + snacks + "\nCost: £" + snacks*2);



    }
}
