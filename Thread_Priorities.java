class Mythrr extends Thread {

  Mythrr(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      System.out.println("Thank you " + this.getName());
    }
  }
}

public class Thread_Priorities {

  public static void main(String[] args) {
    Mythrr t1 = new Mythrr("Prashant(Most important)");
    Mythrr t2 = new Mythrr("Vishal");
    Mythrr t3 = new Mythrr("Ayush");
    Mythrr t4 = new Mythrr("Piyush");
    Mythrr t5 = new Mythrr("Ritik");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MIN_PRIORITY);
  }
}
