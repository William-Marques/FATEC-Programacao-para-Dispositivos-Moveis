package backend2021n;

import backend2021n.util.ConexaoDb;

public class TesteConexao {
    
    public static void main(String[] args) {

        System.out.println(ConexaoDb.statusConection());
        ConexaoDb.getConexaoMySQL();
        System.out.println(ConexaoDb.statusConection());

    }    
}
