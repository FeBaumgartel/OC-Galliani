/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Marca;
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
public class MarcaDao {

    private Conexao conexao;
    private Connection connection;

    public MarcaDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public void save(Marca marca) {
        int id = 0;

        String sql1 = "INSERT INTO marca(nome, endereco_eletronico) VALUES (?,?)";

        try {

            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);

            pstmt1.setString(1, marca.getNome());
            pstmt1.setString(2, marca.getEndereco_eletronico());
            pstmt1.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Marca getById(long id) {
        String sql = "SELECT * FROM marca WHERE id_marca = " + id;

        Marca marca = new Marca();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {

                marca.setId_marca(res1.getInt("id_marca"));
                marca.setNome(res1.getString("nome"));
                marca.setEndereco_eletronico(res1.getString("endereco_eletronico"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return marca;
    }

    public List<Marca> list() {
        String sql1 = "SELECT * FROM marca ORDER BY id_marca ASC";

        List<Marca> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Marca marca = new Marca();

                marca.setId_marca(res1.getInt("id_marca"));
                marca.setNome(res1.getString("nome"));
                marca.setEndereco_eletronico(res1.getString("endereco_eletronico"));

                lista.add(marca);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public void update(Marca marca) {
        String sql1 = "UPDATE marca SET nome = ?, endereco_eletronico = ? WHERE id_marca = ?";

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);

            pstmt1.setString(1, marca.getNome());
            pstmt1.setString(2, marca.getEndereco_eletronico());
            pstmt1.setInt(3, marca.getId_marca());
            pstmt1.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
