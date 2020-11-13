package PacoteJava;

import javax.swing.*;

public class Lista1Ex9 {

    public static void main(String[] args) {
        String aux="";
        double tempo,velMedia;
        
        try{
        aux=JOptionPane.showInputDialog(null,"Digite o tempo gasto na viagem (/H).");
        aux=aux.replace(',','.');
        tempo=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog(null,"Digite a velocidade média(Km/H).");
        aux=aux.replace(',','.');
        velMedia=Double.parseDouble(aux);
        
        //DISTÂNCIA: distancia = tempo * velocidade media
        tempo*= velMedia;

        //LITROS GASTOS: distância / 12;
        tempo/=12;
        
        aux=Double.toString(tempo);
        aux=aux.replace('.',',');
        
        JOptionPane.showMessageDialog(null,"Distância = Tempo x Velocidade Média\nLitros Gastos = Distância / 12(Km por litro)");
        JOptionPane.showMessageDialog(null,"A quantidade de litros usada foi: "+ aux);
        System.exit(0);
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor válido.");
        }catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(null,"Fim da Aplicação.");
            System.exit(0);
        }
        

    }
}
