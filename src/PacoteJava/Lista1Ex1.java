package PacoteJava;

import javax.swing.JOptionPane;

public class Lista1Ex1 {

    public static void main(String[] args) {
        String aux = "";
        double salario;
        double aumento;

        try{
        aux = JOptionPane.showInputDialog(null, "Digite o seu salário. ");
        aux=aux.replace(',','.');
        salario = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite o aumento (%)");
        aux=aux.replace(',','.');
        aumento = Double.parseDouble(aux);

        double salario2 = Operacao.multiplicar(salario, aumento);
        salario2=Operacao.dividir(salario2, 100);
        salario2=salario + salario2;
        
        aux=Double.toString(aumento);
        aux=aux.replace('.',',');

        JOptionPane.showMessageDialog(null, "O valor do aumento foi: " + aux + "%");
        aux=Double.toString(salario2);
        aux=aux.replace('.',',');
        JOptionPane.showMessageDialog(null, "O salário final é: " + aux);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor válido.");
        }catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(null, "Fim da Aplicação");
            System.exit(0);
        }
    }

}
