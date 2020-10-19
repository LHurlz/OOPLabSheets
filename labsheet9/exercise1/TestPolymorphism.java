package labsheet9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee employeeRef; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        SelfEmployedWorker se1 = new SelfEmployedWorker("Richard","Branson");

        Employee[] employeeArray = {b1,hw1,se1};

        for(int i=0; i<employeeArray.length; i++)
            System.out.println(employeeArray[i].toString() + " and the earnings were £" + String.format("%.2f",employeeArray[i].earnings()) + "\n");
    }
}