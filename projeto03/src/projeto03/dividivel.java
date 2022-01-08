package projeto03;
import javax.swing.JOptionPane;

public class dividivel {

	public static void main(String[] args) {
		
		int numero;
		
		String dado;
		
		dado = JOptionPane.showInputDialog("Digite um valor");
		numero = Integer.parseInt(dado);
		if(numero%3 == 0) {
			JOptionPane.showMessageDialog(null,"O número "+numero+" é divisível por 3");
	}
		
	}
}
