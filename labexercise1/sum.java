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
public class sum {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         int i,sum=0;
         for(i=100;i<200;i++)
         {
             if (i%7==0)
             sum=sum+i;
         }
         System.out.println("The sum is--"+sum);
     }
}
         
         
    

