package PacoteJava;

import javax.swing.*;

public class Lista1Ex8 {

    public static void main(String[] args) {
        String aux = "";
        double altura = 0;

        try {
            JOptionPane.showMessageDialog(null, "Calcule o valor do volume de um lata.\nAtravés da fórmula:  3.14159 x raio² x altura");

            aux = JOptionPane.showInputDialog(null, "Digite o valor do raio da lata (em centimetros).");
            aux = aux.replace(',', '.');
            double raio = Double.parseDouble(aux);
            raio *= 2;

            aux = JOptionPane.showInputDialog(null, "Digite a altura da lata (em centimetros).");
            aux = aux.replace(',', '.');
            altura = Double.parseDouble(aux);

            altura = (altura * raio) * 3.14159;
            aux = Double.toString(altura);
            aux = aux.replace('.', ',');

            JOptionPane.showMessageDialog(null, "O volume da lata é: " + aux + " cm³");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação.");
            System.exit(0);
        }

    }
}
