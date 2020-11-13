package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex08 {

    public static void main(String[] args) {
        String aux = "";
        double codigo;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o código do produto.");
            codigo = Double.parseDouble(aux);

            if (codigo == 001) {
                JOptionPane.showMessageDialog(null, "Parafuso");

            } else if (codigo == 002) {
                JOptionPane.showMessageDialog(null, "Porca");

            } else if (codigo == 003) {
                JOptionPane.showMessageDialog(null, "Prego");

            } else if (codigo == 004) {
                JOptionPane.showMessageDialog(null, "Martelo");
            }else{
            JOptionPane.showMessageDialog(null, "Digite um código válido.");
            JOptionPane.showMessageDialog(null,"001 - Parafuso \n002 - Porca \n003 - Prego \n004 - Martelo");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um código válido.");
            JOptionPane.showMessageDialog(null,"001 - Parafuso \n002 - Porca \n003 - Prego \n004 - Martelo");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
    }
}
