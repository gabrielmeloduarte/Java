package projeto13;

import java.util.Scanner;

public class potenciação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de números que deseja: ");
		int n = sc.nextInt();

		int[] listaDeNumeros = new int[n];
		System.out.println("Digite os valores aqui: ");
	 	for (int i = 0; i < listaDeNumeros.length; i++) {

			listaDeNumeros[i] = (int) (sc.nextInt());
		}

		System.out.print("Lista de numeros selecionados para o bilhete: ");
		for (int t = 0; t < listaDeNumeros.length; t++) {
			System.out.println(Math.pow(t, 3));

		}
		sc.close();

	}

}
