class Base {

  private int x;

  void setX(int a) {
    x = a;
  }

  int getX() {
    return x;
  }

  void printme() {
    System.out.println("I am a constructor of class Base " + x);
  }
}
 
class Derived extends Base{  
  private int y; 

  void setY(int b){ 
    y=b;
  } 

  int getY(){ 
    return y;
  }

}
class App {

  public static void main(String[] args) {
    Base b = new Base();
    b.setX(5);
    b.printme();

    System.out.println(b.getX()); 
    b.setY(10);
  }
}
