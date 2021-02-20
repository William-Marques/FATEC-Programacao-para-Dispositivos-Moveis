/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.pessoa;

import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControlePessoa;
import revisaodm2021n.dados.Pessoa;

/**
 *
 * @author User
 */
public class ManterPessoa {
    
    static int id;
    static String nome;
    static String idade;
    static String genero;
    static String peso;
    static String altura;
    
    static ControlePessoa contPes = new ControlePessoa();
    
    public static void Inserir() {
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(nome,idade,genero,peso,altura);
        Pessoa pSaida = contPes.inserir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
    
    public static void Alterar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(id,nome,idade,genero,peso,altura);
        Pessoa pSaida = contPes.alterar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

    public static void Listar() {
        nome = JOptionPane.showInputDialog("NOME");
        Pessoa pEntrada = new Pessoa(nome);
        List<Pessoa> psSaida = contPes.listar(pEntrada);
        JOptionPane.showMessageDialog(null,psSaida.get(1).toString());
        
    }

    public static void Buscar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = contPes.buscar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
        
    }

    public static void Excluir() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = contPes.excluir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

}
