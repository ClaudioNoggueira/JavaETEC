package PacoteJava;
import javax.swing.*;
public class ExemploMatriz {
    public static void main(String[] args) {
        try{
        
        int Matriz [][] = new int [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Primeira Matriz"));
            }
        }
        int Matriz2 [][] = new int [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Segunda Matriz"));
            }
        }
        int Result [][]=new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Result[i][j]=Matriz[i][j]+Matriz2[i][j];
                JOptionPane.showMessageDialog(null,Result[i][j]);
            }
        }
    }catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(null,"Valor inválido");
        
    } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação :)");
            System.exit(0);
        }
}
}
