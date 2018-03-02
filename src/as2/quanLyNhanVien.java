/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as2;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author koala
 */
public class quanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public quanLyNhanVien() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panelAction1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        panelAction2 = new javax.swing.JPanel();
        panelImage = new javax.swing.JPanel();
        labelBrowse = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGEMENT EMPLOYEE");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 102));
        lblTitle.setText("        EMPLOYEE MANAGEMENT ");
        lblTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lblTitle.setOpaque(true);

        panelAction1.setBackground(new java.awt.Color(255, 255, 255));
        panelAction1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNew.setBackground(new java.awt.Color(0, 153, 153));
        btnNew.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconNew.png"))); // NOI18N
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 153));
        btnSave.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconSave.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconDelete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(0, 153, 153));
        btnFind.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconFind.png"))); // NOI18N
        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setBackground(new java.awt.Color(0, 153, 153));
        btnOpen.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnOpen.setForeground(new java.awt.Color(255, 255, 255));
        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconOpen.png"))); // NOI18N
        btnOpen.setText("OPEN FILE");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 153, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconExit.png"))); // NOI18N
        btnExit.setText("EXIT ");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as2/iconUpdate .png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAction1Layout = new javax.swing.GroupLayout(panelAction1);
        panelAction1.setLayout(panelAction1Layout);
        panelAction1Layout.setHorizontalGroup(
            panelAction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAction1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAction1Layout.createSequentialGroup()
                        .addGroup(panelAction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAction1Layout.setVerticalGroup(
            panelAction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAction1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAction2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAction2Layout = new javax.swing.GroupLayout(panelAction2);
        panelAction2.setLayout(panelAction2Layout);
        panelAction2Layout.setHorizontalGroup(
            panelAction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        panelAction2Layout.setVerticalGroup(
            panelAction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        labelBrowse.setBackground(new java.awt.Color(255, 255, 255));
        labelBrowse.setAutoscrolls(true);
        labelBrowse.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelBrowse.setMinimumSize(new java.awt.Dimension(2, 2));
        labelBrowse.setOpaque(true);

        btnBrowse.setText("Browse..");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelImageLayout.setVerticalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImageLayout.createSequentialGroup()
                .addComponent(labelBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfo.setBackground(new java.awt.Color(255, 255, 255));

        lblId.setBackground(new java.awt.Color(204, 204, 204));
        lblId.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 204, 204));
        lblId.setText("EMPLOYEE ID:");

        lblName.setBackground(new java.awt.Color(204, 204, 204));
        lblName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 204, 204));
        lblName.setText("              NAME:");

        lblAge.setBackground(new java.awt.Color(204, 204, 204));
        lblAge.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(0, 204, 204));
        lblAge.setText("                 AGE:");

        lblAddress.setBackground(new java.awt.Color(204, 204, 204));
        lblAddress.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 204, 204));
        lblAddress.setText("        ADDRESS:");

        lblEmail.setBackground(new java.awt.Color(204, 204, 204));
        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 204, 204));
        lblEmail.setText("            EMAIL:");

        lblSalary.setBackground(new java.awt.Color(102, 102, 102));
        lblSalary.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(0, 204, 204));
        lblSalary.setText("         SALARY:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail))
                        .addGap(44, 44, 44)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtSalary)))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblId))
                        .addGap(39, 39, 39)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtName)
                            .addComponent(txtAge)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnFirst.setBackground(new java.awt.Color(0, 153, 153));
        btnFirst.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("FIRST");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 153, 153));
        btnNext.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("NEXT ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(0, 153, 153));
        btnPre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("PRE");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        lblCount.setBackground(new java.awt.Color(189, 150, 111));
        lblCount.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N

        btnLast.setBackground(new java.awt.Color(0, 153, 153));
        btnLast.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText("LAST");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(panelAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(panelAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  phanTuNhanVien: đối tượng nhanVien.
    ArrayList<nhanVien> phanTuNhanVien = new ArrayList<nhanVien>(); 
    private static String DUONG_DAN = "/home/admin123/Documents/QuanLyNhanVien.txt";
    int currentIndex = -1;
    ImageIcon image = null;
    static String DUONG_DAN_FILE = null;
    JFileChooser choose;
    
    
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
            this.open();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        this.pre();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
            this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
            this.reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            Matcher id, age, salery, idSpace, ageSpace, salerySpace;
            Pattern space = Pattern.compile("\\s");
        for (nhanVien nv: phanTuNhanVien){
            if ((nv.getId() == Integer.parseInt(txtId.getText())) || (nv.getEmail().equalsIgnoreCase(txtEmail.getText()))){
                JOptionPane.showMessageDialog(this, "Lưu ý: Không được nhập trùng: Id, email", "Thông báo", JOptionPane.WARNING_MESSAGE);
                reset();
                break;
            }
        }
        
        if (labelBrowse.getIcon() == null){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập hình ảnh của bạn", "Thông báo", JOptionPane.WARNING_MESSAGE);
            reset();
        }
        
        if (
                (txtId.getText().matches("[0-9\\s]{1,}") 
                    && 
                txtAge.getText().matches("[0-9\\s]{1,}"))
            && 
                (txtSalary.getText().matches("[0-9\\s]{1,}") 
                    && 
                txtEmail.getText().matches("[\\sA-z\\-_0-9]{1,}\\@[A-z]{1,6}(\\.[A-z]{1,10}){1,2}"))
           ){
            
             id = space.matcher(txtId.getText());
             age = space.matcher(txtAge.getText());
             salery = space.matcher(txtSalary.getText());
             String id_replaced = id.replaceAll("");
             String age_replaced = id.replaceAll("");
             //String salery_replaced = id.replaceAll("");
             nhanVien hienThiNhanVien = new nhanVien(); 
             hienThiNhanVien.setId(Integer.parseInt(id_replaced));
             hienThiNhanVien.setAge(Integer.parseInt(age_replaced));
             hienThiNhanVien.setSalary(Double.valueOf(txtSalary.getText()));
             hienThiNhanVien.setName(txtName.getText());
             hienThiNhanVien.setAddress(txtAddress.getText());
             hienThiNhanVien.setEmail(txtEmail.getText());
             hienThiNhanVien.LUU_DUONG_DAN_FILE = DUONG_DAN_FILE;
             phanTuNhanVien.add(hienThiNhanVien);
             this.save();
             this.reset();
        }else 
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lại!!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            this.reset();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//     Input chứa chuỗi cần xóa
       nhanVien hienThiNhanVien = new nhanVien(); 
       String input = JOptionPane.showInputDialog(this, "Nhập vào ID cần xóa", "ID...");
//     JOptionPane.showMessageDialog(this,input);
       for (nhanVien nv: phanTuNhanVien){   // ArrayList lưu các đối tượng kiểu nhanVien
           if (nv.getId() == Integer.parseInt(input)){
               phanTuNhanVien.remove(nv);
               JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
               this.save();
               currentIndex--;
               displayElementEmployee();
               break;
           }
           else if (nv.getId() != Integer.parseInt(input)){
               JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
               break;
           }
       }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        int i;
        nhanVien nv = null;
        String findId = JOptionPane.showInputDialog(this, "Nhập vào id cả nhân viên cần tìm");
       
        for (i = 0;i < phanTuNhanVien.size(); ++i){
            nv = phanTuNhanVien.get(i);
            if (nv.getId() == Integer.parseInt(findId)){
                currentIndex = i;
                displayElementEmployee();
                JOptionPane.showMessageDialog(this, "Tìm Kiếm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//              this.reset();
                break;
            }        
        }
        
        if (nv.getId() != Integer.parseInt(findId) || i == phanTuNhanVien.size()){
            this.reset();
            JOptionPane.showMessageDialog(this, "Không thấy nhân viên cần tìm", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
            choose = new JFileChooser(new File("D:\\"));
            choose.setDialogTitle("New image");
            int choosed = choose.showOpenDialog(null);
            if (choosed == JFileChooser.APPROVE_OPTION) {
                File file = choose.getSelectedFile();
                DUONG_DAN_FILE = file.getAbsolutePath();
                image = new ImageIcon(DUONG_DAN_FILE);
                // lây chiều rộng, chiều cao của labelBrowse
                Rectangle rect = labelBrowse.getBounds();
                // Scaling the image to fit in the labelBrowse
                Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
                // Converting the image back to ImageIcon to make acceptable by the labelBrowse
                image = new ImageIcon(scaledImage);
                labelBrowse.setIcon(image);
            }
            else if (choosed == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(this, "You don't choose image, right?","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Matcher id, age, salery, idSpace, ageSpace, salerySpace;
            Pattern space = Pattern.compile("\\s");
        
        
        if (
                (txtId.getText().matches("[0-9\\s]{1,}") 
                    && 
                txtAge.getText().matches("[0-9\\s]{1,}"))
            && 
                (txtSalary.getText().matches("[0-9\\s]{1,}") 
                    && 
                txtEmail.getText().matches("[\\sA-z\\-_0-9]{1,}\\@[A-z]{1,6}(\\.[A-z]{1,10}){1,2}"))
           ){
           
             nhanVien nv = new nhanVien(); 
             nv.setId(Integer.parseInt(txtId.getText().trim()));
             nv.setAge(Integer.parseInt(txtAge.getText().trim()));
             nv.setSalary(Double.valueOf(txtSalary.getText().trim()));
             nv.setName(txtName.getText());
             nv.setAddress(txtAddress.getText());
             nv.setEmail(txtEmail.getText());
             nv.LUU_DUONG_DAN_FILE = DUONG_DAN_FILE;
             phanTuNhanVien.set(currentIndex, nv);
             this.save();
             this.reset();
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lại!!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            this.reset();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
        //          JOptionPane.showMessageDialog(this,phanTuNhanVien.size(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(quanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                quanLyNhanVien nv = new quanLyNhanVien();
                nv.setVisible(true);
                
            }
        });
    }
    
    void reset(){
        txtId.enable();
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtSalary.setText("");
        labelBrowse.setIcon(null);
    }
    
    void displayElementEmployee(){
        // phanTuNhanVien thuộc ArrayList kiểu nhanVien
        // phanTuNhanVien.add(hienThiNhanVien): Thêm một object là hienThiNhanVien
        // nên khi lấy ra là phải có hienThiNhanVien chứa object nhanVien
        nhanVien hienThiNhanVien = phanTuNhanVien.get(currentIndex);    
        txtId.setText(String.valueOf(hienThiNhanVien.getId()));
        txtId.disable();
        txtName.setText(hienThiNhanVien.getName());
        txtAge.setText(String.valueOf(hienThiNhanVien.getAge()));
        txtAddress.setText(hienThiNhanVien.getAddress());
        txtEmail.setText(hienThiNhanVien.getEmail());
        txtSalary.setText(String.valueOf(hienThiNhanVien.getSalary()));  
       
        image = new ImageIcon(hienThiNhanVien.LUU_DUONG_DAN_FILE);
        Rectangle rect = labelBrowse.getBounds();
        // Scaling the image to fit in the labelBrowse
        Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
        // Converting the image back to ImageIcon to make acceptable by the labelBrowse
        image = new ImageIcon(scaledImage);
        labelBrowse.setIcon(image);
        this.count();
    }
    
    void first(){
        currentIndex = 0;
        displayElementEmployee();
    }
   
    void last(){
        currentIndex = phanTuNhanVien.size() - 1;
        displayElementEmployee();
    }
    
    void pre(){
        -- currentIndex;
        if (currentIndex < 0){
            currentIndex = phanTuNhanVien.size() - 1;
        }
        displayElementEmployee();
    }
    
    void next(){
        ++ currentIndex;
        if (currentIndex > phanTuNhanVien.size() - 1){
            currentIndex = 0;
        }
        displayElementEmployee();
    }
    
    void save(){
        try{
            FileOutputStream fileOutput = new FileOutputStream(DUONG_DAN, false);// lưu ObjectOutputStream phải cho ghi đè
            ObjectOutputStream objfileOutput = new ObjectOutputStream(fileOutput);
            objfileOutput.writeObject(phanTuNhanVien);
            objfileOutput.close();
            fileOutput.close();
            JOptionPane.showMessageDialog(this, "Save file successfull","dialog", JOptionPane.INFORMATION_MESSAGE);
        }catch(FileNotFoundException e){
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Save file has been error","dialog", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    void open(){
        try{
            FileInputStream fileInput = new FileInputStream(DUONG_DAN);
            ObjectInputStream objInput = new ObjectInputStream(fileInput);
            // Phải ép kiểu vì readObject là kiểu byte
            phanTuNhanVien = (ArrayList<nhanVien>) objInput.readObject();
            objInput.close();
            fileInput.close();
            if (phanTuNhanVien.size() > 0){
                currentIndex = 0;
                this.displayElementEmployee();
                JOptionPane.showMessageDialog(this, "Open file successfull"," dialog", JOptionPane.INFORMATION_MESSAGE);
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Input employee,please"," dialog", JOptionPane.WARNING_MESSAGE);
            }
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Open file has been error"," dialog", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel labelBrowse;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAction1;
    private javax.swing.JPanel panelAction2;
    private javax.swing.JPanel panelImage;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
    private void count(){
        lblCount.setText("Number of employees: " + (1 + currentIndex) + " in total "+ phanTuNhanVien.size());
    }
    private void setIcon() {
        // Toolkit.getDefaultToolkit() là đối tượng dùng để lấy hay sử lý tài nguyên ở máy cục bộ
        // Trả về file nguồn của ảnh
        Toolkit image = Toolkit.getDefaultToolkit();
        setIconImage(image.getImage(getClass().getResource("icon.png")));
    }
}
