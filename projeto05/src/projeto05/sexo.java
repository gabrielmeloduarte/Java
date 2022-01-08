package projeto05;
import javax.swing.JOptionPane;

public class sexo {

	public static void main(String[] args) {

		String dado;
		
		dado =  JOptionPane.showInputDialog("Digite \"M\" para masculino e \"F\" para feminino");
		if(dado.equals("M")||dado.equals("m")) JOptionPane.showMessageDialog(null,"Seja bem-vindo, Senhor!");			
		else if(dado.equals("F")||dado.equals("f"))  JOptionPane.showMessageDialog(null,"Seja bem-vindo, Senhora!");		

	}

}
