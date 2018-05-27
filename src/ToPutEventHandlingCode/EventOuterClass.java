package ToPutEventHandlingCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventOuterClass extends JFrame {
    JTextField tf;
    EventOuterClass(){
        tf=new JTextField(15);
        tf.setBounds(60,50,170,20);
        setLayout(null);
        JButton b=new JButton("Click");
        b.addActionListener(new HandlerOc(this));
        b.setBounds(100,120,80,30);
        add(b,BorderLayout.NORTH);
        add(tf,BorderLayout.SOUTH);
    }
    private class HandlerOc implements ActionListener{
        EventOuterClass eoc;
        HandlerOc(EventOuterClass e){
            eoc=e;

        }
        public void actionPerformed(ActionEvent e){
            eoc.tf.setText("Welcome");
        }

    }
}
