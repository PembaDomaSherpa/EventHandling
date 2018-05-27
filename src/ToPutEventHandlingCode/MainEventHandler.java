package ToPutEventHandlingCode;



import javax.swing.*;

public class MainEventHandler {
    public static void main(String[] args){
        EventSameClass sc=new EventSameClass();
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sc.setSize(400,500);
        sc.setVisible(true);


        EventOuterClass oc=new EventOuterClass();
        oc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oc.setSize(400,500);
        oc.setVisible(true);


        EventInnerClass ic=new EventInnerClass();
        ic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ic.setSize(400,500);
        ic.setVisible(true);

    }
}
