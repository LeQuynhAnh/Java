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
public class Bai1_lap1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ho ten:");
       String Hoten = scanner.nextLine();
       System.out.print("Diem tb:");
       double Diemtb = scanner.nextDouble();
       System.out.printf("%s %f diem",Hoten,Diemtb);
       
    }
    
}
