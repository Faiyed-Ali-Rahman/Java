import java.awt.*;
import javax.swing.JPasswordField;
import java.awt.event.*;
class Transfer extends Frame{
	    
        TextField uid = new TextField();
         TextField oid = new TextField();
		TextField Ammount = new TextField();
		JPasswordField Password = new JPasswordField();
		
		
		  
    public Transfer(){
        super("TRANSFER");
        setSize(700,700);
         setLocation(200, 150);
         setBackground(Color.cyan);
	
		Label l1,l2,l3; 
                Label k=new Label("Own id :");
		k.setFont(new Font("Serif", Font.BOLD, 20));
		l1=new Label("Account id :");
		l1.setFont(new Font("Serif", Font.BOLD, 20));
	    l2=new Label("Ammount :");
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l3=new Label("Password :");
		l3.setFont(new Font("Serif", Font.BOLD, 20));	
		
                k.setBounds(50,250,140,50);
                add(k);
		l1.setBounds(50,300,140,50);
		add(l1);
		l2.setBounds(50,350,140,50);
		add(l2);
		l3.setBounds(50,400,140,50);
		add(l3);
		
                oid.setBounds(310,250,200,40);
                add(oid);
		uid.setBounds(310,300,200,40);
		add(uid);
		Ammount.setBounds(310,350,200,40);
		add(Ammount);
		Password.setBounds(310,400,200,40);
		add(Password);
		
        Button b = new Button("go");
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

