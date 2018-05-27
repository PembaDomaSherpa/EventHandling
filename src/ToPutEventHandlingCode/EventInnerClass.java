package ToPutEventHandlingCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventInnerClass extends JFrame {
    JTextField tf;
    EventInnerClass(){
        tf=new JTextField(15);
        tf.setBounds(60,50,170,20);
        setLayout(null);
        JButton b=new JButton("Click");
        b.addActionListener(new HandlerIc(this));
        b.setBounds(100,120,80,30);
        add(b,BorderLayout.NORTH);
        add(tf,BorderLayout.SOUTH);
    }
    private class HandlerIc implements ActionListener {
        EventInnerClass eoc;
        HandlerIc(EventInnerClass e){
            eoc=e;

        }
        public void actionPerformed(ActionEvent e){
            eoc.tf.setText("Welcome");
        }

    }
}
