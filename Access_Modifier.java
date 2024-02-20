// class c1 {

//   public int a = 5;
//   protected int b = 10;
//   int c = 15;
//   private int d = 20;

//   void meth1() {
//     System.out.println(a);
//     System.out.println(b);
//     System.out.println(c);
//     System.out.println(d);
//   }
// }

// public class Access_Modifier {
//     public static void main(String[] args) {
//         c1 c=new c1();
//         c.meth1();
//     }

//     } 




// class c1 {

//   public int a = 5;
//   protected int b = 10;
//   int c = 15;
//   private int d = 20;
// }

// public class Access_Modifier {

//   public static void main(String[] args) {
//     c1 c = new c1();
//     System.out.println(c.a);
//     System.out.println(c.b);
//     System.out.println(c.c);
//     //System.out.println(c.d);            //---> private access modifier can'nt be used in same package
//   }
// }





// class c1 {

//   public int a = 5;
//   protected int b = 10;
//   int c = 15;
//   private int d = 20;
// }

// class c2 extends c1 {

// }

// public class Access_Modifier {

//   public static void main(String[] args) {
//     c1 c = new c1();
//     c2 cc = new c2();

//     System.out.println(cc.a);
//     System.out.println(cc.b);
//     System.out.println(cc.c);
//     //System.out.println(cc.d);             //---> in inheritance private access modifier also can'nt be accessable

//   }
// }




class c1 {

    public int a = 5;
    protected int b = 10;
    int c = 15;
    private int d = 20; 
  }
   
    class c2 extends c1{ 
      void meth2(){ 
          System.out.println(a); 
          System.out.println(b);
          System.out.println(c);
          //System.out.println(d);            //---> in inheritance private access modifier also can'nt be accessable
        }
        
    }
    public class Access_Modifier {
        public static void main(String[] args) {
            c1 c=new c1();
            c2 cc=new c2();  
            
            cc.meth2();            
  
      }
  
      } 
  




