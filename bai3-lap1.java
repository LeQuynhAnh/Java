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
public class bai3 {
     public static void main(String[] args){
         Scanner bp = new Scanner(System.in);
         System.out.print("nhap canh a: ");
         int a = bp.nextInt();
         int V = (int) Math.pow(a, 3);
        System.out.println("The tich khoi lap phuong la: "+V);
         
     }
}
