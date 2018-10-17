
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TeacherLogin extends JFrame{

    ImageIcon Icon;
    Container a;
    JLabel User,Pass,Login, pic;
    JTextField UserName;
    JPasswordField Password;
    JButton login, Clear;
    Font f,f1;    
    
    TeacherLogin()
    {
        TLoginFrame();
    }
    
    public void TLoginFrame()
    { 
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(500,200,300,500);
         setTitle("Teacher Login");
         
         //Setting Up Icon
         Icon= new ImageIcon(getClass().getResource("index.png"));
         this.setIconImage(Icon.getImage());  
         
         //Backgroung Color
         a = this.getContentPane();
         a.setLayout(null);
         a. setBackground(Color.pink);
         
         //font
         
         f = new Font("Agency FB",Font.BOLD,25);
         f1 = new Font("Agency FB",Font.BOLD,18);
         
         pic = new JLabel(Icon);
         pic.setBounds(70,70,150,150);
         a.add(pic);
         
        
         Login = new JLabel ("Login As Teacher");
         Login.setBounds(80,220,150,50);
         Login.setFont(f);
         Login.setForeground(Color.BLUE);
         a.add(Login);
         
         User = new JLabel ("Username: ");
         User.setBounds(50,285,100,40);
         User.setFont(f);
         User.setForeground(Color.BLUE);
         a.add(User);
         
         Pass = new JLabel ("Password: ");
         Pass.setBounds(50,325,100,40);
         Pass.setFont(f);
         Pass.setForeground(Color.BLUE);
         a.add(Pass);
           
         UserName = new JTextField();
         UserName.setBounds(140,290,100,35);
         UserName.setFont(f1);
         UserName.setForeground(Color.BLUE);
         a.add(UserName);
         
         Password = new JPasswordField();
         Password.setEchoChar('*');
         Password.setBounds(140,330,100,35);
         Password.setFont(f1);
         Password.setForeground(Color.BLUE);
         a.add(Password);
         
         login = new JButton("Login");
         login.setBounds(30,400,100,35);
         login.setFont(f1);
         login.setForeground(Color.BLUE);
         a.add(login);
         
         Clear = new JButton("Reset");
         Clear.setBounds(150,400,100,35);
         Clear.setFont(f1);
         Clear.setForeground(Color.BLUE);
         a.add(Clear);
         
         login.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                 String userName = UserName.getText();
                 String password = Password.getText();
                 
                 if(userName.equals("Tarik") && password.equals("1234"))
                 {
                     //JOptionPane.showMessageDialog(null,"Logged in as a teacher succesfully");
                     dispose();
                     TeacherFeature frame = new TeacherFeature();
                     frame.setVisible(true);
                 }
                 
                 else
                     JOptionPane.showMessageDialog(null,"Invalid Username or Password");
             }
             
         });
         
         
         Clear.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                 UserName.setText("");
                 Password.setText("");
                         
             }
             
         });
             
         
    }
    
    public static void main(String[] args) {
        TeacherLogin frame= new TeacherLogin();
        frame.setVisible(true);
    }

    
}
