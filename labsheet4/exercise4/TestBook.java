package labsheet4.exercise4;
import javax.swing.*;
import java.awt.Font;

public class TestBook {
    public static void main(String[] args) {
        String title,ISBN,output="";
        int pages;
        double price;
        JTextArea textArea = new JTextArea();
        //Font font = new Font(Font.MONOSPACED);


        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));
        Book favouriteBook = new Book(title,price,ISBN,pages);

        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));
        Book leastFave = new Book(title,price,ISBN,pages);


        textArea.append(String.format("%-30s%-10s%-20s%-5s","\n\nTitle","Price","ISBN","Pages","%-30s%-10s%-20s%-5s","\n\n",favouriteBook.getTitle(),favouriteBook.getPrice(),favouriteBook.getISBN(),
                favouriteBook.getPages(),"\n\n",leastFave.getTitle(),leastFave.getPrice(),leastFave.getISBN(),leastFave.getPages()));

              /* textArea.append( "Fave book details are \n" + favouriteBook.getTitle() + "    " + favouriteBook.getPrice() + "    " + favouriteBook.getISBN() + "    " + favouriteBook.getPages()
                        + "\n\nLeast fave details are" + leastFave.getTitle() + "    " + leastFave.getPrice() + "    " + leastFave.getISBN() + "    " + leastFave.getPages());*/



        JOptionPane.showMessageDialog(null,textArea,"Book Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
