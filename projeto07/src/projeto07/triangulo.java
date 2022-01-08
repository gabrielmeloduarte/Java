package projeto07;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class triangulo {

	public static void main(String[] args) {

		int a,b,c,maior,somaDasDuasArestas;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
		maior = -9999;
		somaDasDuasArestas = -9999;
		
		if(a>maior) {
			maior = a;
			somaDasDuasArestas = b+c;
		}
		if(b>maior) {
			maior = b;
			somaDasDuasArestas = a+c;
		}
		if(c>maior) {
			maior = c;
			somaDasDuasArestas = a+b;
		}
		
		//System.out.println(maior);
		if(maior < somaDasDuasArestas) {
			System.out.println("É Triangulo");
			
			/*
			 * equilátero (os três lados iguais),
			 *  isósceles (2 lados iguais) ou 
			 *  escalenos (três lados diferentes
			 */
			
			if((a==b)&&(b==c)) {
				System.out.println("equilatero");
			}else if((a==b)||(b==c)||(a==c)) {
				System.out.println("isoceles");
			}else {
				System.out.println("escaleno");
			}
			
		}else {
			System.out.println("Não É Triangulo");
		}
	}

}
