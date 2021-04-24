package textArea;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    Container c;
    JTextArea textArea;
    MyFrame(){

        setTitle("Text Area");
        setBounds(10,20,700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        c=getContentPane();
        c.setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(30,50,500,200);
        textArea.setLineWrap(true);
        c.add(textArea);
        setVisible(true);

    }
}
public class TextArea {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
