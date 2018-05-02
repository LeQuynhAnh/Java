/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanh4;

/**
 *
 * @author Admin
 */
public class Nhanvien {
    
    private String manv;
    private int sosp;
    private String phanxuong;
    public int getChuan()
    {
        if(phanxuong == "A")
            return 300;
        else
            return 500;
    }
    public boolean VuotChuan()
    {
        if(phanxuong == "A")
        {
            if(sosp > 300)
                return true;
            else
                return false;
        }
        else
        {
            if(sosp > 500)
                return true;
            else
                return false;
        }
    }
    public int tinhluong()
    {
        if(VuotChuan() == false)
            return (sosp*20000);
        else 
        {
            if(phanxuong == "A")
                return (300 * 20000)+((sosp - 300)* 30000);
            else
                return (500 * 20000)+((sosp - 500) * 30000);
        }
    }
    public String toString()
    {
        return manv;
    }
    /**
     * @return the manv
     */
    public String getManv() {
        return manv;
    }

    /**
     * @param manv the manv to set
     */
    public void setManv(String manv) {
        this.manv = manv;
    }

    /**
     * @return the sosp
     */
    public int getSosp() {
        return sosp;
    }

    /**
     * @param sosp the sosp to set
     */
    public void setSosp(int sosp) {
        this.sosp = sosp;
    }

    /**
     * @return the phanxuong
     */
    public String getPhanxuong() {
        return phanxuong;
    }

    /**
     * @param phanxuong the phanxuong to set
     */
    public void setPhanxuong(String phanxuong) {
        this.phanxuong = phanxuong;
    }
    
}

