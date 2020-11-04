package labsheet11.sampleprogram1;

//TestComputer.java
/*A driver class for the Computer class that uses a for-each loop*/

public class TestComputer {
    public static void main(String[] args) {

        double totalPrice = 0;
        Computer highestSpeedComputer;

        Computer c1 = new Computer();
        Computer c2 = new Computer("Dell", "Laptop", 3.25, 16, 550.99);
        Computer c3 = new Computer("Apple", "Tablet", 3.65, 8, 500.25);
        Computer c4 = new Computer("Sun", "Server", 4.25, 32, 1768.45);
        Computer c5 = new Computer("Lenovo", "Desktop", 2.68, 14, 457.34);

        Computer allComputers[] = {c1, c2, c3, c4, c5};

        highestSpeedComputer = allComputers[0];
        String over500 = "";
        String tablets = "";

        System.out.println("\n\nDetails of all Computers in the array\n");
        for (Computer c : allComputers) {
            totalPrice += c.getPrice();

            if (c.getSpeed() > highestSpeedComputer.getSpeed())
                highestSpeedComputer = c;

            if (c.getPrice() > 500)
                over500 += c + "\n";

            if (c.getType().toLowerCase().equals("tablet"))
                tablets += c + "\n";

            System.out.println(c);
        }

        System.out.println("\n\nSome additional information\n\nAverage computer price is: €" + String.format("%.2f", totalPrice / allComputers.length) +
                "\nDetails of highest speed computer: " + highestSpeedComputer + "\nList of computers whose price exceeds $500:\n\n" + over500 +
                "\n\nList of computers that are tablets:\n" + tablets);

        System.out.println("\n\nUpdated details of all Computers in the array\n\n");
        for (Computer c : allComputers) {
            if(c.getManufacturer().toLowerCase().equals("lenovo"))
                c.setManufacturer("Dell");

            System.out.println(c);
        }
    }
}
