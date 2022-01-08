package projeto09;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class compras {
	

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> valores = new ArrayList<Double>();

		int qtdeValores;
		
		double somaTotal = 0;

		System.out.println("Quantos valores deseja adicionar a lista de compra ? ");
		qtdeValores = sc.nextInt();

		System.out.println("------------------------");

		for (int i = 0; i < qtdeValores; i++) {
			System.out.print("Digite o " + (i + 1) + "º" + " valor: ");
			valores.add(sc.nextDouble());
		}

		System.out.println("------------------------");

		for (int i = 0; i < qtdeValores; i++) {

			System.out.println("O valor digitado foi " + valores.get(i));
		}

		for (int i = 0; i < valores.size(); i++) {
			somaTotal += valores.get(i);
		}
		System.out.println("------------------------");
		System.out.printf("Soma dos valor: R$ %.2f", Math.ceil(somaTotal));

		sc.close();

	}

}
