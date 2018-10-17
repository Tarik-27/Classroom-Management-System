package messagedialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MessageDialog extends JFrame{
    
    ImageIcon Icon, TImage, SImage;
    Container c;
    JLabel Teacher, Student;
    JButton TImg, SImg, Admin;
    Font f,f1;
    //
    JTextField UserName;
    JPasswordField Password;
    
    
    
    MessageDialog()
    {
        SetupFrame();
    }
    
    public void SetupFrame()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("Classroom Management System");
         
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
         
         //teacher
         Teacher = new JLabel("Teacher");
         Teacher.setBounds(270, 300, 150, 50);
         Teacher.setFont(f);
         Teacher.setForeground(Color.BLUE);
         Teacher.setToolTipText("Login As Teacher");
         c.add(Teacher);
         
         TImage= new ImageIcon(getClass().getResource("index.png"));
         TImg= new JButton(TImage);
         TImg.setContentAreaFilled(false);
         TImg.setFocusPainted(false);
         TImg.setBorderPainted(true);
         TImg.setBounds(230,150,150,150);
         c.add(TImg);
         
         //Student
         Student= new JLabel("Student");
         Student.setBounds(470, 300, 150, 50);
         Student.setFont(f);
         Student.setForeground(Color.BLUE);
         Student.setToolTipText("Login As Student");
         c.add(Student);
         
         SImage= new ImageIcon(getClass().getResource("Student.png"));
         SImg= new JButton(SImage);
         SImg.setContentAreaFilled(false);
         SImg.setFocusPainted(false);
         SImg.setBorderPainted(false);
         SImg.setBounds(430,150,150,150);
         c.add(SImg);

         //Admin
         Admin= new JButton("Admin Panel");
         Admin.setBounds(650, 500, 100, 40);
         Admin.setFont(f1);
         Admin.setForeground(Color.BLUE);
         c.add(Admin);
         
         TImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                    dispose(); 
                    TeacherLogin frame = new TeacherLogin();
                     frame.setVisible(true);
             }
             
         });
         
         SImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     dispose();
                     StudentLogin frame = new StudentLogin();
                     frame.setVisible(true);
             }
             
         });


    }
    

    public static void main(String[] args) {

         MessageDialog frame = new MessageDialog();
         frame.setVisible(true);
    }
    
}
