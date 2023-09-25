import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame3 extends JFrame implements ActionListener {

    JComboBox comboBox;
     

    MyFrame3(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); 

        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);// enables to type something you want to look for

        //System.out.println(comboBox.getItemCount());
       // comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeAll();


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    
public void actionPerformed(ActionEvent e){
    if(e.getSource()==comboBox){
        System.out.println(comboBox.getSelectedItem());
       // System.out.println(comboBox.getSelectedIndex());// gets index
        
    }

}
}
