/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.alterar.Alterar_Funcionario;
import view.alterar.Alterar_Marca;
import view.alterar.Alterar_Cliente;
import view.alterar.Alterar_Fornecedor;
import view.cadastrar.Cadastrar_Fornecedor;
import view.cadastrar.Cadastrar_Marca;
import view.cadastrar.Cadastrar_Funcionario;
import view.cadastrar.Cadastrar_Cliente;

/**
 *
 * @author TnahLenovoNote01
 */
public class Entidades extends javax.swing.JFrame {

    /**
     * Creates new form Entidades
     */
    public Entidades() {
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

        jPanel1 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btAltCli = new javax.swing.JButton();
        btAltFunc = new javax.swing.JButton();
        btCadCli = new javax.swing.JButton();
        btCadFunc = new javax.swing.JButton();
        btAltForn = new javax.swing.JButton();
        btAltMarc = new javax.swing.JButton();
        btCadForn = new javax.swing.JButton();
        btCadMarc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        btAltCli.setText("Alterar Cliente");
        btAltCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltCliActionPerformed(evt);
            }
        });

        btAltFunc.setText("Alterar Funcionario");
        btAltFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltFuncActionPerformed(evt);
            }
        });

        btCadCli.setText("Cadastrar Cliente");
        btCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCliActionPerformed(evt);
            }
        });

        btCadFunc.setText("Cadastrar Funcioario");
        btCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncActionPerformed(evt);
            }
        });

        btAltForn.setText("Alterar Fornecedor");
        btAltForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltFornActionPerformed(evt);
            }
        });

        btAltMarc.setText("Alterar Marca");
        btAltMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltMarcActionPerformed(evt);
            }
        });

        btCadForn.setText("Cadastrar Fornecedor");
        btCadForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFornActionPerformed(evt);
            }
        });

        btCadMarc.setText("Cadastrar Marca");
        btCadMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMarcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAltForn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAltFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(btAltCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btAltMarc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadForn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadMarc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAltCli)
                    .addComponent(btCadCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAltFunc)
                    .addComponent(btCadFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAltForn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAltMarc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btCadForn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadMarc)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAltCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltCliActionPerformed
        new Alterar_Cliente().setVisible(true);
    }//GEN-LAST:event_btAltCliActionPerformed

    private void btAltFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltFuncActionPerformed
        new Alterar_Funcionario().setVisible(true);
    }//GEN-LAST:event_btAltFuncActionPerformed

    private void btCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCliActionPerformed
        new Cadastrar_Cliente().setVisible(true);
    }//GEN-LAST:event_btCadCliActionPerformed

    private void btCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncActionPerformed
        new Cadastrar_Funcionario().setVisible(true);
    }//GEN-LAST:event_btCadFuncActionPerformed

    private void btAltFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltFornActionPerformed
        new Alterar_Fornecedor().setVisible(true);
    }//GEN-LAST:event_btAltFornActionPerformed

    private void btAltMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltMarcActionPerformed
        new Alterar_Marca().setVisible(true);
    }//GEN-LAST:event_btAltMarcActionPerformed

    private void btCadFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFornActionPerformed
        new Cadastrar_Fornecedor().setVisible(true);
    }//GEN-LAST:event_btCadFornActionPerformed

    private void btCadMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMarcActionPerformed
        new Cadastrar_Marca().setVisible(true);
    }//GEN-LAST:event_btCadMarcActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltCli;
    private javax.swing.JButton btAltForn;
    private javax.swing.JButton btAltFunc;
    private javax.swing.JButton btAltMarc;
    private javax.swing.JButton btCadCli;
    private javax.swing.JButton btCadForn;
    private javax.swing.JButton btCadFunc;
    private javax.swing.JButton btCadMarc;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}