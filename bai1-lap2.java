
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner bp = new Scanner(System.in);
        System.out.print("nhap a:");
        float a = bp.nextFloat();
        System.out.print("nhap b:");
        float b = bp.nextFloat();
        if(a != 0)
            System.out.println("nghiem cua pt la: "+(-b/a));
        else
        {
            if(a == 0 && b!=0)
            {
                System.out.println("PT vo nghiem");
            }
            else
            {
                System.out.println("PT vo so nghiem");
            }
        }
        
        
        
    }
    
}
