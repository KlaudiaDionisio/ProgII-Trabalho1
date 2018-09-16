/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Objects;

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

    public Professor(String nome, int idade, String instIndicado) {
        super(nome, idade);
        this.instIndicado = instIndicado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (this.getNome().equals(other.getNome()) && this.getIdade() == other.getIdade() 
                && this.getInstIndicado().equals(other.getInstIndicado())) {
            return true;
        }
        return false;
    }
    
    public String getInstIndicado() {
        return instIndicado;
    }

    public void setInstIndicado(String instIndicado) {
        this.instIndicado = instIndicado;
    }
}
