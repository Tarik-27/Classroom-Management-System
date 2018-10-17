package messagedialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RecordingMarks extends JFrame{
    
    ImageIcon Icon, TImage, SImage;
    Container c;
    JTable Mark;
    JScrollPane Scroll;
    //JTextField
    String [] cols = {"ID", "Quiz 1", "Quiz 2", "Quiz 3", "Mid", "Final","Total", "Grade Point"};
    String [][] rows = {
                        {"Student 1","15", "15 ", "15", "65", "130","270","4.00"},
                        {"Student 2","15", "15 ", "15", "75", "120","280","3.5"},
                        {"Student 3","07", "15 ", "13", "65", "130","250","3.7"},
                        {"Student 4","15", "10 ", "12", "45", "140","290","3.9",},
                        {"Student 5","15", "15 ", "14", "65", "130","275","3.8"},
    };
    Font f,f1;

    
    
    
    RecordingMarks()
    {
        Mark();
    }
    
    public void Mark()
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

         Mark = new JTable(rows,cols);
         
         Scroll = new JScrollPane(Mark);
         Scroll.setBounds(10,10,750,550);
         c.add(Scroll);

    }
    

    public static void main(String[] args) {

         RecordingMarks frame = new RecordingMarks();
         frame.setVisible(true);
    }
    
}
