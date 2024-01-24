// class employe {

//   int id;
//   String name;

//   void printDetails() {
//     System.out.println("My id is: " + id + "\nand my name is " + name);
//   }
// }

// public class Creating_Own_Java_Class {

//   public static void main(String[] args) {
//     System.out.println("This is our custom class");

//     employe prash = new employe();
//     employe prash1 = new employe();

//     prash.id = 12;
//     prash.name = "Prashant Kumar";

//     prash1.id = 17;
//     prash1.name = "Vishal Sah";

//     prash.printDetails();
//     prash1.printDetails();
//   }
// }

// class employe {

//     int id;
//     String name;
//     byte age;
//     int salary;
//     String address;

//     void getdetails() {
//       System.out.println("My id is: " + id+"\nMy name is: "+name+"\nMy age is: "+age+"\nMy salary is: "+salary+"\nnd My address is: "+address+"\n");
//     }
//   }

//   class Creating_Own_Java_Class {

//     public static void main(String[] args) {
//       employe details1 = new employe();
//       employe details2 = new employe();
//       employe details3 = new employe();

//       details1.id = 27;
//       details1.name = "Prashant Kumar";
//       details1.age = 20;
//       details1.salary = 22500;
//       details1.address = "Muradpur, Katihar(Bihar)";

//       details2.id =13;
//       details2.name = "Vishal Sah";
//       details2.age = 22;
//       details2.salary = 32000;
//       details2.address = "Muradpur, Katihar(Bihar)";

//       details3.id = 19;
//       details3.name = "Ajit Sah";
//       details3.age = 22;
//       details3.salary = 26000;
//       details3.address = "Katihar(Bihar)";

//       details1.getdetails();
//       details2.getdetails();
//       details3.getdetails();

//     }
//   }


// class Employe {

//   int salary;
//   String name;

//   int getsalary() {
//     return salary;
//   }

//   String getname() {
//     return name;
//   }

//   void setname(String n) {
//     System.out.println(name = n);
//   }
// }

// class Creating_Own_Java_Class {

//   public static void main(String[] args) {
//     Employe obj = new Employe();
//     obj.salary = 55;
//     obj.name = "Prashant";
//     System.out.println(obj.getsalary());
//     System.out.println(obj.getname());
//     obj.setname("Vishal");
//     System.out.println(obj.getname());
//   }
// }


// class Cellphone { 

//   void sil(){ 
//     System.out.println("Silent...");
//   }

//   void ring() {
//     System.err.println("Ringing...");
//   }

//   void vib() {
//     System.out.println("Vibrating....");
//   }
// }

// class Creating_Own_Java_Class {

//   public static void main(String[] args) {
//     Cellphone iphone = new Cellphone();
    
//     iphone.sil();
//     iphone.ring(); 
//     iphone.vib();
//   }
// }                                         



// class Square {

//   int side;

//   int area() {
//     return side * side;
//   }

//   int perimeter() {
//     return 4 * side;
//   }
// }

// class Creating_Own_Java_Class {

//   public static void main(String[] args) {
//     Square map = new Square();
//     map.side = 3;

//     System.out.println("The area is: " + map.area());
//     System.out.println("The perimeter is: " + map.perimeter());
//   }
// }



// class Rectangular {

//     int length;
//     int breadth;
  
//     void area() {
//       System.out.println("The area is: " + length * breadth);
//     }
  
//     void perimeter() {
//       System.out.println("The perimeter is: " + 2 * (length + breadth));
//     }
//   }
  
//   class Creating_Own_Java_Class {
  
//     public static void main(String[] args) {
//       Rectangular rec = new Rectangular();
//       rec.length = 27;
//       rec.breadth = 16;
  
//       rec.area();
//       rec.perimeter();
//     }
//   }
  


// class TommyVercetti{ 

//     void hit(){ 
//       System.out.println("Hitting the enemy...");
//     } 
//     void run(){ 
//       System.out.println("Running from the enemy...");
//     } 
//     void fire(){ 
//       System.out.println("Firing on the enemy...");
//     }
//   }
//   class Creating_Own_Java_Class{ 
//     public static void main(String[] args) { 
//       TommyVercetti GTA=new TommyVercetti(); 
  
//       GTA.hit(); 
//       GTA.run(); 
//       GTA.fire();
      
//     }
//   }



class Circle {

    int radius;
    float pi;
  
    void area() {
      System.out.println("The area is: " + pi * (radius * radius));
    }
  
    void breadth() {
      System.out.println("The breadthh is: " + radius * radius);
    }
  }
  
  class Creating_Own_Java_Class {
  
    public static void main(String[] args) {
      Circle c = new Circle();
      c.radius = 13;
      c.pi = 22 / 7f;
  
      c.area();
      c.breadth();
    }
  }
  