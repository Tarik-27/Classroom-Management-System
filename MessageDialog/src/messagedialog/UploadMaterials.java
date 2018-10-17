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
import javax.swing.JTextField;

public class UploadMaterials extends JFrame{
    
    ImageIcon Icon, TImage, SImage;
    Container c;
    JLabel Type, Description;
    JButton TImg, SImg, Admin;
    Font f,f1;
    JComboBox jc;
    String [] type = {"Book","Note","Solution"};
    //
    JTextField UserName;
    JPasswordField Password;
    
    
    
    UploadMaterials()
    {
        Materials();
    }
    
    public void Materials()
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
         
         Type = new JLabel ("Type: ");
         Type.setBounds(80,100,200,50);
         Type.setFont(f);
         Type.setForeground(Color.BLUE);
         c.add(Type);
         
         jc = new JComboBox (type);
         jc.setBounds(150,100,200,50);
         jc.setFont(f);
         jc.setForeground(Color.BLUE);
         c.add(jc);
         
         Type = new JLabel ("Details: ");
         Type.setBounds(80,100,200,50);
         Type.setFont(f);
         Type.setForeground(Color.BLUE);
         c.add(Type);
         



    }
    

    public static void main(String[] args) {

         UploadMaterials frame = new UploadMaterials();
         frame.setVisible(true);
    }
    
}
