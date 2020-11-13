package PacoteJava;
import javax.swing.JOptionPane;
public class OperadoresDeIncrementoEDecremento {
    public static void main(String[] args) {
        int c;
        c=5;
        JOptionPane.showMessageDialog(null,"c=5","Incremento:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"++c = (c=c+1) é igual a: "+(++c),"Incremento: ",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "portanto -> c <- agora é igual a: " +c, "Incremento", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
