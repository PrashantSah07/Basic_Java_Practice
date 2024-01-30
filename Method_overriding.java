class A {

  void meth1() {
    System.err.println("I am method 1 of class A");
  }

  void meth2() {
    System.out.println("I am method 2 of class A");
  }
}

class B extends A {

  // @Override(This is option)
  void meth2() {
    System.out.println("I am method 2 of class B");
  }

  void meth3() {
    System.out.println("I am method 3 of class B");
  }
}

public class Method_overriding {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    a.meth1();
    a.meth2();
 
    b.meth1();
    b.meth2();
    b.meth3();
  }
}
