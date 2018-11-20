package singledimensionalarray;

import java.util.*;
public class SingleDimensionalArray {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       /* 
        //single dimensional array
        int [] arr = new int[10];
        
        for (int i = 0; i<arr.length;i++){
            arr[i] = i;
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        //multi dimensional array
        int[][] arrr =  {{1,2,2}, {4,5,6},{7,8,9}};
        for (int a=0; a<arrr.length ; a++){
            for (int b=0;b<arrr[a].length;b++){
                System.out.print(arrr[a][b] + " ");
            }
            System.out.println("");
        }
*/
    /*  
      int [] arr = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
      ArrayList even = new ArrayList();
      ArrayList odd = new ArrayList();
        System.out.print("Elements: ");
       for (int i = 0; i<arr.length;i++){
           System.out.print(" " +arr[i]);
           if (arr[i]%2==0){
             even.add(arr[i]);
               
               
           }
           else if (arr[i]%2==1)  {
             odd.add(arr[i]);
             
           }
         
       }
        System.out.println("");
        System.out.println("");
       System.out.println("Even\tOdd");
       
       for (int i=0;i<arr.length;i++){
           if (i>= even.size() && i<odd.size()){
               System.out.println("\t"+ odd.get(i));
           }
           else if (i>=odd.size() && i<even.size()){
               System.out.println(even.get(i));
           }
           else if (i<odd.size() && i<even.size()){
               System.out.println(even.get(i)      +"\t"+    odd.get(i));
           }
       }*/
       
        System.out.print("Input Length of Numbers: ");
        int b = in.nextInt();
        int [] arr = new int[b];
        int i;
        
        System.out.println("Input Numbers: ");
        for (i=0;i<b;i++){
            //int c = in.nextInt();
            arr[i] = in.nextInt();
        
        }
        System.out.println("ELements: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        
       // System.out.println(arr[i]+ "");
        
      /*  
      ArrayList even = new ArrayList();
      ArrayList odd = new ArrayList();
        System.out.print("Elements: ");
       for (int i = 0; i<arr.length;i++){
           System.out.print(" " +arr[i]);
           if (arr[i]%2==0){
             even.add(arr[i]);
               
               
           }
           else if (arr[i]%2==1)  {
             odd.add(arr[i]);
             
           }
         
       }
        System.out.println("");
        System.out.println("");
       System.out.println("Even\tOdd");
       
       for (int i=0;i<arr.length;i++){
           if (i>= even.size() && i<odd.size()){
               System.out.println("\t"+ odd.get(i));
           }
           else if (i>=odd.size() && i<even.size()){
               System.out.println(even.get(i));
           }
           else if (i<odd.size() && i<even.size()){
               System.out.println(even.get(i)      +"\t"+    odd.get(i));
           }
       }
        */
       
    }
    
}
