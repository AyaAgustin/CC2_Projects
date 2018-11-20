package fibonacci;

import java.util.Scanner;
public class Fibonacci {

    
    public static void main(String[] args) {
        
       output();
    }
    
    public static int user(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Fibonacci or Factorial: ");
        String inp = in.nextLine();
        if (inp.equalsIgnoreCase("Fibonacci") ){
            
        }
        
        
         System.out.print("Enter Number: ");
            int number = in.nextInt();
            
            return number;
            
            
           
        
    }
    
    public static int fib(int number){
      if(number<=1){
          return number;
      }
      else {
          
         return fib(number-1)+fib(number-2);
      }
    
    }
    
   S
    
    public static int output(){
     int x = fib(user());
    
        System.out.println(" ");
        for (int i =0; i<=x;i++){
          
            
               
            System.out.print(fib(i)+" \t");
             
            
            System.out.println(" ");
        } 
        return x;
    }
    
    public static int 
   
    
}
