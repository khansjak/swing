package combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,100,500,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        String[] values ={"A","B","C","D"};

        JComboBox comboBox = new JComboBox(values);
        comboBox.setBounds(100,100,100,30);
        //comboBox.setEditable(true);
        comboBox.setSelectedItem("B");
        c.add(comboBox);

        JButton button = new JButton("Show");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label = new JLabel("Hint");
        label.setBounds(100,300,100,30);
        c.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText((String) comboBox.getSelectedItem());
            }
        });

        f.setVisible(true);

    }
}
