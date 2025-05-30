/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        majorField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enrollField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gpaField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        btn_cancel = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        findField = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Management System");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Gender");

        majorField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        majorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        idField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fullname");

        nameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Enrollment Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Phone");

        enrollField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enrollField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollFieldActionPerformed(evt);
            }
        });
        enrollField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                enrollFieldPropertyChange(evt);
            }
        });

        phoneField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("GPA");

        gpaField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gpaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Major");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setText("Clear");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(phoneField)
                        .addComponent(gpaField)
                        .addComponent(enrollField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(nameField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(majorField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)))
                .addGap(29, 29, 29))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cancel, btn_delete, btn_edit, btn_save});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gender, idField, nameField});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enrollField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(majorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_delete))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gender, idField, nameField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_cancel, btn_delete, btn_edit, btn_save});

        findField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFieldActionPerformed(evt);
            }
        });

        btn_find.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_find.setText("Find");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Find student");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_find))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_find)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
       
    }//GEN-LAST:event_idFieldActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String studentId = idField.getText();
        String studentName = nameField.getText();
        String studentGender = gender.getSelectedItem().toString();
        String studentPhone = phoneField.getText();
        String studentGpa = gpaField.getText();
        String studentEnroll = enrollField.getText();
        String studentMajor = majorField.getText();

        if (studentId.isEmpty() || studentName.isEmpty() || studentPhone.isEmpty() || studentGpa.isEmpty() || studentEnroll.isEmpty() || studentMajor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields need to be fill!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!studentPhone.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Phone must be numbers only!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        double gpaValue;
        try {
            gpaValue = Double.parseDouble(studentGpa);
            if (gpaValue > 5.0) {
            JOptionPane.showMessageDialog(this, "GPA cannot be grater than 5.0!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "GPA must be a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }    
        
    
        try {
            Connection conn = Connect.koneksiDB();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO student (student_id, name, gender, phone, GPA, enrollment, major) VALUES ('" 
                + studentId + "', '" 
                + studentName + "', '" 
                + studentGender + "', " 
                + studentPhone + " , "
                + studentGpa + ", '" 
                + studentEnroll + "', '" 
                + studentMajor + "')";
           
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data successfully saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
            tampil_data();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to save data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btn_saveActionPerformed
   
    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String phone = phoneField.getText();
            String gpaText = gpaField.getText();
            
            if (!isNumeric(phone)){
            JOptionPane.showMessageDialog(null, "phone must be number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            if (!isValidGPA(gpaText)) {
            JOptionPane.showMessageDialog(null, "gpa must be between 0.0 untill 5.0", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            
        
        jTable1.setValueAt(idField.getText(), selectedRow, 0);
        jTable1.setValueAt(nameField.getText(), selectedRow, 1);
        jTable1.setValueAt(gender.getSelectedItem(), selectedRow, 2);
        jTable1.setValueAt(phoneField.getText(), selectedRow, 3);
        jTable1.setValueAt(gpaField.getText(), selectedRow, 4);
        jTable1.setValueAt(enrollField.getText(), selectedRow, 5);
        jTable1.setValueAt(majorField.getText(), selectedRow, 6);
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudents", "Ruben", "jakarta");

           String sql = "UPDATE student SET name = ?, gender = ?, phone = ?, GPA = ?, enrollment = ?, major = ? WHERE student_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            
            pstmt.setString(1, nameField.getText());
            pstmt.setString(2, gender.getSelectedItem().toString());
            pstmt.setString(3, phoneField.getText());
            pstmt.setDouble(4, Double.parseDouble(gpaField.getText()));
            pstmt.setString(5, enrollField.getText());
            pstmt.setString(6, majorField.getText());
            pstmt.setString(7, idField.getText()); // student_id as WHERE condition
            
            int updated = pstmt.executeUpdate();

            if (updated > 0) {
                JOptionPane.showMessageDialog(null, "Data has been updated in the database!");
            } else {
                JOptionPane.showMessageDialog(null, "Update failed. No matching student ID.", "Database Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "DB Error", JOptionPane.ERROR_MESSAGE);
        }
        
        } else {
            JOptionPane.showMessageDialog(null, "Choose a row to edit!", "No Selection", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_btn_editActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void enrollFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrollFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void gpaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaFieldActionPerformed

    private void majorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorFieldActionPerformed

    private void enrollFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_enrollFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_enrollFieldPropertyChange

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Choose row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String studentId = jTable1.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure want to delete data with ID: " + studentId + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection conn = Connect.koneksiDB();
                
                Statement stmt = conn.createStatement();
                String sql = "DELETE FROM student WHERE student_id = '" + studentId + "'";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data successfully deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
                tampil_data();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Failed to delete data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
     System.out.println("find button clicked");
        String searchText = findField.getText().trim();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAME");
        model.addColumn("GENDER");
        model.addColumn("PHONE");
        model.addColumn("GPA");
        model.addColumn("ENROLLMENT DATE");
        model.addColumn("MAJOR");

        try {
            Connection conn = Connect.koneksiDB();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM student WHERE student_id LIKE '%" + searchText + "%' OR name LIKE '%" + searchText + "%'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("phone"),
                    rs.getDouble("GPA"),
                    rs.getString("enrollment"),
                    rs.getString("major")
                });
            }
            jTable1.setModel(model);
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Cannot find the data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_findActionPerformed

    private void findFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFieldActionPerformed
        
    }//GEN-LAST:event_findFieldActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        idField.setText(jTable1.getValueAt(selectedRow, 0).toString());
        nameField.setText(jTable1.getValueAt(selectedRow, 1).toString());
        gender.setSelectedItem(jTable1.getValueAt(selectedRow, 2).toString());
        phoneField.setText(jTable1.getValueAt(selectedRow, 3).toString());
        gpaField.setText(jTable1.getValueAt(selectedRow, 4).toString());
        enrollField.setText(jTable1.getValueAt(selectedRow, 5).toString());
        majorField.setText(jTable1.getValueAt(selectedRow, 6).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
         idField.setText("");
         nameField.setText("");
         gender.setSelectedIndex(0);
         phoneField.setText("");
         gpaField.setText("");
         enrollField.setText("");
         majorField.setText("");
         
         jTable1.clearSelection();
         
    }//GEN-LAST:event_btn_cancelActionPerformed

    public void tampil_data() throws SQLException{
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("NO");
    tabel.addColumn("NAMA");
    tabel.addColumn("GENDER");
    tabel.addColumn("PHONE");
    tabel.addColumn("GPA");
    tabel.addColumn("ENROLLMENT DATE");
    tabel.addColumn("MAJOR");
    try {
        java.sql.Connection conn = (java.sql.Connection) project.Connect.koneksiDB();
        String sql = "select * from student";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery(sql);
        while (rs.next()) {
            tabel.addRow(new Object[] {
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7)
            });
        }
        jTable1.setModel(tabel);
    } catch (Exception e) {
        JOptionPane.showMessageDialog (null, "Error: " + e.getMessage());
    }
    }
    
    /**
     * @param args the command line arguments
     */    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField enrollField;
    private javax.swing.JTextField findField;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField gpaField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField majorField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String str) {
    return str.matches("\\d+");
}
    private boolean isValidGPA(String str) {
    try {
        double gpa = Double.parseDouble(str);
        return gpa >= 0 && gpa <= 5.0 && gpa < 10; // pastikan bukan puluhan
    } catch (NumberFormatException e) {
        return false;
    }
}
}
