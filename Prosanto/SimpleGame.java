
package simple.game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SimpleGame extends JFrame implements ActionListener{
    
    private Container c;
    private JPanel panel1,panel2;
    private JTextField textfield1 , textfield2;
    private JButton button1,button2,button3,button4,button5,button6;
    private ImageIcon button_picture;
    private int total_point = 0,attempt = 0;
    
    public SimpleGame()
    {
        setFrame();
        setContainer();
        setTextField();
        setPanel();
        setIcons();
        setButton();
        setActionListener();
        
    
    }
    
    public void setFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 150, 500, 500);
    }
    
    
    public void setContainer()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
    }
    
    public void setTextField()
    {
        textfield1 = new JTextField();
        textfield1.setBounds(120, 25, 110, 55);
        textfield1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield1.setHorizontalAlignment(JTextField.CENTER);
        textfield1.setEditable(false);
        c.add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(270, 25, 60, 55);
        textfield2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield2.setHorizontalAlignment(JTextField.CENTER);
        textfield2.setEditable(false);
        c.add(textfield2);
    }

    public void setPanel()
    {
        panel1 = new JPanel();
        panel1.setBounds(90,130,300,220);
        panel1.setLayout(new GridLayout(2,2));
        c.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBounds(90,130,300,220);
        panel2.setLayout(new GridLayout(1,1));
        c.add(panel2);
    }
    
    public void setIcons()
    {
       button_picture = new ImageIcon(getClass().getResource("button.png"));
    }
    
    public void setButton()
    {
        button1 = new JButton(button_picture);
        button1.setBackground(Color.white);
        button1.setBorder(null);
        panel1.add(button1);
        
        button2 = new JButton(button_picture);
        button2.setBackground(Color.white);
        button2.setBorder(null);
        panel1.add(button2);
        
        button3 = new JButton(button_picture);
        button3.setBackground(Color.white);
        button3.setBorder(null);
        panel1.add(button3);
        
        button4 = new JButton(button_picture);
        button4.setBackground(Color.white);
        button4.setBorder(null);
        panel1.add(button4);
        
        button5 = new JButton(button_picture);
        button5.setBackground(Color.white);
        button5.setBorder(null);
        panel2.add(button5);
        
        button6 = new JButton(button_picture);
        button6.setBackground(Color.white);
        button6.setBorder(null);
        panel2.add(button6);
        
    }
    
    public void setActionListener()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==button1||ae.getSource()==button2||ae.getSource()==button3||ae.getSource()==button4)
        {
            attempt = attempt + 1;
            textfield2.setText(""+attempt);
            
            
            Random rand = new Random();
            
            int random_number = rand.nextInt(4);
            
            if(random_number==0)
            {
                JOptionPane.showMessageDialog(null,"Congratulations You are BABU and Got 1000 Points");
                total_point = total_point + 1000;
                textfield1.setText(""+total_point);
            }
            else if(random_number==1)
            {
                JOptionPane.showMessageDialog(null,"Congratulations You are Police Now Find Chur and Dakat");
                panel1.setVisible(false);
                panel2.setVisible(true);
            }
            else if(random_number==2)
            {
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Chur So Keep Silent");
               if(checkHim()==0)
               {
                  JOptionPane.showMessageDialog(null,"So Sad!!! You Are Caught");
                  total_point = total_point + 0;
                  textfield1.setText(""+total_point);
               }
               else
               {
                  JOptionPane.showMessageDialog(null,"Congratulations You Are Safe");
                  total_point = total_point + 600;
                  textfield1.setText(""+total_point);
               }
            }
            else if(random_number==3)
            {                
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Dakat So Keep Silent");
               if(checkHim()==0)
               {
                  JOptionPane.showMessageDialog(null,"So Sad!!! You Are Caught");
                  total_point = total_point + 0;
                  textfield1.setText(""+total_point);
               }
               else
               {
                  JOptionPane.showMessageDialog(null,"Congratulations You Are Safe");
                  total_point = total_point + 800;
                  textfield1.setText(""+total_point);
               }
               
            }
        }
        
        if(ae.getSource()==button5||ae.getSource()==button6)
        {
            Random rand = new Random();
            
            int random_number = rand.nextInt(2);
            {
                if(random_number==1)
                {
                    JOptionPane.showMessageDialog(null, "Congratulations You Have Done A Right Guess");
                    panel1.setVisible(true);
                    panel2.setVisible(false);
                    total_point = total_point + 800;
                    textfield1.setText(""+total_point);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "So Sad!! You Have Done A Wrong Guess");
                    panel1.setVisible(true);
                    panel2.setVisible(false);
                    total_point = total_point + 0;
                    textfield1.setText(""+total_point);
                }
            }
        }    
    }
    
    public int checkHim()
    {
        Random rand = new Random();
        int random_number = rand.nextInt(2);
        
        return random_number;
    }
    
    

    public static void main(String[] args) 
    {
       SimpleGame frame = new SimpleGame();
       frame.setVisible(true);
    }
      
}
