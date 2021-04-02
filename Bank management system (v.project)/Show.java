import java.awt.*;
import java.awt.event.*;
//package bank_management_system;
/**
 *
 * @author Arnob
 */
public class Show extends Frame{
    public Show(){
        super("Show");
       setSize(700,700);
        setLocation(200, 150);
         setBackground(Color.cyan);
        Button balance=new Button("Balance");
        Button withdraw=new Button("Withdraw");
        Button diposit=new Button("Diposit");
        Button transfer=new Button("Transfer");
        balance.setBackground(Color.yellow);
        withdraw.setBackground(Color.blue);
        diposit.setBackground(Color.green);
        transfer.setBackground(Color.orange);
        
        balance.setBounds(250,150,90,80);
        withdraw.setBounds(250,250,90,80);
        diposit.setBounds(250,350,90,80);
        transfer.setBounds(250,450,90,80);
        add(balance);
        add(withdraw);
        add(diposit);
        add(transfer);
       
        addWindowListener(new WindowSensor());
        setLayout(new FlowLayout());
        ButtonSensor bs=new ButtonSensor(this);
        balance.addActionListener(bs);
        withdraw.addActionListener(bs);
        diposit.addActionListener(bs);
        transfer.addActionListener(bs);
         setLayout(null);
		setVisible(true);
        
    }
    
}
