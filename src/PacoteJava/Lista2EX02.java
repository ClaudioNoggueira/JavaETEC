package PacoteJava;

import javax.swing.*;

public class Lista2EX02 {
/*REFAZER ESSA BUDEGA
    
    
    
    
    
    NUMEROS PRIMOS
    
    
    
    
    
    
    
   
    */ 
    public static void main(String[] args) {
        try{
        int valor = 0;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor númerico."));
        int result = valor;
        int abc = result;
        valor = result/2;
        for (int i = 2; i < valor; i++) {
            result = abc;
            result%=i;
            if (result == 0) {
                JOptionPane.showMessageDialog(null,"Este número não é primo.");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null,"Este número é primo.");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Valor Inválido");
        }catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(null,"Fim da Aplicação.");
        }
    }
}
