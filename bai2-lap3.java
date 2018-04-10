/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bp = new Scanner(System.in);
        System.out.print("nhap so nguyen n:");
        int n = bp.nextInt();
        boolean ok = true;
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            { ok= false; break;}
        }
        if(ok==false){
            System.out.println("n khong phai la so nguyen to");
        }
        else
        { 
            System.out.println("n la so nguyen to");
        }
    }
    
}
