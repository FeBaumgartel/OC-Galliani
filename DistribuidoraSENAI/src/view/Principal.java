/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import persist.UserLogado;

/**
 *
 * @author TnahLenovoNote01
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
       // lbUser.setText("Usuário: "+UserLogado.toString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        btFrente = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        btGraficos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btFrente.setText("Frente de Caixa");

        btRelatorios.setText("Relatorios");

        btGraficos.setText("Graficos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGraficos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btFrente)
                    .addComponent(btRelatorios)
                    .addComponent(btGraficos)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TnahLenovoNote01\\Desktop\\imgs\\logo.PNG")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFrente;
    private javax.swing.JButton btGraficos;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
