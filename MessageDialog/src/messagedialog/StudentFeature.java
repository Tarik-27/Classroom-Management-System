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

public class StudentFeature extends JFrame{
    
    ImageIcon Icon,Assignment,Schedule,Book,Mark,Exam,Student;
    Container c;
    JLabel schedule, assignment, book, mark, exam,student, SImg;
    JButton ScImg,BImg,MImg,AsImg,EImg,Logout;
    Font f,f1;
    
    
    
    StudentFeature()
    {
        SFeature();
    }
    
    public void SFeature()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("Teacher");
         
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
        
         
         
         Student= new ImageIcon(getClass().getResource("Student.png"));
         SImg= new JLabel(Student);
         SImg.setBounds(300,15,150,150);
         c.add(SImg);
         
         student = new JLabel("Student");
         student.setBounds(340, 150, 150, 50);
         student.setFont(f);
         student.setForeground(Color.BLUE);
         c.add(student);
         
         
         
         
         Schedule= new ImageIcon(getClass().getResource("Schedule.png"));
         ScImg= new JButton(Schedule);
         ScImg.setContentAreaFilled(false);
         ScImg.setFocusPainted(false);
         ScImg.setBorderPainted(true);
         ScImg.setBounds(305,200,150,150);
         c.add(ScImg);
         
         schedule = new JLabel("Schedule");
         schedule.setBounds(335, 330, 150, 50);
         schedule.setFont(f);
         schedule.setForeground(Color.BLUE);
         schedule.setToolTipText("Update Schedule");
         c.add(schedule);
         
         Exam= new ImageIcon(getClass().getResource("Exam.png"));
         EImg= new JButton(Exam);
         EImg.setContentAreaFilled(false);
         EImg.setFocusPainted(false);
         EImg.setBorderPainted(true);
         EImg.setBounds(105,200,150,150);
         c.add(EImg);
         
         exam = new JLabel("Exam");
         exam.setBounds(150, 330, 150, 50);
         exam.setFont(f);
         exam.setForeground(Color.BLUE);
         exam.setToolTipText("Attend Exam");
         c.add(exam);
         
         
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
         
          Logout.addActionListener(new ActionListener()
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

         StudentFeature frame = new StudentFeature();
         frame.setVisible(true);
    }
    
}
