package com.ghtd.view;

import com.ghtd.controller.AddDonHangController;

/**
 *
 * @author Asus
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
    public OrderJPanel() {
        initComponents();
        AddDonHangController addDonHangController = new AddDonHangController(canNang, datDonButton, diaChiGui, diaChiNhan, giaTien, loaiSanPham, tenSanPham);
        addDonHangController.addDonHang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datDonButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        diaChiNhan = new javax.swing.JTextField();
        giaTien = new javax.swing.JTextField();
        diaChiGui = new javax.swing.JTextField();
        loaiSanPham = new javax.swing.JTextField();
        canNang = new javax.swing.JTextField();
        tenSanPham = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        datDonButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        datDonButton.setText("Đặt đơn");
        datDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datDonButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Form đặt đơn");

        diaChiNhan.setText("Địa chỉ nhận ");
        diaChiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiNhanActionPerformed(evt);
            }
        });

        giaTien.setText("Giá tiền");
        giaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaTienActionPerformed(evt);
            }
        });

        diaChiGui.setText("Địa chỉ gửi ");
        diaChiGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiGuiActionPerformed(evt);
            }
        });

        loaiSanPham.setText("Loại sản phẩm");
        loaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiSanPhamActionPerformed(evt);
            }
        });

        canNang.setText("Cân nặng ");
        canNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canNangActionPerformed(evt);
            }
        });

        tenSanPham.setText("Tên sản phẩm");
        tenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaChiGui, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaChiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canNang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(datDonButton)
                .addGap(429, 429, 429))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaChiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaChiGui, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canNang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(datDonButton)
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datDonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datDonButtonActionPerformed

    private void diaChiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiNhanActionPerformed

    private void giaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaTienActionPerformed

    private void diaChiGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiGuiActionPerformed

    private void loaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaiSanPhamActionPerformed

    private void canNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canNangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canNangActionPerformed

    private void tenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenSanPhamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField canNang;
    private javax.swing.JButton datDonButton;
    private javax.swing.JTextField diaChiGui;
    private javax.swing.JTextField diaChiNhan;
    private javax.swing.JTextField giaTien;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loaiSanPham;
    private javax.swing.JTextField tenSanPham;
    // End of variables declaration//GEN-END:variables
}
