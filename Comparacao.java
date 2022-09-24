/* 2) Implemente a Classe Comparacao que receba dois números inteiros do teclado e apresente se eles
são iguais, se algum é maior ou menor do que o outro. */

import java.util.Scanner;
import java.util.Locale;

public class Comparacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		sc.close();
	
		if (n1 == n2) {
			System.out.printf("%d é igual a %d", n1, n2);
		}
		else {
			System.out.printf("%d é maior que %d", Math.max(n1, n2), Math.min(n1, n2));
		}
		
	}

}
