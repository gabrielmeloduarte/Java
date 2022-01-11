package projeto16;
import javax.swing.JOptionPane; 
public class homens {

	public static void main(String[] args) {

		String nome = null; 

		int idade = 0; 

		String sexo = null; 

		 

		for (int i = 0; i < 5; i++) { 

		nome = JOptionPane.showInputDialog("Digite o seu nome: "); 

		sexo = JOptionPane.showInputDialog("Gênero? M ou F: "); 

		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? ")); 

		 

		if (sexo.equals("M") || sexo.equals("m") && idade > 21) { 

		 

		System.out.println("Nome: " + nome + " Idade: " + idade); 

		 

		} else { 

		 

		System.out.println("Nenhuma das pessoas digitadas são maior de idade."); 

		 

		} 

		} 
	}

}
