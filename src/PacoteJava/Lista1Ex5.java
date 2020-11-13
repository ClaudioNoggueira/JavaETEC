package PacoteJava;

import javax.swing.*;

public class Lista1Ex5 {
//DATA DE CRIAÇÃO DESTE CÓDIGO: 11/04/2018

    public static void main(String[] args) {
        int diaN, mesN, anoN, resposta;
        int diaA, mesA, anoA;
        int bissexto = 0;
        String aux = "";

        try {
            JOptionPane.showMessageDialog(null, "Calcule quantos dias você tem de vida.");

            aux = JOptionPane.showInputDialog(null, "Digite o dia atual.");
            diaA = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o mês atual.\n " + diaA + " / mês");
            mesA = Integer.parseInt(aux);
            switch (mesA) {
                case 1:
                    aux = Integer.toString(mesA);
                    aux = "Janeiro";
                    break;
                case 2:
                    aux = Integer.toString(mesA);
                    aux = "Fevereiro";
                    break;
                case 3:
                    aux = Integer.toString(mesA);
                    aux = "Março";
                    break;
                case 4:
                    aux = Integer.toString(mesA);
                    aux = "Abril";
                    break;
                case 5:
                    aux = Integer.toString(mesA);
                    aux = "Maio";
                    break;
                case 6:
                    aux = Integer.toString(mesA);
                    aux = "Junho";
                    break;
                case 7:
                    aux = Integer.toString(mesA);
                    aux = "Julho";
                    break;
                case 8:
                    aux = Integer.toString(mesA);
                    aux = "Agosto";
                    break;
                case 9:
                    aux = Integer.toString(mesA);
                    aux = "Setembro";
                    break;
                case 10:
                    aux = Integer.toString(mesA);
                    aux = "Outubro";
                    break;
                case 11:
                    aux = Integer.toString(mesA);
                    aux = "Novembro";
                    break;
                case 12:
                    aux = Integer.toString(mesA);
                    aux = "Dezembro";
                    break;
            }
            String aux2=aux;
            aux = JOptionPane.showInputDialog(null, "Digite o ano atual.\n " + diaA + " / " + aux2 + " / ano");
            anoA = Integer.parseInt(aux);
            JOptionPane.showMessageDialog(null, "A data atual é: " + diaA + " / " + aux2 + " / " + anoA);

            aux = JOptionPane.showInputDialog(null, "Digite o dia de seu nascimento");
            diaN = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o seu mês de nascimento");
            mesN = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o seu ano de nascimento");
            anoN = Integer.parseInt(aux);

            anoN = anoA - anoN;
            diaN = anoN;
            //Calculo de anos bissextos
            while (diaN >= 4) {
                bissexto++;
                diaN -= 4;
            }
            anoN *= 365;
            anoN += bissexto;

            mesN = mesA - mesN;
            mesN *= 30;
            diaN = diaA - diaN;

            resposta = diaN + mesN + anoN;

            JOptionPane.showMessageDialog(null, "Você possui " + resposta + " dias de vida.");

            System.exit(0);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite números inteiros.", "Erro", 2);
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação");
            System.exit(0);
        }
    }

}
