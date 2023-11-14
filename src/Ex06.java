import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o valor do raio do círculo em cm");
        System.out.print("> ");
        double raio;
        while (true) {
            validarDouble(entrada);
            raio = entrada.nextDouble();
            if (!(raio > 0)) {
                System.out.print("Entrada inválida. Digite novamente\n> ");
            } else break;
        }

        double area = calcularArea(raio);
        System.out.printf(Locale.US,"A área do círculo é: %.2f cm²", area);

        entrada.close();

    }
    public static double calcularArea(double valorRaio) {
        return Math.PI * Math.pow(valorRaio,2);
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
