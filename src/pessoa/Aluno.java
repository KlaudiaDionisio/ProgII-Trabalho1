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
public class Aluno extends Pessoa{
    private String nivel; // nivel de conhecimento do aluno 

    public Aluno() {
        super();
        this.nivel = "";
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        }
        
        if (this.getNivel().equals(other.getNivel()) && this.getNome().equals(other.getNome()) 
                && this.getIdade() == (other.getIdade())) {
            return true;
        }
        return false;
    }

    public Aluno(String nome, int idade, String nivel) {
        super(nome, idade);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
