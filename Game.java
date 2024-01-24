import java.util.Scanner;
import java.util.Random;
public class Game{ 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       Random pc=new Random();

       System.out.println("Enter 0 for rock, 1 for Paper, 2 for Scissors"); 
       int userInput=sc.nextInt(); 
       if (userInput>2 ||userInput<0) { 
        System.out.println("Please Enter The Valid Number!"); 
        return;
       } 
       int computerInput=pc.nextInt(3);  

  
       if((userInput==computerInput)){ 
        System.out.println("Match Draw");

       }else if((userInput==0 && computerInput==2) || (userInput==1 && computerInput==0) || (userInput==2 && computerInput==1)){ 
        System.out.println("Congratulations, You Won:)");

       }else 
        System.out.println("You Lose:(");  


        if(userInput==0){ 
            System.out.println("User Choise: Rock");
        }else if(userInput==1){ 
            System.out.println("User Choise: Paper");
        } else if(userInput==2){ 
            System.out.println("User Choise: Scissors");
        } 


        if(computerInput==0){ 
            System.out.println("Computer Choise: Rock");
        }else if(computerInput==1){ 
            System.out.println("Computer Choise: Paper");
        } else if(computerInput==2){ 
            System.out.println("Computer Choise: Scissors");
        } 


    }
}