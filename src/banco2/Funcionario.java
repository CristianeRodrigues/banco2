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
public class Funcionario {

    int codigo;
    String função;
    Endereco end;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        System.out.println("código");
    }
    public void setFuncao(String funcao) {
        this.função = funcao;
        System.out.println("função");
        System.out.println("função2");
    }
}
