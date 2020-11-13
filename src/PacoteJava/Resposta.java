package PacoteJava;

import javax.swing.JOptionPane;

public class Resposta {

    public static void result(double numDig1, double numDig2, double result, String sinal) {
        JOptionPane.showMessageDialog(null, "Os numeros digitados foram: " + numDig1 + " e " + numDig2);
        JOptionPane.showMessageDialog(null, "A operação escolhida foi: " + sinal);
        JOptionPane.showMessageDialog(null, "O resultado da equação é: " + Math.round(result));

    }
}
