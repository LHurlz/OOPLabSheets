package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output="";

        Thermometer t1 = new Thermometer(35,35,35);

        output+="*****Thermometer Testing*****\n\n\nCalling the single argument constructor... setting the temperature of the first thermometer to 35C\nFirst Thermometer:" + t1.toString();

        Thermometer t2 = new Thermometer();

        output+="\n\nCalling the single argument constructor... setting the temperature of the second thermometer to 0C\nFirst Thermometer:" + t2.toString();

        t2.setTemperature(25);

        output+="\n\nCalling setTemperature()..... setting the temperature of the second thermometer to 25C\nSecond Thermometer: " + t2.toString();

        JOptionPane.showMessageDialog(null,output);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:"));
        t1.setTemperature(input);

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\nCalling setTemperature()..... setting the temperature of the first thermometer to "
                            + input + "C\nFirst Thermometer:" + t1.toString());
    }
}
