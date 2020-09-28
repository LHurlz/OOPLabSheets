package labsheet1;

import javax.swing.*;

public class NumbersMenu {
    public static void main(String[] args) {
        int i=0;

        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("-------Iteration " + (i+1) + "\n\nPlease enter any whole number:"));

            int choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do?\n\n1. Determine if the number is odd or even\n2. Find the factorial of the number" +
                                       "\n3. Quit the program"));

            switch(choice) {
                case 1:
                    if(num%2==0)
                        JOptionPane.showMessageDialog(null,"The number you entered is even","Number Data",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"The number you entered is odd","Number Data",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    int factorial=1;

                    if(num<0){
                        JOptionPane.showMessageDialog(null,"You cannot find the factorial of a negative number","Number Data",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    else {
                        for(int j=1; j<=num; j++)
                            factorial=(factorial*j);

                        JOptionPane.showMessageDialog(null, "The factorial of the number you entered is " + factorial, "Number Data", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                case 3:
                    JOptionPane.showMessageDialog(null, "Qutting program", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
            }

            i++;
        }while(i<10);

    }
}
