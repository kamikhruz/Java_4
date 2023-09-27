import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.*;

public class MyFrame7 extends JFrame implements KeyListener{

    JLabel label;

    MyFrame7(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);// set background color of the frame

        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e){
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
            break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
            break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
            break;
            
        }

    }
    
    @Override
    public void keyPressed(KeyEvent e){
        //KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
         switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10, label.getY());
            break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
            break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
            break;
            case 39 : label.setLocation(label.getX()+10, label.getY());
            break;

    }
}
    
    @Override
    public void keyReleased(KeyEvent e){
        //keyRealeased = called whenever a button is realeased
        System.out.println("You released key char "+ e.getKeyChar());
        System.out.println("You released key code "+ e.getKeyCode());
    }
    
}
