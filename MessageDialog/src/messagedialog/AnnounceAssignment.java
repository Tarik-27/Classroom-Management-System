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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AnnounceAssignment extends JFrame{
    
    ImageIcon Icon, AImage;
    Container c;
    JLabel Topic, AssignmentDetails, Submission,SubmissionT, AImg, Head ;
    JTextField topic, submission, submissionT;
    JTextArea details;
    JButton Announce, Back;
    Font f,f1;
    //
    JTextField UserName;
    JPasswordField Password;
    
    
    
    AnnounceAssignment()
    {
        Mark();
    }
    
    public void Mark()
    {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,150,800,600);
         setTitle("AnnounceAssignment");
         
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
         
         AImage= new ImageIcon(getClass().getResource("Assignment.png"));
         AImg = new JLabel (AImage);
         AImg.setBounds(320,10,150,100);
         AImg.setFont(f);
         AImg.setForeground(Color.BLUE);
         c.add(AImg);
         
         Head = new JLabel ("Announce Assignment");
         Head.setBounds(320,70,200,100);
         Head.setFont(f);
         Head.setForeground(Color.BLUE);
         c.add(Head);
         
         Topic = new JLabel ("Tittle: ");
         Topic.setBounds(80,170,200,100);
         Topic.setFont(f);
         Topic.setForeground(Color.BLUE);
         c.add(Topic);
         
         topic = new JTextField ();
         topic.setBounds(150,200,230,50);
         topic.setFont(f);
         topic.setForeground(Color.BLUE);
         c.add(topic);
         
         Submission = new JLabel ("Submission Date: ");
         Submission.setBounds(80,270,150,50);
         Submission.setFont(f);
         Submission.setForeground(Color.BLUE);
         c.add(Submission);
         
         submission = new JTextField ();
         submission.setBounds(230,270,150,50);
         submission.setFont(f);
         submission.setForeground(Color.BLUE);
         c.add(submission);
         
         
         
         SubmissionT = new JLabel ("Submission Time: ");
         SubmissionT.setBounds(80,340,150,50);
         SubmissionT.setFont(f);
         SubmissionT.setForeground(Color.BLUE);
         c.add(SubmissionT);
         
         submissionT = new JTextField ();
         submissionT.setBounds(230,340,150,50);
         submissionT.setFont(f);
         submissionT.setForeground(Color.BLUE);
         c.add(submissionT);
         
         
         
         details = new JTextArea ();
         details.setBounds(400,200,300,200);
         details.setFont(f);
         details.setForeground(Color.BLUE);
         c.add(details);
         
         AssignmentDetails = new JLabel ("ASSIGNMENT DETAILS: ");
         AssignmentDetails.setBounds(400,70,300,200);
         AssignmentDetails.setFont(f);
         AssignmentDetails.setForeground(Color.BLUE);
         c.add(AssignmentDetails);
         
         
         Announce = new JButton ("Announce");
         Announce.setBounds(320,500,150,50);
         Announce.setFont(f);
         Announce.setForeground(Color.BLUE);
         c.add(Announce);
         
         Back = new JButton ("Back");
         Back.setBounds(700,20,60,30);
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

         AnnounceAssignment frame = new AnnounceAssignment();
         frame.setVisible(true);
    }
    
}
