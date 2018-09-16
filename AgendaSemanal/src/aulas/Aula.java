/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import pessoa.Aluno;
import pessoa.Professor;
import instrumentos.Instrumento;

/**
 *
 * @author klaud
 */
public class Aula implements Comparable<Aula> { // interface Comparable já existe, usado para ordenar as aulas pelo horario

    private Aluno aluno;
    private Professor professor;
    private Instrumento instrumento;
    private String horario;
    private int dia;

    public Aula() {
        this.aluno = null;
        this.professor = null;
        this.instrumento = null;
        this.horario = "  :  ";
        this.dia = 0;
    }

    public Aula(Aluno aluno, Professor professor, Instrumento instrumento, String horario, int dia) {
        this.aluno = aluno;
        this.professor = professor;
        this.instrumento = instrumento;
        this.horario = horario;
        this.dia = dia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public int compareTo(Aula o) {

        if (this.getDia() > o.getDia()) {
            return 1;
        }
        if (this.getDia() < o.getDia()) {
            return -1;
        }
        return this.getHorario().compareTo(o.getHorario());
    }

    public String getDiaAsString(){
        String dia = "";
        switch(this.getDia()){
            case 1:
                dia = "Segunda";
                break;
            case 2:
                dia = "Terça";
                break;
            case 3:
                dia = "Quarta";
                break;
            case 4:
                dia = "Quita";
                break;
            case 5:
                dia = "Sexta";
                break;
        }
        return dia;
    }
}
