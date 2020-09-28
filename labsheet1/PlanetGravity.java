package labsheet1;
import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {
        final double g=9.81;
        int massE, radE, radO, massO;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of the planet earth: ");
        massE=input.nextInt();

        System.out.println("Please enter the radius of the planet earth: ");
        radE=input.nextInt();

        System.out.println("Please enter the mass of the other planet: ");
        massO=input.nextInt();

        System.out.println("Please enter the radius of the other planet: ");
        radO=input.nextInt();

        System.out.print("\n\nThe acceleration due to gravity on the other planet is" + ((g*massO*(radE*2))/(massE*(radO*2))) + " m/s/s");

    }
}
