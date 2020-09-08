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
public class palindrome {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         int r,s=0,a;
         System.out.println("enter the number");
         int n=obj.nextInt();
         a=n;
         while(n>0)
         {
             r=a%10;
             s=(s*10)+r;
             n=n/10;
         }
         if(a==s)
         {
             System.out.println("It is a palindrome");
         }
         else
             System.out.println(" it is not a palindrome");
         }
             
         }
    

