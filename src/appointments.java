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
import  net.proteanit.sql.DbUtils;
import javax.swing.table.*;
public class appointments extends javax.swing.JFrame {

    /**
     * Creates new form appointments
     */
    public appointments() {
        initComponents();
        getPatient();
        getTreatment();
        appCount();
        displayAppointments();
        clear();
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
        prescriptionText = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        appointmentText1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientText = new javax.swing.JLabel();
        treatmentText = new javax.swing.JLabel();
        dashboardText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        patientlabel = new javax.swing.JLabel();
        timeText1 = new javax.swing.JLabel();
        patientName = new javax.swing.JComboBox<>();
        treatmentListText = new javax.swing.JLabel();
        treatName = new javax.swing.JComboBox<>();
        timeText3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        appTime = new javax.swing.JTextField();
        appDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closeLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1265, 746));

        jPanel1.setBackground(new java.awt.Color(254, 131, 198));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

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

        appointmentText1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        appointmentText1.setForeground(new java.awt.Color(32, 32, 32));
        appointmentText1.setText("Appointments Section");

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

        treatmentText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        treatmentText.setForeground(new java.awt.Color(255, 242, 249));
        treatmentText.setText("Treatment");
        treatmentText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treatmentTextMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(appointmentText1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(treatmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientText)
                            .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardText)
                            .addComponent(logout1))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(appointmentText1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(patientText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(treatmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(prescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(dashboardText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(logout1)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 32, 32));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        dateText.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 242, 249));
        dateText.setText("Date");

        patientlabel.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        patientlabel.setForeground(new java.awt.Color(255, 242, 249));
        patientlabel.setText("Patient");

        timeText1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        timeText1.setForeground(new java.awt.Color(255, 242, 249));
        timeText1.setText("Time");

        patientName.setBackground(new java.awt.Color(248, 237, 237));
        patientName.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N

        treatmentListText.setFont(new java.awt.Font("PT Sans", 0, 24)); // NOI18N
        treatmentListText.setForeground(new java.awt.Color(255, 242, 249));
        treatmentListText.setText("Appointments List");

        treatName.setBackground(new java.awt.Color(248, 237, 237));
        treatName.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N

        timeText3.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        timeText3.setForeground(new java.awt.Color(255, 242, 249));
        timeText3.setText("Treatments");

        AppointmentTable.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Treatments", "Date", "Time"
            }
        ));
        AppointmentTable.setRowHeight(24);
        AppointmentTable.setSelectionBackground(new java.awt.Color(254, 131, 198));
        AppointmentTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        AppointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AppointmentTable);

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.setBorderPainted(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 153, 51));
        saveButton.setText("Save");
        saveButton.setBorderPainted(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.setBorderPainted(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
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

        appTime.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N
        appTime.setText("hh:min a");
        appTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appTimeActionPerformed(evt);
            }
        });

        appDate.setFont(new java.awt.Font("PT Sans", 0, 11)); // NOI18N
        appDate.setText("dd-mon-yyyy");
        appDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appDateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PT Sans", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 131, 198));
        jLabel2.setText("Appointments");

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
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeLogin)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appDate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(64, 64, 64)
                                .addComponent(editButton)
                                .addGap(54, 54, 54)
                                .addComponent(deleteButton)
                                .addGap(46, 46, 46)
                                .addComponent(clearButton)
                                .addGap(226, 226, 226))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(appTime, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(timeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(144, 144, 144)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeText3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(treatName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(treatmentListText)
                                .addGap(351, 351, 351))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(280, 280, 280))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(closeLogin))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeText3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(treatName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton)
                    .addComponent(clearButton))
                .addGap(18, 18, 18)
                .addComponent(treatmentListText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement ps;
    ResultSet rs,rs1=null;
    Statement st,st1=null;
    private void getPatient(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
            st = con.createStatement();
            rs = st.executeQuery("select PatName from patienttbl");
            while(rs.next())
            {
                String pname = rs.getString("PatName");
                patientName.addItem(pname);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void getTreatment(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
            st = con.createStatement();
            rs = st.executeQuery("select t_name from treatment");
            while(rs.next())
            {
                String tname = rs.getString("t_name");
                treatName.addItem(tname);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int app_id=0;
    private void appCount()
    {
        try{
            st1=con.createStatement();
            rs1 = st1.executeQuery("select max(app_id) from appointment;");
            rs1.next();
            app_id = rs1.getInt(1)+1;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    private void displayAppointments(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
            st = con.createStatement();
            rs = st.executeQuery("select * from appointment;");
            AppointmentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        if(appDate.getText().isEmpty()||appTime.getText().isEmpty()||patientName.getSelectedIndex()==-1||treatName.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Information is Missing.");
        }
        else
        {
            try
            {
                
                appCount();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
                ps = con.prepareStatement("insert into appointment(date,time,t_name,p_name) values(?,?,?,?);" ); 
                ps.setString(1,appDate.getText());
                ps.setString(2, appTime.getText());
                ps.setString(4, patientName.getSelectedItem().toString());
                ps.setString(3, treatName.getSelectedItem().toString());
                int row = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Appointment inserted.");
                con.close();
                displayAppointments();
                clear();
            }catch(Exception e)
            {
                Logger.getLogger(appointments.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void clear()
    {
        appDate.setText("");
        appTime.setText("");
        treatName.setSelectedIndex(-1);
        patientName.setSelectedIndex(-1);
        key = -1;
    }
    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clear();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void appTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appTimeActionPerformed

    int key=-1;
    private void AppointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)AppointmentTable.getModel();
        int index = AppointmentTable.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(index, 0).toString());
        appDate.setText(model.getValueAt(index,3).toString());
        patientName.setSelectedItem(model.getValueAt(index,1).toString());
        treatName.setSelectedItem(model.getValueAt(index,2).toString());
        appTime.setText(model.getValueAt(index,4).toString());
    }//GEN-LAST:event_AppointmentTableMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select appointment.");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem?user=root&password=MANGOstick123@");
                ps = con.prepareStatement("delete from appointment where app_id="+key);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Appointment Deleted.");
                displayAppointments();
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
                ps = con.prepareStatement("update appointment set t_name='"+treatName.getSelectedItem().toString()+"'"+",date='"+appDate.getText()+"'"+",time='"+appTime.getText()+"'"+",p_name='"+patientName.getSelectedItem().toString()+"' "+"where app_id="+key+";");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Appointment updated successfully.");
                displayAppointments();
                clear();
            }catch(Exception e){
                Logger.getLogger(Treatments.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void appDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appDateActionPerformed

    private void patientTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTextMouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientTextMouseClicked

    private void treatmentTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treatmentTextMouseClicked
        new Treatments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_treatmentTextMouseClicked

    private void dashboardTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTextMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardTextMouseClicked

    private void prescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionTextMouseClicked
        new Prescription().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescriptionTextMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void closeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLoginMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JTextField appDate;
    private javax.swing.JTextField appTime;
    private javax.swing.JLabel appointmentText1;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel closeLogin;
    private javax.swing.JLabel dashboardText;
    private javax.swing.JLabel dateText;
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
    private javax.swing.JComboBox<String> patientName;
    private javax.swing.JLabel patientText;
    private javax.swing.JLabel patientlabel;
    private javax.swing.JLabel prescriptionText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel timeText1;
    private javax.swing.JLabel timeText3;
    private javax.swing.JComboBox<String> treatName;
    private javax.swing.JLabel treatmentListText;
    private javax.swing.JLabel treatmentText;
    // End of variables declaration//GEN-END:variables
}
