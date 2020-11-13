package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex07 {

    public static void main(String[] args) {
        String aux = "";
        double pagamento,preco;
        try{
        
        aux=JOptionPane.showInputDialog(null,"Digite o valor do produto");
        aux=aux.replace(',','.');
        preco=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog(null,"Digite o valor do pago pelo produto.");
        aux=aux.replace(',','.');
        pagamento=Double.parseDouble(aux);
        
        preco-=pagamento;
        
        if(preco>0){
            JOptionPane.showMessageDialog(null,"Valor do pagamento insuficiente.");
        }else{
            aux=Double.toString(preco);
            aux=aux.replace('.',',');
            JOptionPane.showMessageDialog(null, "O troco eh: "+preco+" R$");
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }

    }
}
