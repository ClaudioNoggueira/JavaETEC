package PacoteJava;

public class BalancoTrimestral {

    public static void main(String[] args) {
        int gastosJaneiro = 15000, gastosFevereiro=23000, gastosMarco=17000;
        int gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("O gasto no trimestre foi: " + gastoTrimestre);
        
        int mediaMensal;
        mediaMensal=gastoTrimestre /3;
        System.out.println("A média mensal é: " + mediaMensal);

    }

}
