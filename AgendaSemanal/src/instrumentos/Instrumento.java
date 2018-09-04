/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author klaud
 */
public abstract class Instrumento {
    private String nome;
    private int idadeMin;
    private boolean eletrico;
    
    public Instrumento(){
        this.nome = "";
        this.idadeMin = 0;
        this.eletrico = false;
    }
    
    public Instrumento(String nome, int idadeMin, boolean eletrico){
        this.nome = nome;
        this.idadeMin = idadeMin;
        this.eletrico = eletrico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }
    
}
