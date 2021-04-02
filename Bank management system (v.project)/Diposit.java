//package bank_management_system;
import java.awt.*;
import javax.swing.JPasswordField;
import java.awt.event.*;
class Diposit extends Frame{
	    
	TextField Ammount = new TextField();		
		
		  
    public Diposit(){
        super("Diposit money");
        setSize(700,700);
        setLocation(200, 150);
        setBackground(Color.cyan);
		Label l2; 
	    l2=new Label("Ammount :");
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l2.setBounds(50,350,140,50);
		add(l2);
		Ammount.setBounds(310,350,200,40);
		add(Ammount);
		
        Button b = new Button("OK");
        b.setBounds(250,450,60,50);
	    b.setBackground(Color.yellow);
	    add(b);
		
		
        addWindowListener(new WindowSensor());
        
       
        ButtonSensor bs = new ButtonSensor(this);
        b.addActionListener(bs);
            
        setLayout(null);
		setVisible(true);
    }
    

   
    public static void main(String[] v){
        
        Diposit d = new Diposit();
        d.setVisible(true);
    }
}


