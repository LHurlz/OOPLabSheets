package labsheet10.exercise1;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestInterface {
     public static void main(String args[]) {
			System.out.println("Testing the UnderGraduate no-arg constructor: ");
			UnderGraduate u1 = new UnderGraduate();
			System.out.println(u1);

			System.out.println("\n\nTesting the UnderGraduate multi-arg constructor: ");
			UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);
			System.out.println(u2);

			System.out.println("\n\nTesting the PostGraduate no-arg constructor: ");
			PostGraduate p1 = new PostGraduate();
			System.out.println(p1);

			System.out.println("\n\nTesting the PostGraduate multi-arg constructor: ");
			PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");
			System.out.println(p2);

		 	System.out.println("\n\nTesting the PermanentLecturer multi-arg constructor: ");
		 	PermanentLecturer pl1 = new PermanentLecturer("Thomas Aquinas", "Dublin", new GregorianCalendar(1984,11,31),"52673",new String[]{"Econ 101","Media Presentation",
									"Political Debate"},new GregorianCalendar(2003,5,23),"Lots and lots of Pension Entitlements :-)","Full Time Professorship");
		 	System.out.println(pl1);

		 	System.out.println("\n\nTesting the TemporaryLecturer multi-arg constructor: ");
		 	TemporaryLecturer tl1 = new TemporaryLecturer("Richard O' Neill", "Tallaght, Dublin", new GregorianCalendar(1985,2,4),"3536278b",new String[]{"Applied Biology",
					"Microbiology"},new GregorianCalendar(2018,3,15),762);
		 	System.out.println(tl1);
     	}	   
}