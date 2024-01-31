import java.util.Scanner;
class Switchcase{ 
    public static void main(String[] args) { 
         Scanner sc=new Scanner(System.in); 
        //  System.out.println("Enter your age");
        //  int a=sc.nextInt(); 
       
        //  switch(a){ 
        //     case 18: 
        //     System.out.println("You can drive!");
        //     break;

        //     case 15: 
        //     System.out.println("You can drive yet!");
        //     break; 

        //     case 12:
        //     System.out.println("You cannot drive in this age!"); 
        //     break;

        //     case 10: 
        //     System.out.println("You are child now");
        //     break;

        //     case 8: 
        //     System.out.println("You are baby!"); 
        //     break;
            

        //     default:
        //     System.out.println("Nothing");
        //     break; 
            
        // }  



        System.out.println("Enter the number to check the date");
        byte bt=sc.nextByte();  
        
        switch(bt){ 

            case 1: 
            System.out.println("Today's Monday"); 
            break;

            case 2: 
            System.out.println("Today's Tuesday"); 
            break;

            case 3: 
            System.out.println("Today's Wednesday"); 
            break;

            case 4: 
            System.out.println("Today's Thursday"); 
            break;

            case 5: 
            System.out.println("Today's Friday");
            break;
            
            case 6: 
            System.out.println("Today's Saturday"); 
            break;

            case 7: 
            System.out.println("Today's Sunday Chill"); 
            break;
             
            default: 
            System.out.println("Opps, No Date Match"); 
            break; 
           
        } 

            System.out.println("Thank You:)");
 
            // Close the Scanner
            sc.close();
    }
}