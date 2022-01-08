package projeto01;

import java.util.Scanner;


public class media {

	public static void main(String[] args) {
		
		double n1,n2,n3,n4,n5,media;
		
		Scanner entrada = new Scanner(System.in); 
	    System.out.println("Digite o 1º numero");
	    n1 = entrada.nextInt();
	    System.out.println("Digite o 2º numero");
	    n2 = entrada.nextInt();
	    System.out.println("Digite o 3º numero");
	    n3 = entrada.nextInt();
	    System.out.println("Digite o 4º numero");
	    n4 = entrada.nextInt();
	    System.out.println("Digite o 5º numero");
	    n5 = entrada.nextInt();
	    media = (n1+n2+n3+n4+n5)/5;
	    System.out.println("O valor da média é .: "+media);
	}

}
