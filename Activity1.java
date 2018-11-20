package activity1;

import java.util.Scanner;
import java.lang.*;

public class Activity1 {

    public static void main(String[] args) {

       Scanner sn = new Scanner(System.in);
       
   System.out.println("Enter the radius of a circle: ");
   double radius = Double.parseDouble(sn.nextLine());
   System.out.println("Enter the sides of a square: ");
   double square = Double.parseDouble(sn.nextLine());
   System.out.println("Enter the base of a triangle: ");
   double b = Double.parseDouble(sn.nextLine());
   System.out.println("Enter the heigt of a triangle: ");
   double h = Double.parseDouble(sn.nextLine());
 
   System.out.println("Area of a circle: "+ Math.PI*Math.pow(radius, 2));
   System.out.println("Area of a Square: "+ Math.pow(square, 2));
   System.out.println("Area of a triangle: " + (b*h)/2);
   
    }
    
}
