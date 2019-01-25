/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Cliente;
import domain.Pessoa;
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
public class ClienteDao {

    private Conexao conexao;
    private Connection connection;

    public ClienteDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public void save(Cliente cliente) {
        int id = 0;

        String sql1 = "INSERT INTO pessoa(nome, cpf, rg, nascimento, telefone, celular, email, foto) VALUES (?,?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO cliente(Pessoa_id_pessoa) VALUES (?)";

        String sql3 = "SELECT MAX(id_pessoa) FROM pessoa";

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);

            pstmt1.setString(1, cliente.getNome());
            pstmt1.setString(2, cliente.getCpf());
            pstmt1.setString(3, cliente.getRg());
            java.util.Date datautil1 = cliente.getNascimento();
            java.sql.Date datasql1 = new java.sql.Date(datautil1.getTime());
            pstmt1.setDate(4, datasql1);
            pstmt1.setString(5, cliente.getTelefone());
            pstmt1.setString(6, cliente.getCelular());
            pstmt1.setString(7, cliente.getEmail());
            pstmt1.setString(8, cliente.getFoto());
            pstmt1.execute();

            pstmt1.close();

            ResultSet res3 = pstmt3.executeQuery(sql3);
            while (res3.next()) {
                id = res3.getInt("MAX(id_pessoa)");
            }
            pstmt2.setInt(1, id);
            pstmt2.execute();

            pstmt2.close();
            pstmt3.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Pessoa getById(long id) {
        String sql = "SELECT * FROM cliente WHERE id_cliente = " + id;

        Cliente cliente = new Cliente();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {
                cliente.setId_cliente(res1.getInt("id_cliente"));
                int idPessoa = res1.getInt("Pessoa_id_pessoa");

                String sql2 = "SELECT * FROM pessoa WHERE id_pessoa = " + idPessoa + " ORDER BY id_pessoa ASC";
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    cliente.setNome(res2.getString("nome"));
                    cliente.setCpf(res2.getString("cpf"));
                    cliente.setRg(res2.getString("rg"));
                    cliente.setNascimento(res2.getDate("nascimento"));
                    cliente.setTelefone(res2.getString("telefone"));
                    cliente.setCelular(res2.getString("celular"));
                    cliente.setEmail(res2.getString("email"));
                    cliente.setFoto(res2.getString("foto"));

                }
                pstmt2.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return cliente;
    }

    public List<Cliente> list() {
        String sql1 = "SELECT * FROM cliente ORDER BY id_cliente ASC";

        List<Cliente> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Cliente cliente = new Cliente();

                cliente.setId_cliente(res1.getInt("id_cliente"));
                int idPess = res1.getInt("Pessoa_id_pessoa");

                String sql2 = "SELECT * FROM pessoa WHERE id_pessoa = " + idPess;
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    cliente.setNome(res2.getString("nome"));
                    cliente.setCpf(res2.getString("cpf"));
                    cliente.setRg(res2.getString("rg"));
                    cliente.setNascimento(res2.getDate("nascimento"));
                    cliente.setTelefone(res2.getString("telefone"));
                    cliente.setCelular(res2.getString("celular"));
                    cliente.setEmail(res2.getString("email"));
                    cliente.setFoto(res2.getString("foto"));

                }
                lista.add(cliente);
                pstmt2.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public List<Cliente> listNome(String nome) {

        String sql1 = "SELECT pessoa.nome, pessoa.nascimento, cliente.id_cliente FROM cliente, pessoa WHERE pessoa.nome LIKE '%" + nome + "%' AND pessoa.id_pessoa = cliente.pessoa_id_pessoa ORDER BY id_cliente ASC";
        List<Cliente> lista = new ArrayList<>();

        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(res1.getInt("id_cliente"));

                cliente.setNome(res1.getString("nome"));
                cliente.setNascimento(res1.getDate("nascimento"));
                lista.add(cliente);
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Cliente cliente) {
        String sql1 = "UPDATE pessoa SET nome = ?, cpf = ?, rg = ?, nascimento = ?, telefone = ?, celular = ?, email = ?, foto = ? WHERE id_pessoa = ?";

        try {
            String sql2 = "SELECT Pessoa_id_pessoa FROM cliente WHERE id_cliente = " + cliente.getId_cliente();
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            ResultSet res2 = pstmt2.executeQuery(sql2);
            while (res2.next()) {
                int id_pessoa = res2.getInt("Pessoa_id_pessoa");

                pstmt1.setString(1, cliente.getNome());
                pstmt1.setString(2, cliente.getCpf());
                pstmt1.setString(3, cliente.getRg());
                java.util.Date datautil1 = cliente.getNascimento();
                java.sql.Date datasql1 = new java.sql.Date(datautil1.getTime());
                pstmt1.setDate(4, datasql1);
                pstmt1.setString(5, cliente.getTelefone());
                pstmt1.setString(6, cliente.getCelular());
                pstmt1.setString(7, cliente.getEmail());
                pstmt1.setString(8, cliente.getFoto());
                pstmt1.setInt(9, id_pessoa);
                pstmt1.execute();
            }
            pstmt1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql1 = "SELECT pessoa_id_pessoa FROM cliente WHERE id_cliente = " + id;
        String sql2 = "DELETE FROM cliente WHERE id_cliente = " + id;
        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);
            while (res1.next()) {

                int idpessoa = res1.getInt("pessoa_id_pessoa");
                pstmt1.close();
                String sql3 = "DELETE FROM pessoa Where id_pessoa = " + idpessoa;
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                pstmt2.executeUpdate(sql2);
                PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
                pstmt3.executeUpdate(sql3);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
