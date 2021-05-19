package revisaodm2021n;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import revisaodm2021n.telas.alocacao.ManterAlocacao;
import revisaodm2021n.telas.pessoa.ManterPessoa;
import revisaodm2021n.telas.usuario.ManterUsuario;
import revisaodm2021n.telas.departamento.ManterDepartamento;
import revisaodm2021n.telas.pessoa.ManterPessoaFisica;
import revisaodm2021n.telas.terceiros.ManterTerceiros;
import revisaodm2021n.telas.empresa.ManterEmpresa;

public class RevisaoDM2021N {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        
        JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOAS , DEPARTAMENTO E USUARIO");
        JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - PESSOAS, 2 - DEPARTAMENTO, 3 - USUARIO, 4 - TERCEIROS, 5 - EMPRESA, 6 - ALOCAÇÃO");
        int sistema = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

        if(sistema == 1 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO 1 - PESSOA , 2- PESSOAFISICA");

            int  subsistema = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

            if(subsistema == 1) {
            
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOA");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTAR, 5 - EXCLUIR,");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
                if(opcao == 1) { ManterPessoa.Inserir(); }

                if(opcao == 2) { ManterPessoa.Alterar(); }

                if(opcao == 3) { ManterPessoa.Buscar(); }

                if(opcao == 4) { ManterPessoa.Listar(); }

                if(opcao == 5) { ManterPessoa.Excluir(); }
            }
            
            if(subsistema == 2) {
            
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOAFISICA");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR,");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
                if(opcao == 1) { ManterPessoaFisica.Inserir(); }

                if(opcao == 2) { ManterPessoaFisica.Alterar(); }

                if(opcao == 3) { ManterPessoaFisica.Buscar(); }

                if(opcao == 4) { ManterPessoaFisica.Excluir(); }

                if(opcao == 5) { ManterPessoaFisica.Listar(); }
            }

          }

        if(sistema == 2 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO DEPARTAMEMTO");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR,");
        
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterDepartamento.Inserir(); }

            if(opcao == 2) { ManterDepartamento.Alterar(); }

            if(opcao == 3) { ManterDepartamento.Buscar(); }

            if(opcao == 4) { ManterDepartamento.Excluir(); }

            if(opcao == 5) { ManterDepartamento.Listar(); }

        }

        if(sistema == 3 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO USUARIO");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR, 6 - VALIDAR,");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterUsuario.Inserir(); }

            if(opcao == 2) { ManterUsuario.Alterar(); }

            if(opcao == 3) { ManterUsuario.Buscar(); }

            if(opcao == 4) { ManterUsuario.Listar(); }

            if(opcao == 5) { ManterUsuario.Excluir(); }

            if(opcao == 6) { ManterUsuario.Validar(); }

        }
        
        if(sistema == 4 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO TERCEIROS");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR, 6 - LISTAR NOME");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterTerceiros.Inserir(); }

            if(opcao == 2) { ManterTerceiros.Alterar(); }

            if(opcao == 3) { ManterTerceiros.Buscar(); }

            if(opcao == 4) { ManterTerceiros.Listar(); }

            if(opcao == 5) { ManterTerceiros.Excluir(); }   
            
        }
        
        if(sistema == 5 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO EMPRESA");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterEmpresa.Inserir(); }

            if(opcao == 2) { ManterEmpresa.Alterar(); }

            if(opcao == 3) { ManterEmpresa.Buscar(); }

            if(opcao == 4) { ManterEmpresa.Listar(); }

            if(opcao == 5) { ManterEmpresa.Excluir(); }
        }
        
        if(sistema == 6 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO ALOCAÇÃO");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterAlocacao.Inserir(); }

            if(opcao == 2) { ManterAlocacao.Alterar(); }

            if(opcao == 3) { ManterAlocacao.Buscar(); }

            if(opcao == 4) { ManterAlocacao.Listar(); }

            if(opcao == 5) { ManterAlocacao.Excluir(); }
            
        }
    }    
}
