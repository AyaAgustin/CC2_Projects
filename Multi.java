package multi;

import java.util.*;

public class Multi {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
       
        String [] [] names = {{"Anton","Manny"},{"Leni","Robredo"},{"Gabbie", "Lonie"},{"Abbie","MAggot"}};
      /*  
        for (int i = 0; i<names.length;i++){
            //System.out.println(names[i][0]+ " ");
            for (int a = 0;a<names[i].length;a++){
                System.out.print(names[i][a]+ " \t");
            }
             System.out.println();
        }*/
       
        //User Input
     /*  System.out.print("Input Number of rows: ");
        int b = in.nextInt();
        int [] arr = new int[b]; 
        
        System.out.println("Input Number of Column: ");
        int c = in.nextInt();
        int [] arrr = new int[c]; 
        */
     /*
        int b = 0;
        int a = 0;
        int[] arr = new int[a];
        int[] arrr = new int [b];
        //int [][] array = [arr][arrr];
        for (int row = 0; row<arr.length;row++){
            arr[row] = in.nextInt();
            for (int col= 0;col<arrr[row];col++){
                arrr[col] = in.nextInt();
                
                System.out.println();
            }
        }*/
        
        System.out.print("Number of Rows: ");
        int a= in.nextInt();
        System.out.print("\nNumber of Columns: ");
        int b= in.nextInt();
        
        String arr[][]=new String[b][a];
        
        for(int c=0;c<arr.length;c++){
            for(int d=0;d<arr[c].length;d++){
                System.out.print("\nInput elements for column "+(c+1)+ " row "+(d+1)+ " :");
                arr[c][d]=in.next();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Elements of Table");
        System.out.println("");
        for (int c=0;c<arr.length;c++){
            for(int d=0;d<arr[c].length;d++){
                System.out.printf("%-15s",arr[c][d]);
            }
            System.out.println(" ");
        }
        
    }
    
}
