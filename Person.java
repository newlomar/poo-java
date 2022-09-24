/* 4) Implemente uma classe que receba do teclado e imprima seu nome, sobrenome e idade. */

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String primeiroNome;
		String ultimoNome;
		int idade;
		
		System.out.printf("Digite seu primeiro nome: ");
		primeiroNome = sc.next();
		System.out.printf("Digite seu ultimo nome: ");
		ultimoNome = sc.next();
		System.out.printf("Digite sua idade: ");
		idade = sc.nextInt();
		sc.close();
		
		System.out.printf("Voce se chama %s %s e voce tem %d anos de idade.", primeiroNome, ultimoNome, idade);
	}

}
