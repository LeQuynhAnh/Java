/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame.pkg3;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author Admin
 */
public class TongAB extends Frame{
    Label lblA,lblTong,lblB,lblc;
    TextField txtB,txtkq,txtA;
    Button btnTinhTong,btnTinhHieu,btnTinhTich,btnTinhThuong;
    public TongAB()
    {
        setTitle("Bai 1 AWT");
        setSize(300,300);
        //setLayout(new FlowLayout());
        GridLayout l = new GridLayout(4,2);
        setLayout(l);
        lblA = new Label("A ");
        add(lblA); // gan vao Frame
        txtA = new TextField(20);
        add(txtA);
        lblB = new Label("B "); 
        add(lblB);
        txtB = new TextField(20);
        add(txtB);
        lblc = new Label("Thao tac");
        add(lblc);
        btnTinhTong = new Button("+");
        btnTinhTong.addActionListener(new Langnghecong());
        btnTinhHieu = new Button("-");
        btnTinhHieu.addActionListener(new Langnghetru());
        btnTinhTich = new Button("*");
        btnTinhTich.addActionListener(new Langnghenhan());
        btnTinhThuong = new Button("/");
        btnTinhThuong.addActionListener(new Langnghechia());
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(btnTinhTong);
        p.add(btnTinhHieu);
        p.add(btnTinhTich);
        p.add(btnTinhThuong);
        add(p);
        
        lblTong = new Label("ket qua ");
        add(lblTong); // gan vao Frame
        
        txtkq = new TextField(20);
        add(txtkq);
        setVisible(true);
        xulisukiencuaso bolangnghe = new xulisukiencuaso();
        addWindowListener(bolangnghe);
    }
    
    public static void main(String[] args)
    {
        new TongAB();
        //Frame f = new Frame();
        
    }
    class Langnghecong implements ActionListener{
        public void actionPerformed(ActionEvent e){
        //lay A
        int a = Integer.parseInt(txtA.getText());
        
        //lay B
        int b = Integer.parseInt(txtB.getText());
        //Tinh tong
        int Tong = a+b;
        //Xuat
        txtkq.setText(String.valueOf(Tong));}
        }
    class Langnghetru implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Hieu = a-b;
        txtkq.setText(String.valueOf(Hieu));
        }}
    class Langnghenhan implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Tich = a*b;
        txtkq.setText(String.valueOf(Tich));
            }
    }
    class Langnghechia implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Thuong = a/b;
        txtkq.setText(String.valueOf(Thuong));
            }
    
    }
    }
    
    
    
    class xulisukiencuaso implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

