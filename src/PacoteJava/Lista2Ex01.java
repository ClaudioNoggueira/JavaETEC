package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex01 {

    public static void main(String[] args) {
        double valor = 0.0;
        String aux = "";

        try {

            aux = JOptionPane.showInputDialog(null, "Digite um valor númerico.");
            aux = aux.replace(',', '.');
            valor = Double.parseDouble(aux);
            valor %= 2;
            if (valor == 0) {
                JOptionPane.showMessageDialog(null, "Valor digitado é par.");
            } else {
                JOptionPane.showMessageDialog(null, "Valor digitado é ímpar.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
    }

}
