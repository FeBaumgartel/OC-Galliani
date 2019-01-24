/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataservices.dao.FuncionarioDao;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TnahLenovoNote01
 */
public class Funcionario extends Pessoa {

    private int id_funcionario;
    private Date contratacao;
    private double salario;
    private String cargo;
    private String usuario;
    private String senha;

    public Funcionario(int id_funcionario, Date contratacao, double salario, String cargo, String usuario, String senha, String nome, String cpf, String rg, Date nascimento, String telefone, String celular, String email, String foto) {
        super(nome, cpf, rg, nascimento, telefone, celular, email, foto);
        this.id_funcionario = id_funcionario;
        this.contratacao = contratacao;
        this.salario = salario;
        this.cargo = cargo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Date getContratacao() {
        return contratacao;
    }

    public void setContratacao(Date contratacao) {
        this.contratacao = contratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(Date contratacao, double salario, String cargo, String usuario, String senha, String nome, String cpf, String rg, Date nascimento, String telefone, String celular, String email, String foto) {
        super(nome,cpf,rg,nascimento,telefone,celular,email,foto);
        this.contratacao = contratacao;
        this.salario = salario;
        this.cargo = cargo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario() {
    }


    public boolean verificarUser(Funcionario a) {
        List<Funcionario> lista = dao.list();

        for (int i = 0; i < lista.size(); i++) {
            if (a.getUsuario().equals(lista.get(i).getUsuario())) {
                return true;
            }
        }
        return false;
    }
    public boolean verificarSenha(Funcionario a) {
        List<Funcionario> lista = dao.list();

        for (int i = 0; i < lista.size(); i++) {
            if (a.getSenha().equals(lista.get(i).getSenha())) {
                return true;
            }
        }
        return false;
    }

    
    FuncionarioDao dao = new FuncionarioDao();
}
