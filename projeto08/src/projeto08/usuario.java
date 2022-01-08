package projeto08;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class usuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numero = new ArrayList<Integer>();
		int totalInteiros;
		System.out.println("Quantos número deseja adicionar a lista ? ");
		totalInteiros = sc.nextInt();

		for (int i = 0; i < totalInteiros; i++) {
			System.out.println("Digite o " + (i + 1) + "º" + " número: ");
			numero.add(sc.nextInt());
		}

		Collections.sort(numero);
		System.out.println("Números ordenados em ordem crecente: ");
		for (int i = 0; i < totalInteiros; i++) {
			System.out.print(numero.get(i) +" - ");
		}

		sc.close();

	}

}
