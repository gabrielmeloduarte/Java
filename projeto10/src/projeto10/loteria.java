package projeto10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class loteria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> loterias = new ArrayList<Integer>();

		int qtdeNumeros;

		System.out.println("Quantos n�meros deseja adicionar ao bilhente ? ");
		qtdeNumeros = sc.nextInt();

		System.out.println("--------------------------------");

		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero do sorteio: ");
			loterias.add(sc.nextInt());
		}

		System.out.println("--------------------------------");

		System.out.println("N�meros escolhidos ");
		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print(loterias.get(i) + " - ");
		}
		System.out.println("\n--------------------------------");

		System.out.println("N�meros sorteados");
		Random sorteio = new Random();
		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print((sorteio.nextInt(60)) + " - ");
		}
		System.out.println("\n");
		sc.close();


	}

}
