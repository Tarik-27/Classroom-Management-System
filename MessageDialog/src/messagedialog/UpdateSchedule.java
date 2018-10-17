package messagedialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateSchedule extends JFrame{
    
    ImageIcon Icon, TImage, SImage;
    Container c;
    JLabel Teacher, Student;
    JButton TImg, SImg, Admin;
    Font f,f1;
    //
    JTextField UserName;
    JPasswordField Password;
    
    
    
    UpdateSchedule()
    {
        Schedule();
    }
    
    public void Schedule()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("UpdateSchedule");
         
         //Setting Up Icon
         Icon= new ImageIcon(getClass().getResource("index.png"));
         this.setIconImage(Icon.getImage());  
         
         //Backgroung Color
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.pink);
         
         //font
         f = new Font("Agency FB",Font.BOLD,25);
         f1 = new Font("Agency FB",Font.BOLD,15);
         
         
         


    }
    

    public static void main(String[] args) {

         UpdateSchedule frame = new UpdateSchedule();
         frame.setVisible(true);
    }
    
}
