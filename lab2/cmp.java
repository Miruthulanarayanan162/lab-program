/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner; 
            
    

/**
 *
 * @author DELL
 */
class complex
{
    void add(int a1 , int a2 , int b1  ,int b2  )
    {
       int c=a1+a2;
       int d=b1+b2;
       System.out.println("Addition"+c+"+i"+d);
    }
    void sub(int a1, int a2, int b1, int b2)
    {
        int c=a1-a2;
        int d=b1-b2;
        System.out.println("Subtraction"+c+"+i"+d);
    }
    void mul(int a1, int a2, int b1,int b2)
    {
        int c=a1*a2;
        int d=b1*b2;
        System.out.println("Multiplication"+c+"+i"+d);
        
     }
    void div(int a1,int a2, int b1,int b2)
    {
        int c=a1/a2;
        int d=b1/b2;
        System.out.println("Division"+c+"+i"+d);
        
     }
   
 }
    
            
            
          
    



public class cmp {
     public static void main(String[] args) {
            complex s=new complex();
            int a1,a2,b1,b2;
            System.out.println("enter the value of a1,a2,b1,b2:");
            Scanner obj=new Scanner(System.in);
            a1=obj.nextInt();
            a2=obj.nextInt();
            b1=obj.nextInt();
            b2=obj.nextInt();
            s.add( a1, a2, b1, b2);
            s.sub(a1,a2,b1,b2);
            s.mul(a1,a2,b1,b2);
            s.div(a1,a2,b1,b2);
            
}
}
