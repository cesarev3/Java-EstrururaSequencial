import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);

    System.out.println("Digite um número");
    System.out.print("> ");
    validarFloat(entrada);

    float numero = entrada.nextFloat();
    System.out.println("O número informado foi " + numero);

    entrada.close();
    }

    private static void validarFloat(Scanner entrada) {
        while (!entrada.hasNextFloat()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
