import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;

public class Information extends Frame {
    public Information(){
        System.out.println("Default constructor of Information");
    }
    public Information(int a,int b,int c){
        super("Show");
       setSize(700,700);
        setLocation(200, 150);
         setBackground(Color.cyan); 
            Label q=new Label("Balance:"+a);
		q.setFont(new Font("Serif", Font.BOLD, 20));
	    Label l2=new Label("Withdraw:"+b);
		l2.setFont(new Font("Serif", Font.BOLD, 20));
            Label l3=new Label("Diposit:"+c);
		l3.setFont(new Font("Serif", Font.BOLD, 20));	
            q.setBounds(50,300,250,50);
	    add(q);
            l2.setBounds(50,400,140,50);
            add(l2);
            l3.setBounds(50,500,140,50);
            add(l3);
            Button j = new Button("go back");
            j.setBounds(250,550,60,50);
	    j.setBackground(Color.yellow);
	    add(j);
            ButtonSensor bs = new ButtonSensor(this);
            j.addActionListener(bs);
            addWindowListener(new WindowSensor());
            setLayout(null);
		setVisible(true);
    }
   

  
    
}
