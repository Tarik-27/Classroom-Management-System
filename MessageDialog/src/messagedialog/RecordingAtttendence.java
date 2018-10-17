package messagedialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RecordingAtttendence extends JFrame{
    
    ImageIcon Icon, TImage, SImage;
    Container c;
    JTable Attendence;
    JScrollPane Scroll;
    JButton Back;
    //JTextField
    String [] cols = {"ID", "Class 1", "Class 2", "Class 3"};
    String [][] rows = {
                        {"Student 1" ," ", " ", " "},
                        {"Student 2"," ", " ", " "},
                        {"Student 3"," "," "," "},
                        {"Student 4"," "," "," "},
                        {"Student 5"," "," "," "},
    };
    Font f,f1;

    
    
    
    RecordingAtttendence()
    {
        Attendence();
    }
    
    public void Attendence()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("Recording Attendence");
         
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

         Attendence = new JTable(rows,cols);
         
         Scroll = new JScrollPane(Attendence);
         Scroll.setBounds(10,50,750,550);
         c.add(Scroll);
         
         Back = new JButton("Back");
         Back.setBounds(700,10,70,30);
         Back.setFont(f1);
         Back.setForeground(Color.BLUE);
         c.add(Back);
         
         Back.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     dispose();
                     TeacherFeature frame = new TeacherFeature();
                     frame.setVisible(true);
             }
             
         });
         

    }
    

    public static void main(String[] args) {

         RecordingAtttendence frame = new RecordingAtttendence();
         frame.setVisible(true);
    }
    
}
