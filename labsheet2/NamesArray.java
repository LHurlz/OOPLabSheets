package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {
        String names[] = new String[5];
        String longestName="";
        int totalLength=0;


        populateArray(names);
        Arrays.sort(names);

        for(int j=0; j<names.length; j++)
            totalLength+=names[j].length();

        for(int i=0; i<names.length; i++)
        {
            longestName=names[i];
            if(names[i].compareTo(longestName)==1)
                names[i]=longestName;
        }

        JOptionPane.showMessageDialog(null, "The longest name is " +longestName + "\n\nAverage characters per name is " + (totalLength/5) +
                "\n\nThe array sorted in ascending order is:\n\n" + Arrays.toString(names));
    }

    public static void populateArray(String names[]) {

        for (int i = 0; i < names.length; i++)
            names[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i + 1));
    }
}
