
package PacoteJava;
import javax.swing.JOptionPane;
public class Lista2Ex06 {
    public static void main(String[] args) {
        String aux = "";
        int ano=0;
         try{
             
         
        aux=JOptionPane.showInputDialog(null,"Digite um ano e veja se ele é bissexto ou não.");
        ano=Integer.parseInt(aux);
        
        ano%=4;
        if(ano==0){
            JOptionPane.showMessageDialog(null,"Ano bissexto.");
        }else{
            JOptionPane.showMessageDialog(null,"Este ano não é bissexto.");
        }
         }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite um valor válido."); 
            
         } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
        
    }
}
