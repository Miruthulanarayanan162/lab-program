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
public class harmonic {
     public static void main(String[] args){
        System.out.println("Enter the value of a");
         Scanner obj=new Scanner(System.in);
         int a=obj.nextInt();
         double result=0;
         while(a>0)
         {
             result=(result+(double)1/a);
             a--;
         }
             System.out.println("The harmonic series is"+result);
         
    
     }
}
         
    

