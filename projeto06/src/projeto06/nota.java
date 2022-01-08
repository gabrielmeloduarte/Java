package projeto06;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {

		double nota;
		
		String conceito =null;
		
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Insira uma nota de 0 a 10 para gerar o conceito");	   
		nota = entrada.nextDouble();
		if((nota >=0)&&(nota <= 2)) conceito="E";
		if((nota >=2)&&(nota <= 4)) conceito="D";
		if((nota >=4)&&(nota <= 6)) conceito="C";
		if((nota >=6)&&(nota <= 8)) conceito="B";
		if((nota >=8)&&(nota <= 10)) conceito="A";
		System.out.println ("Conceito "+conceito);
	}

}
