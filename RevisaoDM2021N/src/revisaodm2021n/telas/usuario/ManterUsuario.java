/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.usuario;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleUsuario;
import revisaodm2021n.dados.Usuario;

/**
 *
 * @author User
 */
public class ManterUsuario {
    
    static int id;
    static String login;
    static String senha;
    static String status;
    static String tipo;
    
    static ControleUsuario contUsu;
    
    public static void Validar() throws SQLException, ClassNotFoundException {
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        Usuario uEntrada = new Usuario(login,senha);
        contUsu = new ControleUsuario();
        Usuario uSaida = contUsu.validar(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

    public static void Inserir() throws SQLException, ClassNotFoundException {
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS");
        tipo = JOptionPane.showInputDialog("TIPO");
        Usuario uEntrada = new Usuario(login,senha,status,tipo);
        contUsu = new ControleUsuario();
        Usuario uSaida = contUsu.inserir(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS");
        tipo = JOptionPane.showInputDialog("TIPO");
        Usuario uEntrada = new Usuario(id,login,senha,status,tipo);
        contUsu = new ControleUsuario();
        Usuario uSaida = contUsu.alterar(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        login = JOptionPane.showInputDialog("LOGIN");
        Usuario uEntrada = new Usuario(login);
        contUsu = new ControleUsuario();
        List<Usuario> usSaida = contUsu.listar(uEntrada);
        usSaida.forEach((usuL) -> {
            JOptionPane.showMessageDialog(null,usuL.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario uEntrada = new Usuario(id);
        contUsu = new ControleUsuario();
        Usuario uSaida = contUsu.buscar(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario uEntrada = new Usuario(id);
        contUsu = new ControleUsuario();
        Usuario uSaida = contUsu.excluir(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

}
