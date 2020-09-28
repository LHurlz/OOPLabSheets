package labsheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {
        String serialNo=" ", procType="", cheapProc="";
        int totalSpace=0, entries=0;
        float price=0, lowestPrice=10000000, highestPrice=0;

        serialNo = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while(!serialNo.equals("")){
            //serialNo = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");
            int space = Integer.parseInt(JOptionPane.showInputDialog("Please enter the disk space"));
            if(space>50 && space<5000){
                procType = JOptionPane.showInputDialog("Please enter the processor type");
                price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price"));
                serialNo = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

            }
            else {
                space = Integer.parseInt(JOptionPane.showInputDialog("Invalid!! Please re-enter the disk space"));
            }

            totalSpace+=space;
            entries++;
            if(price<lowestPrice)
                lowestPrice=price;
            cheapProc=procType;
            if(price>highestPrice)
                highestPrice=price;
        }



        if(entries==0){
            JOptionPane.showMessageDialog(null,"No data entered","Computer Stats",JOptionPane.INFORMATION_MESSAGE);
        }

        else{
            JOptionPane.showMessageDialog(null, "The average disk space is " +
                    (totalSpace/entries) + "\nThe " + "price range of the computers is from $"
                    + lowestPrice + " to " + "$" + highestPrice + "\nThe processor type on the cheapest computer"
                    + " is " + cheapProc);
        }


    }
}
