package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumbersGUI {
    JTextField inputField;
    JLabel highestNumberLabel;
    JLabel lowestNumberLabel;
    float highest,lowest;

    public NumbersGUI(){
        JFrame jFrameWindow = new JFrame("Numbers Application");

        jFrameWindow.setSize(500,150);

        FlowLayout flow = new FlowLayout();
        jFrameWindow.setLayout(flow);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel inputLabel = new JLabel("Please enter your numbers here");
        jFrameWindow.add(inputLabel);

        inputField = new JTextField(20);
        jFrameWindow.add(inputField);

        highestNumberLabel = new JLabel("No numbers entered yet");
        jFrameWindow.add(highestNumberLabel);

        lowestNumberLabel = new JLabel("");
        jFrameWindow.add(lowestNumberLabel);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        inputField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String[] args) {
        NumbersGUI guiApp = new NumbersGUI();
    }

    private class TextFieldEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputAsString;
            float input;

            if(inputField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"You must enter something","Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                inputAsString=inputField.getText();
                inputField.setText("");
                input = Float.parseFloat(inputAsString);

                if(input>highest)
                    highest=input;

                if(input<lowest)
                    lowest=input;

                highestNumberLabel.setText("Largest number so far is: " + highest);
                lowestNumberLabel.setText("Smallest number so far is: " + lowest);
            }

        }


    }
}
