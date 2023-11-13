import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite um valor em metros");
            System.out.print("> ");
            float metros = entrada.nextFloat();

            float centimetros = converterMetros(metros);
            System.out.printf(Locale.US,
                    "%.2f metros equivale a %.2f centímetros"
                    ,metros, centimetros);
            entrada.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
            System.out.println("\nfim");
        }
    }
    public static float converterMetros(float valorMetros) {
        return valorMetros * 100;
    }
}
