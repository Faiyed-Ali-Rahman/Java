//package bank_management_system;
import java.awt.*;
import javax.swing.JPasswordField;
import java.awt.event.*;
class Withdraw extends Frame{
	    
	TextField Ammount = new TextField();		
		
		  
    public Withdraw(){
        super("Withdraw money");
        setSize(700,700);
        setBackground(Color.cyan);
        setLocation(200, 150);
		Label l2; 
	    l2=new Label("Ammount :");
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l2.setBounds(50,350,140,50);
		add(l2);
		Ammount.setBounds(310,350,200,40);
		add(Ammount);
		
        Button b = new Button("yes");
        b.setBounds(250,450,60,50);
	    b.setBackground(Color.yellow);
	    add(b);
		
		
        addWindowListener(new WindowSensor());
        
       
        ButtonSensor bs = new ButtonSensor(this);
        b.addActionListener(bs);
            
        setLayout(null);
		setVisible(true);
    }
    
}


