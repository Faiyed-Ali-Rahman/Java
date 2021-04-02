import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
class ButtonSensor implements ActionListener{
    LogIn l;
    Registration r;
    Requirement r1;
    Show s;
    String log;
    Diposit d;
    Withdraw w;
    static int x;
    Transfer gt;
    MyFrame mf;
    Information i;


    public ButtonSensor(Withdraw w){
        this.w = w;
    }

    public ButtonSensor(Transfer gt){
        this.gt = gt;
    }

    public ButtonSensor(Diposit d){
        this.d = d;
    }

    public ButtonSensor(LogIn l){
        this.l=l;        
    } 

    public ButtonSensor(Registration r){
        this.r=r;        
    }

    public ButtonSensor(Requirement r1){
        this.r1=r1;        
    }

    public ButtonSensor(Show s){
        this.s=s;        
    }
    
    public ButtonSensor(MyFrame f){
        mf=f;
    }
    
    public ButtonSensor(Information i){
        this.i=i;
    }
    
    public void actionPerformed(ActionEvent ae){
        boolean flag=true;
        String s3=ae.getActionCommand();

        if(flag && s3.equals("Logout")){
            System.out.println("Logout Completed");
            LogIn ob1=new LogIn();
            ob1.setVisible(true);
            mf.setVisible(false);
        }

        if(flag && s3.equals("Exit")){
            System.out.println("Exit is Working");
            mf.setVisible(false);
        }


        if(ae.getActionCommand()=="log in"){
            System.out.println("log in button pressed");
            Requirement obj1=new Requirement();
            obj1.setVisible(true);
            l.setVisible(false);
        }

        else if(ae.getActionCommand()=="sign up"){
            System.out.println("sign up button pressed");
            Registration ob=new Registration();
            ob.setVisible(true);
            l.setVisible(false);
        }

        else if(ae.getActionCommand()=="complete"){
            System.out.println(r.Name.getText());
            System.out.println(r.Age.getText());
            System.out.println(r.Gender.getText());
            System.out.println(r.Number.getText());
            NewAccountAdd ob=new NewAccountAdd(r.Name.getText(),r.Age.getText(),r.Gender.getText(),r.Number.getText(),r.password.getText());
            LogIn ob1=new LogIn();
            ob1.setVisible(true);
            r.setVisible(false);
        }

        else if(ae.getActionCommand()=="Back"){
            r.setVisible(false);
            LogIn l=new LogIn();
            l.setVisible(true);
        }

        else if(ae.getActionCommand()=="Previous"){
            r1.setVisible(false);
            LogIn l=new LogIn();
            l.setVisible(true);
        }

        else if (ae.getActionCommand()=="Next"){
            System.out.println(r1.name.getText());
            System.out.println(r1.pass.getPassword());
            DataAccess l=new DataAccess();
            try{                
                log="select * from registration where Name='"+r1.name.getText()+"' and password='"+r1.pass.getText()+"'";
                ResultSet rs =l.getData(log);
                rs.next();
                x=rs.getInt("id");
                ResultSet c=l.getData(log);
                if(c.next()){
                    System.out.println(x);
                    System.out.println("Log in successfully");
                    Show s=new Show();
                    s.setVisible(true);
                    //l.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(r1,"You must provide a department no.");
                    System.out.println("log in failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }                        
        }

        else if(ae.getActionCommand()=="Transfer"){
            s.setVisible(false);
            Transfer t= new Transfer();                 
        }

        else if(ae.getActionCommand()=="go"){
            System.out.println("Clicked");
            System.out.println(gt.uid.getText());
            System.out.println(gt.Ammount.getText());
             System.out.println(gt.oid.getText());
             System.out.println(gt.Password.getPassword());

            //DataAccess l=new DataAccess();
            try{                
                DataAccess l=new DataAccess();
                log="select * from registration where id='"+gt.oid.getText()+"' and password='"+gt.Password.getText()+"'";
                l.getData(log);
                ResultSet c=l.getData(log);
                if(c.next()){
                    try {
                String query1 = "SELECT * FROM amount WHERE uid=" + gt.uid.getText();
                ResultSet rs = l.getData(query1);
                rs.next();
                
                int newBalance = rs.getInt("balance") + Integer.parseInt(gt.Ammount.getText());
                String query2 = "UPDATE amount SET balance=" + newBalance + " WHERE uid=" + gt.uid.getText();
                l.updateDB(query2);
                
                String query3 = "SELECT * FROM amount WHERE uid=" + gt.oid.getText();
                ResultSet rs1 = l.getData(query3);
                rs1.next();
                
                int newBalance2 = rs1.getInt("balance") - Integer.parseInt(gt.Ammount.getText());
                String query4 = "UPDATE amount SET balance=" + newBalance2 + " WHERE uid=" + gt.oid.getText();
                l.updateDB(query4);
                JOptionPane.showMessageDialog(gt,"CONGRATULATION,transfer sucessful");
         
                
            } catch (Exception e) {
                //
            }
                    //l.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(gt,"You must provide a right id or password");
                    System.out.println("log in failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("something is wrong");
            }
            Show s=new Show();
                s.setVisible(true);
          
        }
        else if(ae.getActionCommand()=="Withdraw")
            {
                Withdraw w=new Withdraw();
                w.setVisible(true);
            }
        else if(ae.getActionCommand()=="yes")
         {
                try {
                String query1 = "SELECT * FROM amount WHERE uid="+x ;
                DataAccess l = new DataAccess();
                ResultSet rs = l.getData(query1);
                rs.next();
           
                int newBalance = rs.getInt("balance") - Integer.parseInt(w.Ammount.getText());
                if(w.Ammount.getText()==null){
                    JOptionPane.showMessageDialog(w,"you didn't submit any amount");
                }
                else if(newBalance>=0){
                String query2 = "UPDATE amount SET balance=" + newBalance + " WHERE uid=" + x;
                l.updateDB(query2);
                int newBalance2 = rs.getInt("withdraw") + Integer.parseInt(w.Ammount.getText());
                String query3 = "UPDATE amount SET withdraw=" + newBalance2 + " WHERE uid=" + x;
                l.updateDB(query3);
                JOptionPane.showMessageDialog(w,"CONGRATULATION,withdraw sucessful");
           
                }
                else{
                JOptionPane.showMessageDialog(w,"you have not enough balance");
                }
            } catch (Exception e) {
                System.out.println("something is missing");
            }
                Show s=new Show();
                s.setVisible(true);
                
            }
        
        else if(ae.getActionCommand()=="Diposit")
            {
                Diposit d=new Diposit();
                d.setVisible(true);
                
            }
        else if(ae.getActionCommand()=="OK")
         {
                try {
                String query1 = "SELECT * FROM amount WHERE uid="+x ;
                DataAccess l = new DataAccess();
                ResultSet rs = l.getData(query1);
                rs.next();
                
                int newBalance = rs.getInt("balance") + Integer.parseInt(d.Ammount.getText());
                String query2 = "UPDATE amount SET balance=" + newBalance + " WHERE uid=" + x;
                l.updateDB(query2);
                
                int newBalance2 = rs.getInt("deposit") + Integer.parseInt(d.Ammount.getText());
                String query3 = "UPDATE amount SET deposit=" + newBalance2 + " WHERE uid=" + x;
                l.updateDB(query3);
                JOptionPane.showMessageDialog(d,"CONGRATULATION,diposit sucessful");
            } catch (Exception e) {
               System.out.println("something is fault");
            }
                Show s=new Show();
                s.setVisible(true);
            }
        
        else if(ae.getActionCommand()=="Balance"){
            try{
            String query1 = "SELECT * FROM amount WHERE uid="+x ;
                DataAccess l = new DataAccess();
                ResultSet rs = l.getData(query1);
                rs.next();
                
                int Balance = rs.getInt("balance");
                int withdraw=rs.getInt("withdraw");
                int diposit=rs.getInt("deposit");
                Information i=new Information(Balance,withdraw,diposit);
                i.setVisible(true);
                
            }
            catch (Exception e) {
               System.out.println("something is error");
            }
        }
        
        if(ae.getActionCommand()=="go back"){
            
            Show s=new Show();
            s.setVisible(true);
        }
       
    }
    
}



// "SELECT * FROM amount WHERE uid=10"
// int newBalance = oldBalance + input;
// "UPDATE amount SET balance=newBalance WHERE uid=10"