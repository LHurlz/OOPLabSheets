package labsheet5.exercise1;

import labsheet4.exercise4.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String title,ISBN,output="";
        int pages;
        double price;
        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);


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

        textArea.append(String.format("%-30s%-10s%-20s%-5s\n\n%-30s%-10.2f%-20s%d\n\n%-30s%-10.2f%-20s%d","Title","Price","ISBN","Pages",favouriteBook.getTitle(),favouriteBook.getPrice(),
                favouriteBook.getISBN(),favouriteBook.getPages(),leastFave.getTitle(),leastFave.getPrice(),leastFave.getISBN(),leastFave.getPages()));

             JOptionPane.showMessageDialog(null,textArea,"Book Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
