package projeto14;

import java.util.Scanner;

public class vetores {
	

	public static void main(String[] args) {

int [][] matriz = new int [2][2];
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("MatrizM[2][2]\n");
				
		
		for(int linha=0; linha<2; linha++) {
		for (int coluna=0; coluna<2; coluna++) {
			System.out.printf("Insira o Elemento M [%d][%d] :",linha+1,coluna+1);
			matriz[linha][coluna]=entrada.nextInt();
			
		}
       
		} 
       
		System.out.println("\nA Matriz Ficou : \n");
		for(int linha=0 ; linha< 2 ;linha++) {
			for(int coluna=0 ;coluna<2;coluna++) {
				System.out.printf("\t %d  \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
	}

}
