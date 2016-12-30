/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import business.Employee.Employee;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDirectory;
    private JPanel container;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel container,OrganizationDirectory organizationDirectory) {
        initComponents();
        this.container = container;
        this.organizationDirectory = organizationDirectory;
        
        populateOrganizationComboBox();
        populateOrganizationEmployeeComboBox();
    }
    
    public void populateOrganizationComboBox(){
        boxOrganization.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            boxOrganization.addItem(organization);
        }
    }
    
    public void populateOrganizationEmployeeComboBox(){
        boxOrganizationEmployee.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            boxOrganizationEmployee.addItem(organization);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        btnCreateEmployee = new javax.swing.JButton();
        boxOrganization = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        boxOrganizationEmployee = new javax.swing.JComboBox();
        lblorganizationEmployee = new javax.swing.JLabel();

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
            tblOrganization.getColumnModel().getColumn(1).setResizable(false);
        }

        btnCreateEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        boxOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOrganizationActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblOrganization.setText("Organization:");

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        boxOrganizationEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxOrganizationEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblorganizationEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblorganizationEmployee.setText("Organization:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblOrganization)
                        .addGap(18, 18, 18)
                        .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblorganizationEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(boxOrganizationEmployee, 0, 163, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(btnCreateEmployee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganization))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxOrganizationEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblorganizationEmployee))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreateEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        
        Organization organization = (Organization) boxOrganizationEmployee.getSelectedItem();
        String name = txtName.getText();
        if(organization.getEmployeeDirectory().getEmployeeList().size() < 1)
        {
            organization.getEmployeeDirectory().createEmployee(name, 1);
        }
        else
        {
            Employee employee = organization.getEmployeeDirectory().getEmployeeList().get(organization.getEmployeeDirectory().getEmployeeList().size() -1);
        organization.getEmployeeDirectory().createEmployee(name,employee.getId() + 1);
            
        }
        //populateTable(organization);
        JOptionPane.showMessageDialog(null, "Employee Added Succesfully");
        boxOrganization.setSelectedItem(boxOrganizationEmployee.getSelectedItem());
        
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOrganizationActionPerformed
        Organization organization = (Organization) boxOrganization.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_boxOrganizationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxOrganization;
    private javax.swing.JComboBox boxOrganizationEmployee;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblorganizationEmployee;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
