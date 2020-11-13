package PacoteJava;

import javax.swing.JOptionPane;

public class Lista2Ex10 {

    public static void main(String[] args) {
        int hora, minuto, horaSaida, minutoSaida;
        int horas[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

        try {
            hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. Hora:Minutos"));
            while (hora > 23) {
                JOptionPane.showMessageDialog(null, "Digite um valor entre 0 e 23.");
                hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. Hora:Minutos"));
            }

            minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. " + hora + " :Minutos"));
            while (minuto > 59) {
                JOptionPane.showMessageDialog(null, "Digite um valor entre 00 e 59.");
                minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. " + hora + " :Minutos"));
            }

            horaSaida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de saída. Horas:Minutos"));
            while (hora > 23) {
                JOptionPane.showMessageDialog(null, "Seu dia tem mais de 24 horas?");
                hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. Horas:Minutos"));
            }

            minutoSaida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de saída. " + horaSaida + " :Minutos"));
            while (minutoSaida > 59) {
                JOptionPane.showMessageDialog(null, "Digite um valor entre 00 e 59.");
                minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário de entrada. " + horaSaida + " :Minutos"));
            }

            JOptionPane.showMessageDialog(null, "Você entrou as: " + hora + ":" + minuto + "\nE saiu as: " + horaSaida + ":" + minutoSaida);

            horaSaida -= hora;

            minutoSaida -= minuto;
            if (minutoSaida > 0 && horaSaida == 0) {
                horaSaida++;
            }
            while (horaSaida < 0) {
                horaSaida += 23;

            }
            switch (horas[horaSaida]) {
                case 0:
                    JOptionPane.showMessageDialog(null, "4 reais por "+horas[horaSaida]+" hora.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "4 reais por "+horas[horaSaida]+" hora.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "6 reais por "+horas[horaSaida]+" horas.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Um real por hora ACIMA de DUAS horas.");
                    JOptionPane.showMessageDialog(null, "7 reais por 3 horas.");
            }
            int i = 0;
            if (horas[horaSaida] > 3) {
                i = horas[horaSaida] - 3;
                JOptionPane.showMessageDialog(null, 6 + i + " reais por " + horas[horaSaida] + " horas.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Fim da Aplicação.");
        }

        /* 
        4 reais para UMA hora do estacionamento
        6 reais por DUAS horas
        1 por hora adicional ACIMA DE DUAS HORAS
         */
    }
}
