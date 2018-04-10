/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner bp = new Scanner(System.in);
        System.out.print("nhap n:");
        int n = bp.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = bp.nextInt();
        }
        //sap xep ds
        Arrays.sort(a);
        //in ra mang
        System.out.print("mang vua nhap la: ");
        for(int i=0;i<a.length;i++)
        {System.out.println(" "+a[i]); } 
        //phan tu nho nhat
        int min = a[0];
        for(int i =0;i<a.length;i++)
        {
            if(a[i]<min)
            { 
                min = a[i];
            }
        }System.out.println("phan tu nho nhat la: "+min);
        //trung binh cong cua so chia het cho 3
        int dem = 0,tong=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%3==0)
            {
                tong+=a[i];
                dem++;}
        }
        System.out.println("trung binh cong cac so chia het cho 3 la: "+tong/dem);
    }
}
