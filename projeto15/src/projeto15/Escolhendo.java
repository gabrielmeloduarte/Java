package projeto15;
import java.util.Scanner;

public class Escolhendo {

	public static void main(String[] args) {

		int matriz[][];
        int det;
        Scanner entrada = new Scanner(System.in);
        int linha=0, coluna =0;

        System.out.println("Informe a quantidade de linhas da matriz");
        linha = entrada.nextInt();

        System.out.println("Informe a quantidade de colunas da matriz");
        coluna = entrada.nextInt();

        matriz = new int[linha][coluna];

         for(int x=0; x < linha; x++){
            for(int y=0; y < coluna; y++){
                System.out.println("matriz ["+x+"]["+y+"] =");
                matriz[x][y]= entrada.nextInt();
            }
        }

        for(int x=0; x < linha; x++){
 
            for(int y=0; y < coluna; y++){
			}
		}
		

		det =     matriz[0][0] * matriz[1][1] - matriz[0][1] *matriz[1][0]  ;
				 
		System.out.println("O determinante dessa matriz é: " + det);

	}

}
