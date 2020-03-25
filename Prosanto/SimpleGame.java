
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
    private JPanel panel1;
    private JTextField textfield;
    private JButton button1,button2,button3,button4;
    private ImageIcon button_picture;
    private int total_point=0;
    
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
        textfield = new JTextField();
        textfield.setBounds(180, 25, 110, 55);
        textfield.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
        c.add(textfield);
    }

    public void setPanel()
    {
        panel1 = new JPanel();
        panel1.setBounds(90,130,300,220);
        panel1.setLayout(new GridLayout(2,2));
        panel1.setBackground(Color.yellow);
        c.add(panel1);
    }
    
    public void setIcons()
    {
       button_picture = new ImageIcon(getClass().getResource("/Pictures/button.png"));
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
        
    }
    
    public void setActionListener()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==button1||ae.getSource()==button2||ae.getSource()==button3||ae.getSource()==button4)
        {
            Random rand = new Random();
            
            int random_number = rand.nextInt(4);
            
            if(random_number==0)
            {
                JOptionPane.showMessageDialog(null,"Congratulations You are BABU and Got 1000 Points");
                total_point = total_point + 1000;
                textfield.setText(""+total_point);
            }
            else if(random_number==1)
            {
                JOptionPane.showMessageDialog(null,"Congratulations You are Police Now Find Chur and Dakat");
            }
            else if(random_number==2)
            {
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Chur So Keep Silent");
            }
            else if(random_number==3)
            {                
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Dakat So Keep Silent");
            }
           
        }
    }
    
    

    public static void main(String[] args) 
    {
       SimpleGame frame = new SimpleGame();
       frame.setVisible(true);
    }
      
}
