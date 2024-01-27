class Base1 {

  Base1() {
    System.out.println("I am a Base class constructors");
  }

  Base1(int a) {
    System.out.println("I am an overloaded Base class constructed with the value of x: " + a);
  }
}

class Derived1 extends Base1 {

  Derived1() {
    //super();
    System.out.println("I am a Derived class Constructors");
  }

  Derived1(int x, int y) {
    super(x);
    System.out.println("I am an overloaded derived class constructor with the value of y: " + y);
  }
}

class childDerived1 extends Derived1 {

  childDerived1() {
    //super();
    System.out.println("I am a childDerived class constructoras");
  }

  childDerived1(int x, int y, int z) {
    super(x, y);
    System.out.println("I am an overloaded childDerived class constructoras with the value of z: " +z );
  }
}

public class Constructors_in_Inheritance {

  public static void main(String[] args) {
    Base1 b = new Base1();
    Base1 b1 = new Base1(7);

    Derived1 d = new Derived1();
    Derived1 d1 = new Derived1(15, 21);

    childDerived1 cd = new childDerived1();
    childDerived1 cd1 = new childDerived1(2, 4, 6);
  }
}
