import javax.swing.Action;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame6 extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame6(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JColorChooser colorChooser = new JColorChooser();

        Color color = JColorChooser.showDialog(null, "Pick a color... I guess", Color.black);

        //label.setForeground(color);
        label.setBackground(color);

    }
    
}
