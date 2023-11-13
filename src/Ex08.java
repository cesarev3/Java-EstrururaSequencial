import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Quantos reais você ganha por hora?");
            System.out.print("> ");
            float valorHora = entrada.nextFloat();

            System.out.println("Quantas horas trabalhadas este mês?");
            System.out.print("> ");
            float quantidadeHoras = entrada.nextFloat();

            if (valorHora < 0 || quantidadeHoras < 0) {
                throw new RuntimeException("Os valores devem ser positivos");
            }

            float salario = calcularSalario(valorHora, quantidadeHoras);
            System.out.printf("Salario deste mês: R$ %.2f", salario);
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
    public static float calcularSalario(float horaValor,
                                        float horaQuantidade) {
        return horaValor * horaQuantidade;
    }
}
