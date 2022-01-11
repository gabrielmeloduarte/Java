package projeto11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorteio {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i <= 60; i++) {
			numeros.add(i);
		}

		Collections.shuffle(numeros);
		for (int i = 1; i <= 6; i++) {
			System.out.print(numeros.get(i) + " - ");
		}
		System.out.println("\n");

		List<Integer> escolhidos = numeros.subList(1, 7);

		Collections.sort(escolhidos);

		System.out.print("Os números sorteados foram: ");
		for (Integer escolhido : escolhidos) {
			if (escolhido < 10) {

				CharSequence a = "0" + escolhido + " - ";
				System.out.print(a);

			} else {

				CharSequence a = escolhido + " - ";
				System.out.print(a);

			}
		}

	}

}
