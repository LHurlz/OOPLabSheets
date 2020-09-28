package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int random[] = new int[10];
        int over100=0;
        String unsorted="";

        populateArray(random);
        unsorted = Arrays.toString(random);
        Arrays.sort(random);

        for(int i=0; i<random.length; i++)
        {
            if(random[i]>100)
               over100++;
        }

        JOptionPane.showMessageDialog(null,"The initial contents of the array is " + unsorted + "\nThe percentage of values that exceed 100 is " + over100*10 +
                "%" + "\nThe contents of the array after sorting is: " + Arrays.toString(random));

    }
    public static void populateArray(int random[]){
        for(int i=0; i<random.length; i++)
        {
            random[i]=(int)(Math.random()*(1000-1+1)+1);
        }
    }
}
