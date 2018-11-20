package activity5;


import java.util.*;

public class Activity5 {

    
    public static void main(String[] args) {
     // Random rand = new Random();
     //  int num = rand.nextInt(1000);
     
      
        Scanner in = new Scanner (System.in);
        System.out.println("Input number to be guessed: ");
        int num = in.nextInt();
        
        System.out.println("Guess a number from 1 to 1000: ");
        int no = in.nextInt();
       
       
        
        boolean yes = false;
        
        
        do {
           if(no > num){  
                if (num %2 ==0){
            System.out.println("The number to be guessed is even");
                
        }
        else {
            System.out.println("the number to be guessed is odd");
        }
             System.out.println("Lower");
             no = in.nextInt();
           }else if(no< num){
                if (num %2 ==0){
            System.out.println("The number to be guessed is even");
                
        }
        else {
            System.out.println("the number to be guessed is odd");
        }
               System.out.println("higher");
               no = in.nextInt();
           }else if(no == num){
               
               System.out.println("correct");
               break;
               
           }
            
            
        } while (yes==false);
        
    }
    
}
