import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    public String msg;
    public Label message;

    public MyFrame() {
        super("Online Bank Account : User Details");
        msg = "Window Created";

        message = new Label();
        Label idLabel = new Label("User : ");

        Button logoutButton=new Button("Logout");Button exitButton=new Button("Exit");

        add(idLabel);

        add(logoutButton);
        add(exitButton);


        ButtonSensor bs=new ButtonSensor(this);
        logoutButton.addActionListener(bs);
        exitButton.addActionListener(bs);

        setSize(390,250);
        int screenWidth=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        setLocation((screenWidth-600)/2,450);
        setLayout(new FlowLayout());
    }
    
}

