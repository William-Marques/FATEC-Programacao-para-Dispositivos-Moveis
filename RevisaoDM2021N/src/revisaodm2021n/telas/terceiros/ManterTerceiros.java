package revisaodm2021n.telas.terceiros;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
//import revisaodm2021n.controles.ControleTerceiros;
import revisaodm2021n.dados.Terceiros;

public class ManterTerceiros {
    
    //atributos
    static int id;
    static String nome;
    static String dataNascimento;
    static String cpf;
    static String genero;
    static String endereco;
    static String telefone;
    static String email;
    static String empresa;
    static String tipo;
    
    //static ControleUsuario contUsu;
    
    public static void Inserir() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO"); 
        cpf = JOptionPane.showInputDialog("CPF");
        genero = JOptionPane.showInputDialog("GÊNERO");
        endereco = JOptionPane.showInputDialog("ENDEREÇO");
        telefone = JOptionPane.showInputDialog("TELEFONE");
        email = JOptionPane.showInputDialog("EMAIL");
        empresa = JOptionPane.showInputDialog("EMPRESA");
        tipo = JOptionPane.showInputDialog("TIPO");
        
        Terceiros terceirosEntrada = new Terceiros(nome,dataNascimento,cpf,genero, endereco, telefone, email, empresa, tipo);
        
        controleTerceiros = new ControleTerceiros();
        
        Terceiros terceirosSaida = controleTerceiros.inserir(terceirosEntrada);
        
        JOptionPane.showMessageDialog(null,terceirosSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO"); 
        cpf = JOptionPane.showInputDialog("CPF");
        genero = JOptionPane.showInputDialog("GÊNERO");
        endereco = JOptionPane.showInputDialog("ENDEREÇO");
        telefone = JOptionPane.showInputDialog("TELEFONE");
        email = JOptionPane.showInputDialog("EMAIL");
        empresa = JOptionPane.showInputDialog("EMPRESA");
        tipo = JOptionPane.showInputDialog("TIPO");
        
        Terceiros terceirosEntrada = new Terceiros(id,nome,dataNascimento,cpf,genero, endereco, telefone, email, empresa, tipo);
        
        controleTerceiros = new ControleTerceiros();
        
        Terceiros terceirosSaida = controleTerceiros.inserir(terceirosEntrada);
        
        JOptionPane.showMessageDialog(null,terceirosSaida.toString());
    }
    
    //PAREI AQUI NESSA BOSTA>>>>>>>>>>

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

    
}
