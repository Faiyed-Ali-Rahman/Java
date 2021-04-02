import java.awt.*;
import java.awt.event.*;
import javax.swing.JPasswordField;
class Registration extends Frame{
        TextField Name=new TextField("");
        TextField Age=new TextField("");
        TextField Gender=new TextField("");
        TextField Number=new TextField("");
       JPasswordField password = new JPasswordField();
        public Registration(){
        super("Registration");
        setSize(700,700);
         setLocation(200, 150);
          setBackground(Color.cyan);
         Label l1,l2,l3,a,b; 
		l1=new Label("Account Name :");
		l1.setFont(new Font("Serif", Font.BOLD, 20));
	    l2=new Label("Age:");
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l3=new Label("Gender:");
		l3.setFont(new Font("Serif", Font.BOLD, 20));	
		a=new Label("Number:");
		a.setFont(new Font("Serif", Font.BOLD, 20));
                b=new Label("Password:");
		b.setFont(new Font("Serif", Font.BOLD, 20));	
		l1.setBounds(50,300,250,50);
		add(l1);
		l2.setBounds(50,350,140,50);
		add(l2);
		l3.setBounds(50,400,140,50);
		add(l3);
                a.setBounds(50,450,140,50);
		add(a);
                b.setBounds(50,500,140,50);
		add(b);
		
		Name.setBounds(310,300,200,40);
		add(Name);
		Age.setBounds(310,350,200,40);
		add(Age);
                Gender.setBounds(310,400,200,40);
		add(Gender);
                Number.setBounds(310,450,200,40);
		add(Number);
		password.setBounds(310,500,200,40);
		add(password);
		
        Button c = new Button("complete");
        c.setBounds(200,550,60,50);
	    c.setBackground(Color.yellow);
	    add(c);

        Button back=new Button("Back");
        back.setBounds(400,550,60,50);
	    back.setBackground(Color.yellow);
	    add(back);

        addWindowListener(new WindowSensor());
        setLayout(new FlowLayout());
        ButtonSensor bs=new ButtonSensor(this);
        c.addActionListener(bs);
        back.addActionListener(bs);
        setLayout(null);
		setVisible(true);
        
  }
    }
    


