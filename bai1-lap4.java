
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
public class bai1 {

    /**
     * @param args the command line arguments
     */
  /*  String ten;
    Double gia;
    Double giamgia;
    public void nhap()
    {
     Scanner bp = new Scanner(System.in);
     System.out.println("nhap ten sp: ");
     ten = bp.nextLine();
     System.out.println("nhap gia sp:");
     gia = bp.nextDouble();
     System.out.println("nhap giam gia sp: ");
     giamgia = bp.nextDouble();}*/
    String ten;
    Double gia;
    Double giamgia;
    Double thuenhapkhau;
    public static void main(String[] args) {
        // TODO code application logic here
         SanPham sp= new SanPham();
         sp.nhap();
         sp.xuat();
    }
}
class SanPham
    {
    private String ten;
    private Double gia;
    private Double giamgia;
    private Double thuenhapkhau;
    
    public void nhap()
    {
     Scanner bp = new Scanner(System.in);
     System.out.println("nhap ten sp: ");
        setTen(bp.nextLine());
     System.out.println("nhap gia sp:");
        setGia((Double) bp.nextDouble());
     System.out.println("nhap giam gia sp: ");
        setGiamgia((Double) bp.nextDouble());
    }
    
    public void xuat()
    {
        System.out.println("Thong tin SP:");
        System.out.println("Ten SP: "+getTen());
        System.out.println("Gia SP: "+getGia());
        System.out.println("Giam gia cua SP: "+getGiamgia());
        System.out.println("Thue nhap khau cua SP:"+getThuenhapkhau());
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public Double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(Double gia) {
        this.gia = gia;
    }

    /**
     * @return the giamgia
     */
    public Double getGiamgia() {
        return giamgia;
    }

    /**
     * @param giamgia the giamgia to set
     */
    public void setGiamgia(Double giamgia) {
        this.giamgia = giamgia;
    }

    /**
     * @return the thuenhapkhau
     */
    public Double getThuenhapkhau() {
        return 0.1*gia;
    }

    /**
     * @param thuenhapkhau the thuenhapkhau to set
     */
    public void setThuenhapkhau(Double thuenhapkhau) {
        this.thuenhapkhau = thuenhapkhau;
    }

    /**
     * @return the ten
     */
}