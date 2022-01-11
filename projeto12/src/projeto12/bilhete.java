package projeto12;

import java.util.Scanner;


public class bilhete {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Quanos números deseja apostar?: ");
		int n = numero.nextInt();

		if (n >= 6 && n <= 15) {
			int[] listaDeNumeros = new int[n];
			for (int i = 0; i < listaDeNumeros.length; i++) {

				if (n > 0 && n <= 60) {
					System.out.print((i + 1) + "º número:");
					listaDeNumeros[i] = (numero.nextInt());
				} else {
					System.out.println("Digite um número entre 1 a 60");
				}

			}
		} else {
			System.out.println("Números Inválido");
			return;
		}

		int[] lista = new int[6];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 61);

		}
		System.out.println("Os numeros sorteados foram:");
		for (int x = 0; x < lista.length; x++) {
			System.out.println(lista[x]);
		}

		if (n > 0 && n < 3) {
			System.out.println("Perdeu");
		}

		if (n == 4) {
			System.out.println("Quadra");
		}

		if (n == 5) {
			System.out.println("Quina");
		}
		if (n == 6) {
			System.out.println("Sena");
		}

	}

}
