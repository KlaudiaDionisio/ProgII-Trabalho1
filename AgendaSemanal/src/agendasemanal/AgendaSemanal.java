/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendasemanal;

import gerenciadores.GerenciadorAluno;
import gerenciadores.GerenciadorInstrumento;
import gerenciadores.GerenciadorProfessor;
import instrumentos.InsCorda;
import instrumentos.InsTecla;
import instrumentos.Instrumento;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pessoa.Aluno;
import pessoa.Professor;

/**
 *
 * @author klaud
 */
public class AgendaSemanal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorAluno ga = new GerenciadorAluno();
        GerenciadorProfessor gp = new GerenciadorProfessor();
        GerenciadorInstrumento gi = new GerenciadorInstrumento();
        
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Cadastrar aluno\n"
                    + "2 - Cadastrar professor\n"
                    + "3 - Cadastrar instrumento\n"
                    + "4 - Cadastrar aula\n"
                    + "5 - Mostrar agenda semanal\n"
                    + "6 - Remover aula\n"
                    + "0 - Sair\n"));

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
                    try {
                        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
                    } catch (Exception ex) {
                        Logger.getLogger(AgendaSemanal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    aluno.setNivel(JOptionPane.showInputDialog("Digite o nível do aluno: "));
                    ga.cadastrar(aluno);
                    
                    break;
                case 2:
                    Professor prof = new Professor();
                    prof.setNome(JOptionPane.showInputDialog("Digite o nome do professor: "));
                    try {
                        prof.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digire a idade: ")));
                    } catch (Exception ex) {
                        Logger.getLogger(AgendaSemanal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    prof.setInstIndicado(JOptionPane.showInputDialog("Digite o instrumento indicado: "));
                       gp.cadastrar(prof);
                    break;
                case 3:
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de instrumento deseja cadastrar?\n"
                            + "1 - Instrumento de corda\n"
                            + "2 - Instrumento de tecla\n"));
                    if(tipo == 1){
                        InsCorda ins = new InsCorda();
                        ins.setNome(JOptionPane.showInputDialog("Digite o nome do instrumento: "));
                        ins.setIdadeMin(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade mínima: ")));
                        ins.setEletrico(Boolean.parseBoolean(JOptionPane.showInputDialog("É elétrico: (true/false)")));
                        ins.setQtdeCordas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cordas: ")));
                        ins.setPalheta(Boolean.parseBoolean(JOptionPane.showInputDialog("Precisa palheta? (true/false)")));
                        gi.cadastrar(ins);
                    }else if(tipo == 2){
                        InsTecla ins = new InsTecla();
                        ins.setNome(JOptionPane.showInputDialog("Digite o nome do instrumento: "));
                        ins.setIdadeMin(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade mínima: ")));
                        ins.setEletrico(Boolean.parseBoolean(JOptionPane.showInputDialog("É elétrico: (true/false)")));
                        gi.cadastrar(ins);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                    }
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        } while (opcao != 0);
    }

}
