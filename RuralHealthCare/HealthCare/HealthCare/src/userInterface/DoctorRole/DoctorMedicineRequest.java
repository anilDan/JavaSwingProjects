/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorRole;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.PharmacistOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.MedicineWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ketul
 */
public class DoctorMedicineRequest extends javax.swing.JPanel {

    /**
     * Creates new form DoctorMedicineRequest
     */
    UserAccount userAccount;
    JPanel container;
    Enterprise enterprise;
    public DoctorMedicineRequest(JPanel container, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.container = container;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        medicinesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMedicines = new javax.swing.JTextArea();
        requestButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(104, 120, 128));

        banner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        banner.setText("Request Medicines");

        patientNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        patientNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientNameLabel.setText("Patient Name:");

        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        medicinesLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        medicinesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        medicinesLabel.setText("Medicines:");

        areaMedicines.setColumns(20);
        areaMedicines.setRows(5);
        jScrollPane1.setViewportView(areaMedicines);

        requestButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        requestButton.setText("Request");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(banner))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(medicinesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientNameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(requestButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLabel)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicinesLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        // TODO add your handling code here:
        MedicineWorkRequest request = new MedicineWorkRequest();
        request.setPatientName(txtPatientName.getText());
        request.setMessage(areaMedicines.getText());
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setRequestType("Medicine Request");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof PharmacistOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_requestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMedicines;
    private javax.swing.JLabel banner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicinesLabel;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JButton requestButton;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
