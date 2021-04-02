import java.awt.*;
import java.awt.event.*;
import javax.swing.JPasswordField;
//package bank_management_system;
/**
 *
 * @author Arnob
 */
public class Requirement extends Frame {
    TextField name=new TextField("");
   JPasswordField pass = new JPasswordField();
    public Requirement(){
        super("Requirement");
        setSize(700,700);
         setLocation(200, 150);
          setBackground(Color.cyan);
        Label l1=new Label("UserName :");
        l1.setFont(new Font("Serif", Font.BOLD, 20));
	Label l2=new Label("Password :");
        l2.setFont(new Font("Serif", Font.BOLD, 20));
        l1.setBounds(50,300,140,50);
	add(l1);
        add(name);
        name.setBounds(200,300,140,50);
        l2.setBounds(50,350,140,50);
        add(l2);
        add(pass);
        pass.setBounds(200,350,140,50);
        Button next=new Button("Next");
        Button previous=new Button("Previous");
        next.setBounds(200,500,50,50);
        next.setBackground(Color.green);
        add(next);
        previous.setBounds(300,500,50,50);
        previous.setBackground(Color.green);
        add(previous);
        addWindowListener(new WindowSensor());
        setLayout(new FlowLayout());
        ButtonSensor bs=new ButtonSensor(this);
        next.addActionListener(bs);
       previous.addActionListener(bs);
       setLayout(null);
		setVisible(true);
        
    }
}
