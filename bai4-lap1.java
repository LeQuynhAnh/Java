/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai4 {
     public static void main(String[] args){
     Scanner bp = new Scanner(System.in);
     System.out.print("nhap a:");
     int a = bp.nextInt();
     System.out.print("nhap b: ");
     int b = bp.nextInt();
     System.out.print("nhap c: ");
     int c = bp.nextInt();
     int Del = (int) (Math.pow(b, 2)-4*a*c);
     int d = (int) Math.sqrt(Del);
     System.out.println("Can Delta la: "+d);
     }
}
