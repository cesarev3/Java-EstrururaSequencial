import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite o valor de um lado em cm");
            System.out.print("> ");
            double lado = entrada.nextDouble();

            if (lado < 0) {
                throw new RuntimeException("O valor deve ser positivo");
            }

            double area2x = calcularArea(lado) * 2;
            System.out.printf(Locale.US, "O dobro da área é: %.2f cm²", area2x);
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
    public static double calcularArea(double valorLado) {
        return Math.pow(valorLado,2);
    }
}
