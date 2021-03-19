/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import revisaodm2021n.dados.Usuario;
import revisaodm2021n.modelos.DaoUsuario;

/**
 *
 * @author matrix
 */
public class ControleUsuario {
    
    static DaoUsuario daoUsu = new DaoUsuario();
    
    public Usuario inserir (Usuario d){
        return daoUsuario.inserir(d);
        
        
        //PAREI NO CONTROLE USUARIO, VIDEO AOS 39:34
    }
    
}
