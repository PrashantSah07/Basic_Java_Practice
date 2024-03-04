class MyRunnableThread1 implements Runnable {

  public void run() {
    for (int a = 0; a <= 10; a++) {
      System.out.println("I am thread 1"); 
    }
  }
}

class MyRunnableThread2 implements Runnable {

  public void run() {
    for (int a = 0; a <= 10; a++) {
      System.out.println("I am thread 2");
    }
  }
}

public class RunnableThread {

  public static void main(String[] args) { 

    MyRunnableThread1 bullet1 = new MyRunnableThread1();
    Thread gun1 = new Thread(bullet1); 

    MyRunnableThread2 bullet2 = new MyRunnableThread2();
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start(); 
    
  }
}
