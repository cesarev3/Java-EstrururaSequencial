import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Quantos reais você ganha por hora?");
        System.out.print("> ");
        double valorHora;
        while (true) {
            validarDouble(entrada);
            valorHora = entrada.nextDouble();
            if (!(valorHora > 0)) {
                System.out.print("Entrada inválida. Digite novamente\n> ");
            } else break;
        }

        System.out.println("Quantas horas trabalhadas este mês?");
        System.out.print("> ");
        double quantidadeHoras;
        while (true) {
            validarDouble(entrada);
            quantidadeHoras = entrada.nextDouble();
            if (!(quantidadeHoras > 0)) {
                System.out.print("Entrada inválida. Digite novamente\n> ");
            } else break;
        }

        double salario = calcularSalario(valorHora, quantidadeHoras);
        System.out.printf("Salario deste mês: R$ %.2f", salario);

        entrada.close();
    }
    public static double calcularSalario(double horaValor,
                                        double horaQuantidade) {
        return horaValor * horaQuantidade;
    }
    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
