// class ForEachLoop{ 
//     public static void main(String[] args) {
//         int[]marks={73,72,97,72,86}; 
//         System.out.println(marks.length);
 
//         System.out.println("Simple way to print 1-D array values"); 

//         System.out.println(marks[0]); 
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);     
//         System.out.println(marks[3]);
//         System.out.println(marks[4]);

            
//     }
// } 


// class ForEachLoop{ 
//     public static void main(String[] args) {
//         int[]marks={73,72,97,72,86}; 
//         System.out.println(marks.length); 

//         System.out.println("Print 1-D array using for loop");

//         for(int a=0; a<marks.length; ++a){ 
//             System.out.println(marks[a]);
//         } 

//     }} 


// class ForEachLoop{ 
//     public static void main(String[] args) {
//         int[]marks={79,42,97,82,86}; 
//         System.out.println(marks.length); 

//         System.out.println("Print 1-D array using for loop in reverse order");

//         for(int a=marks.length-1; a>=0; --a){ 
//             System.out.println(marks[a]);
//         } 

//     }}  


// class ForEachLoop{ 
//     public static void main(String[] args) {
        
//       int[]marks={79,42,97,82,86};                // -----One onother way to print 1-D array     
//       for(int a=0; a<=4; ++a){ 
//         System.out.println(marks[a]); 
//     }
//       }
// } 



// class ForEachLoop{ 
//     public static void main(String[] args) {
        
//       int[]marks={79,42,97,82,86};                     // -----One another way to print 1-D array in reverse order  
//       for(int a=4; a>=0; --a){ 
//         System.out.println(marks[a]); 
//     }
//       }
// }




// import java.util.Scanner; 
// class ForEachLoop{ 
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in); 
        
//         System.out.println("Enter the value that starts from 0"); 
//         int b=sc.nextInt();  

//         int a[]=new int[5]; 
//         a[0]=84;
//         a[1]=53;
//         a[2]=78;
//         a[3]=53;
//         a[4]=96; 

//         for( ; b<=4; ++b){ 
//             System.out.println(a[b]);
//         }
// }
//     }



class ForEachLoop{ 
    public static void main(String[] args) {
        int[]marks={46,27,81,90,32,77}; 
                                                  //------- Print 1-D arrays using for each loop
        for(int element:marks){ 
            System.out.print(element+" ");
        }
    }
}
