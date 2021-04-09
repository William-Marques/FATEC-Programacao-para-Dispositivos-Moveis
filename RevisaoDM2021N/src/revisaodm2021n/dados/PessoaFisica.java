/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.dados;

/**
 *
 * @author User
 */
public class PessoaFisica {
    
    int id;
    String nome;
    String cpf;
    String rg;
    String tel;
    String situacao;
    String email;

    public PessoaFisica(int id) {
        this.id = id;
    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf, String rg, String tel, String situacao, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.situacao = situacao;
        this.email = email;
    }

    public PessoaFisica(int id, String nome, String cpf, String rg, String tel, String situacao, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.situacao = situacao;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", tel=" + tel + ", situacao=" + situacao + ", email=" + email + '}';
    }

   
    
}
