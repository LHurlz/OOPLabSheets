package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        String output="*****Person Class Tester*****";
        String firstName, lastName;

        Person p1 = new Person();

        output+="\n\nCalling the Person() constructor.....\nValue of first object is: " + p1.toString();

        firstName = JOptionPane.showInputDialog("Please enter first name of the second person");
        lastName = JOptionPane.showInputDialog("Please enter last name of the second person");

        Person p2 = new Person(firstName,lastName);

        output+="\n\nCalling the Person(String,String) constructor.....\nValue of second object is: " + p2.toString();

        JOptionPane.showMessageDialog(null,output);
    }
}
