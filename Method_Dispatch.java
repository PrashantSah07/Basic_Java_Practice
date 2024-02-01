class Phone {

  void on() {
    System.out.println("Turning on the Phone...");
  }

  void greet() {
    System.out.println("Good Morning");
  }
}

class SmartPhone extends Phone {

  void music() {
    System.out.println("Playing Music...");
  }

  void on() {
    System.out.println("Turning on the Smartphone...");
  }
}

class Method_Dispatch {

  public static void main(String[] args) {
    // Phone pn = new Phone();
    // SmartPhone spn = new SmartPhone();
    // pn.on();
    // pn.greet();

    // spn.music();
    // spn.on();

      Phone pn = new SmartPhone();  //---> This is valid
      //  SmartPhone smp=new Phone();  //---> This is not valid

      pn.greet();
      pn.on();
      // pn.music();   //---> Not Allowed

  }
}
