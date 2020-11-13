package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex04 {

    public static void main(String[] args) {
        String aux = "";
        double valor1, valor2, valor3, valor4;

        aux = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        aux = aux.replace(',', '.');
        valor1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        aux = aux.replace(',', '.');
        valor2 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite o terceiro valor");
        aux = aux.replace(',', '.');
        valor3 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite o quarto valor");
        aux = aux.replace(',', '.');
        valor4 = Double.parseDouble(aux);
        try {
            if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4) {
                aux = Double.toString(valor1);
                aux = aux.replace('.', ',');
                JOptionPane.showMessageDialog(null, aux + " O primeiro valor digitado eh o menor.");
            } else if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4) {
                aux = Double.toString(valor2);
                aux = aux.replace('.', ',');
                JOptionPane.showMessageDialog(null, aux + " O segundo valor digitado eh o menor.");
            } else if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
                aux = Double.toString(valor3);
                aux = aux.replace('.', ',');
                JOptionPane.showMessageDialog(null, aux + " O terceiro valor digitado eh o menor.");
            } else {
                aux = Double.toString(valor4);
                aux = aux.replace('.', ',');
                JOptionPane.showMessageDialog(null, aux + " O quarto valor digitado eh o menor.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
    }
}
