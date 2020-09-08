/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class min {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
      int x, y;
      System.out.println("Enter the numbers");  
      x = obj.nextInt();
      y = obj.nextInt();
      int min=(x<y)?x:y;
System.out.println("minimum is" +min );
}
}
     

         
    

