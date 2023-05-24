import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Temperature Converter");

        JLabel jLabel = new JLabel("Celsius to Fahrenheit");
        jLabel.setBounds(30,30,300,20);

        jFrame.add(jLabel);

        JLabel jLabel1 = new JLabel("Farenheit to Celsius");
        jLabel1.setBounds(30,130,300,20);

        jFrame.add(jLabel1);

        JTextArea jTextArea  = new JTextArea();
        jTextArea.setBounds(30,60,200,20);
        jTextArea.setForeground(Color.BLACK);

        jFrame.add(jTextArea);

        JTextArea jTextArea1 = new JTextArea();
        jTextArea1.setBounds(30,160,200,20);
        jTextArea1.setForeground(Color.BLACK);

        jFrame.add(jTextArea1);

        JButton jButton = new JButton("Convert to Fahrenheit");
        jButton.setBounds(200,100,200,20);

        jFrame.add(jButton);

        JButton jButton1  = new JButton("Fahrenheit to Celsius");
        jButton1.setBounds(200,190,200,20);

        jFrame.add(jButton1);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float c =  Float.parseFloat(jTextArea.getText());
                float f =  (1.8f) *  c + 32;
                JOptionPane.showMessageDialog(null,"The temperature in fehrenheit is : "+f);
//                jLabel.setText("The temperature in fehrenheit is : "+f);

            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float f1 = Float.parseFloat(jTextArea1.getText());
                float c1 = (f1 - 32) * 5/9;
//                JOptionPane.showMessageDialog(null,"The temperature in celsius is : "+c1);
                jLabel1.setText("The temperature in celsius is : "+c1);
            }
        });


        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
