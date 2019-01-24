/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Fornecedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TnahLenovoNote01
 */
public class FornecedorDao {

    private Conexao conexao;
    private Connection connection;

    public FornecedorDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public void save(Fornecedor fornecedor) {
        String sql1 = "INSERT INTO fornecedor(nome, nome_fantasia, cnpj, telefone, email, inscricao_estadual, ramo_negocio) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);

            pstmt1.setString(1, fornecedor.getNome());
            pstmt1.setString(2, fornecedor.getNome_fantasia());
            pstmt1.setString(3, fornecedor.getCnpj());
            pstmt1.setString(4, fornecedor.getTelefone());
            pstmt1.setString(5, fornecedor.getEmail());
            pstmt1.setString(6, fornecedor.getInscricao_estadual());
            pstmt1.setString(7, fornecedor.getRamo_negocio());
            pstmt1.execute();

            pstmt1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Fornecedor getById(long id) {
        String sql = "SELECT * FROM fornecedor WHERE id_fornecedor = " + id;

        Fornecedor fornecedor = new Fornecedor();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {

                fornecedor.setId_fornecedor(res1.getInt("id_fornecedor"));
                fornecedor.setNome(res1.getString("nome"));
                fornecedor.setNome_fantasia(res1.getString("nome_fantasia"));
                fornecedor.setCnpj(res1.getString("cnpj"));
                fornecedor.setTelefone(res1.getString("telefone"));
                fornecedor.setEmail(res1.getString("email"));
                fornecedor.setInscricao_estadual(res1.getString("inscricao_estadual"));
                fornecedor.setRamo_negocio(res1.getString("ramo_negocio"));
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return fornecedor;
    }

    public List<Fornecedor> list() {
        
        String sql1 = "SELECT * FROM fornecedor ORDER BY id_fornecedor ASC";

        List<Fornecedor> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

                
            while (res1.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId_fornecedor(res1.getInt("id_fornecedor"));
                fornecedor.setNome(res1.getString("nome"));
                fornecedor.setNome_fantasia(res1.getString("nome_fantasia"));
                fornecedor.setCnpj(res1.getString("cnpj"));
                fornecedor.setTelefone(res1.getString("telefone"));
                fornecedor.setEmail(res1.getString("email"));
                fornecedor.setInscricao_estadual(res1.getString("inscricao_estadual"));
                fornecedor.setRamo_negocio(res1.getString("ramo_negocio"));

                lista.add(fornecedor);
            }
            pstmt1.close();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return lista;
    }

    public List<Fornecedor> listNome(String nome) {
        String sql1 = "SELECT * FROM fornecedor WHERE nome LIKE '%" + nome + "%' ORDER BY id_fornecedor ASC";

        List<Fornecedor> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId_fornecedor(res1.getInt("id_fornecedor"));
                fornecedor.setNome(res1.getString("nome"));
                fornecedor.setNome_fantasia(res1.getString("nome_fantasia"));
                fornecedor.setCnpj(res1.getString("cnpj"));
                fornecedor.setTelefone(res1.getString("telefone"));
                fornecedor.setEmail(res1.getString("email"));
                fornecedor.setInscricao_estadual(res1.getString("inscricao_estadual"));
                fornecedor.setRamo_negocio(res1.getString("ramo_negocio"));

                lista.add(fornecedor);
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Fornecedor fornecedor) {
        String sql1 = "UPDATE fornecedor SET nome = ?, nome_fantasia = ?, cnpj = ?, telefone = ?, email = ?, inscricao_estadual = ?, ramo_negocio = ? WHERE id_fornecedor = ?";

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);

            pstmt1.setString(1, fornecedor.getNome());
            pstmt1.setString(2, fornecedor.getNome_fantasia());
            pstmt1.setString(3, fornecedor.getCnpj());
            pstmt1.setString(4, fornecedor.getTelefone());
            pstmt1.setString(5, fornecedor.getEmail());
            pstmt1.setString(6, fornecedor.getInscricao_estadual());
            pstmt1.setString(7, fornecedor.getRamo_negocio());
            pstmt1.setInt(8, fornecedor.getId_fornecedor());
            pstmt1.execute();

            pstmt1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql1 = "SELECT id_produto FROM produto WHERE id_fornecedor = " + id;
        String sql2 = "DELETE FROM fornecedor WHERE id_fornecedor = " + id;
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {

                int idProduto = res1.getInt("id_produto");
                String sql3 = "DELETE produto FROM WHERE id_produto = " + idProduto;
                PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
                pstmt3.executeQuery(sql3);
                pstmt3.close();
            }
            pstmt1.close();
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            pstmt2.executeQuery(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
