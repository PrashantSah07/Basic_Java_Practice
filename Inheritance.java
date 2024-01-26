// class Base {

//   private int x;

//   void setX(int a) {
//     System.out.println("I am setting the value of x");
//     x = a;
//   }

//   int getX() {
//     return x;
//   }
// }

// class Derived extends Base {

//   private int y;

//   void setY(int b) {
//     System.out.println("I am setting the value of y");
//     y = b;
//   }

//   int getY() {
//     return y;
//   }
// }

// public class Inheritance {

//   public static void main(String[] args) {
//     Base b = new Base();
//     b.setX(5);
//     System.out.println(b.getX());                       //Note:- You can also access the value of x using derived class(d) bcoz derived class
//                                                         //        is store all information of class Base.
//     Derived d = new Derived();
//     d.setY(10);
//     System.out.println(d.getY());

//     d.setX(44);
//     System.out.println(d.getX());
//   }
// }



class Animal {

  void cat() {
    System.out.println("Meow-Meow");
  }
}

class Derived extends Animal {

  void dog() {
    System.out.println("Bhow-Bhow");
  }
}

class Inheritance {

  public static void main(String[] args) {
    Animal a = new Animal();
    a.cat();

    Derived d = new Derived();
    d.dog();
    d.cat();
  }
}
