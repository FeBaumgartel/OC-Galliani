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
public class Marca {
    private int id_marca;
    private String nome;
    private String endereco_eletronico;

    public Marca() {
    }

    public Marca(String nome, String endereco_eletronico) {
        this.nome = nome;
        this.endereco_eletronico = endereco_eletronico;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco_eletronico() {
        return endereco_eletronico;
    }

    public void setEndereco_eletronico(String endereco_eletronico) {
        this.endereco_eletronico = endereco_eletronico;
    }
}
