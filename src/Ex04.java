import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int bimestres = 4;
        double[] notas = new double[bimestres];

        carregarNotas(bimestres, entrada, notas);

        double media = calcularMedia(notas);
        System.out.printf(Locale.US,"Média do aluno: %.2f", media);

        entrada.close();
    }

    private static void carregarNotas(int bimestres, Scanner entrada,
                                      double[] notas) {
        for (int i = 0; i < bimestres; i++) {
            System.out.println("Digite a média do " + (i + 1) + "º bimestre");
            System.out.print("> ");

            double nota;
            while (true) {
                validarDouble(entrada);
                nota = entrada.nextDouble();
                if (!(nota > 0)) {
                    System.out.print("Entrada inválida. Digite novamente\n> ");
                } else break;
            }
            notas[i] = nota;
        }
    }

    public static double calcularMedia(double[] input) {
        double total = 0;
        for (double v : input) total += v;
        return total / input.length;
    }

    private static void validarDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
