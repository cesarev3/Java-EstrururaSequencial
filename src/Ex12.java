import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
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

            double pesoIdeal = calcularPesoIdeal(altura);
            System.out.printf("Seu peso ideal: %.1f", pesoIdeal);
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
    public static double calcularPesoIdeal(float valorAltura) {
        return (72.7 * valorAltura) - 58;
    }
}
