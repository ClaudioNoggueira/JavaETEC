package PacoteJava;

import javax.swing.JOptionPane;

public class Lista1Ex7 {

    public static void main(String[] args) {
        String aux = "";
        double valorAula, numAulas, HoraAula, INSS, result;
        INSS = 1.0;

        try {
            JOptionPane.showMessageDialog(null,"Calcule o sálario liquido de um professor.");
            
            
            aux = JOptionPane.showInputDialog(null, "Aulas Dadas no mês.");
            aux = aux.replace(',', '.');
            numAulas = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Horas dadas por aula.");
            aux = aux.replace(',', '.');
            HoraAula = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Valor por hora.");
            aux = aux.replace(',', '.');
            valorAula = Double.parseDouble(aux);

            result = numAulas * HoraAula * valorAula;

            if (result >= 1693.72) {
                INSS = 8;
                JOptionPane.showMessageDialog(null, "Valor descontado do INSS será: " + INSS + " %");

            } else if (result >= 1693.73 && result <= 2822.90) {
                INSS = 9;
                JOptionPane.showMessageDialog(null, "Valor descontado do INSS será: " + INSS + " %");
            } else if (result >= 2822.91 && result <= 5645.80) {
                INSS = 11;
                JOptionPane.showMessageDialog(null, "Valor descontado do INSS será: " + INSS + " %");
            }
            valorAula = result * INSS / 100;
            result -= valorAula;
            aux = Double.toString(result);
            aux = aux.replace('.', ',');

            JOptionPane.showMessageDialog(null, "O salário líquido é: " + aux + " R$");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite valores númericos", "", 2);
        }catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(null,"Fim da Aplicação");
            System.exit(0);
        }
    }
}
