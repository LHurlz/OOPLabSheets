package labsheet9.exercise2;

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

             Triangle triangle1 = new Triangle();
             System.out.println("\n\nDetails of first Triangle object: \n" + triangle1);

             Triangle triangle2 = new Triangle(3.24,4.23,5.78);
             System.out.println("\n\nDetails of second Triangle object: \n" + triangle2);

             Ellipse ellipse1 = new Ellipse();
             System.out.println("\n\nDetails of first Ellipse object: \n" + ellipse1);

             Ellipse ellipse2 = new Ellipse(5.62,4.19);
             System.out.println("\n\nDetails of second Ellipse object: \n" + ellipse2);


             //Creating an array of Shape to store references to all the Circle and Rectangle objects
             //This is legal since a Circle is-a Shape and a Rectangle is-a Shape.
             //A Shape reference can reference an object that subclasses Shape

             Shape[] allShapes = {circle1,circle2,rectangle1,rectangle2,triangle1,triangle2,ellipse1,ellipse2};

             //Looping through the array of Shape references to display the state of the
             //various shapes it contains, using polymorphism and dynamic method binding

             System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
             for(int i=0;i<allShapes.length;i++)
                 System.out.println(allShapes[i] + "\n\n");
         }
}