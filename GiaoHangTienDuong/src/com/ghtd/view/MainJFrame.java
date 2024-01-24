package com.ghtd.view;

import com.ghtd.bean.DanhMucBean;
import com.ghtd.controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Asus
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        setTitle("HỆ THỐNG HỖ TRỢ GIAO HÀNG TIỆN ĐƯỜNG");
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("AccountInfo", jPanelAccountInfo, jLabelAccountInfo));
        listItem.add(new DanhMucBean("Order", jPanelOrder, jLabelOrder));
        listItem.add(new DanhMucBean("AllOrder", jPanelAllOrder, jLabelAllOrder));
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jPanelView);
        controller.setView(jPanelAccountInfo, jLabelAccountInfo);
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAll = new javax.swing.JPanel();
        jPanelOptions = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelAccountInfo = new javax.swing.JPanel();
        jLabelAccountInfo = new javax.swing.JLabel();
        jPanelOrder = new javax.swing.JPanel();
        jLabelOrder = new javax.swing.JLabel();
        jPanelAllOrder = new javax.swing.JPanel();
        jLabelAllOrder = new javax.swing.JLabel();
        jPanelLogout = new javax.swing.JPanel();
        jLabelLogout = new javax.swing.JLabel();
        jPanelView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAll.setBackground(new java.awt.Color(255, 255, 255));

        jPanelOptions.setBackground(new java.awt.Color(117, 184, 85));

        jPanelHome.setBackground(new java.awt.Color(21, 114, 65));

        jLabelHome.setFont(new java.awt.Font("Montserrat", 3, 20)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ghtd/images/truck.png"))); // NOI18N
        jLabelHome.setText("GIAO HÀNG TIỆN ĐƯỜNG");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHome)
                .addGap(20, 20, 20))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jPanelAccountInfo.setBackground(new java.awt.Color(255, 102, 102));
        jPanelAccountInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 246, 244), null));

        jLabelAccountInfo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelAccountInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ghtd/images/info.png"))); // NOI18N
        jLabelAccountInfo.setText("THÔNG TIN TÀI KHOẢN");

        javax.swing.GroupLayout jPanelAccountInfoLayout = new javax.swing.GroupLayout(jPanelAccountInfo);
        jPanelAccountInfo.setLayout(jPanelAccountInfoLayout);
        jPanelAccountInfoLayout.setHorizontalGroup(
            jPanelAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountInfoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelAccountInfo)
                .addGap(45, 45, 45))
        );
        jPanelAccountInfoLayout.setVerticalGroup(
            jPanelAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelAccountInfo)
                .addGap(30, 30, 30))
        );

        jPanelOrder.setBackground(new java.awt.Color(255, 102, 102));
        jPanelOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 246, 244), null));

        jLabelOrder.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ghtd/images/cart.png"))); // NOI18N
        jLabelOrder.setText("ĐẶT ĐƠN GIAO HÀNG");

        javax.swing.GroupLayout jPanelOrderLayout = new javax.swing.GroupLayout(jPanelOrder);
        jPanelOrder.setLayout(jPanelOrderLayout);
        jPanelOrderLayout.setHorizontalGroup(
            jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelOrder)
                .addGap(51, 51, 51))
        );
        jPanelOrderLayout.setVerticalGroup(
            jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelOrder)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanelAllOrder.setBackground(new java.awt.Color(255, 102, 102));
        jPanelAllOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 246, 244), null));

        jLabelAllOrder.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelAllOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ghtd/images/description.png"))); // NOI18N
        jLabelAllOrder.setText("TẤT CẢ ĐƠN HÀNG");

        javax.swing.GroupLayout jPanelAllOrderLayout = new javax.swing.GroupLayout(jPanelAllOrder);
        jPanelAllOrder.setLayout(jPanelAllOrderLayout);
        jPanelAllOrderLayout.setHorizontalGroup(
            jPanelAllOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllOrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAllOrder)
                .addGap(64, 64, 64))
        );
        jPanelAllOrderLayout.setVerticalGroup(
            jPanelAllOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllOrderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelAllOrder)
                .addGap(30, 30, 30))
        );

        jPanelLogout.setBackground(new java.awt.Color(255, 102, 102));
        jPanelLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 246, 244), null));

        jLabelLogout.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ghtd/images/logout.png"))); // NOI18N
        jLabelLogout.setText("ĐĂNG XUẤT");

        javax.swing.GroupLayout jPanelLogoutLayout = new javax.swing.GroupLayout(jPanelLogout);
        jPanelLogout.setLayout(jPanelLogoutLayout);
        jPanelLogoutLayout.setHorizontalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelLogout)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelLogoutLayout.setVerticalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelLogout)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOptionsLayout = new javax.swing.GroupLayout(jPanelOptions);
        jPanelOptions.setLayout(jPanelOptionsLayout);
        jPanelOptionsLayout.setHorizontalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAccountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAllOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOptionsLayout.setVerticalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jPanelView.setBackground(new java.awt.Color(173, 56, 56));

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelAllLayout = new javax.swing.GroupLayout(jPanelAll);
        jPanelAll.setLayout(jPanelAllLayout);
        jPanelAllLayout.setHorizontalGroup(
            jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllLayout.createSequentialGroup()
                .addComponent(jPanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAllLayout.setVerticalGroup(
            jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAccountInfo;
    private javax.swing.JLabel jLabelAllOrder;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelOrder;
    private javax.swing.JPanel jPanelAccountInfo;
    private javax.swing.JPanel jPanelAll;
    private javax.swing.JPanel jPanelAllOrder;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelOrder;
    private javax.swing.JPanel jPanelView;
    // End of variables declaration//GEN-END:variables
}
