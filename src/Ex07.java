import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o valor de um lado do quadrado em cm");
        System.out.print("> ");
        double lado;
        while (true) {
            validarDouble(entrada);
            lado = entrada.nextDouble();
            if (!(lado > 0)) {
                System.out.print("Entrada inválida. Digite novamente\n> ");
            } else break;
        }

        double area2x = calcularArea(lado) * 2;
        System.out.printf(Locale.US, "O dobro da área é: %.2f cm²", area2x);

        entrada.close();

    }
    public static double calcularArea(double valorLado) {
        return Math.pow(valorLado,2);
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
