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
public class Fornecedor {
    private int id_fornecedor;
    private String nome;
    private String nome_fantasia;
    private String cnpj;
    private String telefone;
    private String email;
    private String inscricao_estadual;
    private String ramo_negocio;

    public Fornecedor(int id_fornecedor, String nome, String nome_fantasia, String cnpj, String telefone, String email, String inscricao_estadual, String ramo_negocio) {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.inscricao_estadual = inscricao_estadual;
        this.ramo_negocio = ramo_negocio;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getRamo_negocio() {
        return ramo_negocio;
    }

    public void setRamo_negocio(String ramo_negocio) {
        this.ramo_negocio = ramo_negocio;
    }

    public Fornecedor() {
    }

    public Fornecedor(String nome, String nome_fantasia, String cnpj, String telefone, String email, String inscricao_estadual, String ramo_negocio) {
        this.nome = nome;
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.inscricao_estadual = inscricao_estadual;
        this.ramo_negocio = ramo_negocio;
    }
    
}
