// class VoidMethod{
//     static void joke(){
//         System.out.println("A bear walks into a bar and says, Give me a whiskey and cola");

//     }
//     public static void main(String[] args) {
//         joke();

//     }
// }

// class VoidMethod{
//     static void array(int[]arr){
//         arr[0]=52;
//     }
//     public static void main(String[] args) {

//         int[]marks={47,73,52,75,42,96,45};
//         array(marks);
//         System.out.println(marks[0]);

//         for(int element: marks){
//             System.out.print(element+" ");
//         }

//     }
//     }


// class VoidMethod{
//   static void multiply(int a, int b){
//     System.out.println("Result is: "+(a*b));
//   }
//   static void multiply(int a, int b, int c){
//     System.out.println("Result is: "+(a*b*c));
// }
// public static void main(String[] args) {
//   int a=2;
//   int b=4;
//   int c=6;
//   multiply(a,b);
//   multiply(a,b,c);

// }
// }

// class VoidMethod{
//     static void hey(){
//         System.out.println("Good Morning, Bro!");
//     } 
//     static void hey(String str){
//         System.out.println("Good Morning, "+str+" Bro!");
//     }
//     static void hey(String str,String str1){
//         System.out.println("Good Morning, "+str+" and");
//         System.out.println("Good Morning, "+str1+" Bro!");
//     }

//        public static void main(String[] args) {
//         hey();
//         String str="Prashant";
//         hey(str);
//         String strp="Prashant";
//          String strv="Vishal";
//         hey(strp,strv);

// }
// }

// class VoidMethod{
//    static void factorial(int i){
//       int fac=1;
//       for(int a=i; a>=1; --a){
//          System.out.println(a);
//          fac*=a;
//       }
//          System.out.println("The factorial is: "+fac);
//    }
//    public static void main(String[] args) {
//       int a=5;
//       factorial(a);
//    }
// }

// import java.util.Scanner;
// class VoidMethod{
//    static void factorial(int i){
//        int fac=1;
//        if(i<=0){
//          System.out.println("Invalid Number:(");
//          return;
//        }
//        for(int a=i; a>=1; --a){
//          System.out.println(a);
//          fac=fac*a;
//        }
//          System.out.println("The factorial is: "+fac);
//    }
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter number");
//       int a=sc.nextInt();
//       factorial(a);

//       int a1=sc.nextInt();
//       factorial(a1);

//    }
// }


/************VARIABLE ARGUMENTS************/

// class VoidMethod{
//     static void sum(int...arr){    // available as int[]arr;

//         int value=0;
//         for(int a:arr){
//             System.out.print(a+" ");
//             value+=a;
//         }
//             System.out.println("\nThe sum value is :"+value);
//         //return value;
//     }
//     public static void main(String[] args) {
//         int a=6;
//         int b=7;
//         int c=9;
//         int d=5;

//         //int z=sum(a);
//         sum(a);

//         //int z1=sum(a,b);
//         sum(a,b);

//         //int z2=sum(a,b,c);
//         sum(a,b,c);

//         //int z3=sum(a,b,c,d);
//         sum(a,b,c,d);

//     }
// }

/************RECERSION************/

// import java.util.Scanner;
// class VoidMethod{
//   static void factorial(int i) {
//     int fac = 1;
//     if(i<0){
//       System.out.println("Invalid for negative numbers");
//       return;
//     }
//     for (int a=i; a>=1; --a) {
//       System.out.print(a+"x");
//       fac=fac*a;
//     }
//     System.out.println("\nThe Total factorial is: " +fac);

//   }

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number:");
//     int a=sc.nextInt();
//     factorial(a);

//   }
// }
