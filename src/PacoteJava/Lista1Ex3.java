package PacoteJava;

import javax.swing.JOptionPane;

public class Lista1Ex3 {

    public static void main(String[] args) {
        String aux = "";
        double raio = 0;
        double perimetro = 0;

        try {

            JOptionPane.showMessageDialog(null,"Calcule o perimetro de uma circunferência");
            aux = JOptionPane.showInputDialog(null, "Digite o raio da circunferência.");
            aux=aux.replace(',','.');
            raio = Double.parseDouble(aux);
            perimetro = Operacao.multiplicar(raio, 2);
            perimetro = 3.14159 * perimetro;
            aux=Double.toString(perimetro);
            aux=aux.replace('.',',');

            JOptionPane.showMessageDialog(null, "O perímetro é: " + aux);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação.");
            System.exit(0);
        }

    }
}
