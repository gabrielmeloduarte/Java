package projeto08;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class usuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numero = new ArrayList<Integer>();
		int totalInteiros;
		System.out.println("Quantos n�mero deseja adicionar a lista ? ");
		totalInteiros = sc.nextInt();

		for (int i = 0; i < totalInteiros; i++) {
			System.out.println("Digite o " + (i + 1) + "�" + " n�mero: ");
			numero.add(sc.nextInt());
		}

		Collections.sort(numero);
		System.out.println("N�meros ordenados em ordem crecente: ");
		for (int i = 0; i < totalInteiros; i++) {
			System.out.print(numero.get(i) +" - ");
		}

		sc.close();

	}

}
