package PacoteJava;

import java.util.Scanner;

public class Lista3Ex01 {

    public static void main(String[] args) {
        //Linha do topo
        for (int topo = 0; topo < 121; topo++) {
            System.out.print("=");
        }
        //Salto de uma linha VERTICAL
        System.out.println("");
        //Titulos
        System.out.println("|\t Tabuada do 1 \t|\t Tabuada do 2 \t|\t Tabuada do 3 \t|\t Tabuada do 4 \t|\t Tabuada do 5 \t|");

        //Tabuada do 1 até 5
        for (int result = 0; result < 10; result++) {
            for (int multi = 1; multi <= 10; multi++) {
                for (int contagem = 1; contagem <= 5; contagem++) {
                    result = multi * contagem;
                    if (contagem == 5) {
                        System.out.print("|\t " + contagem + " x " + multi + " = " + result + "   \t|");
                        System.out.println("");
                    } else {
                        System.out.print("|\t " + contagem + " x " + multi + " = " + result + "   \t");
                    }
                }
            }
        }
        //Corte do meio
        for (int meio = 0; meio < 121; meio++) {
            System.out.print("-");
        }
        //Salto de linha
        System.out.println("");
        //Títulos 
        System.out.println("|\t Tabuada do 6 \t|\t Tabuada do 7 \t|\t Tabuada do 8 \t|\t Tabuada do 9 \t|\t Tabuada do 10 \t|");

        //Tabuada do 6 até 10
        for (int result = 0; result < 10; result++) {
            for (int multi = 1; multi <= 10; multi++) {
                for (int contagem = 6; contagem <= 10; contagem++) {
                    result = multi * contagem;
                    if (contagem == 10 && multi == 10) {
                        System.out.print("|\t " + contagem + " x " + multi + " = " + result + "  |");
                        System.out.println("");
                    } else if (contagem == 10) {
                        System.out.print("|\t " + contagem + " x " + multi + " = " + result + "   \t|");
                        System.out.println("");
                    } else {
                        System.out.print("|\t " + contagem + " x " + multi + " = " + result + "   \t");
                    }
                }
            }
        }
        //Rodapé
        for (int rodapé = 0; rodapé < 121; rodapé++) {
            System.out.print("=");
        }
    }
}
