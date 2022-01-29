/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rocker
 */
//import java.util.*;
//import java.lang.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.*;
public class Treatments extends javax.swing.JFrame {

    public Treatments() {
        initComponents();
        displayTreatments();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prescSectionLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientText = new javax.swing.JLabel();
        prescriptionText = new javax.swing.JLabel();
        dashboardText = new javax.swing.JLabel();
        appointmentsText = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        costText = new javax.swing.JLabel();
        treatmentListText = new javax.swing.JLabel();
        mdeicineslabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TreatmentTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        CostTb = new javax.swing.JTextField();
        TNameTb = new javax.swing.JTextField();
        namelabel = new javax.swing.JLabel();
        MedicineTb = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closeLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1265, 746));

        jPanel1.setBackground(new java.awt.Color(254, 131, 198));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        prescSectionLabel.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        prescSectionLabel.setForeground(new java.awt.Color(32, 32, 32));
        prescSectionLabel.setText("Treatments Section");

        jLabel3.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 32, 32));
        jLabel3.setText(" Medinova Hospital");

        patientText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        patientText.setForeground(new java.awt.Color(255, 242, 249));
        patientText.setText("Patients");
        patientText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTextMouseClicked(evt);
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

        dashboardText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        dashboardText.setForeground(new java.awt.Color(255, 242, 249));
        dashboardText.setText("Dashboard");
        dashboardText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardTextMouseClicked(evt);
            }
        });

        appointmentsText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        appointmentsText.setForeground(new java.awt.Color(255, 242, 249));
        appointmentsText.setText("Appointments");
        appointmentsText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsTextMouseClicked(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientText)
                            .addComponent(prescSectionLabel)
                            .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointmentsText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardText)
                            .addComponent(logout1))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(prescSectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(patientText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(appointmentsText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(dashboardText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(logout1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 32, 32));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        costText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        costText.setForeground(new java.awt.Color(255, 242, 249));
        costText.setText("Cost");

        treatmentListText.setFont(new java.awt.Font("PT Sans", 0, 24)); // NOI18N
        treatmentListText.setForeground(new java.awt.Color(255, 242, 249));
        treatmentListText.setText("Treatments List");

        mdeicineslabel.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        mdeicineslabel.setForeground(new java.awt.Color(255, 242, 249));
        mdeicineslabel.setText("Medicines");

        TreatmentTable.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N
        TreatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Treatments", "Cost", "Medicines", "Quantity"
            }
        ));
        TreatmentTable.setRowHeight(24);
        TreatmentTable.setSelectionBackground(new java.awt.Color(254, 131, 198));
        TreatmentTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TreatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TreatmentTable);

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        editButton.setText("Edit");
        editButton.setBorderPainted(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 153, 51));
        saveButton.setText("Save");
        saveButton.setBorderPainted(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.setBorderPainted(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        CostTb.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N

        TNameTb.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N

        namelabel.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(255, 242, 249));
        namelabel.setText("Name");

        MedicineTb.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N
        MedicineTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineTbActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorderPainted(false);
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 131, 198));
        jLabel2.setText("Treatments");

        jLabel4.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Project by Mihir Panchal and Pooja Nambiar ");

        closeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon_small_forloginpage.png"))); // NOI18N
        closeLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeLogin))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdeicineslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(saveButton)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(deleteButton)
                        .addGap(51, 51, 51)
                        .addComponent(clearButton))
                    .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(treatmentListText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(closeLogin))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(mdeicineslabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(MedicineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(editButton)
                        .addComponent(deleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(treatmentListText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MedicineTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineTbActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    
    Connection con;
    PreparedStatement ps;
    ResultSet rs,rs1=null;
    Statement st,st1=null;
    
    private void displayTreatments(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
            st = con.createStatement();
            rs = st.executeQuery("select * from treatment");
            TreatmentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int t_id=0;
    private void tCount()
    {
        try{
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select max(t_id) from treatment;");
            rs1.next();
            t_id = rs1.getInt(1)+1;
        }catch(Exception ex){
            ex.printStackTrace();}
    }
    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        if(TNameTb.getText().isEmpty()||CostTb.getText().isEmpty()||MedicineTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Information is Missing.");
        }
        else
        {
            try
            {
                tCount();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
                ps = con.prepareStatement("insert into treatment(t_id,t_name,t_cost,t_medicine) values(?,?,?,?)" );
                ps.setInt(1,t_id);
                ps.setString(2, TNameTb.getText());
                ps.setInt(3, Integer.parseInt(CostTb.getText()));
                ps.setString(4, MedicineTb.getText());
                int row = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Treatment inserted.");
                con.close();
                displayTreatments();
                clear();
            }catch(Exception e)
            {
                Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    
    int key= -1;
    private void TreatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)TreatmentTable.getModel();
        int index=TreatmentTable.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(index, 0).toString());
        TNameTb.setText(model.getValueAt(index,1).toString());
        CostTb.setText(model.getValueAt(index,2).toString());
        MedicineTb.setText(model.getValueAt(index,3).toString());
    }//GEN-LAST:event_TreatmentTableMouseClicked

    private void clear()
    {
        TNameTb.setText("");
        CostTb.setText("");
        MedicineTb.setText("");
        key = -1;
    }
    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clear();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select treatment.");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
                ps = con.prepareStatement("delete from treatment where t_id="+key);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Treatment Deleted.");
                displayTreatments();
                clear();
            }catch(Exception e){
                Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select treatment to edit.");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
                ps = con.prepareStatement("update treatment set t_name='"+TNameTb.getText()+"'"+",t_cost='"+Integer.parseInt(CostTb.getText())+"'"+",t_medicine='"+MedicineTb.getText()+"'" +"where t_id="+key+";");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Treatment updated successfully.");
                displayTreatments();
                clear();
            }catch(Exception e){
                Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void patientTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTextMouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientTextMouseClicked

    private void prescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionTextMouseClicked
        new Prescription().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescriptionTextMouseClicked

    private void dashboardTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTextMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardTextMouseClicked

    private void appointmentsTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsTextMouseClicked
        new appointments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentsTextMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void closeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLoginMouseClicked

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CostTb;
    private javax.swing.JTextField MedicineTb;
    private javax.swing.JTextField TNameTb;
    private javax.swing.JTable TreatmentTable;
    private javax.swing.JLabel appointmentsText;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel closeLogin;
    private javax.swing.JLabel costText;
    private javax.swing.JLabel dashboardText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel mdeicineslabel;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel patientText;
    private javax.swing.JLabel prescSectionLabel;
    private javax.swing.JLabel prescriptionText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel treatmentListText;
    // End of variables declaration//GEN-END:variables
}
