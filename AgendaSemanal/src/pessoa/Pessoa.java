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
public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade > 0){
            this.idade = idade;
        }else{
            throw new Exception("A idade precisa ser maior que 0!");
        }
    }
    
    

}
