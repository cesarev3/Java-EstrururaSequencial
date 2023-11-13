import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Quantos reais você ganha por hora?");
            System.out.print("> ");
            float valorHora = entrada.nextFloat();

            System.out.println("Quantas horas trabalhadas este mês?");
            System.out.print("> ");
            float horasTrabalhadas = entrada.nextFloat();

            if (valorHora < 0 || horasTrabalhadas < 0) {
                throw new RuntimeException("Os valores devem ser positivos");
            }

            float salarioBruto = calcularSalarioBruto(valorHora,
                    horasTrabalhadas);
            float descontoIR = calcularIR(salarioBruto);
            float descontoINSS = calcularINSS(salarioBruto);
            float descontoSindicato = calcularSindicato(salarioBruto);
            float salarioLiquido = calcularSalarioLiquido(salarioBruto,
                    descontoIR, descontoINSS, descontoSindicato);

            System.out.printf("Salario bruto: R$ %.2f\n", salarioBruto);
            System.out.print("Desconto IR (11%): R$ ");
            System.out.printf("%.2f\n", descontoIR);
            System.out.print("Desconto INSS (8%): R$ ");
            System.out.printf("%.2f\n", descontoINSS);
            System.out.print("Desconto Sindicato (5%): R$ ");
            System.out.printf("%.2f\n", descontoSindicato);
            System.out.printf("Salario líquido: R$ %.2f\n", salarioLiquido);
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
    public static float calcularSalarioBruto(float horaValor,
                                             float horaQuantidade) {
        return horaValor * horaQuantidade;
    }
    public static float calcularIR(float valorBruto) {
        return (float)(valorBruto * 0.11);
    }
    public static float calcularINSS(float valorBruto) {
        return (float)(valorBruto * 0.08);
    }
    public static float calcularSindicato(float valorBruto) {
        return (float)(valorBruto * 0.05);
    }
    public static float calcularSalarioLiquido(float valorBruto,
                                               float valorIR,
                                               float valorINSS,
                                               float valorSindicato) {
        return valorBruto - valorIR - valorINSS - valorSindicato;
    }
}
