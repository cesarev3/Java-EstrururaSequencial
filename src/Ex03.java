import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite um primeiro número");
        System.out.print("> ");
        validarFloat(entrada);
        float n1 = entrada.nextFloat();

        System.out.println("Digite um segundo número");
        System.out.print("> ");
        validarFloat(entrada);
        float n2 = entrada.nextFloat();

        float resultado = adicionar(n1, n2);
        System.out.println("A soma é igual a " + resultado);

        entrada.close();
    }

    public static float adicionar(float numero1, float numero2) {
        return numero1 + numero2;
    }

    private static void validarFloat(Scanner entrada) {
        while (!entrada.hasNextFloat()) {
            System.out.print("Entrada inválida. Digite novamente\n> ");
            entrada.next();
        }
    }
}
