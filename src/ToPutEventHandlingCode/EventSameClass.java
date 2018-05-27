package ToPutEventHandlingCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSameClass extends JFrame implements ActionListener {
    JTextField tf;
    EventSameClass(){
        tf=new JTextField(15);
        tf.setBounds(60,50,170,20);
        setLayout(null);
        JButton b=new JButton("Click");
        b.addActionListener(this);
        b.setBounds(100,120,80,30);
        add(b,BorderLayout.NORTH);
        add(tf,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to this Class");
    }
}
