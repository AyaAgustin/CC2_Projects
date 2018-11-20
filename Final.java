package pkgfinal;

import java.io.*;

public class Final {

   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        one(br);
        
    }
    
    public static void one (BufferedReader br) throws IOException{
        System.out.println("Enter your choice"
                + "\n Fibonacci"
                + "\n Factorial");
        System.out.println("Enter your choice:");
        String choice = br.readLine();
        if (choice.equalsIgnoreCase("Fibonacci")){
            fibonacci(br);
        }
        else if (choice.equalsIgnoreCase("Factorial")){
            factorial(br);
        }
        else {
            System.out.println("Invalid Input");
            one(br);
        }
        
    }
    
    public static void fibonacci (BufferedReader br) throws IOException{
        System.out.println("Enter number of elements: ");
        int number = Integer.parseInt(br.readLine());
        int [] arr = new int [number];
        
        for (int i = 0;i<arr.length;i++){
            System.out.print("Enter element for index "+i+ ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("");
        System.out.println("Elements");
        for (int i=0;i<arr.length;i++){
            System.out.print("f ["+i+"] \t");
        }
        System.out.println(" ");
        for (int a =0;a<arr.length;a++){
            System.out.print(fib(arr[a])+ "\t");
            
        }
        
        
    }
    public static int fib(int number){
      if(number<=1){
          return number;
      }
      else {
          
         return fib(number-1)+fib(number-2);
      }
    
    }
    
    public static void factorial(BufferedReader br)throws IOException{
        System.out.println("Enter number of elements: ");
        int number = Integer.parseInt(br.readLine());
        int [] arr = new int [number];
        
        for (int i = 0;i<arr.length;i++){
            System.out.print("Enter element for index "+i+ ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("");
        System.out.println("Elements");
        for (int i=0;i<arr.length;i++){
            System.out.print("f ["+(i+1)+"] \t");
        }
        System.out.println(" ");
        for (int a =0;a<arr.length;a++){
            System.out.print(fact(arr[a])+ "\t");
            
        }
        
    }
    public static int fact(int number){
      if(number==0){
          return 1;
      }
      else {
          
         return (number * fact(number-1));
      }
    
    }
}
