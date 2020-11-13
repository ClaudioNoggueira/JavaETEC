package PacoteJava;

import javax.swing.JOptionPane;

public class Lista1Ex2 {

    public static void main(String[] args) {
        String aux = "";
        double salario;
        double parcela;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o seu salário");
            aux = aux.replace(',', '.');
            salario = Double.parseDouble(aux);

            double abcde = Operacao.multiplicar(salario, 30);
            abcde = Operacao.dividir(abcde, 100);

            aux = JOptionPane.showInputDialog(null, "Digite o valor da parcela");
            aux = aux.replace(',', '.');
            parcela = Double.parseDouble(aux);

            if (parcela > abcde) {
                JOptionPane.showMessageDialog(null, "Empréstimo não concedido");

            } else {
                JOptionPane.showMessageDialog(null, "Empréstimo concedido");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação");
            System.exit(0);
        }
    }
}
