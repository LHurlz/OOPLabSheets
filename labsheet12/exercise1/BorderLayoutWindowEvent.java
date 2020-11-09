package labsheet12.exercise1;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutWindowEvent extends JFrame {

    private JButton jb[];
    private JTextArea textArea;
    private JLabel label;

    public BorderLayoutWindowEvent() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);
        label = new JLabel("Please enter your text on the text-area below");
        textArea = new JTextArea();



        String regions[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                BorderLayout.WEST, BorderLayout.CENTER};

        add(label,BorderLayout.NORTH);
        add(textArea,BorderLayout.CENTER);

        addWindowListener(new WindowEventHandler());
        setSize(400, 300);

        setVisible(true);
    }


    public static void main(String args[]) {
        BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Welcome to this nifty little GUI Application. It is designed to take some user-supplied text\n" +
                            "entered onto a text-area and when the JFrame window is minimised, it will give some statistical information" +
                            "\nabout the text entered. Then, when the window is unminimised, it will clear the text-area for new input.", "Opening Window",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        //hides the window on closing by default (so application is still actually running in background)
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Thanks for using the program", "Exiting Application",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        //method only called when dispose() is called on the relevant window from elsewhere
        public void windowClosed(WindowEvent e) {
            }


        public void windowIconified(WindowEvent e) {
            String enteredText=textArea.getText().toLowerCase();
            int totalChars = enteredText.length();
            int vowelCount=0;
            int lettersCount=0;
            int digitCount=0;
            int wordCount=1;
            int sentenceCount=0;
            int endWithDCount=0;

            for(int i=0; i<enteredText.length(); i++){
                if(enteredText.charAt(i)=='a' || enteredText.charAt(i)=='e' ||enteredText.charAt(i)=='i' ||enteredText.charAt(i)=='o' ||enteredText.charAt(i)=='u')
                    vowelCount++;

                if(Character.isDigit(enteredText.charAt(i)))
                    digitCount++;

                if(enteredText.charAt(i)=='.')
                    sentenceCount++;

                if(Character.isLetter(enteredText.charAt(i)))
                    lettersCount++;

                if(enteredText.charAt(i)==' ')
                    wordCount++;

                if(enteredText.charAt(i)=='d'){
                    if(enteredText.charAt(i+1)=='?' || enteredText.charAt(i+1)=='.' || enteredText.charAt(i+1)=='!' || enteredText.charAt(i+1)==' ' || enteredText.charAt(i+1)==','){
                        endWithDCount++;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Statistical Information for Text Entered\n\n\nTotal Number of characters: "+totalChars+"\n" +
                            "Total number of vowels: "+vowelCount+"\nTotal number of letters: "+lettersCount+"\nTotal Number of digits: "+digitCount
                            +"\nTotal Number of words: "+wordCount+"\nTotal Number of sentences: "+sentenceCount+"\nTotal number of words ending with 'd': "
                            +endWithDCount, "Program Data",
                            JOptionPane.INFORMATION_MESSAGE);
        }


        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                    JOptionPane.INFORMATION_MESSAGE);
            textArea.setText("");
        }


        public void windowActivated(WindowEvent e) {

        }


        public void windowDeactivated(WindowEvent e) {

        }
    }
}
