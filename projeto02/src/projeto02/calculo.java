package projeto02;
import javax.swing.JOptionPane;

public class calculo {

	public static void main(String[] args) {

		double raio,area;
		
		String dado;
		
		dado = JOptionPane.showInputDialog("Digite o valor do raio");
		raio = Double.parseDouble(dado);
		area = 3.1415*raio*raio;
		JOptionPane.showMessageDialog(null,"O valor da area da circunferencia é .: "+area);
	}

}
