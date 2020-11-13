package PacoteJava;

import javax.swing.*;

public class Lista3Ex04 {

    public static void main(String[] args) {
        int mesas = 40;
        int cadeiras = 6;
        boolean lugares[][] = new boolean[mesas][cadeiras];
        boolean spots[] = new boolean[mesas];
        int spot = 0;
        int chair = 0;
        int menu = 1;

        try {
            while (menu != 0) {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "9 - Reservar Mesa \n0-Encerrar Aplicação"));
                if (menu == 0) {
                    JOptionPane.showMessageDialog(null, "Fim da Aplicação");
                    System.exit(0);
                } else if (menu == 9) {
                    spot = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da MESA"));
                    while (spots[spot] == true) {
                        JOptionPane.showMessageDialog(null, "Mesa indisponível");
                        JOptionPane.showMessageDialog(null, "Digite novamente");
                        spot = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da MESA"));

                    }
                    while (spot > 40 || spot < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido!");
                        JOptionPane.showMessageDialog(null, "Há apenas 40 mesas");
                        JOptionPane.showMessageDialog(null, "Digite Novamente");
                        spot = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da MESA"));
                    }
                    chair = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de CADEIRAS desejada"));
                    while (chair > 6 || chair <= 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido!");
                        JOptionPane.showMessageDialog(null, "Cada mesa possui 6 cadeiras");
                        JOptionPane.showMessageDialog(null, "Digite Novamente");
                        chair = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de CADEIRAS desejada"));
                    }
                    for (int i = 0; i < chair; i++) {
                        if (lugares[spot][i] == true) {

                        } else {
                            lugares[spot][i] = true;
                        }
                    }
                    if (lugares[spot][5] == true) {
                        JOptionPane.showMessageDialog(null, "Mesa " + spot + " lotada");
                        spots[spot] = true;
                    }

                } else {
                    while (menu != 0 && menu != 9) {
                        JOptionPane.showMessageDialog(null, "Opção Inválida! \nDigite novamente", "", 1);
                        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "9 - Reservar Mesa \n0-Encerrar Aplicação"));
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Valot Inválido!", "", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex1) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação");
        }
    }
}
