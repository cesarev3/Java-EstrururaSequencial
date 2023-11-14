import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite a temperatura atual em Fahrenheit");
        System.out.print("> ");
        validarDouble(entrada);
        double temperatura = entrada.nextDouble();

        double celsius = calcularCelsius(temperatura);
        System.out.printf(Locale.US, "%.1fF equivale a %.1fºC",
                temperatura, celsius);

        entrada.close();
    }
    public static double calcularCelsius(double valorFahrenheit) {
        return 5 * ((valorFahrenheit - 32) / 9);
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
