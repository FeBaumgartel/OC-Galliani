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
public class Produto {
    private int id_produto;
    private String descricao;
    private String cod_barras;
    private double valor_unt;
    private String categoria;
    private String un_medida;
    private Marca marca;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getValor_unt() {
        return valor_unt;
    }

    public void setValor_unt(double valor_unt) {
        this.valor_unt = valor_unt;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUn_medida() {
        return un_medida;
    }

    public void setUn_medida(String un_medida) {
        this.un_medida = un_medida;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto(String descricao, String cod_barras, double valor_unt, String categoria, String un_medida, Marca marca, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.cod_barras = cod_barras;
        this.valor_unt = valor_unt;
        this.categoria = categoria;
        this.un_medida = un_medida;
        this.marca = marca;
        this.fornecedor = fornecedor;
    }

    public Produto() {
    }

}
