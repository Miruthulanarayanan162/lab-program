/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdemo;
import packdemo.pack1.*;
import packdemo.pack1.subpackage.third;
/**
 *
 * @author DELL
 */
public class accesspack {
    public static void main(String[] args){
        first s=new first();
        s.display();
        second r=new second();
        r.display();
        third t=new third();
        t.display();
        rupeesconversion e=new rupeesconversion();
        System.out.println("The value of dollar in rupees:Rs."+e.dollortorupee());
        System.out.println("The value of rupees in dollar:$"+e.rupeetodollor());
        System.out.println("The value of yen in rupees:Rs."+e.yentorupee());
        System.out.println("The value of rupees in yen:"+e.rupeetoyen());
        System.out.println("The value of euro in rupees:Rs."+e.eurotorupee());
        System.out.println("The value of rupees in euro:"+e.rupeetoeuro());
        
    }
    
}
