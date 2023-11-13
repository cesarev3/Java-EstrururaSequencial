import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        float[] notas = new float[4];
        float media = 0.00f;

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a média do " + (i + 1) +
                        "º bimestre");
                System.out.print("> ");
                notas[i] = entrada.nextFloat();
            }

            for (int j = 0; j < 4; j++) {
                media += notas[j];
            }

            System.out.printf(Locale.US,"Média do aluno: %.2f", (media / 4));
            entrada.close();

        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("\nfim");
        }
    }
}
