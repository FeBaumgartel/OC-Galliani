/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.alterar;

import dataservices.dao.FornecedorDao;
import dataservices.dao.MarcaDao;
import dataservices.dao.ProdutoDao;
import dataservices.dao.Un_medidaDao;
import domain.Produto;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author TnahLenovoNote01
 */
public class Alterar_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Produto
     */
    public Alterar_Produto(Produto prod) {
        initComponents();
        limpaCampos();
        PreencheCampos(prod);
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
        txDescricao = new javax.swing.JTextField();
        txCod_barras = new javax.swing.JTextField();
        txVal_unitario = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbImagem = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbCod_barras = new javax.swing.JLabel();
        lbVal_unitario = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbFornecedor = new javax.swing.JLabel();
        lbUn_medida = new javax.swing.JLabel();
        lbMsg = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        cbMarca = new javax.swing.JComboBox();
        cbFornecedor = new javax.swing.JComboBox();
        cbUn_medida = new javax.swing.JComboBox();
        lbImg = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();

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

        lbDescricao.setText("Descrição");

        lbCod_barras.setText("Código de barras");

        lbVal_unitario.setText("Valor unitário");

        lbCategoria.setText("Categoria");

        lbMarca.setText("Marca");

        lbFornecedor.setText("Fornecedor");

        lbUn_medida.setText("Unidade de medida");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Refrigerante", "Sucos", "Água", "Vinha", "Whisky", "Coquetel", "Outros" }));

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel(dao.getMarca().toArray()));

        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(dao.getFornecedor().toArray()));

        cbUn_medida.setModel(new javax.swing.DefaultComboBoxModel(dao.getUn_medida().toArray()));

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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbUn_medida, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbFornecedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricao)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txVal_unitario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCod_barras, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbVal_unitario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txCod_barras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(lbCategoria)
                            .addComponent(lbMarca)
                            .addComponent(lbFornecedor)
                            .addComponent(lbUn_medida)))
                    .addComponent(lbId)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btRemover))
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImagem))
                .addContainerGap())
            .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(btRemover))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCod_barras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCod_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbVal_unitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txVal_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUn_medida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUn_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(lbMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
            if (txDescricao.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txDescricao.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txCod_barras.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txCod_barras.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txVal_unitario.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txVal_unitario.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (cbCategoria.getSelectedItem().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                cbCategoria.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (cbFornecedor.getSelectedItem().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                cbFornecedor.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (cbMarca.getSelectedItem().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                cbMarca.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (cbUn_medida.getSelectedItem().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                cbUn_medida.setBorder(new LineBorder(Color.red));
                repaint();
            }
            dao.update(criarProduto());
            lbMsg.setText("Cadastro realizado com sucesso");
            lbMsg.setForeground(Color.green);
            repaint();
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar o cadastro.");
            lbMsg.setForeground(Color.red);
            repaint();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

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

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto_produto.jpg";
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    private Produto criarProduto() {
        int id = Integer.parseInt(txId.getText());
        String descricao = txDescricao.getText();
        String cod_barras = txCod_barras.getText();
        double valor_unt = Double.parseDouble(txVal_unitario.getText());
        String categoria = (String) cbCategoria.getSelectedItem();

        String marca = (String) cbMarca.getSelectedItem();
        String fornecedor = (String) cbFornecedor.getSelectedItem();
        String un_medida = (String) cbUn_medida.getSelectedItem();
        String imagem = diretorio;
        int idmarca = Integer.parseInt(marca.substring(0, marca.indexOf(" ")));
        int idfornecedor = Integer.parseInt(fornecedor.substring(0, fornecedor.indexOf(" ")));
        int idun_medida = Integer.parseInt(un_medida.substring(0, un_medida.indexOf(" ")));

        return new Produto(id, descricao, cod_barras, valor_unt, categoria, imagem, unDao.getById(idun_medida), marcaDao.getById(idmarca), fornDao.getById(idfornecedor));
    }

    private void limpaCampos() {
        txDescricao.setText("");
        txCod_barras.setText("");
        txVal_unitario.setText("");
        cbCategoria.setSelectedIndex(1);
        cbMarca.setSelectedIndex(1);
        cbFornecedor.setSelectedIndex(1);
        cbUn_medida.setSelectedIndex(1);
    }
    private void PreencheCampos(Produto prod) {
        txDescricao.setText(prod.getDescricao());
        txCod_barras.setText(prod.getCod_barras());
        txVal_unitario.setText(""+prod.getValor_unt());
        txId.setText(""+prod.getId_produto());
        ImageIcon image = new ImageIcon(prod.getFoto());
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }
    
    
    private ProdutoDao dao = new ProdutoDao();
    private Un_medidaDao unDao = new Un_medidaDao();
    private MarcaDao marcaDao = new MarcaDao();
    private FornecedorDao fornDao = new FornecedorDao();
    private String diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto_produto.jpg";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JComboBox cbMarca;
    private javax.swing.JComboBox cbUn_medida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCod_barras;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JLabel lbUn_medida;
    private javax.swing.JLabel lbVal_unitario;
    private javax.swing.JTextField txCod_barras;
    private javax.swing.JTextField txDescricao;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txVal_unitario;
    // End of variables declaration//GEN-END:variables
}
