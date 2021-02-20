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
public class Pessoa {
    
    int id;
    String nome;
    String idade;
    String genero;
    String peso;
    String altura;

    public Pessoa(int id) {
        this.id = id;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String idade, String genero, String peso, String altura) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(int id, String nome, String idade, String genero, String peso, String altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    

    
    
    
    
}
