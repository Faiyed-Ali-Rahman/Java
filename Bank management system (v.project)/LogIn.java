import java.awt.*;
import java.awt.event.*;
//package bank_management_system;
class LogIn extends Frame {
    public LogIn(){
        super("Welcome");
        setSize(700,700);
//        Frame a=new Frame();
        setBackground(Color.cyan);
        setLocation(200, 150);
        Button log=new Button("log in");
        Button sign=new Button("sign up");
        log.setBackground(Color.lightGray);
        sign.setBackground(Color.lightGray);
        add(log);
        add(sign);
        log.setBounds(300,200,80,60);
        sign.setBounds(300,400,80,60);
        addWindowListener(new WindowSensor());
        
        ButtonSensor bs=new ButtonSensor(this);
        log.addActionListener(bs);
        sign.addActionListener(bs);
         setLayout(null);
		setVisible(true);
       
    }
   
    
    
    
}
