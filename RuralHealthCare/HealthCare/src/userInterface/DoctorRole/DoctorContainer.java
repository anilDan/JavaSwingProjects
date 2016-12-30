/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorRole;

import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.DoctorOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.MedicineWorkRequest;
import business.WorkQueue.Schedule;
import business.WorkQueue.ScheduleDirectory;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankit
 */
public class DoctorContainer extends javax.swing.JPanel {

    /**
     * Creates new form DoctorContainer
     */
    JPanel container;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ScheduleDirectory scheduleDirectory;
    Network network;
    public DoctorContainer(JPanel container, UserAccount userAccount, DoctorOrganization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.container=container;
        this.userAccount = userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
        this.network = network;
        scheduleDirectory= userAccount.getScheduleDirectory();
        populateScheduleTable();
        populateLabRequestTable();
        populateMedicineRequestTable();
    }
    
    private void populateScheduleTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblDoctorSchedule.getModel();
        
        model.setRowCount(0);
        
        for (Schedule schedule : userAccount.getScheduleDirectory().getScheduleList()){
            Object[] row = new Object[4];
            row[0] = schedule.getDate();
            row[1] = schedule.getTime();
            row[2] = schedule.getAvailHours();
            row[3] = schedule;
            model.addRow(row);
    }
    }
        
        private void populateLabRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblLabRequests.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().contains("Lab"))
            {
            Object[] row = new Object[4];
            row[0] = request.getPatientName();
            row[1] = request;
            row[2] = request.getRequestDate();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
            }
    }
        
        private void populateMedicineRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblMedicineRequests.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().contains("Medicine"))
            {
            Object[] row = new Object[4];
            row[0] = request.getPatientName();
            row[1] = request;
            row[2] = request.getRequestDate();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
        }
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        splitPaneDoctor = new javax.swing.JSplitPane();
        DoctorContainerLeftPanel = new javax.swing.JPanel();
        btnCreateSchedule = new javax.swing.JButton();
        btnModifySchedule = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRequestLabTest = new javax.swing.JButton();
        btnRequestMedicine = new javax.swing.JButton();
        btnViewReports = new javax.swing.JButton();
        DoctorContainerRightJPanel = new javax.swing.JPanel();
        doctorContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorSchedule = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLabRequests = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedicineRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Test Request:");

        splitPaneDoctor.setDividerLocation(350);
        splitPaneDoctor.setDividerSize(1);

        DoctorContainerLeftPanel.setBackground(new java.awt.Color(104, 120, 128));

        btnCreateSchedule.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCreateSchedule.setText("Create Schedule");
        btnCreateSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateScheduleActionPerformed(evt);
            }
        });

        btnModifySchedule.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnModifySchedule.setText("Modify Schedule");
        btnModifySchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyScheduleActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCancel.setText("Cancel Schedule");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRequestLabTest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRequestLabTest.setText("Request Lab Test");
        btnRequestLabTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLabTestActionPerformed(evt);
            }
        });

        btnRequestMedicine.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRequestMedicine.setText("Request Medicine for Patient");
        btnRequestMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMedicineActionPerformed(evt);
            }
        });

        btnViewReports.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnViewReports.setText("View Reports of Patient");
        btnViewReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DoctorContainerLeftPanelLayout = new javax.swing.GroupLayout(DoctorContainerLeftPanel);
        DoctorContainerLeftPanel.setLayout(DoctorContainerLeftPanelLayout);
        DoctorContainerLeftPanelLayout.setHorizontalGroup(
            DoctorContainerLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorContainerLeftPanelLayout.createSequentialGroup()
                .addGroup(DoctorContainerLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DoctorContainerLeftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnViewReports, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoctorContainerLeftPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DoctorContainerLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModifySchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRequestLabTest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRequestMedicine, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        DoctorContainerLeftPanelLayout.setVerticalGroup(
            DoctorContainerLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorContainerLeftPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnCreateSchedule)
                .addGap(18, 18, 18)
                .addComponent(btnModifySchedule)
                .addGap(18, 18, 18)
                .addComponent(btnRequestMedicine)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(btnRequestLabTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewReports)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        splitPaneDoctor.setLeftComponent(DoctorContainerLeftPanel);

        DoctorContainerRightJPanel.setLayout(new java.awt.CardLayout());

        doctorContainer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                doctorContainerComponentShown(evt);
            }
        });

        tblDoctorSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Hours", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctorSchedule);

        tblLabRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Tests", "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLabRequests);
        if (tblLabRequests.getColumnModel().getColumnCount() > 0) {
            tblLabRequests.getColumnModel().getColumn(0).setResizable(false);
            tblLabRequests.getColumnModel().getColumn(1).setResizable(false);
            tblLabRequests.getColumnModel().getColumn(2).setResizable(false);
            tblLabRequests.getColumnModel().getColumn(3).setResizable(false);
        }

        tblMedicineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Medicines", "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMedicineRequests);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Doctor WorkArea");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Test Request:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Schedule:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Medicine Request:");

        javax.swing.GroupLayout doctorContainerLayout = new javax.swing.GroupLayout(doctorContainer);
        doctorContainer.setLayout(doctorContainerLayout);
        doctorContainerLayout.setHorizontalGroup(
            doctorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(doctorContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(doctorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doctorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doctorContainerLayout.setVerticalGroup(
            doctorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DoctorContainerRightJPanel.add(doctorContainer, "card2");

        splitPaneDoctor.setRightComponent(DoctorContainerRightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneDoctor)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateScheduleActionPerformed
        DoctorCreateSchedule doctorCreateSchedule =new DoctorCreateSchedule(DoctorContainerRightJPanel, userAccount, scheduleDirectory);
        DoctorContainerRightJPanel.add("DoctorCreateSchedule", doctorCreateSchedule);
        CardLayout layout=(CardLayout) DoctorContainerRightJPanel.getLayout();
        layout.next(DoctorContainerRightJPanel);
        btnCreateSchedule.setEnabled(false);
        btnModifySchedule.setEnabled(false);
        btnRequestMedicine.setEnabled(false);
        btnRequestLabTest.setEnabled(false);
        btnCancel.setEnabled(false);
        btnViewReports.setEnabled(false);
        
    }//GEN-LAST:event_btnCreateScheduleActionPerformed

    private void btnModifyScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyScheduleActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctorSchedule.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Schedule schedule = (Schedule) tblDoctorSchedule.getValueAt(selectedRow, 3);
            DoctorModifySchedule doctorModifySchedule = new DoctorModifySchedule(DoctorContainerRightJPanel, userAccount, schedule);
            DoctorContainerRightJPanel.add("modifyDoctorSchedule", doctorModifySchedule);
            CardLayout layout = (CardLayout) DoctorContainerRightJPanel.getLayout();
            layout.next(DoctorContainerRightJPanel);
            btnCreateSchedule.setEnabled(false);
            btnRequestLabTest.setEnabled(false);
            btnRequestMedicine.setEnabled(false);
            btnCancel.setEnabled(false);
            btnModifySchedule.setEnabled(false);
            btnViewReports.setEnabled(false);
        }

    }//GEN-LAST:event_btnModifyScheduleActionPerformed

    private void doctorContainerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_doctorContainerComponentShown
        // TODO add your handling code here:
        btnCreateSchedule.setEnabled(true);
        btnModifySchedule.setEnabled(true);
        btnRequestMedicine.setEnabled(true);
        btnRequestLabTest.setEnabled(true);
        btnCancel.setEnabled(true);
        btnViewReports.setEnabled(true);
        populateScheduleTable();
        populateLabRequestTable();
        populateMedicineRequestTable();
    }//GEN-LAST:event_doctorContainerComponentShown

    private void btnRequestMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMedicineActionPerformed
        // TODO add your handling code here:
        DoctorMedicineRequest doctorMedicineRequest =new DoctorMedicineRequest(DoctorContainerRightJPanel, userAccount, enterprise);
        DoctorContainerRightJPanel.add("Lab Test Request", doctorMedicineRequest);
        CardLayout layout=(CardLayout) DoctorContainerRightJPanel.getLayout();
        layout.next(DoctorContainerRightJPanel);
        btnCreateSchedule.setEnabled(false);
        btnModifySchedule.setEnabled(false);
        btnRequestMedicine.setEnabled(false);
        btnRequestLabTest.setEnabled(false);
        btnCancel.setEnabled(false);
        btnViewReports.setEnabled(false);
        
    }//GEN-LAST:event_btnRequestMedicineActionPerformed

    private void btnRequestLabTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLabTestActionPerformed
        // TODO add your handling code here:
        DoctorLabTestRequest docterLabTestRequest =new DoctorLabTestRequest(DoctorContainerRightJPanel, userAccount, enterprise);
        DoctorContainerRightJPanel.add("Lab Test Request", docterLabTestRequest);
        CardLayout layout=(CardLayout) DoctorContainerRightJPanel.getLayout();
        layout.next(DoctorContainerRightJPanel);
        btnCreateSchedule.setEnabled(false);
        btnModifySchedule.setEnabled(false);
        btnRequestMedicine.setEnabled(false);
        btnRequestLabTest.setEnabled(false);
        btnCancel.setEnabled(false);
        btnViewReports.setEnabled(false);
    }//GEN-LAST:event_btnRequestLabTestActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctorSchedule.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Schedule schedule = (Schedule) tblDoctorSchedule.getValueAt(selectedRow, 3);
            userAccount.getScheduleDirectory().cancelSchedule(schedule);
            populateScheduleTable();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabRequests.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            LabTestWorkRequest request = (LabTestWorkRequest) tblLabRequests.getValueAt(selectedRow, 1);
            if(request.getStatus().equalsIgnoreCase("Completed"))
            {
            DoctorViewReoprts doctorViewReports =new DoctorViewReoprts(DoctorContainerRightJPanel, userAccount, request);
            DoctorContainerRightJPanel.add("doctorViewReports", doctorViewReports);
            CardLayout layout=(CardLayout) DoctorContainerRightJPanel.getLayout();
            layout.next(DoctorContainerRightJPanel);
            btnCreateSchedule.setEnabled(false);
            btnModifySchedule.setEnabled(false);
            btnRequestMedicine.setEnabled(false);
            btnRequestLabTest.setEnabled(false);
            btnCancel.setEnabled(false);
            btnViewReports.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Reports are not ready...!!!");
            }
        }
    }//GEN-LAST:event_btnViewReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorContainerLeftPanel;
    private javax.swing.JPanel DoctorContainerRightJPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateSchedule;
    private javax.swing.JButton btnModifySchedule;
    private javax.swing.JButton btnRequestLabTest;
    private javax.swing.JButton btnRequestMedicine;
    private javax.swing.JButton btnViewReports;
    private javax.swing.JPanel doctorContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane splitPaneDoctor;
    private javax.swing.JTable tblDoctorSchedule;
    private javax.swing.JTable tblLabRequests;
    private javax.swing.JTable tblMedicineRequests;
    // End of variables declaration//GEN-END:variables
}
