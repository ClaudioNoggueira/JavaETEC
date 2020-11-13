package PacoteJava;
import javax.swing.JOptionPane;
public class EntradaDeDados {

    public static void main(String[] args) {
        String aux="";
        double nota1=0, nota2 =0, trabalho =0, media=0;
        aux=JOptionPane.showInputDialog(null,"Entre com a nota 1");
        nota1=Float.parseFloat(aux);
        
        aux=JOptionPane.showInputDialog(null,"Entre com a nota 2.");
        nota2=Float.parseFloat(aux);
        
        aux=JOptionPane.showInputDialog(null,"Entre com a nota d trabalho.");
        trabalho=Float.parseFloat(aux);
        
        media=(nota1+nota2+trabalho)/3;
        JOptionPane.showMessageDialog(null, "Media: " +media);

    }

}
