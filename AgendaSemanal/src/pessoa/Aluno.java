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
public class Aluno extends Pessoa{
    private String nivel; // nivel de conhecimento do aluno 

    public Aluno() {
        super();
        this.nivel = "";
    }

    public Aluno(String nivel, String nome, int idade) {
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
