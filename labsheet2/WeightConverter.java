package labsheet2;

import com.sun.java.swing.plaf.windows.WindowsGraphicsUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeightConverter {
    JTextField jTextField;
    double result;
    JLabel resultLabel;

    public WeightConverter(){
        JFrame jFrameWindow = new JFrame();
        FlowLayout flow = new FlowLayout();

        jFrameWindow.setTitle("Weight Converter");
        jFrameWindow.setLayout(flow);
        jFrameWindow.setSize(300,100);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Pounds");
        jFrameWindow.add(jLabel);

        jTextField = new JTextField(5);
        jFrameWindow.add(jTextField);

        JLabel resultLabel = new JLabel("This is equivalent to");
        jFrameWindow.add(resultLabel);

        TextFieldEventHandler handler = new TextFieldEventHandler();
        jTextField.addActionListener(handler);

        jFrameWindow.setVisible(true);

    }


    public static void main(String[] args) {
        WeightConverter guiApp = new WeightConverter();

    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String weight=jTextField.getText();


            if(weight.equals(""))
               JOptionPane.showMessageDialog(null,"No value entered!","Error",JOptionPane.ERROR_MESSAGE);
            else
            {
                result = Integer.parseInt(weight)/2.2;
                resultLabel.setText(" " + result);
            }
        }
    }
}
