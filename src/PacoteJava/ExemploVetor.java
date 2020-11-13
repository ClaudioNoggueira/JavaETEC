package PacoteJava;

import javax.swing.*;

public class ExemploVetor {

    public static void main(String[] args) {
         int Vetor [] = new int [3];
         for(int i=0; i<3;i++){
             Vetor[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro Vetor"));
         }
         
         int vetor [] = new int [3];
         for(int i=0; i<3;i++){
             vetor[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo Vetor"));
         }
         int resultado[] = new int [3];
         for(int i=0; i<3;i++){
             resultado[i]=vetor[i]+Vetor[i];
         }
         for (int i = 0; i < 3; i++) {
         JOptionPane.showMessageDialog(null,"Resultado "+resultado[i]);
        }
    }
}
