/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.Story;
import Classes.User;
import Controller.Controller;
import Model.UserModel;
import java.awt.HeadlessException;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class viewForm extends javax.swing.JFrame {
    Controller controller = new Controller();
    
    LinkedList<Story> storyObjectList = new LinkedList<>();
    
    /**
     * Creates new form viewForm
     */
    public viewForm() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserLastname = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        BtnSaveUser = new javax.swing.JButton();
        BtnSearchUser = new javax.swing.JButton();
        BtnEditUser = new javax.swing.JButton();
        BtnDeleteUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUserIdStory = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtShortDescription = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStory = new javax.swing.JTextArea();
        BtnSaveStory = new javax.swing.JButton();
        BtnSearchStory = new javax.swing.JButton();
        BtnEditStory = new javax.swing.JButton();
        BtnDeleteBook = new javax.swing.JButton();
        LbInstructions = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtStoryReg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbGenre = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtKeyWords = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListStories = new javax.swing.JList<>();
        BtnSearchStoryKeyWords = new javax.swing.JButton();
        BtnViewStory = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtStorySearched = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TheBestStories.com");

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(232, 244, 250));

        jLabel2.setText("Name");

        jLabel3.setText("Document Number");

        jLabel4.setText("Last Name");

        jLabel5.setText("User id:");

        txtUserId.setEditable(false);

        BtnSaveUser.setBackground(new java.awt.Color(60, 254, 100));
        BtnSaveUser.setText("Save");
        BtnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveUserActionPerformed(evt);
            }
        });

        BtnSearchUser.setBackground(new java.awt.Color(110, 180, 250));
        BtnSearchUser.setText("Search");
        BtnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchUserActionPerformed(evt);
            }
        });

        BtnEditUser.setBackground(new java.awt.Color(240, 80, 240));
        BtnEditUser.setText("Edit");
        BtnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditUserActionPerformed(evt);
            }
        });

        BtnDeleteUser.setBackground(new java.awt.Color(240, 100, 100));
        BtnDeleteUser.setText("Delete");
        BtnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnSaveUser)
                        .addGap(39, 39, 39)
                        .addComponent(BtnSearchUser)
                        .addGap(36, 36, 36)
                        .addComponent(BtnEditUser)
                        .addGap(48, 48, 48)
                        .addComponent(BtnDeleteUser)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtUserName)
                            .addComponent(txtUserLastname)
                            .addComponent(txtUserId))
                        .addGap(160, 160, 160))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSaveUser)
                    .addComponent(BtnSearchUser)
                    .addComponent(BtnEditUser)
                    .addComponent(BtnDeleteUser))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Users", jPanel1);

        jPanel2.setBackground(new java.awt.Color(254, 220, 220));

        jLabel6.setText("Title: ");

        jLabel7.setText("User ID: ");

        jLabel8.setText("Short Description: ");

        jLabel9.setText("Story:");

        txtStory.setColumns(20);
        txtStory.setLineWrap(true);
        txtStory.setRows(5);
        txtStory.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtStory);

        BtnSaveStory.setBackground(new java.awt.Color(60, 254, 100));
        BtnSaveStory.setText("Save");
        BtnSaveStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveStoryActionPerformed(evt);
            }
        });

        BtnSearchStory.setBackground(new java.awt.Color(110, 180, 250));
        BtnSearchStory.setText("Search");
        BtnSearchStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchStoryActionPerformed(evt);
            }
        });

        BtnEditStory.setBackground(new java.awt.Color(240, 80, 240));
        BtnEditStory.setText("Edit");
        BtnEditStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditStoryActionPerformed(evt);
            }
        });

        BtnDeleteBook.setBackground(new java.awt.Color(240, 100, 100));
        BtnDeleteBook.setText("Delete");
        BtnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteBookActionPerformed(evt);
            }
        });

        jLabel12.setText("Story id:");

        txtStoryReg.setEditable(false);

        jLabel13.setText("Genre:");

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Romance", "Science Fiction", "Literary fiction", "Mistery", "Thriller", "Horror", "Historical", "Fantasy", "Dystopian", "Magical Realism", "Realist Literatur" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserIdStory, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtShortDescription)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStoryReg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BtnSaveStory)
                                .addGap(53, 53, 53)
                                .addComponent(BtnSearchStory)
                                .addGap(57, 57, 57)
                                .addComponent(BtnEditStory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnDeleteBook))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LbInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtUserIdStory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtShortDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtStoryReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSearchStory)
                    .addComponent(BtnSaveStory)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnEditStory)
                        .addComponent(BtnDeleteBook)))
                .addGap(18, 18, 18)
                .addComponent(LbInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Story registration", jPanel2);

        jPanel3.setBackground(new java.awt.Color(210, 254, 210));

        jLabel10.setText("Search Story by key words");

        ListStories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListStories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListStoriesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListStories);

        BtnSearchStoryKeyWords.setBackground(new java.awt.Color(110, 180, 250));
        BtnSearchStoryKeyWords.setText("Search");
        BtnSearchStoryKeyWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchStoryKeyWordsActionPerformed(evt);
            }
        });

        BtnViewStory.setBackground(new java.awt.Color(250, 180, 250));
        BtnViewStory.setText("View");
        BtnViewStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewStoryActionPerformed(evt);
            }
        });

        txtStorySearched.setEditable(false);
        txtStorySearched.setColumns(20);
        txtStorySearched.setLineWrap(true);
        txtStorySearched.setRows(5);
        txtStorySearched.setToolTipText("");
        txtStorySearched.setWrapStyleWord(true);
        txtStorySearched.setName(""); // NOI18N
        jScrollPane3.setViewportView(txtStorySearched);

        jLabel14.setText("Select from the list to read the story:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKeyWords)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSearchStoryKeyWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnViewStory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(BtnSearchStoryKeyWords)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnViewStory)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search stories", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveUserActionPerformed
        try {
            String document = txtDocument.getText();
            String name = txtUserName.getText();
            String lastname = txtUserLastname.getText();
            
            if(document.equals("") || name.equals("") || lastname.equals("")){
                JOptionPane.showMessageDialog(this, "Fill all fields");
            }else{
                User user = new User(null, document, name, lastname);
                controller.SaveUser(user);
                this.clearUsersFields();
                JOptionPane.showMessageDialog(this, "The record has been saved");
            }

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, ("Error: " + e.getMessage()));
        }
    }//GEN-LAST:event_BtnSaveUserActionPerformed

    private void BtnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchUserActionPerformed
        String document = txtDocument.getText();
        
        User user = controller.SearchUser(document);
        
        if(user == null){
            JOptionPane.showMessageDialog(this, "Document not found");
        }else{
            txtUserId.setText(user.getId()+"");
            txtUserName.setText(user.getName()+"");
            txtUserLastname.setText(user.getLastname()+"");
        }
        
    }//GEN-LAST:event_BtnSearchUserActionPerformed

    private void BtnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditUserActionPerformed
        try {
            Integer id= Integer.parseInt(txtUserId.getText());
            String document = txtDocument.getText();
            String name = txtUserName.getText();
            String lastname = txtUserLastname.getText();
            
            if(document.equals("") || name.equals("") || lastname.equals("")){
                JOptionPane.showMessageDialog(this, "Fill all fields");
            }else{
                User user = new User(id, document, name, lastname);
                controller.SaveUser(user);
                this.clearUsersFields();
                JOptionPane.showMessageDialog(this, "The record has been updated");
            }

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, ("Error: " + e.getMessage()));
        }
    }//GEN-LAST:event_BtnEditUserActionPerformed

    private void BtnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteUserActionPerformed
        Integer id= Integer.parseInt(txtUserId.getText()) ;
        
        Boolean deleted = controller.DeleteUser(id);
        
        if(!deleted){
            JOptionPane.showMessageDialog(this, "Document not found");
        }else{
            JOptionPane.showMessageDialog(this, "User deleted successfully");
            this.clearUsersFields();
            
        }
    }//GEN-LAST:event_BtnDeleteUserActionPerformed

    private void BtnSaveStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveStoryActionPerformed
        try {
            String title = txtTitle.getText();
            int user_id = Integer.parseInt(txtUserIdStory.getText());
            String short_description = txtShortDescription.getText();
            String story = txtStory.getText();
            String genre = cbGenre.getSelectedItem().toString();
            
            if(title.equals("") || txtUserIdStory.getText().equals("") || story.equals("") || short_description.equals("")){
                JOptionPane.showMessageDialog(this, "Fill all fields");
            }else{
                Story storySave = new Story(null, user_id, title, short_description, story, genre, title);
                controller.SaveStory(storySave);
                this.clearStoriesRegFields();
                JOptionPane.showMessageDialog(this, "The record has been saved");
            }

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, ("Error: " + e.getMessage()));
        }
    }//GEN-LAST:event_BtnSaveStoryActionPerformed

    private void BtnSearchStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchStoryActionPerformed
        String title = txtTitle.getText();
        if(title.equals("") || txtUserIdStory.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Fill all fields");
        }
        Story story = controller.SearchStory(title);
        txtShortDescription.setText(story.getShort_description());
        txtStory.setText(story.getStory());
        cbGenre.setSelectedItem(story.getGenre());
        txtUserIdStory.setText(story.getUser_id()+"");
        txtStoryReg.setText(story.getId()+"");
        
    }//GEN-LAST:event_BtnSearchStoryActionPerformed

    private void BtnSearchStoryKeyWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchStoryKeyWordsActionPerformed
        try {
            String keyWords = txtKeyWords.getText();
            String[] words = keyWords.split(" ");

            this.storyObjectList= controller.SearchStoryByKeyWords(words);
            this.FillJlist();
        } catch (Exception e) {
            System.out.println("Error searching by key words: "+e.getMessage());
        }
                
    }//GEN-LAST:event_BtnSearchStoryKeyWordsActionPerformed

    private void BtnViewStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewStoryActionPerformed
        String selected = ListStories.getSelectedValue();
        String[] words = selected.split(" - ");
        String title= words[1];
        Story story = controller.SearchStory(title);
        txtStorySearched.setText(story.getStory());
        
    }//GEN-LAST:event_BtnViewStoryActionPerformed

    private void BtnEditStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditStoryActionPerformed
        try {
            int id = Integer.parseInt(txtStoryReg.getText());
            String title = txtTitle.getText();
            int user_id = Integer.parseInt(txtUserIdStory.getText());
            String short_description = txtShortDescription.getText();
            String story = txtStory.getText();
            String genre = cbGenre.getSelectedItem().toString();
            
            if(title.equals("") || txtUserIdStory.getText().equals("") || story.equals("") || short_description.equals("")){
                JOptionPane.showMessageDialog(this, "Fill all fields");
            }else{
                Story storySave = new Story(id, user_id, title, short_description, story, genre, title);
                controller.SaveStory(storySave);
                this.clearStoriesRegFields();
                JOptionPane.showMessageDialog(this, "The record has been updated");
            }

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, ("Error: " + e.getMessage()));
        }
    }//GEN-LAST:event_BtnEditStoryActionPerformed

    private void BtnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteBookActionPerformed
        try {
            Integer id= Integer.parseInt(txtStoryReg.getText()) ;
            Boolean deleted = controller.DeleteStory(id);
            if(!deleted){
                JOptionPane.showMessageDialog(this, "Story not found");
            }else{
                JOptionPane.showMessageDialog(this, "Story deleted successfully");
            this.clearStoriesRegFields();
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have to search the Story before you delete it.\n"
                    + e.getMessage());
        }
        
    }//GEN-LAST:event_BtnDeleteBookActionPerformed

    private void ListStoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListStoriesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListStoriesValueChanged

    public void clearStoriesRegFields(){
        String t = "";
        txtTitle.setText(t);
        txtShortDescription.setText(t);
        txtUserIdStory.setText(t);
        cbGenre.setSelectedIndex(0);
        txtStory.setText(t);
        txtStoryReg.setText(t);
    }
    public void clearUsersFields(){
        String t = "";
        txtDocument.setText(t);
        txtUserName.setText(t);
        txtUserLastname.setText(t);
        txtUserId.setText(t);
    }
    
    private void FillJlist(){
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (Story story: storyObjectList) {       
            String data = story.getId()+ " - "+ story.getTitle();
            model.add(index, data);
            index++;
        }
        ListStories.setModel(model);
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeleteBook;
    private javax.swing.JButton BtnDeleteUser;
    private javax.swing.JButton BtnEditStory;
    private javax.swing.JButton BtnEditUser;
    private javax.swing.JButton BtnSaveStory;
    private javax.swing.JButton BtnSaveUser;
    private javax.swing.JButton BtnSearchStory;
    private javax.swing.JButton BtnSearchStoryKeyWords;
    private javax.swing.JButton BtnSearchUser;
    private javax.swing.JButton BtnViewStory;
    private javax.swing.JLabel LbInstructions;
    private javax.swing.JList<String> ListStories;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtKeyWords;
    private javax.swing.JTextField txtShortDescription;
    private javax.swing.JTextArea txtStory;
    private javax.swing.JTextField txtStoryReg;
    private javax.swing.JTextArea txtStorySearched;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserIdStory;
    private javax.swing.JTextField txtUserLastname;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
