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
public class bai2 {
     public static void main(String[] args){
    Scanner bp = new Scanner(System.in);
        System.out.print("nhap chieu rong: ");
        int w = bp.nextInt();
        System.out.print("nhap chieu dai: ");
        int h = bp.nextInt();
        int C = (w + h)*2;
        int S = w * h;
        int NN = Math.min(w, h);
        System.out.println("Chu vi hcn la: "+C);
        System.out.println("Dien tich hcn la: "+S);
        System.out.println("Canh nho nhat la: "+NN);}
}
