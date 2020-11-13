package PacoteJava;
import javax.swing.JOptionPane;
public class Lista2EX03 {
    public static void main(String[] args) {
        String aux ="";
        double valor1 =0;
        double valor2=0;
        
        aux=JOptionPane.showInputDialog(null,"Digite o primeiro valor.");
        aux=aux.replace(',','.');
        valor1=Double.parseDouble(aux);
        aux=JOptionPane.showInputDialog(null,"Digite o segundo valor.");
        aux=aux.replace(',','.');
        valor2=Double.parseDouble(aux);
        try{
        if(valor1>valor2){
            aux=Double.toString(valor1);
            aux=aux.replace('.',',');
            JOptionPane.showMessageDialog(null,"O primeiro valor "+aux+" é maior que o segundo.");
        }else if(valor2>valor1){
            aux=Double.toString(valor2);
            aux=aux.replace('.',',');
            JOptionPane.showMessageDialog(null,"O segundo valor "+aux+" é maior que o primeiro.");
        }else{
            JOptionPane.showMessageDialog(null,"Os dois valores são iguais.");
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor válido.");
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
        
            
    }
}
