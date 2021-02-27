/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n;

import javax.swing.JOptionPane;
import revisaodm2021n.telas.pessoa.ManterDepartamento;
import revisaodm2021n.telas.pessoa.ManterPessoa;

/**
 *
 * @author User
 */
public class RevisaoDM2021N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOA E DEPARTAMENTO");
        JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - PESSOA, 2 - DEPARTAMENTO");

        int sistema = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

        if(sistema == 1 ) {

            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOA");
            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR,");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));
        
            if(opcao == 1) { ManterPessoa.Inserir(); }

            if(opcao == 2) { ManterPessoa.Alterar(); }

            if(opcao == 3) { ManterPessoa.Buscar(); }

            if(opcao == 4) { ManterPessoa.Excluir(); }

            if(opcao == 5) { ManterPessoa.Listar(); }

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

    }
    
}
