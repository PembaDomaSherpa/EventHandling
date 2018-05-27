package EventButton;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;

    public ButtonFrame(){
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        JButton yellowButton=new JButton("Yellow");
        JButton blueButton=new JButton("Blue");
        JButton redButton=new JButton("Red");
        buttonPanel=new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        add(buttonPanel);
        colorAction yellowAction=new colorAction(Color.YELLOW);
        colorAction bluewAction=new colorAction(Color.BLUE);
        colorAction redwAction=new colorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(bluewAction);
        redButton.addActionListener(redwAction);



    }
    private class colorAction implements ActionListener{
        private Color backGroundColor;

       public colorAction(Color c){
           backGroundColor=c;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backGroundColor);
        }
    }
}
