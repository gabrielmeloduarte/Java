package projeto01;

import java.util.Scanner;


public class media {

	public static void main(String[] args) {
		
		double n1,n2,n3,n4,n5,media;
		
		Scanner entrada = new Scanner(System.in); 
	    System.out.println("Digite o 1� numero");
	    n1 = entrada.nextInt();
	    System.out.println("Digite o 2� numero");
	    n2 = entrada.nextInt();
	    System.out.println("Digite o 3� numero");
	    n3 = entrada.nextInt();
	    System.out.println("Digite o 4� numero");
	    n4 = entrada.nextInt();
	    System.out.println("Digite o 5� numero");
	    n5 = entrada.nextInt();
	    media = (n1+n2+n3+n4+n5)/5;
	    System.out.println("O valor da m�dia � .: "+media);
	}

}
