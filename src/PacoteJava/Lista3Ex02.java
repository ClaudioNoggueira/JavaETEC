package PacoteJava;

import javax.swing.*;

public class Lista3Ex02 {

    public static void main(String[] args) {
        try {
            int linhas = 6;
            int colunas = 3;
            String nomes[] = new String[linhas];
            float notas[][] = new float[7][colunas];
            float result[][] = new float[7][colunas];
            int i = 0;
            int nome = 1;
            String aluno = "";
            String aux = "";

            for (; i != nomes.length; i++) {
                nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + nome + "° aluno");

                aux = JOptionPane.showInputDialog(null, "Digite a primeira nota de " + nomes[i]);
                aux = aux.replace(',', '.');
                notas[i][1] = Float.parseFloat(aux);
                while (notas[i][1] > 10 || notas[i][1] < 0) {
                    JOptionPane.showMessageDialog(null, "Digite um numero entre 0 e 10");
                    aux = JOptionPane.showInputDialog(null, "Digite a primeira nota de " + nomes[i]);
                    aux = aux.replace(',', '.');
                    notas[i][1] = Float.parseFloat(aux);
                }
                aux = JOptionPane.showInputDialog(null, "Digite a segunda nota de " + nomes[i]);
                aux = aux.replace(',', '.');
                notas[i][2] = Float.parseFloat(aux);
                while (notas[i][2] > 10 || notas[i][2] < 0) {
                    JOptionPane.showMessageDialog(null, "Digite um numero entre 0 e 10");
                    aux = JOptionPane.showInputDialog(null, "Digite a segunda nota de " + nomes[i]);
                    aux = aux.replace(',', '.');
                    notas[i][2] = Float.parseFloat(aux);
                }
                nome++;
                result[i][1] = (notas[i][1] + notas[i][2]) / 2;
            }

            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada:\n1 - Média do aluno\n2 - Total de alunos aprovados\n3 - Total de alunos de exame\n4 - Total de alunos Reprovados\n5 - Média da classe"));

            switch (menu) {
                //Média do aluno
                case 1:
                    i = 0;
                    aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno.");

                    for (; !aluno.equals(nomes[i]); i++) {
                        if (i >= 5) {
                            JOptionPane.showMessageDialog(null, "Nome não encontrado.", "", 1);
                            JOptionPane.showMessageDialog(null, "Digite novamente.");
                            i = -1;
                            aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno.");
                        }
                    }
                    result[i][1] = (notas[i][1] + notas[i][2]) / 2;
                    aux=Double.toString(result[i][1]);
                    aux=aux.replace('.',',');
                    JOptionPane.showMessageDialog(null, nomes[i] + "\nMédia: " + aux);
                    if (result[i][1] < 3) {
                        JOptionPane.showMessageDialog(null, nomes[i] + " está reprovado.");
                    } else if (result[i][1] >= 3 && result[i][1] < 7) {
                        JOptionPane.showMessageDialog(null, nomes[i] + " terá de fazer exame.");
                    } else {
                        JOptionPane.showMessageDialog(null, nomes[i] + " está aprovado.");
                    }
                    break;
                //Total de alunos Aprovados
                case 2:
                    i = 0;
                    result[1][2] = 0;
                    for (; i <= linhas; i++) {
                        if (i <= linhas && result[i][1] >= 7) {
                            result[1][2]++;
                        }
                    }
                    aux = Float.toString(result[1][2]);
                    aux = aux.replace('.', ',');
                    JOptionPane.showMessageDialog(null, "Total de alunos Aprovados:  " + aux);
                    break;
                //Total de alunos de exame
                case 3:
                    i = 0;
                    result[2][2] = 0;
                    for (; i < nomes.length; i++) {
                        if (result[i][1] >= 3 || result[i][1] < 7) {
                            result[2][2]++;
                        }
                    }
                    aux = Float.toString(result[2][2]);
                    aux = aux.replace('.', ',');
                    JOptionPane.showMessageDialog(null, "Total de alunos de Exame:  " + aux);
                    break;
                //Total de Alunos Reporvados
                case 4:
                    i = 0;
                    result[3][2] = 0;
                    for (; i < nomes.length; i++) {
                        if (result[i][1] < 3) {
                            result[3][2]++;
                        }
                    }
                    aux = Float.toString(result[3][2]);
                    aux = aux.replace('.', ',');
                    JOptionPane.showMessageDialog(null, "Total de alunos Reprovados:  " + aux);
                    break;
                //Média da Classe
                case 5:
                    i = 1;
                    result[4][2] = 0;
                    for (; i < nomes.length; i++) {
                        result[4][2] += notas[i][1] + notas[i][2] / 2;
                    }
                    result[4][2] /= 6;
                    aux = Float.toString(result[4][2]);
                    aux = aux.replace('.', ',');
                    JOptionPane.showMessageDialog(null, "Média da molecada: " + aux);
                    break;

            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação.");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.\nNão ponha números em nomes ou letras em notas.");
        }

    }
}
