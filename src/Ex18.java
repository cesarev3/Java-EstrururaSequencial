import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite o tamanho do arquivo em MB");
            System.out.print("> ");
            float tamanho = entrada.nextFloat();

            System.out.println("Digite a velocidade do link em Mbps");
            System.out.print("> ");
            int velocidade = entrada.nextInt();


            float baseSegundos = calcularBaseSegundos(tamanho, velocidade);
            int horas = calcularhoras(baseSegundos);
            int minutos = calcularMinutos(baseSegundos, horas);
            int segundos = calcularSegundos(baseSegundos, horas, minutos);

            // formatando a saída para singular e plural
            String xHora = ",";
            String xMinuto = " e";
            char xSegundo = ' ';

            if (horas > 1) {
                xHora = "s,";
            }
            if (minutos > 1) {
                xMinuto = "s e";
            }
            if (segundos > 1) {
                xSegundo = 's';
            }

            // imprimindo na tela conforme necessidade de horas e minutos
            if (horas >= 1) {
                System.out.printf("Tempo aproximado de download: %d hora%s" +
                        " %d minuto%s %d segundo%s", horas, xHora, minutos, xMinuto, segundos, xSegundo);
            } else if (horas == 0 && minutos == 0) {
                System.out.printf("Tempo aproximado de download: %d segundo%s",
                        segundos, xSegundo);
            } else {
                System.out.printf("Tempo aproximado de download: %d minuto%s" +
                        " %d segundo%s", minutos, xMinuto, segundos, xSegundo);
            }
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
        finally {
            System.out.print("\nfim");
        }
    }
    public static float calcularBaseSegundos(float tamanhoArquivoMB, int velocidadeBanda){
        float converterArquivoMb = tamanhoArquivoMB * 8;
        return converterArquivoMb / velocidadeBanda;
    }
    public static int calcularhoras(float totalTempoSegundos){
        float totalHoras = totalTempoSegundos / 3600;
        return (int)totalHoras;
    }
    public static int calcularMinutos(float totalTempoSegundos, int parteInteiraHoras){
        float decimalHoras = (totalTempoSegundos / 3600) - (float)parteInteiraHoras;
        return (int)(decimalHoras * 60);
    }
    public static int calcularSegundos(float totalTempoSegundos, int parteInteiraHoras, int parteInteiraMinutos){
        float decimalHoras = (totalTempoSegundos / 3600) - (float)parteInteiraHoras;
        float parteMinutos = decimalHoras * 60;
        float decimalMinutos = parteMinutos - parteInteiraMinutos;
        return (int)(Math.ceil(decimalMinutos * 60));
    }

}
