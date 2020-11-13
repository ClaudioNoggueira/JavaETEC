package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex09 {

    public static void main(String[] args) {
        String aux = "";
        double lado1, lado2, base;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor do 1º lado do triângulo");
            lado1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o valor do 2º lado do triângulo");
            lado2 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o valor do 3º lado do triângulo");
            base = Double.parseDouble(aux);

            if (lado1 == lado2 && lado1 == base) {
                JOptionPane.showMessageDialog(null, "Triângulo Equilatero\n Todos os lados são iguais");
            } else if (lado1 == lado2 && lado1 != base) {
                lado1+=lado2;
                if(base>lado2){
                    JOptionPane.showMessageDialog(null,"Valor inválido!");
                    JOptionPane.showMessageDialog(null, "Um dos lados do triângulo não pode ser maior do que a soma dos outros dois");
                }
                JOptionPane.showMessageDialog(null, "Triângulo Isóseles \n Dois lados iguais e um diferente.");
            } else if (lado1 != lado2 && lado1 == base) {
                base+=lado1;
                if(lado1>base){
                    JOptionPane.showMessageDialog(null,"Valor inválido!");
                    JOptionPane.showMessageDialog(null, "Um dos lados do triângulo não pode ser maior do que a soma dos outros dois");
                }
                JOptionPane.showMessageDialog(null, "Triângulo Isóseles \n Dois lados iguais e um diferente.");

            } else if (lado2 == base && lado2 != lado1){
                
            lado2+=base;
            if(lado1>lado2){
                JOptionPane.showMessageDialog(null,"Valor inválido!");
                    JOptionPane.showMessageDialog(null, "Um dos lados do triângulo não pode ser maior do que a soma dos outros dois");
                
                JOptionPane.showMessageDialog(null, "Triângulo Isósceles \n Dois lados iguais e um diferente.");
            }
            }else if (lado1 != lado2 && lado2 != base) {
                JOptionPane.showMessageDialog(null, "Triângulo Escaleno \n Todos os lados possuem valores diferentes.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos.");

        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
    }
}
