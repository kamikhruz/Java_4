import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame2 extends JFrame implements ActionListener {

     JRadioButton pizzaButton;
     JRadioButton hamburgerButton;
     JRadioButton hotdogButton;

    MyFrame2(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         pizzaButton = new JRadioButton();
         hamburgerButton = new JRadioButton();
         hotdogButton = new JRadioButton();

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hotdogButton.addActionListener(this);
        hamburgerButton.addActionListener(this);


        this.add(pizzaButton);
        this.add(hotdogButton);
        this.add(hamburgerButton);
        this.pack();
        this.setVisible(true);
    }


    @Override
    
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==pizzaButton){
        System.out.println("You ordered pizza!");
    }
    else if(e.getSource()==hamburgerButton){
        System.out.println("You ordered a hamburger!");

    }
    else if(e.getSource()==hotdogButton){
        System.out.println("You ordered a hotdog!");
    }
    
        
        
    }
    
}
