/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1;

import com.sun.glass.ui.Cursor;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class vdtaoswing extends JFrame{
    public vdtaoswing(){
        setTitle("SW1");
        setSize(200,300);
        setLayout(new FlowLayout());
        Container cp = getContentPane();
        JLabel lblHello = new JLabel("Helllo Swing");
        cp.add(lblHello);
        setVisible(true);
    }
    public static void main(String[] args){
        new vdtaoswing();
    }

   

    
}
