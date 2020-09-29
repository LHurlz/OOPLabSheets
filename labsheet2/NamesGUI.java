package labsheet2;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class NamesGUI {
    JButton searchButton, findButton;
    JFrame jFrameWindow;
    JTextField textField;
    JLabel arrayLabel;
    String[] names = new String[5];
    int i = 0;

    public NamesGUI() {
        jFrameWindow = new JFrame("Student Names");

        FlowLayout flow = new FlowLayout();
        jFrameWindow.setSize(500, 100);
        jFrameWindow.setLayout(flow);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel promptLabel = new JLabel("Name");
        jFrameWindow.add(promptLabel);

        textField = new JTextField(20);
        jFrameWindow.add(textField);

        arrayLabel = new JLabel("The names array is currently empty! Add names using the text-field above");
        jFrameWindow.add(arrayLabel);

        EventHandler handler = new EventHandler();
        textField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String[] args) {
        NamesGUI guiApp = new NamesGUI();
    }

    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == textField && i < 5) {
                names[i] = textField.getText();
                arrayLabel.setText("Name Added! " + (4 - i) + " slots of the array remain empty");
                textField.setText("");
                i++;


                if (i == 5) {
                    JOptionPane.showMessageDialog(null, "Names array now full! To find longest name or search this array hit return", "Student Names", JOptionPane.INFORMATION_MESSAGE);
                    arrayLabel.setVisible(false);
                    searchButton = new JButton("Search");
                    findButton = new JButton("Find Longest Name");
                    jFrameWindow.add(searchButton);
                    jFrameWindow.add(findButton);
                    EventHandler handler = new EventHandler();
                    searchButton.addActionListener(handler);
                    findButton.addActionListener(handler);
                }
            } else if (e.getSource() == searchButton) {
                Arrays.sort(names);
                String name = textField.getText();
                if(binarySearch(names,name))
                    JOptionPane.showMessageDialog(null,"The name you searched for, " + name + ", was found!","Name Found!",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"The name you searched for, " + name + ", was not found!","Name Not Found!",JOptionPane.INFORMATION_MESSAGE);
            }

            else if(e.getSource()==findButton){
                String longest = names[0];

                for(int i=0; i<5; i++) {
                    if (names[i].length() > longest.length())
                        longest = names[i];
                }

                JOptionPane.showMessageDialog(null,"The longest name found is " + longest,"Longest Name!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static boolean binarySearch(String names[], String name){
        int highestSub=names.length-1, lowerSub=0, middleSub;

        while(lowerSub<=highestSub){
            middleSub = (highestSub+lowerSub)/2;

            if(names[middleSub].compareTo(name)<0)
                lowerSub=middleSub+1;
            else if(names[middleSub].compareTo(name)>0)
                highestSub=middleSub-1;
            else
                return true;
        }

        return false;
    }
}
