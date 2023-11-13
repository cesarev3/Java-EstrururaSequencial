import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite a temperatura atual em Fahrenheit");
            System.out.print("> ");
            float temperatura = entrada.nextFloat();

            float celsius = calcularCelsius(temperatura);
            System.out.printf(Locale.US, "%.1fF equivale a %.1fºC",
                    temperatura, celsius);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static float calcularCelsius(float valorFahrenheit) {
        return 5 * ((valorFahrenheit - 32) / 9);
    }
}
