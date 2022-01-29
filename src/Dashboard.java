/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package patientmanagementsystem;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.*;
//import java.lang.*;
import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.Statement;
//import java.sql.SQLException;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.DriverManager;
//import  net.proteanit.sql.DbUtils;
//import javax.swing.table.*;
//import javax.naming.spi.DirStateFactory.Result;
//import javax.swing.table.*;
//import javax.swing.JOptionPane;
//import java.sql.*;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        getData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appointmentsText = new javax.swing.JLabel();
        patientText = new javax.swing.JLabel();
        treatmentText = new javax.swing.JLabel();
        prescriptionText = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TNumLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        appNumLbl = new javax.swing.JLabel();
        PNumLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PrescriptionNumLbl = new javax.swing.JLabel();
        closeLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(254, 131, 198));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 32, 32));
        jLabel19.setText("Dashboard");

        jLabel3.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 32, 32));
        jLabel3.setText(" Medinova Hospital");

        appointmentsText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        appointmentsText.setForeground(new java.awt.Color(255, 242, 249));
        appointmentsText.setText("Appointments");
        appointmentsText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsTextMouseClicked(evt);
            }
        });

        patientText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        patientText.setForeground(new java.awt.Color(255, 242, 249));
        patientText.setText("Patients");
        patientText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTextMouseClicked(evt);
            }
        });

        treatmentText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        treatmentText.setForeground(new java.awt.Color(255, 242, 249));
        treatmentText.setText("Treatment");
        treatmentText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treatmentTextMouseClicked(evt);
            }
        });

        prescriptionText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        prescriptionText.setForeground(new java.awt.Color(255, 242, 249));
        prescriptionText.setText("Prescription");
        prescriptionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescriptionTextMouseClicked(evt);
            }
        });

        logout1.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 242, 249));
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_smol.png"))); // NOI18N
        logout1.setText("Logout");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(treatmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appointmentsText)
                        .addComponent(patientText)
                        .addComponent(jLabel19)))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel19)
                .addGap(62, 62, 62)
                .addComponent(patientText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(appointmentsText)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(treatmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout1)
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(118, 118, 118))
        );

        jPanel4.setBackground(new java.awt.Color(32, 32, 32));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));

        jLabel12.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 131, 198));
        jLabel12.setText("Patients");

        TNumLbl.setFont(new java.awt.Font("PT Sans", 0, 36)); // NOI18N
        TNumLbl.setForeground(new java.awt.Color(255, 242, 249));
        TNumLbl.setText("x");

        jLabel15.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 131, 198));
        jLabel15.setText("Prescriptions");

        appNumLbl.setFont(new java.awt.Font("PT Sans", 0, 36)); // NOI18N
        appNumLbl.setForeground(new java.awt.Color(255, 242, 249));
        appNumLbl.setText("x");

        PNumLbl.setFont(new java.awt.Font("PT Sans", 0, 36)); // NOI18N
        PNumLbl.setForeground(new java.awt.Color(255, 242, 249));
        PNumLbl.setText("x");

        jLabel16.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 131, 198));
        jLabel16.setText("Appointments");

        PrescriptionNumLbl.setFont(new java.awt.Font("PT Sans", 0, 36)); // NOI18N
        PrescriptionNumLbl.setForeground(new java.awt.Color(255, 242, 249));
        PrescriptionNumLbl.setText("x");

        closeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon_small_forloginpage.png"))); // NOI18N
        closeLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLoginMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 131, 198));
        jLabel2.setText("Dashboard");

        jLabel8.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 131, 198));
        jLabel8.setText("Treatments");

        jLabel5.setFont(new java.awt.Font("PT Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Project by Mihir Panchal and Pooja Nambiar ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patient_png_smol.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prescription_pink_smol.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/treatment_pink_smol.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appointment_pink_smol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeLogin))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel29)
                                        .addGap(53, 53, 53)
                                        .addComponent(TNumLbl)
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(PNumLbl)))
                                .addGap(85, 85, 85))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(PrescriptionNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(106, 106, 106)
                                .addComponent(appNumLbl)
                                .addGap(137, 137, 137)))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLogin)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TNumLbl)
                                    .addComponent(jLabel29))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(PNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel16))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel15)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(PrescriptionNumLbl))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(appNumLbl))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(92, 92, 92)
                .addComponent(jLabel32)
                .addGap(40, 40, 40)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLoginMouseClicked

    private void patientTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTextMouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientTextMouseClicked

    private void treatmentTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treatmentTextMouseClicked
        new Treatments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_treatmentTextMouseClicked

    private void prescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionTextMouseClicked
        new Prescription().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescriptionTextMouseClicked

    private void appointmentsTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsTextMouseClicked
        new appointments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentsTextMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

Connection Con = null;
Statement St = null,St1=null,St2=null,St3=null;
ResultSet Rs = null,Rs1=null,Rs2=null,Rs3=null;
private void getData()
{
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
        St = Con.createStatement();
        St1 = Con.createStatement();
        St2 = Con.createStatement();
        St3 = Con.createStatement();
        Rs = St.executeQuery("select count(*) from patientmanagementsystem.patienttbl;");
        Rs1 = St1.executeQuery("select count(*) from treatment;");
        Rs2 = St2.executeQuery("select count(*) from prescription;");
        Rs3 = St3.executeQuery("select count(*) from appointment;");
        while(Rs.next())
        {
            PNumLbl.setText(""+Rs.getInt(1));
        }
        while(Rs1.next())
        {
            TNumLbl.setText(""+Rs1.getInt(1));
        }
        while(Rs2.next())
        {
            PrescriptionNumLbl.setText(""+Rs2.getInt(1));
        }
        while(Rs3.next())
        {
            appNumLbl.setText(""+Rs3.getInt(1));
        }
        //JOptionPane.showMessageDialog(this, "Done");
    }catch(Exception e)
    {
        
    }
}
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PNumLbl;
    private javax.swing.JLabel PrescriptionNumLbl;
    private javax.swing.JLabel TNumLbl;
    private javax.swing.JLabel appNumLbl;
    private javax.swing.JLabel appointmentsText;
    private javax.swing.JLabel closeLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel patientText;
    private javax.swing.JLabel prescriptionText;
    private javax.swing.JLabel treatmentText;
    // End of variables declaration//GEN-END:variables
}
