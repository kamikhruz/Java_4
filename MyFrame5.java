import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame5 extends JFrame implements ActionListener {

    JButton button;

    MyFrame5(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
 
    
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:/Users/Kamie.K/OneDrive/Desktop"));

            //int response = (fileChooser.showOpenDialog(null));// select file to open
            int response = fileChooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }
}
