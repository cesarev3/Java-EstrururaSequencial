import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite um número");
            System.out.print("> ");
            float numero = entrada.nextFloat();

            System.out.println("O número informado foi " + numero);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("fim");
        }
    }
}
