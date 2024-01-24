//     class Array { 
//     public static void main(String[] args) { 
//          //int[]a={10,20,30,40,50};   //------ 1 Way to write array in java

//         // int[]a;
//         // a=new int[5];            //------ 2 Way to write array in java

//         int[]a=new int[5];           //------ 3 Way to write array in java
         
//         a[0]=10;
//         a[1]=20;
//         a[2]=30;
//         a[3]=40;
//         a[4]=50; 
//         System.out.println(a[1]+" ");
//     }
    
// }


//     class Array { 
//     public static void main(String[] args) { 
//          int[]marks={78,54,75,36,36}; 
//          float[]fl={73.5f,83.5f,65.5f,93.5f,75.5f,74.5f,72.6f}; 
//          char[]ch={'a','b','c','d','e','f'}; 
//          String[]str={"Prashnat","Vishal","Kajal","Ayush"}; 
//          boolean[]b1={true,false,false,true};
        
//         System.out.println(marks.length);  
//         System.out.println(marks[3]); 

//         System.out.println(fl.length); 
//         System.out.println(fl[5]); 

//         System.out.println(ch.length);
//         System.out.println(ch[4]); 
        
//         System.out.println(str.length);
//         System.out.println(str[2]);  

//         System.out.println(b1.length);
//         System.out.println(b1[3]);
//     }}



     class Array {
     public static void main(String[] args) {  
        int []a={64,45,765,34,-35,604,452,45,622,-402,324,543}; 
        int max=0;
        for(int element:a){ 
            System.out.print(element+" ");                           //--- Find maximum element in an array
           if(element>max){ 
            max=element;
           }
        } 
            System.out.println("\nThe Maximum Element Is: "+max); 
        
     }}
