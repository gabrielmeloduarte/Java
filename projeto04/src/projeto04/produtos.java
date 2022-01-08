package projeto04;
import javax.swing.JOptionPane;

public class produtos {

	public static void main(String[] args) {

		double preco;
		
		String dado;
		
		dado = JOptionPane.showInputDialog("Digite o valor do Preco");
		preco = Integer.parseInt(dado);
		if(preco < 100) JOptionPane.showMessageDialog(null,"O valor continua o mesmo R$"+preco);
		else if(preco > 300) {
			preco *=1.18; 
			JOptionPane.showMessageDialog(null,"O valor do produto é R$"+preco);
		}else {
			preco *=1.12; 
			JOptionPane.showMessageDialog(null,"O valor do produto é R$"+preco);
		}
	}

}
