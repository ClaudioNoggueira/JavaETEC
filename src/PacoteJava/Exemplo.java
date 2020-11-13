package PacoteJava;

import javax.swing.JOptionPane;

public class Exemplo {
    
    public static void main(String args[]){
    System.out.println("Exemplo1");
    Exemplo1.mostraNome();
    Exemplo2.escrever();
    
    JOptionPane.showInputDialog(null,"Insira o primeiro número.");
    JOptionPane.showMessageDialog(null,"O valor é: ");
    }
}
