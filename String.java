import java.util.Scanner;
class Main{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 

        System.out.println("Write what you want to write:");
        String str=sc.nextLine(); 
       
        int str1=str.length();  //name.length()---1
        System.out.println(str1);

        String str2=str.toLowerCase(); //name.LowerrCase()---2 
        System.out.println(str2);  

        String str3=str.toUpperCase(); //name.toUpperCase()---3 
        System.out.println(str3); 

        String str4=str.trim(); //name.trim()---4 
        System.out.println(str4);  

        String str5=str.substring(5); //name.subString(5)---5  
        System.out.println(str5);  

        String str6=str.substring(2,6); //name.subString(2,6)
        System.out.println(str6);  

        String str7=str.replace("P", "S"); //name.replace()---6
        System.out.println(str7);  

        boolean str8=str.startsWith("Pra"); //name.startsWith()---7
        System.out.println(str8);  

        boolean str9=str.endsWith("ant "); //name.endsWith()---8
        System.out.println(str9); 

        char  str10=str.charAt(7); //name.charAT()---9
        System.out.println(str10);  

        int str11=str.indexOf("ant"); //name.indexOf("r")---10
        System.out.println(str11); 

        int str12=str.indexOf("sh", 4); //name.indexOf("sh",4)
        System.out.println(str12); 

        int str13=str.lastIndexOf("a"); //name.lastIndexOf("a")---11
        System.out.println(str13); 

        int str14=str.lastIndexOf("a",4); //name.lastIndexOf("a",4)
        System.out.println(str14); 

        boolean str15=str.equals(" prashant "); //name.equals()---12
        System.out.println(str15); 

        boolean str16=str.equalsIgnoreCase(" pRASHant "); //name.equalsIgnoreCase()---13
        System.out.println(str16); 

        boolean str17=str.contains("ant"); //name.contains();---14
        System.out.println(str17);




    }
}