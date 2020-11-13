package PacoteJava;
import javax.swing.JOptionPane;
public class Exemplo3 {
  public static void main(String args[]){
      //Aprensenta uma caixa de entrada de dados
      String Nome = JOptionPane.showInputDialog(null,"Digite um nome.");
      
      String resposta = "O meu nome é: " +Nome;
      //Mostra o dado digitado.
      JOptionPane.showMessageDialog(null,resposta, "Mensagem", 1);
  }
  
}
