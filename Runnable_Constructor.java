class Mythr1 implements Runnable {

    Mythr1(String name) {
     // super(name);
    }
  
    public void run() {
      int id = 47;
      System.out.println("Thank you");
    }
  }
  
  public class Runnable_Constructor {
  
    public static void main(String[] args) {
      Mythr t1 = new Mythr("Prashantt"); 
      Thread t11=new Thread(t1);
      Mythr t2 = new Mythr("Vishall"); 
      Thread t22=new Thread(t2);
  
      t11.start();
      t22.start();
  
      System.out.println(t1.getId());
      System.out.println(t1.getName());
  
      System.out.println(t2.getId());
      System.out.println(t2.getName()); 
      
      
    } 
  }