
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
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bp = new Scanner(System.in);
        System.out.print("nhap a: ");
        float a = bp.nextFloat();
        System.out.print("nhap b: ");
        float b = bp.nextFloat();
        System.out.print("nhap c: ");
        float c = bp.nextFloat();
        int Del = (int) (Math.pow(b, 2)-4*a*c);
        if(a == 0)
        {
            if(b != 0)
            System.out.println("nghiem cua pt la: "+(-c/b));
            else
            {
            if(b == 0 && c!=0)
            {
                System.out.println("PT vo nghiem");
            }
            else
            {
                System.out.println("PT vo so nghiem");
            }
            }
        }
        else
        {
            if(Del < 0)
            {
                System.out.println("PT VN");
            }
            else
            {
                if(Del == 0)
                {
                System.out.println("PT co nghiem kep x = "+(-b/(2*a)));
                }
                else
                {
                System.out.println("PT co hai nghiem phan biet: x1 ="
                    +(-b+Math.sqrt(Del)/(2*a))+" x2 = "+(-b-Math.sqrt(Del)/(2*a)));
                }
            }
        }
    }
}
