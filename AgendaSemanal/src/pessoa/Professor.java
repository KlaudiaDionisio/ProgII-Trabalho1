/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author klaud
 */
public class Professor extends Pessoa{
    private String instIndicado; // instrumnto preferido do professor

    public Professor() {
        super();
        this.instIndicado = "";
    }

    public Professor(String instIndicado, String nome, int idade) {
        super(nome, idade);
        this.instIndicado = instIndicado;
    }
    
    public String getInstIndicado() {
        return instIndicado;
    }

    public void setInstIndicado(String instIndicado) {
        this.instIndicado = instIndicado;
    }
}
