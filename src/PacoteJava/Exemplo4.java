package PacoteJava;
import javax.swing.JOptionPane;
public class Exemplo4 {
    public static void main(String[] args) {
        String aux="";
        String nome=JOptionPane.showInputDialog(null,"Insira seu nome");
        aux=JOptionPane.showInputDialog(null,"Insira sua idade");
        double idade=Double.parseDouble(aux);
        aux=JOptionPane.showInputDialog(null,"Insira seu telefone");
        int tel=Integer.parseInt(aux);
        
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        JOptionPane.showMessageDialog(null, "Seu telefone é: " + tel);
        
    }
 
        
    
}
