package PacoteJava;

public class Constantes {

    static final float PI = 3.1415265f;

    public static void main(String[] args) {
        float raio = 25f;
        float comprimento = raio * 2 * PI;
        float area = (raio * raio) * PI;
        System.out.println("Dados de um círculo de " + raio + "cm:\n" + "comprimento: " + comprimento + "cm\n" + "Área:" + area + "cm2");
    }

}
