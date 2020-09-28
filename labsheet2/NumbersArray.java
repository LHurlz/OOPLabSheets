package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NumbersArray {
    public static void main(String[] args) {
        double numbers[] = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};

        double avg = average(numbers);

       JOptionPane.showMessageDialog(null,"The largest value in the array is " + largest(numbers) + "\nThe average value in the array is " + avg +
               "\nThe list of values above the average is: " + aboveAverage(avg,numbers));

    }

    public static double largest(double numbers[]){
        double large=numbers[0];

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>large)
                large=numbers[i];
        }

        return large;

    }

    public static double average(double numbers[]){
        double total=0;

        for(int i=0; i<numbers.length; i++)
        {
            total+=numbers[i];
        }

        return total/numbers.length;
    }

    public static String aboveAverage(double avg, double numbers[]){
        String returnText="";

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>avg)
                returnText+=numbers[i]+" ";
        }

        return returnText;
    }
}
