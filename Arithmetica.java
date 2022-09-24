import java.util.Scanner;
import java.util.Locale;

public class Arithmetica {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		sc.close();
		
		int soma = n1 + n2;
		int multiplicacao = n1 * n2;
		int subtracao = n1 - n2;
		float divisao = (float)1 / (float)n2;
		
		System.out.println("Resultados:\n");
		System.out.printf("Soma: %d\n", soma);
		System.out.printf("Multiplicacao:%d\n", multiplicacao);
		System.out.printf("Subtracao:%d\n", subtracao);
		System.out.printf("Divisao: %.2f", divisao);
	}

}
