/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem system;
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.system = system;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        boxOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            boxOrganization.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        boxEmployee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            boxEmployee.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        boxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            boxRole.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUser.getModel()).addRow(row);
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

        btnCreateUser = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        boxEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        boxOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        boxRole = new javax.swing.JComboBox();
        lblBanner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(104, 120, 128));

        btnCreateUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCreateUser.setText("Add User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User Name:");

        tblUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setRowHeight(30);
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setResizable(false);
            tblUser.getColumnModel().getColumn(1).setResizable(false);
        }

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lblEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployee.setText("Employee:");

        boxEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblOrganization.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrganization.setText("Organization:");

        boxOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOrganizationActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role:");

        boxRole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblBanner.setText("Manage Users");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBanner))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btnCreateUser))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxOrganization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(boxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(boxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtName.getText();
        String password = txtPassword.getText();
        if(userName.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter valid value", "Warning", JOptionPane.WARNING_MESSAGE);
            txtName.setText("");
            txtPassword.setText("");
        }
        else
        {
        Organization organization = (Organization) boxOrganization.getSelectedItem();
        Employee employee = (Employee) boxEmployee.getSelectedItem();
        Role role = (Role) boxRole.getSelectedItem();
        //organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        if(system.isUsernameUnique(userName) == true)
        {
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        }
        else{
            JOptionPane.showMessageDialog(null, "Username is already in use.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        txtName.setText("");
        txtPassword.setText("");
        JOptionPane.showMessageDialog(null, "User added successfully...!!!");
        popData();
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOrganizationActionPerformed

    }//GEN-LAST:event_boxOrganizationActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost

    }//GEN-LAST:event_txtNameFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEmployee;
    private javax.swing.JComboBox boxOrganization;
    private javax.swing.JComboBox boxRole;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
