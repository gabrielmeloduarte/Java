package projeto19;
import javax.swing.JOptionPane; 
public class valo_H {

	public static void main(String[] args) {

		double h = 0; 

		 

		int numero; 

		 

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")); 

		 

		for (int i = 1; i <= numero; i++) { 

		h = h + (double) 1 / i; 

		System.out.println(h); 

		} 
	}

}
