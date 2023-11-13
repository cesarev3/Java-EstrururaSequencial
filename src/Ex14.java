import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite o peso total dos peixes em kg");
            System.out.print("> ");
            float peso = entrada.nextFloat();

            if (peso == 0) {
                throw new RuntimeException("Boa sorte na próxima pescaria");
            } else if (peso < 0) {
                throw new RuntimeException("Valor deve ser positivo");
            }

            float excesso = calcularExcesso(peso);
            float multa = calcularMulta(excesso);

            System.out.printf("Peso excedido: %.2f kg\n", excesso);
            System.out.printf("Multa a pagar: R$ %.2f", multa);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static float calcularExcesso (float valorPeso) {
        if (valorPeso > 50) {
            return valorPeso - 50;
        } else {
            return 0;
        }
    }
    public static float calcularMulta(float valorExcesso) {
        return valorExcesso * 4;
    }
}
