package DragAndDrop;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    //DragPanel dragPanel = new DragPanel();

    MyPanel panel; 
    
    MyFrame(){
        //this.add(dragPanel);
        
        //this.setTitle("Drag & Drop demo");

        panel = new MyPanel();
        this.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();

        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(0, 0, 500, 500);
    }
}
