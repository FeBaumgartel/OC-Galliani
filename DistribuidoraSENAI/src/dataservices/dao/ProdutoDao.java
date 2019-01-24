/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Fornecedor;
import domain.Marca;
import domain.Produto;
import domain.Un_medida;
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
public class ProdutoDao {

    private Conexao conexao;
    private Connection connection;

    public ProdutoDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public void save(Produto produto) {
        String sql1 = "INSERT INTO produto(descricao, codigo_barras, valor_unitario, categoria, foto, unidade_de_media, id_Marca, id_Fornecedor) VALUES (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);

            pstmt1.setString(1, produto.getDescricao());
            pstmt1.setString(2, produto.getCod_barras());
            pstmt1.setDouble(3, produto.getValor_unt());
            pstmt1.setString(4, produto.getCategoria());
            pstmt1.setString(5, produto.getFoto());
            pstmt1.setInt(6, produto.getUn_medida().getId_unidade());
            pstmt1.setInt(7, produto.getMarca().getId_marca());
            pstmt1.setInt(8, produto.getFornecedor().getId_fornecedor());
            pstmt1.execute();

            pstmt1.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Produto getById(long id) {
        String sql = "SELECT * FROM produto WHERE id_produto = " + id;

        Produto produto = new Produto();
        Marca marca = new Marca();
        Fornecedor fornecedor = new Fornecedor();
        Un_medida unidade = new Un_medida();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {

                produto.setId_produto(res1.getInt("id_produto"));
                produto.setDescricao(res1.getString("descricao"));
                produto.setCod_barras(res1.getString("codigo_de_barras"));
                produto.setValor_unt(res1.getDouble("valor_unitario"));
                produto.setDescricao(res1.getString("descricao"));
                produto.setFoto(res1.getString("foto"));
                int idunidade = res1.getInt("id_unidade_de_medida");
                int idmarca = res1.getInt("id_marca");
                int idforn = res1.getInt("id_fornecedor");

                String sql2 = "SELECT * FROM marca WHERE id_marca = " + idmarca + " ORDER BY id_marca ASC";
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    marca.setId_marca(res2.getInt("id_marca"));
                    marca.setNome(res2.getString("nome"));
                    marca.setEndereco_eletronico(res2.getString("endereco_eletronico"));
                }
                produto.setMarca(marca);
                pstmt2.close();

                String sql3 = "SELECT * FROM fornecedor WHERE id_fornecedor = " + idforn + " ORDER BY  ASC";
                PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
                ResultSet res3 = pstmt3.executeQuery(sql3);

                while (res3.next()) {
                    fornecedor.setId_fornecedor(res3.getInt("id_fornecedor"));
                    fornecedor.setNome(res3.getString("nome"));
                    fornecedor.setNome_fantasia(res3.getString("nome_fantasia"));
                    fornecedor.setCnpj(res3.getString("cnpj"));
                    fornecedor.setTelefone(res3.getString("telefone"));
                    fornecedor.setEmail(res3.getString("email"));
                    fornecedor.setInscricao_estadual(res3.getString("inscricao_estadual"));
                    fornecedor.setRamo_negocio(res3.getString("ramo_negocio"));
                }
                produto.setFornecedor(fornecedor);
                pstmt3.close();

                String sql4 = "SELECT * FROM unidade_de_medida WHERE id_unidade_de_medida = " + idunidade + " ORDER BY  ASC";
                PreparedStatement pstmt4 = (PreparedStatement) connection.prepareStatement(sql4);
                ResultSet res4 = pstmt4.executeQuery(sql4);

                while (res4.next()) {
                    unidade.setId_unidade(res4.getInt("id_unidade"));
                    unidade.setNome(res4.getString("nome"));
                }
                produto.setUn_medida(unidade);
                pstmt4.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produto;
    }

    public List<Produto> list() {
        String sql1 = "SELECT * FROM produto ORDER BY id_produto ASC";

        List<Produto> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Produto produto = new Produto();
                Marca marca = new Marca();
                Fornecedor fornecedor = new Fornecedor();
                Un_medida unidade = new Un_medida();

                produto.setId_produto(res1.getInt("id_produto"));
                produto.setDescricao(res1.getString("descricao"));
                produto.setCod_barras(res1.getString("codigo_de_barras"));
                produto.setValor_unt(res1.getDouble("valor_unitario"));
                produto.setDescricao(res1.getString("descricao"));
                produto.setFoto(res1.getString("foto"));
                int idunidade = res1.getInt("id_unidade_de_medida");
                int idmarca = res1.getInt("id_marca");
                int idforn = res1.getInt("id_fornecedor");

                String sql2 = "SELECT * FROM marca WHERE id_marca = " + idmarca + " ORDER BY id_marca ASC";
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    marca.setId_marca(res2.getInt("id_marca"));
                    marca.setNome(res2.getString("nome"));
                    marca.setEndereco_eletronico(res2.getString("endereco_eletronico"));
                }
                produto.setMarca(marca);
                pstmt2.close();

                String sql3 = "SELECT * FROM fornecedor WHERE id_fornecedor = " + idforn + " ORDER BY  ASC";
                PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
                ResultSet res3 = pstmt3.executeQuery(sql3);

                while (res2.next()) {
                    fornecedor.setId_fornecedor(res3.getInt("id_fornecedor"));
                    fornecedor.setNome(res3.getString("nome"));
                    fornecedor.setNome_fantasia(res3.getString("nome_fantasia"));
                    fornecedor.setCnpj(res3.getString("cnpj"));
                    fornecedor.setTelefone(res3.getString("telefone"));
                    fornecedor.setEmail(res3.getString("email"));
                    fornecedor.setInscricao_estadual(res3.getString("inscricao_estadual"));
                    fornecedor.setRamo_negocio(res3.getString("ramo_negocio"));
                }
                produto.setFornecedor(fornecedor);
                pstmt3.close();

                String sql4 = "SELECT * FROM unidade_de_medida WHERE id_unidade_de_medida = " + idunidade + " ORDER BY  ASC";
                PreparedStatement pstmt4 = (PreparedStatement) connection.prepareStatement(sql4);
                ResultSet res4 = pstmt4.executeQuery(sql4);

                while (res4.next()) {
                    unidade.setId_unidade(res4.getInt("id_unidade"));
                    unidade.setNome(res4.getString("nome"));
                }
                produto.setUn_medida(unidade);
                lista.add(produto);
                pstmt4.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public List<String> getMarca() {
        String sql1 = "SELECT nome FROM marca ORDER BY nome ASC";

        List<String> lista = new ArrayList<>();
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);
            while (res1.next()) {
                String marca;
                marca = res1.getString("nome");
                lista.add(marca);
            }
            pstmt1.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public List<String> getFornecedor() {
        String sql1 = "SELECT nome FROM fornecedor ORDER BY nome ASC";

        List<String> lista = new ArrayList<>();
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);
            while (res1.next()) {
                String fornecedor;
                fornecedor = res1.getString("nome");
                lista.add(fornecedor);
            }
            pstmt1.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public List<String> getUn_medida() {
        String sql1 = "SELECT nome FROM unidade_de_medida ORDER BY nome ASC";

        List<String> lista = new ArrayList<>();
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);
            while (res1.next()) {
                String unidade;
                unidade = res1.getString("nome");
                lista.add(unidade);
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Produto produto) {
        String sql1 = "UPDATE produto SET descricao = ?, codigo_de_barras = ?, valor_unitario = ?, categoria = ?, foto = ?, unidade_de_medida = ?, id_marca = ?, id_fornecedor = ? WHERE id_produto = ?";

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);
            while (res1.next()) {

                pstmt1.setString(1, produto.getDescricao());
                pstmt1.setString(2, produto.getCod_barras());
                pstmt1.setDouble(3, produto.getValor_unt());
                pstmt1.setString(4, produto.getCategoria());
                pstmt1.setString(5, produto.getFoto());
                pstmt1.setInt(6, produto.getUn_medida().getId_unidade());
                pstmt1.setInt(7, produto.getMarca().getId_marca());
                pstmt1.setInt(8, produto.getFornecedor().getId_fornecedor());
                pstmt1.setInt(9, produto.getId_produto());
                pstmt1.execute();
            }
            pstmt1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(int id) {
        String sql1 = "DELETE FROM produto WHERE id_produto = " + id;
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            pstmt1.executeQuery(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
