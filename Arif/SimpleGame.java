
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
    public JTextField textfield1 , textfield2, textfield3, textfield4, textfield5, textfield6,textfield7,textfield8,textfield9, textfield10, textfield11, textfield12;
    private JButton button1,button2,button3,button4,button5,button6;
    private ImageIcon button_picture;
    private int total_point = 0, attempt = 0;
	private int p2 =0, p3 =0, p4 =0, police, babu, chur;
    
    public SimpleGame()
    {
        setFrame();
        setContainer();
        setTextField();
        setPanel();
        setIcons();
        setButton();
        setActionListener();
		setPlayerField();
        
    
    }
    
    public void setFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 150, 1000, 500);
    }
    
    
    public void setContainer()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
    }
    
    public void setTextField()
    {
        textfield11 = new JTextField();
        textfield11.setBounds(570, 100, 160, 55);
        textfield11.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield11.setHorizontalAlignment(JTextField.CENTER);
        textfield11.setEditable(false);
		textfield11.setText("You");
        c.add(textfield11);
		
		textfield1 = new JTextField();
        textfield1.setBounds(730, 100, 150, 55);
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
		
		textfield3 = new JTextField();
        textfield3.setBounds(50, 370, 400, 55);
        textfield3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield3.setHorizontalAlignment(JTextField.CENTER);
        textfield3.setEditable(false);
		textfield3.setText("Your Turn");
        c.add(textfield3);
		
		
		textfield12 = new JTextField();
        textfield12.setBounds(50, 25, 200, 55);
        textfield12.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield12.setHorizontalAlignment(JTextField.CENTER);
        textfield12.setEditable(false);
		textfield12.setText("Turn NO:");
        c.add(textfield12);
		
    }
	
	public void setPlayerField()
	{
		textfield4 = new JTextField();
        textfield4.setBounds(570, 200, 160, 55);
        textfield4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield4.setHorizontalAlignment(JTextField.CENTER);
        textfield4.setEditable(false);
		textfield4.setText("2nd player");
        c.add(textfield4);
		
		textfield5 = new JTextField();
        textfield5.setBounds(730, 200, 150, 55);
        textfield5.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield5.setHorizontalAlignment(JTextField.CENTER);
        textfield5.setEditable(false);
		textfield5.setText("");
        c.add(textfield5);
		
		textfield6 = new JTextField();
        textfield6.setBounds(570, 300, 160, 55);
        textfield6.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield6.setHorizontalAlignment(JTextField.CENTER);
        textfield6.setEditable(false);
		textfield6.setText("3rd player");
        c.add(textfield6);
		
		textfield7 = new JTextField();
        textfield7.setBounds(730, 300, 150, 55);
        textfield7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield7.setHorizontalAlignment(JTextField.CENTER);
        textfield7.setEditable(false);
		textfield7.setText("");
        c.add(textfield7);
		
		textfield8 = new JTextField();
        textfield8.setBounds(570, 400, 160, 55);
        textfield8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield8.setHorizontalAlignment(JTextField.CENTER);
        textfield8.setEditable(false);
		textfield8.setText("4th player");
        c.add(textfield8);
		
		textfield9 = new JTextField();
        textfield9.setBounds(730, 400, 150, 55);
        textfield9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield9.setHorizontalAlignment(JTextField.CENTER);
        textfield9.setEditable(false);
		textfield9.setText("");
        c.add(textfield9);
		
		textfield10 = new JTextField();
        textfield10.setBounds(650, 25, 150, 55);
        textfield10.setFont(new Font("Times New Roman",Font.BOLD,20));
        textfield10.setHorizontalAlignment(JTextField.CENTER);
        textfield10.setEditable(false);
		textfield10.setText("Point Table");
        c.add(textfield10);
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
		textfield3.setText("Your Turn");
		
        if(ae.getSource()==button1||ae.getSource()==button2||ae.getSource()==button3||ae.getSource()==button4)
        {
            attempt = attempt + 1;
            textfield2.setText(""+attempt);
            
            
            Random rand = new Random();
            
            int random_number = rand.nextInt(4);
            
            if(random_number==0)
            {
				textfield3.setText("");
                JOptionPane.showMessageDialog(null,"Congratulations You are BABU and Got 1000 Points");
                total_point = total_point + 1000;
                textfield1.setText(""+total_point);
				this.YouBabu();
				textfield3.setText("Your turn");
            }
            else if(random_number==1)
            {
				textfield3.setText("");
                JOptionPane.showMessageDialog(null,"Congratulations You are Police Now Find Chur and Dakat");
                panel1.setVisible(false);
                panel2.setVisible(true);
				textfield3.setText("Guess Chur or Dakat");
            }
            else if(random_number==2)
            {
			   textfield3.setText("Computer's turn");
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Chur So Keep Silent");
               if(checkHim()==0)
               {
                  JOptionPane.showMessageDialog(null,"So Sad!!! You Are Caught");
                  total_point = total_point + 0;
                  textfield1.setText(""+total_point);
				  chur = 0;
				  this.YouChur();
				  textfield3.setText("Your turn");
               }
               else
               {
                  JOptionPane.showMessageDialog(null,"Congratulations You Are Safe");
                  total_point = total_point + 600;
                  textfield1.setText(""+total_point);
				  chur = 1;
				  this.YouChur();
				  textfield3.setText("Your turn");
               }
            }
            else if(random_number==3)
            {   
                textfield3.setText("");		
               JOptionPane.showMessageDialog(null,"Hey Dirty Fellow You are a Dakat So Keep Silent");
			   textfield3.setText("Computer's turn");
			   
               if(checkHim()==0)
               {
                  JOptionPane.showMessageDialog(null,"So Sad!!! You Are Caught");
                  total_point = total_point + 0;
                  textfield1.setText(""+total_point);
				  chur = 0;
				  this.YouChur();
               }
               else
               {
                  JOptionPane.showMessageDialog(null,"Congratulations You Are Safe");
                  total_point = total_point + 800;
                  textfield1.setText(""+total_point);
				  chur = 1;
				  this.YouChur();
               }
			   textfield3.setText("Your Turn");
               
            }
        }
        
        if(ae.getSource()==button5||ae.getSource()==button6)
        {
			
            Random rand = new Random();
            
            int random_number = rand.nextInt(2);
			textfield3.setText("");
            
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
				
            this.YouPolice();
        }   textfield3.setText("Your Turn");
    }
    
    public int checkHim()
    {
        Random rand = new Random();
        int random_number = rand.nextInt(2);
        
        return random_number;
    }
	
	
	public void YouBabu()
	{
		textfield3.setText("Computers turn");
		Random ran = new Random();
		
		int person = ran.nextInt(3);
		
				int option = ran.nextInt(2);
				if(option == 0)
				{
					JOptionPane.showMessageDialog(null, "Player "+(person+2)+  " was police and he guess right");
					if(person==0)
					{
						p2 = p2+500;
						textfield5.setText(""+p2);
					}
                       
                    else if(person==1)
					{
						p3 = p3+500;
						textfield7.setText(""+p3);
					}
					else if(person==2)
					{
						p4 = p4+500;
						textfield9.setText(""+p4);
					}	
				}
					
				else
					JOptionPane.showMessageDialog(null, "Player "+(person+2)+  " was police and he guess Wrong");		
	}
	
	
	public void YouPolice()
	{
		textfield3.setText("Computers turn");
		Random ran = new Random();
		
		int person = ran.nextInt(3);
	
		JOptionPane.showMessageDialog(null, "Player "+(person+2)+  " is Babu");
		            if(person==0)
					{
						p2 = p2+1000;
						textfield5.setText(""+p2);
					}
                       
                    else if(person==1)
					{
						p3 = p3+1000;
						textfield7.setText(""+p3);
					}
					else if(person==2)
					{
						p4 = p4+1000;
						textfield9.setText(""+p3);
					}			
	}
	
	
	public void YouChur()
	{
		textfield3.setText("Computers turn");
		Random ran = new Random();
		
		police = 1;
		babu = 1;
		 while(police==babu)
		 {
			 police = ran.nextInt(3);
			 babu = ran.nextInt(3);
		 }
		 JOptionPane.showMessageDialog(null, "Player "+(babu+2)+  " is Babu");
		 {
			 if(babu==0)
			{
				p2 = p2+1000;
			    textfield5.setText(""+p2);
			}
                       
            else if(babu==1)
			{
				p3 = p3+1000;
				textfield7.setText(""+p3);
			}
			else if(babu==2)
			{
				p4 = p4+1000;
				textfield9.setText(""+p3);
			}	
		 }
		 
		 if(chur == 0)
		 {
			JOptionPane.showMessageDialog(null, "Player "+(police+2)+  " is Police and guess Right");
            if(police==0)
			{
				p2 = p2+1000;
			    textfield5.setText(""+p2);
			}
                       
            else if(police==1)
			{
				p3 = p3+1000;
				textfield7.setText(""+p3);
			}
			else if(police==2)
			{
				p4 = p4+1000;
				textfield9.setText(""+p3);
			}				
		 }
		 else if (chur ==1)
		 {
			 JOptionPane.showMessageDialog(null, "Player "+(police+2)+  " is Police and guess Wrong");
		 }
	}
	

    public static void main(String[] args) 
    {
       SimpleGame frame = new SimpleGame();
	   frame.setLocationRelativeTo(null);
	   frame.setTitle("~~~ CHUR dhoren , DAKAT maren~~~");
       frame.setVisible(true);
    }
      
}
