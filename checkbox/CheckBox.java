package checkbox;

import javax.swing.*;
import java.awt.*;

public class CheckBox {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,100,500,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("Post Graduation");
        c1.setBounds(100,50,120,30);
        c2.setBounds(100,100,120,30);
        c3.setBounds(100,150,120,30);
        c4.setBounds(100,200,120,30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);
        c1.setEnabled(false);
        f.setVisible(true);

    }

}
