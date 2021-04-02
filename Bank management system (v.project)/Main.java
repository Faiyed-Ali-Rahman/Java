public class Main extends Bank implements Person {
    public Main(){
        System.out.println("default constructor of main class called");
        
    }
    void write_massage(){
        System.out.println("Welcome to Bank Management system");
    }
    public void database(){
        System.out.println("Here is 1 official database of 2 tables. ");
    
    }
   public static void main(String[] v){
      LogIn l=new LogIn();
      l.setVisible(true);
   }
    
}
