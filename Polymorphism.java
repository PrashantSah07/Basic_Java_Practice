interface School {
  void goSchool();
  void comeSchool();
}

interface College {
  void goCollege();
  void comeCollege();
}

interface University {
  void goUniversity();
  void comeUniversity();
}

class Student implements School, College, University {

  public void goSchool() {
    System.out.println("I am going to school");
  }

  public void comeSchool() {
    System.out.println("I am coming from school");
  }

  public void goCollege() {
    System.out.println("I am going to college");
  }

  public void comeCollege() {
    System.out.println("I am coming from college");
  }

  public void goUniversity() {
    System.out.println("I am going to university");
  }

  public void comeUniversity() {
    System.out.println("I am coming from university");
  }
}

public class Polymorphism {

  public static void main(String[] args) {
    Student st = new Student();
    // st.goSchool();
    // st.comeSchool();
    // st.goCollege();
    // st.comeCollege();
    // st.goUniversity();
    // st.comeUniversity();

    /*******Polymorphism*******/      //-----> Just like Method Dispatch

    School sc = new Student();
    sc.goSchool();
    sc.comeSchool();

    College cl = new Student();
    cl.goCollege();
    cl.comeCollege();

    University uv = new Student();
    uv.goUniversity();
    uv.comeUniversity(); 

  }
}
