import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite um valor em metros");
        System.out.print("> ");
        double metros;
        while (true) {
            validarDouble(entrada);
            metros = entrada.nextDouble();
            if (!(metros > 0)) {
                System.out.print("Entrada inválida. Digite novamente\n> ");
            } else break;
        }

        double centimetros = converterCentimetros(metros);

        System.out.printf(Locale.US,
                "%.2f metros equivale a %.2f centímetros"
                ,metros, centimetros);

        entrada.close();
    }

    public static double converterCentimetros(double valorMetros) {
        return valorMetros * 100;
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
