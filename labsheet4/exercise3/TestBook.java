package labsheet4.exercise3;
import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output="";

        Book b1 = new Book();

        output+="Calling the no-argument constructor.  First book details are \n" + b1.toString();

        Book b2 = new Book("The Davinci Code",19.99,"3452617232",348);

        output+="\n\nCalling the multi-argument constructor.  Second book details are \n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
