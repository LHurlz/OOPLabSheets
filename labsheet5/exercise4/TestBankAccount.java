package labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output="";

        BankAccount b1 = new BankAccount();

        output+="Calling the no-argument BankAccount constructor.  The first object details are:\n\n" + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich",2342343,0.75);

        output+="\n\nCalling the multi-argument BankAccount constructor.  The second object details are:\n\n" + b2.toString();

        BankAccount.setInterestRate(0.5);

        output+="\n\nNow calling the setInterestRate() method to change the interest rate to 0.5.\n\nThe first object details are:\n\n" +
                b1.toString() + "\n\nThe second object details are:\n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output);
    }
}
