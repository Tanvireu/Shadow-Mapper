///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
///*
// * IDEForm.java
// *
// * Created on 29-okt-2009, 22:47:41
// */
//
//package nl.shadowlink.shadowmapper;
//
//import nl.shadowlink.file_io.ReadFunctions;
//import nl.shadowlink.shadowgtalib.img.IMG_Item;
//import nl.shadowlink.shadowgtalib.model.model.Model;
//import nl.shadowlink.shadowgtalib.model.model.Vector3D;
//import nl.shadowlink.shadowgtalib.model.model.Vector4D;
//
///**
// *
// * @author Kilian
// */
//public class IDEForm extends javax.swing.JFrame {
//    private int mode = 0;
//    private int ideID = 0;
//    private int itemID = 0;
//    private FileManager mFileManager;
//
//    private Vector3D boundsMin;
//    private Vector3D boundsMax;
//    private Vector4D boundsSphere;
//
//    /** Creates new form IDEForm */
//    public IDEForm() {
//        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage("icon.png"));
//        initComponents();
//        this.setVisible(true);
//    }
//
//    public IDEForm(int ideID, int itemID, FileManager mFileManager){
//        this.ideID = ideID;
//        this.itemID = itemID;
//        mode = 1; //edit item
//        initComponents();
//        textModel.setText(mFileManager.mIDEFiles[ideID].items_objs.get(itemID).modelName);
//        textText.setText(mFileManager.mIDEFiles[ideID].items_objs.get(itemID).textureName);
//        textWDD.setText(mFileManager.mIDEFiles[ideID].items_objs.get(itemID).WDD);
//        textDraw.setText(""+ mFileManager.mIDEFiles[ideID].items_objs.get(itemID).drawDistance[0]);
//        textFlag1.setText("" + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).flag1);
//        textFlag2.setText("" + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).flag2);
//        labelBoundsMin.setText("Bounds Min: " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMin.x + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMin.y + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMin.z);
//        labelBoundsMax.setText("Bounds Max: " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMax.x + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMax.y + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMax.z);
//        labelSphere.setText("Sphere: " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsSphere.x + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsSphere.y + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsSphere.z + ", " + mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsSphere.w);
//        this.mFileManager = mFileManager;
//        this.setVisible(true);
//    }
//
//    public IDEForm(int ideID, FileManager mFileManager){
//        mode = 2; //new IDE entry
//        initComponents();
//        this.ideID = ideID;
//        this.mFileManager = mFileManager;
//        this.setVisible(true);
//    }
//
//    /** This method is called from within the constructor to
//     * initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is
//     * always regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        gLCanvas1 = new javax.media.opengl.GLCanvas();
//        textDraw = new javax.swing.JTextField();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        textWDD = new javax.swing.JTextField();
//        buttonTexture = new javax.swing.JButton();
//        buttonModel = new javax.swing.JButton();
//        jLabel3 = new javax.swing.JLabel();
//        textFlag1 = new javax.swing.JTextField();
//        jLabel4 = new javax.swing.JLabel();
//        jLabel6 = new javax.swing.JLabel();
//        textModel = new javax.swing.JTextField();
//        textText = new javax.swing.JTextField();
//        jLabel7 = new javax.swing.JLabel();
//        textFlag2 = new javax.swing.JTextField();
//        jButton3 = new javax.swing.JButton();
//        jPanel1 = new javax.swing.JPanel();
//        labelBoundsMin = new javax.swing.JLabel();
//        labelBoundsMax = new javax.swing.JLabel();
//        labelSphere = new javax.swing.JLabel();
//        buttonOk = new javax.swing.JButton();
//        buttonCancel = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//        setTitle("IDE Form");
//        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//        getContentPane().add(gLCanvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 270));
//
//        textDraw.setText("300");
//        getContentPane().add(textDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 60, -1));
//
//        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N
//        jLabel1.setText("Model File: ");
//        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
//
//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N
//        jLabel2.setText("Texture File: ");
//        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));
//
//        textWDD.setText("null");
//        textWDD.setEnabled(false);
//        textWDD.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                textWDDActionPerformed(evt);
//            }
//        });
//        getContentPane().add(textWDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, -1));
//
//        buttonTexture.setText("Select");
//        buttonTexture.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                buttonTextureActionPerformed(evt);
//            }
//        });
//        getContentPane().add(buttonTexture, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 70, -1));
//
//        buttonModel.setText("Select");
//        buttonModel.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                buttonModelActionPerformed(evt);
//            }
//        });
//        getContentPane().add(buttonModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 70, -1));
//
//        jLabel3.setText("Draw Distance:");
//        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));
//
//        textFlag1.setText("0");
//        getContentPane().add(textFlag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 60, -1));
//
//        jLabel4.setText("Flag1:");
//        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
//
//        jLabel6.setText("Flag2:");
//        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
//
//        textModel.setText(null);
//        getContentPane().add(textModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 140, -1));
//
//        textText.setText("null");
//        getContentPane().add(textText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, -1));
//
//        jLabel7.setText("WDD:");
//        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));
//
//        textFlag2.setText("0");
//        getContentPane().add(textFlag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 60, -1));
//
//        jButton3.setText("Select");
//        jButton3.setEnabled(false);
//        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, -1));
//
//        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Auto Generated"));
//
//        labelBoundsMin.setText("Bounds Min: ");
//
//        labelBoundsMax.setText("Bounds Max: ");
//
//        labelSphere.setText("Sphere: ");
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(labelBoundsMin)
//                    .addComponent(labelSphere)
//                    .addComponent(labelBoundsMax))
//                .addContainerGap(213, Short.MAX_VALUE))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addComponent(labelBoundsMin)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(labelBoundsMax)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(labelSphere)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 202, 300, 80));
//
//        buttonOk.setText("Ok");
//        buttonOk.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                buttonOkActionPerformed(evt);
//            }
//        });
//        getContentPane().add(buttonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));
//
//        buttonCancel.setText("Cancel");
//        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                buttonCancelActionPerformed(evt);
//            }
//        });
//        getContentPane().add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    private void textWDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textWDDActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_textWDDActionPerformed
//
//    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
//        if(mode == 1){
//            saveIDEItem();
//            mFileManager.mIDEFiles[ideID].changed = true;
//        }else if(mode == 2){
//            Item_OBJS tmpItem = new Item_OBJS(Constants.gIV);
//            itemID = mFileManager.addIDEItem(tmpItem, ideID);
//            saveIDEItem();
//        }
//        this.dispose();
//    }//GEN-LAST:event_buttonOkActionPerformed
//
//    private void saveIDEItem(){
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).modelName = textModel.getText();
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).textureName = textText.getText();
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).WDD = textWDD.getText();
//        if(mFileManager.mIDEFiles[ideID].items_objs.get(itemID).WDD.isEmpty()) mFileManager.mIDEFiles[ideID].items_objs.get(itemID).WDD = "null";
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).drawDistance = new float[1];
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).drawDistance[0] = Float.valueOf(textDraw.getText());
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).flag1 = Integer.valueOf(textFlag1.getText());
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).flag2 = Integer.valueOf(textFlag2.getText());
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMax = boundsMax;
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsMin = boundsMin;
//        mFileManager.mIDEFiles[ideID].items_objs.get(itemID).boundsSphere = boundsSphere;
//    }
//
//    public void setModel(String model, int imgID, int itemID){
//        textModel.setText(model);
//
//        IMG_Item imgItem = mFileManager.mIMGFiles[imgID].Items.get(itemID);
//        ReadFunctions rf = new ReadFunctions();
//        rf.openFile(mFileManager.mIMGFiles[imgID].getFileName());
//        rf.seek(imgItem.getOffset());
//        Model tmpMdl = new Model();
//        tmpMdl.loadWDRSystem(rf.getByteReader(imgItem.getSize()), imgItem.getSize());
//        rf.closeFile();
//        boundsMin = tmpMdl.boundsMin.toVector3D();
//        boundsMax = tmpMdl.boundsMax.toVector3D();
//        boundsSphere = tmpMdl.center;
//        boundsSphere.w = tmpMdl.boundsMax.x;
//        labelBoundsMin.setText("Bounds Min: " + boundsMin);
//        labelBoundsMax.setText("Bounds Max: " + boundsMax);
//        labelSphere.setText("Bounds Sphere: " + boundsSphere);
//        tmpMdl.reset();
//        tmpMdl = null;
//    }
//
//    public void setTexture(String texture){
//        textText.setText(texture);
//    }
//
//    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
//        this.dispose();
//    }//GEN-LAST:event_buttonCancelActionPerformed
//
//    private void buttonModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModelActionPerformed
//        new Browser(mFileManager, this, true, true);
//    }//GEN-LAST:event_buttonModelActionPerformed
//
//    private void buttonTextureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTextureActionPerformed
//        new Browser(mFileManager, this, false, false);
//    }//GEN-LAST:event_buttonTextureActionPerformed
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JButton buttonCancel;
//    private javax.swing.JButton buttonModel;
//    private javax.swing.JButton buttonOk;
//    private javax.swing.JButton buttonTexture;
//    private javax.media.opengl.GLCanvas gLCanvas1;
//    private javax.swing.JButton jButton3;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel6;
//    private javax.swing.JLabel jLabel7;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JLabel labelBoundsMax;
//    private javax.swing.JLabel labelBoundsMin;
//    private javax.swing.JLabel labelSphere;
//    private javax.swing.JTextField textDraw;
//    private javax.swing.JTextField textFlag1;
//    private javax.swing.JTextField textFlag2;
//    private javax.swing.JTextField textModel;
//    private javax.swing.JTextField textText;
//    private javax.swing.JTextField textWDD;
//    // End of variables declaration//GEN-END:variables
//
//}
