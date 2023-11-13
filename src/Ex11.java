import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite um número inteiro");
            System.out.print("> ");
            int inteiro1 = entrada.nextInt();

            System.out.println("Digite outro número inteiro");
            System.out.print("> ");

            int inteiro2 = entrada.nextInt();
            System.out.println("Digite um número real");
            System.out.print("> ");
            float real1 = entrada.nextFloat();

            float itemA = calcularItemA(inteiro1, inteiro2);
            float itemB = calcularItemB(inteiro1, real1);
            double itemC = calcularItemC(real1);

            System.out.printf(Locale.US, "Resposta item a: %.1f\n", itemA);
            System.out.printf(Locale.US, "Resposta item b: %.1f\n", itemB);
            System.out.printf(Locale.US, "Resposta item c: %.1f\n", itemC);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static float calcularItemA(int valorN1, int valorN2) {
        return (valorN1 * 2) * ((float)(valorN2) / 2);
    }
    public static float calcularItemB(int valorN1, float valorN3) {
        return (valorN1 * 3) + valorN3;
    }
    public static double calcularItemC(float valorN3) {
        return Math.pow(valorN3,3);
    }
}
