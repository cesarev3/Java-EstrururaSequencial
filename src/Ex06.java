import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite o valor do raio do círculo em cm");
            System.out.print("> ");
            double raio = entrada.nextDouble();

            if (raio < 0){
                throw new RuntimeException("O valor deve ser positivo");
            }

            double area = calcularArea(raio);
            System.out.printf(Locale.US,"A área do círculo é: %.2f cm²", area);
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
    public static double calcularArea(double valorRaio) {
        return Math.PI * Math.pow(valorRaio,2);
    }
}
