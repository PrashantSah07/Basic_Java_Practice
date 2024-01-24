                                              /************ WHILE LOOPS************/

// class Loops{ 
//   public static void main(String[] args) {
//     int a=1; 
//     int b=1000; 

//     while(a<=b){ 
//       System.out.println("Running: "+a); 
//       ++a; 
//     }
//     System.out.println("The program is finished:)");

// }}

// class Loops{ 
//   public static void main(String[] args) { 
//     char ch='A'; 
//     char ch1='z'; 
//     while(ch<=ch1){ 
//       System.out.print(ch+" "); 
//       ++ch;
//     } 

//   }} 


// import java.util.Scanner; 
// class Loops{ 
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in); 

//     System.out.println("Enter number"); 
//     int a=1;
//     int b=sc.nextInt(); 
 
//     while(a<=10){ 
//       System.out.print(a*b+" "); 
//       a++; 
  
//     } 

// }}  

                                             /************ DO WHILE LOOPS************/ 

// class Loops{ 
//   public static void main(String[] args) {
//     int a=1; 
//     do { 
//       System.out.println(a);
//       ++a;
    
//     } while(a<=10);
//     System.out.println("Program finished:)");
//   } 
// } 


                                            /************* FOR LOOPS***********/ 



// import java.util.Scanner;
// class Loops{ 
//   public static void main(String[] args) { 
//     Scanner sc=new Scanner(System.in); 
//     for(int i=1; i<=10; i++){ 
//       System.out.println(i); 
//     }

//       System.out.println("Stop");
//   }
// } 


// import java.util.Scanner;
// class Loops{ 
//   public static void main(String[] args) { 
//     Scanner sc=new Scanner(System.in); 
//     for(int i=10; i>=0; i--){ 
//       System.out.println(i); 
     
//     }
//      System.out.println("Stop");
//   }
// } 


import java.util.Scanner;
class Loops{ 
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter any one character");
    char ch=sc.next().charAt(0); 
    for(char ch1='z'; ch<=ch1; ++ch){
    System.out.print(ch+" "); 
    }  
    System.out.println("\nStopp");
  
  }}