package OuvintesDeTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import Tela.TelaCadastroDeCarro;
import Tela.TelaDeCadastroCliente;
import Tela.TelaDeMenu;
import Tela.TelaListarCarro;

public class OuvinteTelaDeMenu implements ActionListener {

	private TelaDeMenu telaDeMenu;

	public TelaDeMenu getTelaDeMenu() {
		return telaDeMenu; 
	}
	
	public OuvinteTelaDeMenu(TelaDeMenu tela) {
		this.telaDeMenu = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public void actionPerformedCarro(ActionEvent e, String carro) {
		
		if(carro.equals("Cadastrar Carro")) {
			new TelaCadastroDeCarro("CADASTRAMENTO DE CARRO");
			telaDeMenu.setVisible(false);
		}		
		
	}

	public void actionPerformedCliente(ActionEvent e, String cliente) throws ParseException {
		
		if(cliente.equals("Cadastrar Cliente")) {
			new TelaDeCadastroCliente("");
			telaDeMenu.setVisible(false);
		}
	}

	public void actionPerformedListarCarro(ActionEvent e, String listarCarro) {
		
		if(listarCarro.equals("Listar Carro")) {
			new TelaListarCarro("");
			telaDeMenu.setVisible(false);
		}
	}

}
