/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Funcionario;
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
 * @author felip
 */
public class FuncionarioDao {

    private Conexao conexao;
    private Connection connection;

    public FuncionarioDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public void save(Funcionario funcionario) {
        int id = 0;

        String sql1 = "INSERT INTO pessoa(nome, cpf, rg, nascimento, telefone, celular, email, foto) VALUES (?,?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO funcionario(data_contratacao, salario, cargo, usuario, senha, Pessoa_id_pessoa) VALUES (?,?,?,?,?,?)";

        String sql3 = "SELECT MAX(id_pessoa) FROM pessoa";

        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);

            pstmt1.setString(1, funcionario.getNome());
            pstmt1.setString(2, funcionario.getCpf());
            pstmt1.setString(3, funcionario.getRg());
            pstmt1.setDate(4, (java.sql.Date) funcionario.getNascimento());
            pstmt1.setString(5, funcionario.getTelefone());
            pstmt1.setString(6, funcionario.getCelular());
            pstmt1.setString(7, funcionario.getEmail());
            pstmt1.setString(8, funcionario.getFoto());
            pstmt1.execute();

            pstmt1.close();

            ResultSet res3 = pstmt3.executeQuery(sql3);
            while (res3.next()) {
                id = res3.getInt("MAX(id_pessoa)");
            }
            pstmt2.setDate(1, (java.sql.Date) funcionario.getContratacao());
            pstmt2.setDouble(2, funcionario.getSalario());
            pstmt2.setString(3, funcionario.getCargo());
            pstmt2.setString(4, funcionario.getUsuario());
            pstmt2.setString(5, funcionario.getSenha());
            pstmt2.setInt(6, id);
            pstmt2.execute();

            pstmt2.close();
            pstmt3.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Funcionario getById(long id) {
        String sql = "SELECT * FROM funcionario WHERE id_funcionario = " + id;

        Funcionario funcionario = new Funcionario();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {
                funcionario.setContratacao(res1.getDate("data_contratacao"));
                funcionario.setSalario(res1.getDouble("salario"));
                funcionario.setCargo(res1.getString("cargo"));
                funcionario.setUsuario(res1.getString("usuario"));
                funcionario.setSenha(res1.getString("senha"));
                funcionario.setId_funcionario(res1.getInt("id_funcionario"));
                int idPessoa = res1.getInt("Pessoa_id_pessoa");

                String sql2 = "SELECT * FROM pessoa WHERE id_pessoa = " + idPessoa + " ORDER BY id_pessoa ASC";
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    funcionario.setNome(res2.getString("nome"));
                    funcionario.setCpf(res2.getString("cpf"));
                    funcionario.setRg(res2.getString("rg"));
                    funcionario.setNascimento(res2.getDate("nascimento"));
                    funcionario.setTelefone(res2.getString("telefone"));
                    funcionario.setCelular(res2.getString("celular"));
                    funcionario.setEmail(res2.getString("email"));
                    funcionario.setFoto(res2.getString("foto"));

                }
                pstmt2.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return funcionario;
    }

    public boolean verifUser(String usuario) {
        String sql = "SELECT * FROM funcionario WHERE usuario = " + usuario;

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            if (res1.getString("usuario") != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public boolean verifSenha(String usuario, String senha) {
        String sql = "SELECT * FROM funcionario WHERE usuario = " + usuario + " AND senha = " + senha;

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            if (res1.getString("senha") != null) {
                pstmt1.close();
                return true;
            } else {
                pstmt1.close();
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public String getCargo(String usuario, String senha) {
        String sql = "SELECT * FROM funcionario WHERE usuario = " + usuario + " AND senha = " + senha;
        String cargo = "";
        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            cargo = res1.getString("cargo");

            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cargo;
    }

    public List<Funcionario> list() {
        String sql1 = "SELECT * FROM funcionario ORDER BY id_funcionario ASC";

        List<Funcionario> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setContratacao(res1.getDate("data_contratacao"));
                funcionario.setSalario(res1.getDouble("salario"));
                funcionario.setCargo(res1.getString("cargo"));
                funcionario.setUsuario(res1.getString("usuario"));
                funcionario.setSenha(res1.getString("senha"));
                funcionario.setId_funcionario(res1.getInt("id_funcionario"));
                int idPess = res1.getInt("Pessoa_id_pessoa");

                String sql2 = "SELECT * FROM TB_pessoa WHERE id_pessoa = " + idPess;
                PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
                ResultSet res2 = pstmt2.executeQuery(sql2);

                while (res2.next()) {
                    funcionario.setNome(res2.getString("nome"));
                    funcionario.setCpf(res2.getString("cpf"));
                    funcionario.setRg(res2.getString("rg"));
                    funcionario.setNascimento(res2.getDate("nascimento"));
                    funcionario.setTelefone(res2.getString("telefone"));
                    funcionario.setCelular(res2.getString("celular"));
                    funcionario.setEmail(res2.getString("email"));
                    funcionario.setFoto(res2.getString("foto"));

                }
                lista.add(funcionario);
                pstmt2.close();
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Funcionario funcionario) {
        String sql1 = "UPDATE pessoa SET nome = ?, cpf = ?, rg = ?, nascimento = ?, telefone = ?, celular = ?, email = , foto = ? WHERE id_pessoa = ?";
        String sql2 = "UPDATE tb_funcionario SET (data_contratacao=?, salario=?, cargo=?, usuario=?, senha-? WHERE id_funcionario = ?";

        try {
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            pstmt2.setDate(1, (java.sql.Date) funcionario.getContratacao());
            pstmt2.setDouble(2, funcionario.getSalario());
            pstmt2.setString(3, funcionario.getCargo());
            pstmt2.setString(4, funcionario.getUsuario());
            pstmt2.setString(5, funcionario.getSenha());
            pstmt2.setInt(5, funcionario.getId_funcionario());
            pstmt2.execute();

            pstmt2.close();

            String sql3 = "SELECT Pessoa_id_pessoa FROM funcionario";
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
            ResultSet res3 = pstmt3.executeQuery(sql3);
            while (res3.next()) {
                int id_pessoa = res3.getInt("Pessoa_id_pessoa");

                pstmt1.setString(1, funcionario.getNome());
                pstmt1.setString(2, funcionario.getCpf());
                pstmt1.setString(3, funcionario.getRg());
                pstmt1.setDate(4, (java.sql.Date) funcionario.getNascimento());
                pstmt1.setString(5, funcionario.getTelefone());
                pstmt1.setString(6, funcionario.getCelular());
                pstmt1.setString(7, funcionario.getEmail());
                pstmt1.setString(8, funcionario.getFoto());
                pstmt1.setInt(9, id_pessoa);
                pstmt1.execute();

            }
            pstmt1.close();
            pstmt3.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql1 = "SELECT id_pessoa FROM funcionario WHERE id_funcionario = " + id;
        String sql2 = "DELETE FROM funcionario WHERE id_funcionario = " + id;
        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            int idpessoa = res1.getInt("Pessoa_id_pessoa");
            pstmt1.close();

            String sql3 = "DELETE FROM pessoa Where id_pessoa = " + idpessoa;
            PreparedStatement pstmt2 = (PreparedStatement) connection.prepareStatement(sql2);
            pstmt2.executeQuery(sql2);
            PreparedStatement pstmt3 = (PreparedStatement) connection.prepareStatement(sql3);
            pstmt3.executeQuery(sql3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
