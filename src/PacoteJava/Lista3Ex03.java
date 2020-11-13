package PacoteJava;

import javax.swing.*;

public class Lista3Ex03 {

    public static void main(String[] args) {
        float alturaH[] = new float[50];
        float alturaM[] = new float[50];
        int idadeH[] = new int[50];
        int idadeM[] = new int[50];
        int sexo = 0;
        int index = 0;
        int indexM =0;
        int numero = 1;
        String altura="";
        /*
        SP.SENAC.BR
         */

        int contadorM =1;
        try{
        for (int contadorH = 1; index < alturaM.length; index++) {
            sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sexo da " + numero + "ª pessoa. \n 0 - Homem \t 1 - Mulher"));
            //tratamento de erro
            while (sexo != 0 && sexo != 1) {
                JOptionPane.showMessageDialog(null, sexo);
                JOptionPane.showMessageDialog(null, "Valor inválido");
                sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sexo da " + numero + "ª pessoa. \n 0 - Homem \t 1 - Mulher"));
            }
            if (sexo == 0) {
                altura=JOptionPane.showInputDialog(null,"Digite a ALTURA do "+ contadorH +"º homem.");
                altura=altura.replace(',','.');
                alturaH[index] = Float.parseFloat(altura);
                idadeH[index] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a IDADE do "+ contadorH +"º homem."));
                contadorH++;

            } else if (sexo == 1) {
                altura=JOptionPane.showInputDialog(null,"Digite a ALTURA da "+ contadorM +"ª mulher.");
                altura=altura.replace(',','.');
                alturaM[indexM] = Float.parseFloat(altura);
                idadeM[indexM] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a IDADE da "+ contadorM +"ª mulher."));
                contadorM++;
                indexM++;
            }
            numero++;
        }
        //Calculo da altura
        //Maior altura
        float maximo = alturaH[0];
        int i = 1;
        for (; i < alturaH.length; i++) {
            if (alturaH[i] > maximo) {
                maximo = alturaH[i];
            }
        }
        i = 0;
        for (; i < alturaM.length; i++) {
            if (alturaM[i] > maximo) {
                maximo = alturaM[i];
            }
        }
        altura=Float.toString(maximo);
        altura=altura.replace('.',',');
        JOptionPane.showMessageDialog(null, "A pessoa mais alta tem: " + altura + " de altura");
        //Menor Altura
        float minimo = 0;
        if (alturaH[0] == 0) {
            minimo = alturaM[0];
        } else {
            minimo = alturaH[0];
        }
        i = 0;
        for (; i < alturaH.length; i++) {
            if (alturaH[i] < minimo) {
                if(alturaH[i]!=0){
                minimo = alturaH[i];
                }
            }
        }
        i=0;
        for (; i < alturaM.length; i++) {
            if (alturaM[i] < minimo) {
                if(alturaM[i]!=0){
                minimo = alturaM[i];
                }
            }
        }
        altura=Float.toString(minimo);
        altura=altura.replace('.',',');
        JOptionPane.showMessageDialog(null, "A pessoa mais baixa tem: " + altura + " de altura");
        
        //Média da altura das mulheres
        int x=0;
        alturaH[0]=0;
        for (numero=0; numero < alturaM.length; numero++) {
            if(alturaM[numero]!=0){
            alturaH[0]+=alturaM[numero];
            x++;
            }
        }
        alturaH[0]/=x;
        altura=Float.toString(alturaH[0]);
        altura=altura.replace('.',',');
        JOptionPane.showMessageDialog(null,"A média de altura das mulheres é: " + altura);
        
        //Homem mais velho
        i = 1;
        for (; i < idadeH.length; i++) {
            if (idadeH[i] > idadeH[0]) {
                idadeH[0] = idadeH[i];
            }
        }
        JOptionPane.showMessageDialog(null,"O homem mais velho tem: "+ idadeH[0] + " anos.");
        //Mulher mais nova
        for (i=1; i < idadeM.length; i++) {
            if (idadeM[i] < idadeM[0]) {
                if(idadeM[i]!=0){
                idadeM[0] = idadeM[i];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"A mulher mais nova tem: "+idadeM[0]+" de idade");
        
        
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null,"Valor inválido!");
    }catch(NullPointerException ex2){
        JOptionPane.showMessageDialog(null,"Fim da Aplicação.");
    }
    }
}
