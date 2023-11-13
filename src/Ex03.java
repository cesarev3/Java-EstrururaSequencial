import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite um primeiro número");
            System.out.print("> ");
            float n1 = entrada.nextFloat();

            System.out.println("Digite um segundo número");
            System.out.print("> ");
            float n2 = entrada.nextFloat();

            float resultado = adicionar(n1, n2);
            System.out.println("A soma é igual a " + resultado);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("fim");
        }
    }
    public static float adicionar(float numero1, float numero2) {
        return numero1 + numero2;
    }
}
