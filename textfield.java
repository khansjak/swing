import javax.swing.*;
import java.awt.*;

public class textfield {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 700, 500);
        frame.setTitle("My Text Field");

        Container c =frame.getContentPane();
        c.setLayout(null);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(100,50,120,30);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(100,80,120,30);


        c.add(jTextField);
        c.add(jTextField1);

        jTextField.setText("Javed Khan");
        Font font=new Font("Arial",Font.PLAIN,20);
        jTextField.setFont(font);
        jTextField.setForeground(Color.ORANGE);
        jTextField.setBackground(Color.gray);
        jTextField1.setEditable(false);

    }
}
