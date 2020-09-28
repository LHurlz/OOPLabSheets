package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        final double lowerRate = 1.75;
        final double upperRate = 2.5;
        double paymentDue=0;

        String name = JOptionPane.showInputDialog("Please enter your name");
        String kmAsString = JOptionPane.showInputDialog("Please enter the number of km cycled");
        int km = Integer.parseInt(kmAsString);

        if(km>10)
         {
            paymentDue = ((km-10)*upperRate)+(10*lowerRate);
         }
        else
            paymentDue = km*lowerRate;

        JOptionPane.showMessageDialog(null,"Name: "+ name +"\nDistance cycled: " + km +
                      "\nSponsorship amount due: £" + paymentDue,"Receipt",JOptionPane.INFORMATION_MESSAGE);
    }
}
