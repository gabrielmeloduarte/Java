package projeto18;
import javax.swing.JOptionPane; 
public class sequencia {

	public static void main(String[] args) {

 
		int n1, n2, n3; 

		 

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: ")); 

		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: ")); 

		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: ")); 

		  

		for (int i = n1; i <=n2; i+=n3) { 

		System.out.println(i); 

		} 
	}

}
