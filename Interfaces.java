// interface Bicycle {                            // You can'nt define a class in interfaces & also can't create an onject.
//   // void gear(){                             // When you create an interface class then you can'nt make it's own method like (abstracts class).
//   //     System.out.println("Changing gear");
//   // }

//   void speedUP(int increment);

//   void Break(int decremant);
// }

// class AvonCycle implements Bicycle {        // abstracts class using extends keyword during inherite & interfaces using implements keyword.

//   void blowHorn() {
//     System.out.println("Pee-Pee Poo-Poo");
//   }

//   public void speedUP(int a) {                                        // When some child class inherite parents class method then must be declared public in interface.
//     System.out.println("Applying SpeedUP with " + a + " rpm");
//   }

//   public void Break(int b) {
//     System.out.println("Applying Break with " + b + " rpm");
//   }
// }

// public class Interfaces {

//   public static void main(String[] args) {
//     AvonCycle av = new AvonCycle();
//     av.blowHorn();
//     av.speedUP(23);
//     av.Break(12);
//   }
// }





// interface Home {
//   void sleeping();
//   void eating();
// }

// interface Home2 {
//   void dancing();
//   void watching();
// }

// class Ghar implements Home, Home2 {

//   void benefits() {
//     System.out.println("Using interfaces we can implements one or more interface classes in one child class.");
//   }

//   public void sleeping() {
//     System.out.println("I am sleeping");
//   }

//   public void eating() {
//     System.out.println("I am eating");
//   }

//   public void dancing() {
//     System.out.println("I am dancing");
//   }

//   public void watching() {
//     System.out.println("I am watching movie");
//   }
// }

// public class Interfaces {

//   public static void main(String[] args) {
//     Ghar gh = new Ghar();
//     gh.benefits();

//     gh.sleeping();
//     gh.eating();
//     gh.dancing();
//     gh.watching();
//   }
// }





// class Tv {
//   void showCinema() {
//     System.out.println("I am watching cinema");
//   }
// }

// interface check1 {
//   void gps();
// }

// interface check2 {
//   void camera();
// }

// interface check3 {
//   void mediaPlayer();
// }

// class computer extends Tv implements check1, check2, check3 {

//   void code() {
//     System.out.println("I am learning coding using computer");
//   }

//   public void gps() {
//     System.out.println("i am using gps");
//   }

//   public void camera() {
//     System.out.println("i am a photographer");
//   }

//   public void mediaPlayer() {
//     System.out.println("i am listening the mediaPlayer");
//   }
// }

// public class Interfaces {

//   public static void main(String[] args) {
//     Tv t = new Tv();
//     t.showCinema();
//     computer cm = new computer();

//     cm.code();
//     cm.showCinema();
//     cm.gps();
//     cm.camera();
//     cm.mediaPlayer();

//   }
// }





class MyCellPhone {

  void callNumber(long phoneNumber) {
    System.out.println("Calling " + phoneNumber);
  }

  void pickCall() {
    System.out.println("Connecting...");
  }
}

interface MyCamera {
  void takeSnap();
  void recordVideo();
}

interface MyWifi {
  String[] getNetwork();
  void connectToNetwork(String network);
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {

  public void takeSnap() {
    System.out.println("Taking snap");
  }

  public void recordVideo() {
    System.out.println("Recording video");
  }

  public String[] getNetwork() {
    System.out.println("Getting list of network");
    String[] str1 = { "Harry", "Prashant", "Anjali5G" };
    return str1;
  }

  public void connectToNetwork(String network) {
    System.out.println("Connecting to " + network);
  }
}

public class Interfaces {

  public static void main(String[] args) { 
    MyCellPhone mcp=new MyCellPhone(); 
    mcp.callNumber(100); 
    mcp.pickCall(); 
    
    MySmartPhone msp = new MySmartPhone();
    msp.callNumber(9693217150l);
    msp.pickCall();

    msp.takeSnap();
    msp.recordVideo();

    String[] str = msp.getNetwork();
    for (int a = 0; a < str.length; a++) {
      System.out.println(str[a]);
    }
    msp.connectToNetwork("Airtel 5G"); 

  }
}
