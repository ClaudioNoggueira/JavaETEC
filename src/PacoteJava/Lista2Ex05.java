package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex05 {

    public static void main(String[] args) {
        String aux = "";
        double carro, vel;
        try {
            aux = JOptionPane.showInputDialog(null, "Velocidade do carro em Km/H");
            carro = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Velocidade máxima permitida na rua em Km/H");
            vel = Double.parseDouble(aux);

            carro -= vel;
            if (carro >= 1 && carro <= 10) {
                JOptionPane.showMessageDialog(null, "Multa de 50,00 R$");
            } else if (carro >= 11 && carro <= 30) {
                JOptionPane.showMessageDialog(null, "Multa de 100,00 R$");
            } else if (carro >= 31) {
                JOptionPane.showMessageDialog(null, "Multa de 300,00 R$");
            } else {
                JOptionPane.showMessageDialog(null, "Sem multa");
            }
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }

    }
}
