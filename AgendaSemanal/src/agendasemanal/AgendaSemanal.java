/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendasemanal;

import aulas.Aula;
import gerenciadores.GerenciadorAluno;
import gerenciadores.GerenciadorAula;
import gerenciadores.GerenciadorInstrumento;
import gerenciadores.GerenciadorProfessor;
import instrumentos.InsCorda;
import instrumentos.InsTecla;
import instrumentos.Instrumento;
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
        GerenciadorAula gAu = new GerenciadorAula();

        try {
            ga.cadastrar(new Aluno("Aluno1", 5, "Baixo"));
            ga.cadastrar(new Aluno("Aluno2", 15, "Médio"));
            ga.cadastrar(new Aluno("Aluno3", 13, "Alto"));

            gp.cadastrar(new Professor("Prof1", 32, "Teclado"));
            gp.cadastrar(new Professor("Prof2", 25, "Baixo"));
            gp.cadastrar(new Professor("Prof3", 45, "Guitarra"));

            gi.cadastrar(new InsTecla("Teclado", 5, true));
            gi.cadastrar(new InsCorda("Baixo", 10, true, 4, false));
            gi.cadastrar(new InsCorda("Guitarra", 4, true, 6, true));

            gAu.cadastrar(new Aula((Aluno) ga.getList().get(0), (Professor) gp.getList().get(0), (Instrumento) gi.getList().get(0), "10:00", 1));
            gAu.cadastrar(new Aula((Aluno) ga.getList().get(1), (Professor) gp.getList().get(1), (Instrumento) gi.getList().get(1), "10:00", 2));
            gAu.cadastrar(new Aula((Aluno) ga.getList().get(2), (Professor) gp.getList().get(2), (Instrumento) gi.getList().get(2), "10:00", 3));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "1 - Cadastrar aluno\n"
                    + "2 - Ver alunos cadastrados\n"
                    + "3 - Remover aluno\n"
                    + "4 - Cadastrar professor\n"
                    + "5 - Ver professores cadastrados\n"
                    + "6 - Remover professor\n"
                    + "7 - Cadastrar instrumento\n"
                    + "8 - Ver instrumentos cadastrados\n"
                    + "9 - Remover instrumento\n"
                    + "10 - Cadastrar aula\n"
                    + "11 - Mostrar agenda semanal\n"
                    + "12 - Remover aula\n"
                    + "0 - Sair\n"));

            switch (opcao) {
                case 1: // cadastrar aluno 
                    Aluno aluno = new Aluno();
                    aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));

                    try {
                        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    aluno.setNivel(JOptionPane.showInputDialog("Digite o nível do aluno: "));

                    try {
                        ga.cadastrar(aluno);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

                    break;
                case 2: // ver alunos cadastrados 
                    try {
                        JOptionPane.showMessageDialog(null, ga.imprimirElementos());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;

                case 3: // remover aluno
                    try {
                        int remov = Integer.parseInt(JOptionPane.showInputDialog(ga.imprimirElementos()));
                        if (gAu.hasAula((Aluno) ga.getList().get(remov))) {
                            JOptionPane.showMessageDialog(null, "Aluno não pode ser removido! Está vinculado a uma aula.");
                        } else {
                            ga.getList().remove(remov);
                            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
                case 4: // cadastrar professor
                    Professor prof = new Professor();
                    prof.setNome(JOptionPane.showInputDialog("Digite o nome do professor: "));
                    try {
                        prof.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    prof.setInstIndicado(JOptionPane.showInputDialog("Digite o instrumento indicado: "));

                    try {
                        gp.cadastrar(prof);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

                    break;

                case 5: // ver professores cadastrados
                    try {
                        JOptionPane.showMessageDialog(null, gp.imprimirElementos());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;

                case 6: // remover prof 
                    try {
                        int remov = Integer.parseInt(JOptionPane.showInputDialog(gp.imprimirElementos()));
                        if (gAu.hasAula((Professor) gp.getList().get(remov))) {
                            JOptionPane.showMessageDialog(null, "Professor não pode ser removido! Está vinculado a uma aula.");
                        } else {
                            gp.getList().remove(remov);
                            JOptionPane.showMessageDialog(null, "Professor removido com sucesso!");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
                case 7: // cadastrar instrumento
                    int tipo = Integer.parseInt(
                            JOptionPane.showInputDialog("Qual tipo de instrumento deseja cadastrar?\n"
                            + "1 - Instrumento de corda\n"
                            + "2 - Instrumento de tecla\n"));
                    if (tipo == 1) {
                        InsCorda ins = new InsCorda();
                        ins.setNome(JOptionPane.showInputDialog("Digite o nome do instrumento: "));
                        ins.setIdadeMin(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade mínima: ")));
                        //ins.setEletrico(Boolean.parseBoolean(JOptionPane.showInputDialog("É elétrico: (true/false)")));
                        int eletrico = (JOptionPane.showConfirmDialog(null,
                                "É elétrico: ", "Selecione: ",
                                JOptionPane.YES_NO_OPTION));
                        if (eletrico == 0) {
                            ins.setEletrico(true);
                        } else if (eletrico == 1) {
                            ins.setEletrico(false);
                        }
                        ins.setQtdeCordas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cordas: ")));
                        //ins.setPalheta(Boolean.parseBoolean(JOptionPane.showInputDialog("Precisa palheta? (true/false)")));
                        int palheta = (JOptionPane.showConfirmDialog(null,
                                "Precisa palheta?", "Selecione: ", JOptionPane.YES_NO_OPTION));
                        if (palheta == 0) { //true
                            ins.setPalheta(true);
                        } else if (palheta == 1) {
                            ins.setPalheta(false);
                        }

                        try {
                            gi.cadastrar(ins);
                            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }

                    } else if (tipo == 2) {
                        InsTecla ins = new InsTecla();
                        ins.setNome(JOptionPane.showInputDialog("Digite o nome do instrumento: "));
                        ins.setIdadeMin(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade mínima: ")));
                        int eletrico = (JOptionPane.showConfirmDialog(null,
                                "É elétrico: ", "Selecione: ",
                                JOptionPane.YES_NO_OPTION));
                        if (eletrico == 0) {
                            ins.setEletrico(true);
                        } else if (eletrico == 1) {
                            ins.setEletrico(false);
                        }
                        try {
                            gi.cadastrar(ins);
                            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                    }

                    break;

                case 8: // Ver instrumentos cadastrados
                    try {
                        JOptionPane.showMessageDialog(null, gi.imprimirElementos());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;

                case 9: // Remover instrumento
                    try {
                        int remov = Integer.parseInt(JOptionPane.showInputDialog(gi.imprimirElementos()));
                        Instrumento inst = (Instrumento) gi.getList().get(remov);
                        boolean has;
                        if (inst instanceof InsCorda) {
                            has = gAu.hasAula((InsCorda)gi.getList().get(remov));
                        }else{
                            has = gAu.hasAula((InsTecla)gi.getList().get(remov));
                        }
                        
                        if (has) {
                            JOptionPane.showMessageDialog(null, "Instrumento não pode ser removido! Está vinculado a uma aula.");
                        } else {
                            gi.getList().remove(remov);
                            JOptionPane.showMessageDialog(null, "Instrumento removido com sucesso!");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
                case 10: // cadastrar aula
                    try {
                        int profAula = Integer.parseInt(JOptionPane.showInputDialog("Escolha o professor:\n" + gp.imprimirElementos()));
                        int instAula = Integer.parseInt(JOptionPane.showInputDialog("Escolha o instrumento:\n" + gi.imprimirElementos()));
                        int alunoAula = Integer.parseInt(JOptionPane.showInputDialog("Escolha o aluno:\n" + ga.imprimirElementos()));
                        int diaAula = Integer.parseInt(JOptionPane.showInputDialog("Escolha o dia:\n" + gAu.getDias()));
                        String horaAula = JOptionPane.showInputDialog("Digite o horário da aula: ");

                        Aula aula = new Aula((Aluno) ga.getList().get(alunoAula), (Professor) gp.getList().get(profAula),
                                (Instrumento) gi.getList().get(instAula), horaAula, diaAula);

                        gAu.cadastrar(aula);
                        JOptionPane.showMessageDialog(null, "Aula cadastrada com sucesso!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
                case 11: // ver agenda 
                    try {
                        JOptionPane.showMessageDialog(null, gAu.imprimirElementos());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                case 12: // remover aula
                    try {
                        int remov = Integer.parseInt(JOptionPane.showInputDialog(gAu.imprimirElementos()));
                        gAu.getList().remove(remov);
                        JOptionPane.showMessageDialog(null, "Aula removida com sucesso!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
            }
        } while (opcao != 0);
    }

}
