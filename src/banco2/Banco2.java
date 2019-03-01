/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

/**
 *
 * @author Carlos
 */
public class Banco2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(500);
        funcionario.setFuncao("supervisor",200);
        System.out.println("projeto Banco");
    }

}
