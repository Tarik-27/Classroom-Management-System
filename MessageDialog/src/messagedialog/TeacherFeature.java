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

public class TeacherFeature extends JFrame{
    
    ImageIcon Icon,Attendence,Assignment,Schedule,Book,Mark,Exam,Teacher;
    Container c;
    JLabel attendence, schedule, assignment, book, mark, exam,teacher, TImg;
    JButton AImg,SImg,BImg,MImg,AsImg,Logout;
    Font f,f1;
    
    
    
    TeacherFeature()
    {
        TFeature();
    }
    
    public void TFeature()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("Teacher");
         
         //Setting Up Icon
         Icon= new ImageIcon(getClass().getResource("index.png"));
         this.setIconImage(Icon.getImage());  
         
         //Logoutgroung Color
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.pink);
         
         //font
         f = new Font("Agency FB",Font.BOLD,25);
         f1 = new Font("Agency FB",Font.BOLD,15);
        
         
         
         Teacher= new ImageIcon(getClass().getResource("index.png"));
         TImg= new JLabel(Teacher);
         TImg.setBounds(300,15,150,150);
         c.add(TImg);
         
         teacher = new JLabel("Teacher");
         teacher.setBounds(340, 150, 150, 50);
         teacher.setFont(f);
         teacher.setForeground(Color.BLUE);
         c.add(teacher);
         
         Attendence= new ImageIcon(getClass().getResource("Attendence.png"));
         AImg= new JButton(Attendence);
         AImg.setContentAreaFilled(false);
         AImg.setFocusPainted(false);
         AImg.setBorderPainted(true);
         AImg.setBounds(105,200,150,150);
         c.add(AImg);
         
         attendence = new JLabel("Attendence");
         attendence.setBounds(135, 330, 150, 50);
         attendence.setFont(f);
         attendence.setForeground(Color.BLUE);
         attendence.setToolTipText("Record of Attendence");
         c.add(attendence);
         
         
         
         
         Schedule= new ImageIcon(getClass().getResource("Schedule.png"));
         SImg= new JButton(Schedule);
         SImg.setContentAreaFilled(false);
         SImg.setFocusPainted(false);
         SImg.setBorderPainted(true);
         SImg.setBounds(305,200,150,150);
         c.add(SImg);
         
         schedule = new JLabel("Schedule");
         schedule.setBounds(335, 330, 150, 50);
         schedule.setFont(f);
         schedule.setForeground(Color.BLUE);
         schedule.setToolTipText("Update Schedule");
         c.add(schedule);
         
         
         Assignment= new ImageIcon(getClass().getResource("Assignment.png"));
         AsImg= new JButton(Assignment);
         AsImg.setContentAreaFilled(false);
         AsImg.setFocusPainted(false);
         AsImg.setBorderPainted(true);
         AsImg.setBounds(505,200,150,150);
         c.add(AsImg);
         
         assignment = new JLabel("Assignment");
         assignment.setBounds(535, 330, 150, 50);
         assignment.setFont(f);
         assignment.setForeground(Color.BLUE);
         assignment.setToolTipText("Announce Assignment");
         c.add(assignment);
         
         
         Mark= new ImageIcon(getClass().getResource("Mark.png"));
         MImg= new JButton(Mark);
         MImg.setContentAreaFilled(false);
         MImg.setFocusPainted(false);
         MImg.setBorderPainted(true);
         MImg.setBounds(205,370,150,150);
         c.add(MImg);
         
         mark = new JLabel("Mark");
         mark.setBounds(255, 510, 150, 50);
         mark.setFont(f);
         mark.setForeground(Color.BLUE);
         mark.setToolTipText("Recording Mark");
         c.add(mark);
         
         
         Book= new ImageIcon(getClass().getResource("Book.png"));
         BImg= new JButton(Book);
         BImg.setContentAreaFilled(false);
         BImg.setFocusPainted(false);
         BImg.setBorderPainted(true);
         BImg.setBounds(405,370,150,150);
         c.add(BImg);
         
         book = new JLabel("upload Course Material");
         book.setBounds(405, 510, 200, 50);
         book.setFont(f);
         book.setForeground(Color.BLUE);
         book.setToolTipText("Upload course Material");
         c.add(book);
         
         Logout = new JButton("Logout");
         Logout.setBounds(700,5,70,30);
         Logout.setFont(f1);
         Logout.setForeground(Color.BLUE);
         c.add(Logout);
         
         
         AImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     RecordingAtttendence frame = new RecordingAtttendence();
                     frame.setVisible(true);
             }
             
         });
         
         MImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     RecordingMarks frame = new RecordingMarks();
                     frame.setVisible(true);
             }
             
         });
         
         AsImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     AnnounceAssignment frame = new AnnounceAssignment();
                     frame.setVisible(true);
             }
             
         });
         
         SImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     UpdateSchedule frame = new UpdateSchedule();
                     frame.setVisible(true);
             }
             
         });
         
         BImg.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     UploadMaterials frame = new UploadMaterials();
                     frame.setVisible(true);
             }
             
         });
         
         
         Logout.addActionListener(new ActionListener()
         {
             
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 
                     dispose();
                     TeacherLogin frame = new TeacherLogin();
                     frame.setVisible(true);
             }
             
         });
         
         


    }
    

    public static void main(String[] args) {

         TeacherFeature frame = new TeacherFeature();
         frame.setVisible(true);
    }
    
}
