/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author TnahLenovoNote01
 */
public class Un_medida {
    private int id_unidade;
    private String nome;

    public Un_medida(int id_unidade, String nome) {
        this.id_unidade = id_unidade;
        this.nome = nome;
    }


    public Un_medida() {
    }

    public int getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(int id_unidade) {
        this.id_unidade = id_unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
