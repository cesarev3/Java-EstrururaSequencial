import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite a temperatura atual em Celsius");
            System.out.print("> ");
            double temperatura = entrada.nextFloat();

            double fahrenheit = calcularFahrenheit(temperatura);
            System.out.printf(Locale.US, "%.1fºC equivale a %.1fF",
                    temperatura, fahrenheit);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static double calcularFahrenheit(double valorCelsius) {
        return (valorCelsius * 1.8) + 32;
    }
}
