/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import revisaodm2021n.telas.pessoa.ManterPessoa;
import revisaodm2021n.telas.usuario.ManterUsuario;
import revisaodm2021n.telas.departamento.ManterDepartamento;
import revisaodm2021n.telas.pessoa.ManterPessoaFisica;

/**
 *
 * @author User
 */
public class RevisaoDM2021N {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        
        JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOAS , DEPARTAMENTO E USUARIO");
        JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - PESSOAS, 2 - DEPARTAMENTO, 3 - USUARIO");
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

    }
    
}
