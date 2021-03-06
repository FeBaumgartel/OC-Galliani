/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.alterar;

import dataservices.dao.ClienteDao;
import domain.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
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
public class Alterar_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Cliente
     */
    public Alterar_Cliente(Cliente cli) {
        setTitle("Alterar Cliente");
        initComponents();
        txId.setEditable(false);

        PreencheCampos(cli);

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
        txDataNasc = new javax.swing.JFormattedTextField();
        lbImg = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();

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

        try {
            txDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDataNascActionPerformed(evt);
            }
        });

        lbImg.setMaximumSize(new java.awt.Dimension(140, 140));
        lbImg.setMinimumSize(new java.awt.Dimension(140, 140));

        lbId.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNome)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txRG, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRG, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbDataNasc)
                                .addComponent(lbTelefone)
                                .addComponent(lbCelular)
                                .addComponent(lbEmail)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txId, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addGap(91, 91, 91)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover))
                            .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(btRemover)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(9, 9, 9)
                        .addComponent(lbCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

            dao.update(criarCliente());
            lbMsg.setText("Alteração realizada com sucesso");
            lbMsg.setForeground(Color.green);
            repaint();
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar a alteração");
            lbMsg.setForeground(Color.red);
            repaint();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataNascActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto.jpg";
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    ClienteDao dao = new ClienteDao();

    private Cliente criarCliente() {

        try {
            int id = Integer.parseInt(txId.getText());
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            Date nascimento = in.parse(out.format(txDataNasc.getText()));
            String nome = txNome.getText();
            String cpf = txCPF.getText();
            String rg = txRG.getText();
            String telefone = txTelefone.getText();
            String celular = txCelular.getText();
            String email = txEmail.getText();
            String imagem = diretorio;
            return new Cliente(id, nome, cpf, rg, nascimento, telefone, celular, email, imagem);
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar a alteração");
            lbMsg.setForeground(Color.red);
            repaint();
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return new Cliente();
    }

    private void PreencheCampos(Cliente cli) {
        System.out.println(cli.getNascimento());
        SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        txNome.setText(cli.getNome());
        txCPF.setText(cli.getCpf());
        txRG.setText(cli.getRg());
        txCelular.setText(cli.getCelular());
        txTelefone.setText(cli.getTelefone());
        txEmail.setText(cli.getEmail());
        try {
            txDataNasc.setText(out.format(in.parse(cli.getNascimento().toString())));
        } catch (Exception e) {

        }
        txId.setText("" + cli.getId_cliente());
        ImageIcon image = new ImageIcon(cli.getFoto());
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }
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
    private javax.swing.JLabel lbId;
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
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRG;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

}
