import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite a temperatura atual em Celsius");
        System.out.print("> ");
        validarDouble(entrada);
        double temperatura = entrada.nextDouble();

        double fahrenheit = calcularFahrenheit(temperatura);
        System.out.printf(Locale.US, "%.1fºC equivale a %.1fF",
                temperatura, fahrenheit);

        entrada.close();
    }

    public static double calcularFahrenheit(double valorCelsius) {
        return (valorCelsius * 1.8) + 32;
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
