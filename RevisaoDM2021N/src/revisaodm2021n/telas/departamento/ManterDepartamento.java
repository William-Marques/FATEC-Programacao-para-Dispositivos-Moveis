/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.departamento;

import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleDepartamento;
import revisaodm2021n.dados.Departamento;

/**
 *
 * @author User
 */
public class ManterDepartamento {
    
    static int id;
    static String nome;
    static String descricao;
    static String centrodecusto;
    
    static ControleDepartamento contDep = new ControleDepartamento();
    
    public static void Inserir() {
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        Departamento dEntrada = new Departamento(nome,descricao,centrodecusto);
        Departamento dSaida = contDep.inserir(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }
    
    public static void Alterar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        Departamento dEntrada = new Departamento(id,nome,descricao,centrodecusto);
        Departamento dSaida = contDep.alterar(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }

    public static void Listar() {
        nome = JOptionPane.showInputDialog("NOME");
        Departamento dEntrada = new Departamento(nome);
        List<Departamento> dlSaida = contDep.listar(dEntrada);
        JOptionPane.showMessageDialog(null,dlSaida.get(0).toString());
    }

    public static void Buscar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento dEntrada = new Departamento(id);
        Departamento dSaida = contDep.buscar(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }

    public static void Excluir() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento dEntrada = new Departamento(id);
        Departamento dSaida = contDep.excluir(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }

    
}
