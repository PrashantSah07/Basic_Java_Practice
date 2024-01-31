// import java.util.Scanner;
// class ifelse{ 
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your age");
//         int age=sc.nextInt(); 
//         if(age>=18){ 
//             System.out.println("You can drive");
//         }else 
//             System.out.println("No, You can'nt drive yet");
//     }
// }



// import java.util.Scanner; 
// class ifelse{ 
//     public static void main(String[] args) { 
//         Scanner sc=new Scanner(System.in); 
//         System.out.println("Enter user input"); 
//         int a=sc.nextInt();  
//         int b=50; 
//         if(a>=b){ 
//         System.out.println("You are experienced"); 
//         }
//         else if(a>=40){
//         System.out.println("No, you are experienced yet");
//         } 
//          else if(a>=30){
//         System.out.println("you are not experienced");
//     } 
//         else if(a>=20){
//         System.out.println("You are noob");
//         } 
//         else 
//         System.out.println("Go and watch pogo");
// }} 




import java.util.Scanner;
 class ifelse { 
    public static void main(String[]args){  
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Physics"); 
        float f1=sc.nextFloat(); 
        
        System.out.println("Chemistry"); 
        float f2=sc.nextFloat(); 
        
        System.out.println("Mathematics"); 
        float f3=sc.nextFloat(); 

        float per=(f1+f2+f3)*100/300; 
        System.out.println("Your overall percentage is "+per+"%");
        
        if(per>=40) 
            if(f1>=33) 
                if(f2>=33) 
                    if(f3>=33)
        { 
            System.out.println("Congrats you'r pass:)");
        } else 
            System.out.println("Sorry You'r fail:(");
          
       // Close the Scanner
       sc.close();
    
}}

