// class Myemployee {

//   private int id;
//   private String name;

//   String getname() {
//     return name;
//   }

//   void setname(String n) {
//     name = n;
//   }

//   void setId(int i) {
//     id = i;
//   }

//   int getId() {
//     return id;
//   }
// }



// public class Get_n_Set {

//   public static void main(String[] args) {
//     Myemployee emp = new Myemployee();

//     System.out.println(emp.getname());
//     emp.setname("Vishal");
//     System.out.println(emp.getname());
//     emp.setId(7);
//     System.out.println(emp.getId());
//   }
// }

class Circle1 {

  private float area;
  private float radius;
  private float perimeter;

  float getRadius() {
    return radius;
  }

  void setRadius(float i) {
    radius = i;
  }

  float getArea() {
    return area;
  }

  void setArea(float j) {
    if (j < 22 / 7f || j > 22 / 7f) {
      System.out.println("Invalid to calculate the area");
    } else 
    area = j * radius;
  }

  float getPerimeter() {
    return perimeter;
  }

  void setPerimeter(int k) {
    if (k < 2 || k > 2) {
      System.out.println("Invalid to calculate the perimeter");
    } else 
    perimeter = k * (22 / 7f) * radius;
  }
}

public class Get_n_Set {

  public static void main(String[] args) {
    Circle1 cr = new Circle1();

    // cr.area = 11;
    // cr.radius = 22;
    // cr.perimeter = 33;

    cr.setRadius(13.5f);
    System.out.println("The radius is: "+cr.getRadius());

    cr.setArea(22 / 7f);
    System.out.println("The area is: "+cr.getArea());

    cr.setPerimeter(2);
    System.out.println("The perimeter is: "+cr.getPerimeter());  

  }
}
