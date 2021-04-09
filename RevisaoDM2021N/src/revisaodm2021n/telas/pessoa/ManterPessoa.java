/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.pessoa;

import java.sql.SQLException;
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
    
    static ControlePessoa contPes;
    
    public static void Inserir() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(nome,idade,genero,peso,altura);
        contPes = new ControlePessoa();
        Pessoa pSaida = contPes.inserir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        idade = JOptionPane.showInputDialog("IDADE"); 
        genero = JOptionPane.showInputDialog("GENERO");
        peso = JOptionPane.showInputDialog("PESO");
        altura = JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(id,nome,idade,genero,peso,altura);
        contPes = new ControlePessoa();
        Pessoa pSaida = contPes.alterar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        Pessoa pEntrada = new Pessoa(nome);
        contPes = new ControlePessoa();
        List<Pessoa> psSaida = contPes.listar(pEntrada);
        psSaida.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        contPes = new ControlePessoa();
        Pessoa pSaida = contPes.buscar(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
        
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        contPes = new ControlePessoa();
        Pessoa pSaida = contPes.excluir(pEntrada);
        JOptionPane.showMessageDialog(null,pSaida.toString());
    }

}
