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
public class Bai4 {
    public static void main(String[] args){
      /*  Scanner bp = new Scanner(System.in);
        System.out.println("nhap so dong:");
        int n = bp.nextInt();
        System.out.println("nhap so cot: ");
        int m = bp.nextInt();
        String ten;
        int diem;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            //a[i][j] = new SinhVien();
            System.out.print("a[" + i + ", " + j + "]: ");
            ten = bp.nextLine();*/
        Scanner bp = new Scanner(System.in);
        System.out.print("nhap so sv:");
        int n = bp.nextInt();
        SinhVien a[] = new SinhVien[n];
        String ten;
        int diem = 0;
        
        for(int i = 0 ; i <n ; i ++){
            a[i] = new SinhVien();
            System.out.println("Moi ban nhap ten sinh vien: ");
            ten = bp.nextLine();
            a[i].setTen(ten);
            bp.nextLine();
            System.out.println("Moi ban nhap diem cho sinh vien: ");
            diem = bp.nextInt();
            a[i].setDiem(diem);
            bp.nextLine();
        }
        //sap xep
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n ; j ++){
                if(a[i].getDiem() > a[j].getDiem()){
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //xep loai hanh kiem
       String xeploai;
       if(diem<5.0)
               {xeploai = "yếu";}
            else{ if(diem>=5.0 && diem<6.5)
                xeploai = "tb";
              else {if(diem>=6.5 &&diem<7.5)
                        xeploai="khá";
                    else if(diem>=7.5 && diem<9.0)
                             xeploai="gioi";
                          else
                              xeploai = "xuất sắc";}}
        
        System.out.println("Thong tinh sinh vien sau khi sap xep la : ");
        for(int i = 0; i < n; i ++){
            System.out.println("Ten cua sinh vien la : " +a[i].getTen());
            System.out.println("Diem cua sinh vien la : "+ a[i].getDiem());
            System.out.println("Xeploai: "+xeploai);
        }   
    }
}
class SinhVien{
    private String ten;
    private int diem;
    public void setTen ( String ten) {
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setDiem(int diem){
        this.diem= diem;
    }
    public int getDiem (){
        return diem;
    }
}
    
   

