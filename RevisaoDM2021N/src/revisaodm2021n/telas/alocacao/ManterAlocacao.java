package revisaodm2021n.telas.alocacao;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleAlocacao;
import revisaodm2021n.dados.Alocacao;

public class ManterAlocacao {

    //atributos
    static int id;
    static String terceiros_id;
    static String empresa_id;
    static String dataentrada;
    static String datasaida;

    static ControleAlocacao controleAlocacao;

    public static void Inserir() throws SQLException, ClassNotFoundException {
        terceiros_id = JOptionPane.showInputDialog("ID DO TERCEIRO");
        empresa_id = JOptionPane.showInputDialog("ID DA EMPRESA");
        dataentrada = JOptionPane.showInputDialog("DATA DE ENTRADA DO TERCEIRO");
        datasaida = JOptionPane.showInputDialog("DATA DE SAIDA DO TERCEIRO");

        Alocacao alocacaoEntrada = new Alocacao(terceiros_id, empresa_id, dataentrada, datasaida);

        controleAlocacao = new ControleAlocacao();

        Alocacao alocacaoSaida = controleAlocacao.inserir(alocacaoEntrada);

        JOptionPane.showMessageDialog(null, alocacaoSaida.toString());
    }

    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        terceiros_id = JOptionPane.showInputDialog("ID DO TERCEIRO");
        empresa_id = JOptionPane.showInputDialog("ID DA EMPRESA");
        dataentrada = JOptionPane.showInputDialog("DATA DE ENTRADA DO TERCEIRO");
        datasaida = JOptionPane.showInputDialog("DATA DE SAIDA DO TERCEIRO");

        Alocacao alocacaoEntrada = new Alocacao(id, terceiros_id, empresa_id, dataentrada, datasaida);

        controleAlocacao = new ControleAlocacao();

        Alocacao alocacaoSaida = controleAlocacao.alterar(alocacaoEntrada);

        JOptionPane.showMessageDialog(null, alocacaoSaida.toString());
    }

    //objeto professor tinha usSaida ao invés de uSaida, talvez de problema
    public static void Listar() throws SQLException, ClassNotFoundException {
        terceiros_id = JOptionPane.showInputDialog("NOME DO TERCEIRO");
        Alocacao alocacaoEntrada = new Alocacao(terceiros_id);
        controleAlocacao = new ControleAlocacao();
        List<Alocacao> listaAlocacaoSaida = controleAlocacao.listar(alocacaoEntrada);
        listaAlocacaoSaida.forEach((alocacao) -> {
            JOptionPane.showMessageDialog(null, alocacao.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Alocacao alocacaoEntrada = new Alocacao(id);
        controleAlocacao = new ControleAlocacao();
        Alocacao alocacaoSaida = controleAlocacao.buscar(alocacaoEntrada);
        JOptionPane.showMessageDialog(null, alocacaoSaida.toString());
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Alocacao alocacaoEntrada = new Alocacao(id);
        controleAlocacao = new ControleAlocacao();
        Alocacao alocacaoSaida = controleAlocacao.excluir(alocacaoEntrada);
        JOptionPane.showMessageDialog(null, alocacaoSaida.toString());
    }
}
