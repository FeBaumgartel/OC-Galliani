/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author TnahLenovoNote01
 */
public class Cliente extends Pessoa {

    private int id_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String rg, Date nascimento, String telefone, String celular, String email) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setRg(rg);
        pessoa.setNascimento(nascimento);
        pessoa.setTelefone(telefone);
        pessoa.setCelular(celular);
        pessoa.setEmail(email);
    }
}
