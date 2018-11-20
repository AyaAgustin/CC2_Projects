package pkgif;

import java.util.*;

public class If {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Course: ");
        String c = in.next();
        
        
        if (c.equalsIgnoreCase("BSIT")){
            System.out.print("\nMajor: ");
            String m = in.next();
            
            if(m.equals("netsec")){
                System.out.println("Network and Security");
            }
            else if (m.equalsIgnoreCase("webdev")){
                System.out.println("Web Development Track");
            }
            else if (m.equalsIgnoreCase("erp")){
                System.out.println("Enterprises");
            }
            
            
        }
        else if (c.equalsIgnoreCase("BSCS")){
            System.out.print("\nMajor: ");
            String mm = in.next();
            
            if(mm.equalsIgnoreCase("mobdev")){
                System.out.println("Mobile Development");
            }
            else if(mm.equalsIgnoreCase("DAA")){
                System.out.println("Digital Arts and Animation");
            
            }
        }
        
        else if (c.equalsIgnoreCase("BSDA")){
            System.out.println("BSDA");
        }
    }
    
}
