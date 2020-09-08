/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class greater {
    public static void main(String[] args){
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("A is greater");
        else if(b>a && b>c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
        
            
    }
    
}
