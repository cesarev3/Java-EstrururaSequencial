import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite sua altura em metros");
            System.out.print("> ");
            float altura = entrada.nextFloat();

            if (altura < 0.8) {
                throw new RuntimeException("Entrada inválida." +
                        " Altura mínima: 0.8 metros");
            }

            double pesoIdealHomens = calcularPesoIdealHomens(altura);
            double pesoIdealMulheres = calcularPesoIdealMulheres(altura);

            System.out.printf("Peso ideal Homens: %.1f\n", pesoIdealHomens);
            System.out.printf("Peso ideal Mulheres: %.1f", pesoIdealMulheres);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static double calcularPesoIdealHomens(float valorAltura) {
        return (72.7 * valorAltura) - 58;
    }
    public static double calcularPesoIdealMulheres(float valorAltura) {
        return (62.1 * valorAltura) - 44.7;
    }
}
