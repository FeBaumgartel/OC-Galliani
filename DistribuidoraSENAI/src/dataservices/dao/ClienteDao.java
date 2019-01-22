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

        String sql1 = "INSERT INTO pessoa(nome, cpf, rg, nascimento, telefone, celular, email) VALUES (?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO cliente(Pessoa_id_pessoa) VALUES (?)";

        //Como possui auto increment necessita destes selects
        String sql3 = "SELECT MAX(cd_pessoa) FROM pessoa";

        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);

            pstmt1.setString(1, cliente.getNome());
            pstmt1.setString(2, cliente.getCpf());
            pstmt1.setString(3, cliente.getRg());
            pstmt1.setDate(4, Date.valueOf(cliente.getNascimento()));
            pstmt1.setString(5, cliente.getTelefone());
            pstmt1.setString(6, cliente.getCelular());
            pstmt1.setString(7, cliente.getEmail());
            pstmt1.execute();

            ResultSet res7 = pstmt3.executeQuery(sql3);
            while (res7.next()) {
                id = res7.getInt("MAX(cd_pessoa)");
            }
            pstmt2.setInt(1, id);
            pstmt2.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Pessoa getById(long id) {
        String sql = "SELECT * FROM cliente WHERE cd_cliente = " + id;

        Cliente cliente = new Cliente();
        Pessoa pessoa = new Pessoa();

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
                    cliente.setNome(res2.getString("nm_pessoa"));
                    cliente.setCpf(res2.getString("nr_cpf"));
                    cliente.setRg(res2.getString("nr_rg"));
                    cliente.setNascimento(res2.getDate("nascimento"));
                    cliente.setTelefone(res2.getString("nr_cpf"));
                    cliente.setCelular(res2.getString("nr_rg"));
                    cliente.setEmail(res2.getString("nr_rg"));

                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return cliente;
    }

    public List<Cliente> list() {
        String sql = "SELECT * FROM cliente ORDER BY id_cliente ASC";

        List<Cliente> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {
                Cliente cliente = new Cliente();

                cliente.setId_cliente(res1.getInt("id_cliente"));
                int idPess = res1.getInt("Pessoa_id_pessoa");

                String sql2 = "SELECT * FROM TB_pessoa WHERE cd_pessoa = " + idPess;
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

                }
                lista.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Cliente cliente) {
        String sql1 = "UPDATE pessoa SET nome = ?, cpf = ?, rg = ?, nascimento = ?, telefone = ?, celular = ?, email = ? WHERE id_pessoa = ?";

        try {
            String sql2 = "SELECT Pessoa_id_pessoa FROM cliente";
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            ResultSet res2 = pstmt2.executeQuery(sql2);
            while (res2.next()) {
                int id_pessoa = res2.getInt("Pessoa_id_pessoa");

                pstmt1.setString(1, cliente.getNome());
                pstmt1.setString(2, cliente.getCpf());
                pstmt1.setString(3, cliente.getRg());
                pstmt1.setDate(4, Date.valueOf(cliente.getNascimento()));
                pstmt1.setString(5, cliente.getTelefone());
                pstmt1.setString(6, cliente.getCelular());
                pstmt1.setString(7, cliente.getEmail());
                pstmt1.setInt(8, id_pessoa);
                pstmt1.execute();

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
