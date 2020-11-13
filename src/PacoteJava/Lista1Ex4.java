package PacoteJava;

import javax.swing.JOptionPane;

public class Lista1Ex4 {

    public static void main(String[] args) {
        int i = 5, j, k;
        j = --i;
        k = i++;
        i += 10;
        try {
            JOptionPane.showMessageDialog(null, "Os valores são: " + "i: " + i + " j: " + j + " k: " + i);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Fim da Aplicação.");
            System.exit(0);

        }
    }
}
