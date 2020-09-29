package labsheet2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class WeightConverter{

    JTextField poundsField;
    JLabel kilosLabel;

    public WeightConverter()
    {
        JFrame jFrameWindow = new JFrame("Weight Converter");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(300,100);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel promptLabel = new JLabel("Pounds:");

        jFrameWindow.add(promptLabel);

        poundsField = new JTextField(5);

        jFrameWindow.add(poundsField);

        kilosLabel = new JLabel();

        jFrameWindow.add(poundsField);

        jFrameWindow.add(kilosLabel);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        poundsField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        WeightConverter guiApp = new WeightConverter();
    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            String poundsAsString;
            float pounds;

            poundsAsString = poundsField.getText();

            if(poundsAsString.equals(""))
            {
                JOptionPane.showMessageDialog(null,"You must enter a value into the " +
                        "textfield","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                pounds = Float.parseFloat(poundsAsString);
                kilosLabel.setText("This is equivalent to " +
                        String.format("%.2f",pounds*0.454f) + "kg");
            }
        }
    }

}
