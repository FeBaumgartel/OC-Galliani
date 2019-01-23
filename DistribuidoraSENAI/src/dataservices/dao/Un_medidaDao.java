/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import domain.Un_medida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TnahLenovoNote01
 */
public class Un_medidaDao {
    private Conexao conexao;
    private Connection connection;

    public Un_medidaDao() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }

    public List<Un_medida> list() {
        String sql1 = "SELECT * FROM unidade_de_medida ORDER BY id_unidade_de_medida ASC";

        List<Un_medida> lista = new ArrayList<>();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql1);
            ResultSet res1 = pstmt1.executeQuery(sql1);

            while (res1.next()) {
                Un_medida un_medida = new Un_medida();

                un_medida.setId_unidade(res1.getInt("id_unidade_de_medida"));
                un_medida.setNome(res1.getString("nome"));

                lista.add(un_medida);
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    public Un_medida getById(long id) {
        String sql = "SELECT * FROM unidade_de_medida WHERE id_unidade_de_medida = " + id;

        Un_medida un_medida = new Un_medida();

        try {
            PreparedStatement pstmt1 = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res1 = pstmt1.executeQuery(sql);

            while (res1.next()) {

                un_medida.setId_unidade(res1.getInt("id_unidade_de_medida"));
                un_medida.setNome(res1.getString("nome"));
            }
            pstmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return un_medida;
    }
}
