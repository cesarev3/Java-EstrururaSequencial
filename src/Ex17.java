import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex17 {
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

            float litros = areaPintura / 6;
            int latas = calcularQuantidadeLatas(litros);
            float valorLatas = calcularValorCompra(latas, 0, 0, 0);
            int galoes = calcularQuantidadeGaloes(litros);
            float valorGaloes = calcularValorCompra(0, galoes, 0, 0);
            int mistoLatas = calcularTotalLatasMisto(litros);
            int mistoGaloes = calcularTotalGaloesMisto(litros);
            float valorMisto = calcularValorCompra(0, 0, mistoLatas,
                    mistoGaloes);

            System.out.printf("Litros necessários: %.2f\n", litros);
            System.out.println("Apenas latas (18l): " + latas);
            System.out.printf("Valor total latas: R$ %.2f\n", valorLatas);

            System.out.println("\nApenas galões (3,6l): " + galoes);
            System.out.printf("Valor total galões: R$ %.2f\n", valorGaloes);

            System.out.println("\nCombinação de latas e galões");
            System.out.println("Latas de 18l: " + mistoLatas);
            System.out.println("Galões de 3,6l: " + mistoGaloes);
            System.out.printf("Valor total galões: R$ %.2f\n", valorMisto);
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
    public static int calcularQuantidadeLatas(float totalLitros) {
        return (int)Math.ceil(totalLitros / 18);
    }
    public static int calcularQuantidadeGaloes(float totalLitros) {
        return (int)Math.ceil(totalLitros / 3.6);
    }
    public static int calcularTotalLatasMisto(float totalLitros) {
        double calculoGaloes = (totalLitros * 1.1) / 3.6;
        return (int)calculoGaloes / 5;
    }
    public static int calcularTotalGaloesMisto(float totalLitros) {
        double calculoGaloes = (totalLitros * 1.1) / 3.6;
        int totalLatas = (int)(calculoGaloes / 5);
        return (int)Math.ceil(calculoGaloes - (totalLatas * 5));
    }
    public static float calcularValorCompra(int totalLatas,
                                            int totalGaloes,
                                            int totalMistoLatas,
                                            int totalMistoGaloes) {
        return (totalLatas * 80) + (totalGaloes * 25) + (totalMistoLatas * 80)
                + (totalMistoGaloes * 25);
    }
}
