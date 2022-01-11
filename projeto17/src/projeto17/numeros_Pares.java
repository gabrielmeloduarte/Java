package projeto17;
import javax.swing.JOptionPane; 
public class numeros_Pares {

	public static void main(String[] args) {

		   int soma = 0; 

		    int contador = 26; 

		    while(contador <= 200) { 

		        soma += contador; 

		        contador += 2; 

		    } 

		    JOptionPane.showMessageDialog(null, "A soma dos números pares entre 25 e 200 é: " + soma); 
	}

}
