/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.sthefano;
import java.util.*;
/**
 *
 * @author sthef_000
 */
public class Pessoa {
    protected int cpf;
    protected String nome;
    protected Date nascimento;
    protected String endereco;

    public String getEndereco() {
        return endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
