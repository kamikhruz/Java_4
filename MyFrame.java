import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JCheckBox checkBox;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

       // button = new JButton("Submit");
       // button.addActionListener(this);

       /*textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");*/
        


        //this.add(button);
        //this.add(textField);
         button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,34));

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
      /*if(e.getSource()==button) {
        System.out.println("Welcome "+ textField.getText());
        button.setEnabled(false);
        textField.setEditable(false);
      } */


      if(e.getSource()==button){
        System.out.println(checkBox.isSelected());
      }
    }
    
}
