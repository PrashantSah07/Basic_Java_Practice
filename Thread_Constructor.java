class Mythr extends Thread {

  Mythr(String name) {
    super(name);
  }

  public void run() {
    int id = 27;
    System.out.println("Thank you");
  }
}

public class Thread_Constructor {

  public static void main(String[] args) {
    Mythr t1 = new Mythr("Prashant");
    Mythr t2 = new Mythr("Vishal");

    t1.start();
    t2.start();

    System.out.println(t1.getId());
    System.out.println(t1.getName());

    System.out.println(t2.getId());
    System.out.println(t2.getName()); 
    
  }
}
