// class Myemployee {

//   private int id;
//   private String name;

//   void check() {
//     System.out.println(id);
//   }

//   void check2() {
//     System.out.println(name);
//   }

//   Myemployee() {
//     id = 07;
//     name = "PKS";
//   }

//   Myemployee(String yourname) {
//     id = 27;
//     name = yourname;
//   }

//   Myemployee(String yourname, int a) {
//     id = a;
//     name = yourname;
//   }
// }

// public class Constructor {

//   public static void main(String[] args) {
//     Myemployee as = new Myemployee();
//     Myemployee ass = new Myemployee("Prashant");
//     Myemployee asss = new Myemployee("code_with_prashant", 5);

//     as.check();
//     as.check2();

//     ass.check();
//     ass.check2();

//     asss.check();
//     asss.check2();
//   }
// }

class Myemployee {

  private int salary;

  int a() {
    return salary;
  }

  Myemployee() {
    salary = 12000;
  }

  Myemployee(int n) {
    salary = n;
  }
}

public class Constructor {

  public static void main(String[] args) {
    Myemployee emp = new Myemployee();
    Myemployee emp1 = new Myemployee(15000);

    System.out.println("Employee monthly salary is: " + emp.a());
    System.out.println("Employee monthly salary is: " + emp1.a());
  }
}
