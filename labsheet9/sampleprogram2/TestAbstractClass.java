package labsheet9.sampleprogram2;

//TestAbstractClass.java
/*A driver class to test out the Shape, Circle and Rectangle classes*/

public class TestAbstractClass {
      public static void main(String args[])
         {
             //Creating some Circle objects and displaying their state

             Circle circle1 = new Circle();
             System.out.println("Details of first Circle object: \n" + circle1);

             Circle circle2 = new Circle(5.5);
             System.out.println("\n\nDetails of second Circle object: \n" + circle2);

             //Creating some Rectangle objects and displaying their state

             Rectangle rectangle1 = new Rectangle();
             System.out.println("\n\nDetails of first Rectangle object: \n" + rectangle1);

             Rectangle rectangle2 = new Rectangle(4.3,1.8);
             System.out.println("\n\nDetails of second Rectangle object: \n" + rectangle2);

             //Creating an array of Shape to store references to all the Circle and Rectangle objects
             //This is legal since a Circle is-a Shape and a Rectangle is-a Shape.
             //A Shape reference can reference an object that subclasses Shape

             Shape[] allShapes = {circle1,circle2,rectangle1,rectangle2};

             //Looping through the array of Shape references to display the state of the
             //various shapes it contains, using polymorphism and dynamic method binding

             System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
             for(int i=0;i<allShapes.length;i++)
                 System.out.println(allShapes[i] + "\n\n");
         }
}