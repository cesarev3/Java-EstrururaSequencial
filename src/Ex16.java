import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Tamanho da área para pintura em m²");
            System.out.print("> ");
            float areaPintura = entrada.nextFloat();

            if (areaPintura < 0) {
                throw new RuntimeException("O valor deve ser positivo");
            }

            int latas = calcularQuantidadeLatas(areaPintura);
            float valorCompra = calcularValorCompra(latas);

            System.out.println("Quantidade de latas: " + latas);
            System.out.printf("Valor total: R$ %.2f\n", valorCompra);
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
   public static int calcularQuantidadeLatas(float valorArea) {
        float litros = valorArea / 3;
        return (int)Math.ceil(litros / 18);
   }
   public static float calcularValorCompra(int totalLatas) {
        return totalLatas * 80;
   }
}
