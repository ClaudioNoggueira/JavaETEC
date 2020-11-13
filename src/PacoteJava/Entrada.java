package PacoteJava;

import javax.swing.JOptionPane;

public class Entrada {

    public static void main(String[] args) {
        String aux = "";
        double num1, num2, resp;
        int menu=0;

        try {
                aux = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n1 - Soma \n2 - Subtração "
                        + "\n3 - Multiplicação\n4 - Divisão\n0 - Sair");
                menu = Integer.parseInt(aux);
                
                if (menu > 4) {
                    JOptionPane.showMessageDialog(null, "Opção Inválida.", "Erro", 2);
                    JOptionPane.showMessageDialog(null, "Digite novamente.");
                    menu = 10;
                }
            
            
            //SOMA
            if (menu == 1) {
                
                JOptionPane.showMessageDialog(null, "Opção Soma");
                
                aux = JOptionPane.showInputDialog(null, "Digite o 1º número.");
                aux = aux.replace(',','.');
                num1 = Double.parseDouble(aux);
               
                aux = JOptionPane.showInputDialog(null, "Digite o 2º número.");
                aux= aux.replace(',','.');
                num2 = Double.parseDouble(aux);
                
                //Linkar o método soma aki
                resp=Operacao.soma(num1, num2);
                
                aux=" Soma";
                Resposta.result(num1, num2, resp, aux);
                
                
            } 
            //SUBTRAÇÃO
            else if (menu == 2) {
                //Linkar método Subtração
                JOptionPane.showMessageDialog(null, "Opção Subtração");

                aux = JOptionPane.showInputDialog(null, "Digite o 1º número.");
                aux = aux.replace(',','.');
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite o 2º número.");
                aux = aux.replace(',','.');
                num2 = Double.parseDouble(aux);
                
                resp=Operacao.subtrair(num1, num2);
                aux=" Subtração";
                Resposta.result(num1, num2, resp, aux);
            } 
            //MULTIPLICAÇÃO
            else if (menu == 3) {
                //Linkar método Multiplicação
                JOptionPane.showMessageDialog(null, "Opção Multiplicação");

                aux = JOptionPane.showInputDialog(null, "Digite o 1º número.");
                aux = aux.replace(',','.');
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite o 2º número.");
                aux = aux.replace(',','.');
                num2 = Double.parseDouble(aux);
                
                resp=Operacao.multiplicar(num1, num2);
                aux=" Multiplicação";
                Resposta.result(num1, num2, resp, aux);
            } 
            //DIVISÃO
            else if (menu == 4) {
                //Linkar método Divisão

                JOptionPane.showMessageDialog(null, "Opção Divisão");

                aux = JOptionPane.showInputDialog(null, "Digite o 1º número.");
                aux = aux.replace(',','.');
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite o 2º número.");
                aux = aux.replace(',','.');
                num2 = Double.parseDouble(aux);
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null, "Impossível dividir por zero.");
                    System.exit(0);
                }
                
                resp=Operacao.dividir(num1, num2);
                aux=" Divisão";
                Resposta.result(num1, num2, resp, aux);
            }else if(menu==0){
                JOptionPane.showMessageDialog(null,"Fim da Aplicação","Calculadora", 2);
                
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número válido","Erro",2);
        }
    }
}
