
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th3;

import java.awt.List;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Admin
 */
public class bai3listview extends javax.swing.JFrame {

    /**
     * Creates new form bai3listview
     */
    public bai3listview() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listphai = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listtrai = new javax.swing.JList<>();
        btnphai = new javax.swing.JButton();
        btntrai = new javax.swing.JButton();
        btntatcaphai = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btntatcatrai = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bai3_listview");

        jLabel1.setText("DS môn thể thao");

        jLabel2.setText("Môn yêu thích");

        jScrollPane2.setViewportView(listphai);

        jScrollPane3.setViewportView(listtrai);

        btnphai.setText(">");
        btnphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphaiActionPerformed(evt);
            }
        });

        btntrai.setText("<");
        btntrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntraiActionPerformed(evt);
            }
        });

        btntatcaphai.setText(">>");
        btntatcaphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntatcaphaiActionPerformed(evt);
            }
        });

        btnthem.setText("+");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btntatcatrai.setText("<<");
        btntatcatrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntatcatraiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnphai, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btntatcaphai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntatcatrai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntrai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnthem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGap(239, 239, 239)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnphai)
                        .addGap(16, 16, 16)
                        .addComponent(btntatcaphai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntrai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntatcatrai)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnthem)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        String tt = JOptionPane.showInputDialog("Thêm dữ liệu");
        //them vao list trai
        ListModel mTrai= listtrai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
       for (int i=0; i<mTrai.getSize(); i++)
        { 
            arrTrai.add((String) mTrai.getElementAt(i));
        }
        arrTrai.add(tt);
        // chuyển sang kiểu mảg để đưa vào JList
        String[] arrData  = arrTrai.toArray(new String[0]);
        listtrai.setListData(arrData);
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphaiActionPerformed
        // TODO add your handling code here:
        ListModel mTrai= listtrai.getModel();
        ListModel mPhai= listphai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ArrayList<String> arrPhai = new ArrayList<>();
      
        for (int i=0; i<mTrai.getSize(); i++)
        { 
            arrTrai.add((String) mTrai.getElementAt(i));
        }
        int c = listtrai.getSelectedIndex();
          //them vao list phai
        for (int i=0; i<mPhai.getSize(); i++)
        { 
            arrPhai.add((String) mPhai.getElementAt(i));
        }
        arrPhai.add((String) mTrai.getElementAt(c));
        //xoa ben list trai
        arrTrai.remove(c);
        String[] arrData  = arrTrai.toArray(new String[0]);
        String[] arrData1  = arrPhai.toArray(new String[0]);
        listtrai.setListData(arrData);
        listphai.setListData(arrData1);  
        
    }//GEN-LAST:event_btnphaiActionPerformed

    private void btntatcaphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntatcaphaiActionPerformed
        // TODO add your handling code here:
       ListModel mTrai= listtrai.getModel();
        ListModel mPhai= listphai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ArrayList<String> arrPhai = new ArrayList<>();
       
        for (int i=0; i<mPhai.getSize(); i++)
        { 
            arrPhai.add((String) mPhai.getElementAt(i)); 
        }
        for (int i=0; i<mTrai.getSize(); i++)
        { 
            arrTrai.add((String) mTrai.getElementAt(i));
            //them vao list phai
            arrPhai.add((String)mTrai.getElementAt(i));
        }
        //xoa ptu khoi list trai
        arrTrai.clear();
        // chuyển sang kiểu mảg để đưa vào JList
        String[] arrData  = arrTrai.toArray(new String[0]);
        String[] arrData1  = arrPhai.toArray(new String[0]);
        listtrai.setListData(arrData);
        listphai.setListData(arrData1);
    }//GEN-LAST:event_btntatcaphaiActionPerformed

    private void btntatcatraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntatcatraiActionPerformed
        // TODO add your handling code here:
        ListModel mTrai= listtrai.getModel();
        ListModel mPhai= listphai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ArrayList<String> arrPhai = new ArrayList<>();
        for (int i=0; i<mTrai.getSize(); i++)
        { 
            arrTrai.add((String) mTrai.getElementAt(i));     
        }
        for (int i=0; i<mPhai.getSize(); i++)
        { 
            arrPhai.add((String) mPhai.getElementAt(i)); 
            //them vao list trai
            arrTrai.add((String)mPhai.getElementAt(i));
        }
        //xoa ptu khoi list trai
        arrPhai.clear();
        // chuyển sang kiểu mảg để đưa vào JList
        String[] arrData  = arrTrai.toArray(new String[0]);
        String[] arrData1  = arrPhai.toArray(new String[0]);
        listtrai.setListData(arrData);
        listphai.setListData(arrData1);
    }//GEN-LAST:event_btntatcatraiActionPerformed

    private void btntraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntraiActionPerformed
        // TODO add your handling code here:
        ListModel mTrai= listtrai.getModel();
        ListModel mPhai= listphai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ArrayList<String> arrPhai = new ArrayList<>();  
        for (int i=0; i<mTrai.getSize(); i++)
        { 
            arrTrai.add((String) mTrai.getElementAt(i));
        }
        int c = listphai.getSelectedIndex();
          //them vao list phai
        for (int i=0; i<mPhai.getSize(); i++)
        { 
            arrPhai.add((String) mPhai.getElementAt(i));
        }
        arrTrai.add((String) mPhai.getElementAt(c));
        //xoa ben list trai
        arrPhai.remove(c);
        String[] arrData  = arrTrai.toArray(new String[0]);
        String[] arrData1  = arrPhai.toArray(new String[0]);
        listtrai.setListData(arrData);
        listphai.setListData(arrData1);  
    }//GEN-LAST:event_btntraiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bai3listview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai3listview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai3listview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai3listview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai3listview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnphai;
    private javax.swing.JButton btntatcaphai;
    private javax.swing.JButton btntatcatrai;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntrai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listphai;
    private javax.swing.JList<String> listtrai;
    // End of variables declaration//GEN-END:variables
}
