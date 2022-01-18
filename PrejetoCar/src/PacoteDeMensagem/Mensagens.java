package PacoteDeMensagem;

import javax.swing.JOptionPane;

public class Mensagens {
	
	public static void carroNaoEncontrado() {
		JOptionPane.showMessageDialog(null, "Carro não encontrado");
	}
	
	public static void pessoaNaoEncontrada() {
		JOptionPane.showMessageDialog(null, "Pessoa não encontrado");
	}
	
	public static void tratamentoDeErro() {
		JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente!");
	}
	
	public static void campoVazio() {
		JOptionPane.showMessageDialog(null, "Preenha os campo vazios!");
	}
	
	public static void SalvoComSucesso() {
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
	}

	
}
