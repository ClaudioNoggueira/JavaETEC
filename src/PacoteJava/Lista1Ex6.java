package PacoteJava;

import javax.swing.*;

public class Lista1Ex6 {
    public static void main(String[] args) {
        double valor,desconto;
        desconto = 0.0;
        String aux="";
        
        try{
        aux=JOptionPane.showInputDialog(null,"Digite o valor pago pelo produto.");
        aux=aux.replace(',','.');
        valor=Double.parseDouble(aux);
        JOptionPane.showMessageDialog(null,"Com desconto de 9%");
        desconto=valor * 9 / 100;
        desconto= valor - desconto;
        aux=Double.toString(desconto);
        aux=aux.replace('.',',');
        JOptionPane.showMessageDialog(null,"A valor a ser pago será:  " + aux + " R$");
        
        System.exit(0);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor numérico.","",2);
        }catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(null,"Fim da Aplicação");
            System.exit(0);
        }
    }
}
