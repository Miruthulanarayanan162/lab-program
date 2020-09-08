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
public class distance {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter x1");
        int x1=obj.nextInt();
        System.out.println("Enter x2");
        int x2=obj.nextInt();
        System.out.println("Enter y1");
        int y1=obj.nextInt();
        System.out.println("Enter y2");
        int y2=obj.nextInt();
        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(distance);
        
       
        
    }
    
}
