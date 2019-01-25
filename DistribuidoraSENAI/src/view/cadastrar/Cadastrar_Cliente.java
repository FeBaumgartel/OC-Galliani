/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cadastrar;

import dataservices.dao.ClienteDao;
import domain.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author TnahLenovoNote01
 */
public class Cadastrar_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar_Cliente
     */
    public Cadastrar_Cliente() {
        setTitle("Cadastrar Cliente");
        initComponents();
        limpaCampos();
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
        System.out.println(dao.list());
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
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txNome = new javax.swing.JTextField();
        txCPF = new javax.swing.JTextField();
        txRG = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txCelular = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbImagem = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbMsg = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        txDataNasc = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btConfirmar);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbImagem.setText("Imagem");

        lbNome.setText("Nome");

        lbCPF.setText("CPF");

        lbRG.setText("RG");

        lbDataNasc.setText("Data de nascimento");

        lbTelefone.setText("Telefone");

        lbCelular.setText("Celular");

        lbEmail.setText("Email");

        lbImg.setMaximumSize(new java.awt.Dimension(140, 140));
        lbImg.setMinimumSize(new java.awt.Dimension(140, 140));

        try {
            txDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNome)
                            .addComponent(txEmail)
                            .addComponent(txCelular)
                            .addComponent(txTelefone)
                            .addComponent(txRG)
                            .addComponent(lbCPF)
                            .addComponent(lbRG)
                            .addComponent(txNome)
                            .addComponent(txCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lbDataNasc)
                            .addComponent(lbTelefone)
                            .addComponent(lbCelular)
                            .addComponent(lbEmail)
                            .addComponent(txDataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbImagem)
                                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(btRemover))))
                .addGap(18, 18, 18)
                .addComponent(lbMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        JFileChooser fc1 = new JFileChooser();

        int res = fc1.showOpenDialog(null);

        File caminho = null;

        if (res == JFileChooser.APPROVE_OPTION) {

            caminho = fc1.getSelectedFile();
            diretorio = caminho.getPath();
            ImageIcon image = new ImageIcon(diretorio);
            lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
            System.out.println(diretorio);
            repaint();

        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");

        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
            if (txNome.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txNome.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txCPF.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txCPF.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txRG.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txRG.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txDataNasc.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txDataNasc.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txTelefone.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txTelefone.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txEmail.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txEmail.setBorder(new LineBorder(Color.red));
                repaint();
            }

            
            lbMsg.setText("Cadastro realizado com sucesso");
            lbMsg.setForeground(Color.green);
            dao.save(criarCliente());
            repaint();
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar o cadastro.");
            lbMsg.setForeground(Color.red);
            repaint();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto.jpg";
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    private Cliente criarCliente() {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date nascimento = sdf.parse(txDataNasc.getText());
            String Nome = txNome.getText();
            String cpf = txCPF.getText();
            String rg = txRG.getText();
            String telefone = txTelefone.getText();
            String celular = txCelular.getText();
            String email = txEmail.getText();
            String imagem = diretorio;
            return new Cliente(Nome, cpf, rg, nascimento, telefone, celular, email, imagem);
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar o cadastro");
            lbMsg.setForeground(Color.red);
            repaint();
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return new Cliente();
    }

    private void limpaCampos() {
        txNome.setText("");
        txCPF.setText("");
        txRG.setText("");
        txCelular.setText("");
        txTelefone.setText("");
        txEmail.setText("");
        txDataNasc.setText("");
    }
    ClienteDao dao = new ClienteDao();
    private String diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto.jpg";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTextField txCPF;
    private javax.swing.JTextField txCelular;
    private javax.swing.JFormattedTextField txDataNasc;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRG;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
