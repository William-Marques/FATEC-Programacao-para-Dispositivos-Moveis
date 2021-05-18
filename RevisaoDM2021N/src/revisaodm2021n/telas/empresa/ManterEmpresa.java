package revisaodm2021n.telas.empresa;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleEmpresa;
import revisaodm2021n.dados.Empresa;

public class ManterEmpresa {
    
    //atributos
    static int id;
    static String nome;
    static String cnpj;
    static String endereco;
    static String telefone;
    static String email;
    
    static ControleEmpresa controleEmpresa;
    
    public static void Inserir() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");         
        cnpj = JOptionPane.showInputDialog("CNPJ");        
        endereco = JOptionPane.showInputDialog("ENDEREÇO");
        telefone = JOptionPane.showInputDialog("TELEFONE");
        email = JOptionPane.showInputDialog("EMAIL");
        
        Empresa empresaEntrada = new Empresa(nome, cnpj, endereco, telefone, email);
        
        controleEmpresa = new ControleEmpresa();
        
        Empresa empresaSaida = controleEmpresa.inserir(empresaEntrada);
        
        JOptionPane.showMessageDialog(null,empresaSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");        
        cnpj = JOptionPane.showInputDialog("CNPJ");        
        endereco = JOptionPane.showInputDialog("ENDEREÇO");
        telefone = JOptionPane.showInputDialog("TELEFONE");
        email = JOptionPane.showInputDialog("EMAIL");
        
        Empresa empresaEntrada = new Empresa(id, nome, cnpj, endereco, telefone, email);
        
        controleEmpresa = new ControleEmpresa();
        
        Empresa empresaSaida = controleEmpresa.alterar(empresaEntrada);
        
        JOptionPane.showMessageDialog(null,empresaSaida.toString());
    }
    
    //objeto professor tinha usSaida ao invés de uSaida, talvez de problema
     public static void Listar() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        Empresa empresaEntrada = new Empresa(nome);
        controleEmpresa = new ControleEmpresa();
        List<Empresa> listaEmpresaSaida = controleEmpresa.listar(empresaEntrada);
        listaEmpresaSaida.forEach((empresa) -> {
            JOptionPane.showMessageDialog(null,empresa.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Empresa empresaEntrada = new Empresa(id);
        controleEmpresa = new ControleEmpresa();
        Empresa empresaSaida = controleEmpresa.buscar(empresaEntrada);
        JOptionPane.showMessageDialog(null,empresaSaida.toString());
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Empresa empresaEntrada = new Empresa(id);
        controleEmpresa = new ControleEmpresa();
        Empresa empresaSaida = controleEmpresa.excluir(empresaEntrada);
        JOptionPane.showMessageDialog(null,empresaSaida.toString());
    }
}

