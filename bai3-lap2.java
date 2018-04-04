
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
public class Bai3 {
    public static void main(String[] args){
    Scanner bp = new Scanner(System.in);
    System.out.print("nhap so dien su dung:");
    float sodien = bp.nextFloat();
    if(sodien <= 50)
    {
        System.out.println("so tien dien phai tra la: "+(sodien * 1000));
    }
    else
    {
        System.out.println("So tie dien phai tra la: "+((sodien * 1000)+ ((sodien - 50)*1200)));
    }
    }
}
