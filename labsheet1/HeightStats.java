package labsheet1;
import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {
        double height, totalHeight=0, smallestHeight=2.73;
        int i=0, overAvg=0,betweenRange=0;
        final double GLOBAL_AVERAGE=1.665;

        Scanner input = new Scanner(System.in);

        while(i<6)
        {
            System.out.print("Loop " + (i+1) + " - Please enter height: ");
            height=input.nextDouble();


            while(height<0.5465 || height>2.72)
            {
                System.out.print("Loop " + (i+1) + " - Height value invalid!!! Please re-enter height: ");
                height=input.nextDouble();
            }

            totalHeight+=height;
            if(height>GLOBAL_AVERAGE)
                overAvg++;
            if(height>=1.3 && height<=1.9)
                betweenRange++;
            if(height<smallestHeight)
                smallestHeight=height;
            i++;
        }

        System.out.println("\n\n----------------------------\n\t\tHeight Statistics\n----------------------------"
                          +"\n\n\nThe average of the heights entered is " + String.format("%.1f",totalHeight/6) + "m\nThe smallest height value entered is " +
                          smallestHeight + "m\nThe number of height values between 1.3m and 1.9m inclusive is " + betweenRange + "\nThe " +
                          "percentage of height values exceeding the global average height is " + String.format("%.2f",((overAvg/(double)6)*100)) + "%");
    }
}
