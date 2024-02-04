// abstract class phone{ 
//     void turnOn(){ 
//         System.out.println("Turning on the phone...");
//     } 
//     void turnOff(){ 
//         System.out.println("Turning off the phone...");
//     } 

//    abstract void music();
// } 
// class phone2 extends phone{  
//     @Override   
//     void music(){ 
//         System.out.println("Turning on the music...");
//     }

// }
// public class Abstract_Method{ 
//     public static void main(String[] args) { 
//         // phone ph= new phone();                        //--> No object can be created of an abstract class,and also not can be access their method.
//         // ph.turnOn(); 
//         // ph.turnOff(); 

//         phone2 ph2= new phone2();                        /*--> if some child class extends abstract parents class must be copied thier abstract mathod of parents class.
//         //                                                         Otherwise child class cannot create its own object aswell*/
//         ph2.music();
//         ph2.turnOn(); 
//         ph2.turnOff();
         
//     }
// }




abstract class Parents {

  Parents() {
    System.out.println("I am a constructor of Parents class");
  }

  void sayHello() {
    System.out.println("Hello");
  }

  abstract void greet();

  abstract void greet2();
}

class Child extends Parents {


  @Override
  void greet() {
    System.out.println("Good Morning");
  }

  @Override
  void greet2() {
    System.out.println("Good Afternoon");
  } 
  
} 

abstract class Child2 extends Child { 
  
    @Override
    void greet(){  
        System.out.println("Hehe");

    } 
    @Override
    void greet2(){  
        System.out.println("Hehe Boi");

    } 
    abstract void hh();
} 

class Child3 extends Child2 {  
    void hh (){ 
        System.out.println("Prashant");
    } 
    

}

public class Abstract_Method {

  public static void main(String[] args) {
    // Parents p=new Parents();                  //--> No object can be created of an abstract class,and also not can be access their method.
    //  p.sayHello();
    Child c = new Child();                       /*--> if some child class extends abstract parents class must be copied thier abstract mathod of parents class.
                                                        Otherwise child class cannot create its own object aswell*/
    c.greet();
    c.greet2();
    c.sayHello(); 
    //Child2 ch=new Child2();                    //--> No object can be created of an abstract class,and also not can be access their method.
    //ch.greet(); 
    //ch.greet2(); 
     Child3 ch1=new Child3();  
     ch1.hh(); 
     ch1.greet();
     ch1.greet2(); 

  }
}
