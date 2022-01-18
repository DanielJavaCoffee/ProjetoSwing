package OuvintesDeTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Class.Carro;
import Class.Central;
import Class.Persistencia;
import PacoteDeMensagem.Mensagens;
import Tela.TelaCadastroDeCarro;
import Tela.TelaDeMenu;

public class OuvinteTelaDeCadastroCarro implements ActionListener {
	
	
	Persistencia persistencia = new Persistencia();
	Central central = persistencia.recuperarCentral();
	
	private TelaCadastroDeCarro telaCadastroDeCarro;
	
	public TelaCadastroDeCarro getTelaCadastroDeCarro() {
		return telaCadastroDeCarro;
	}
	
	public  OuvinteTelaDeCadastroCarro(TelaCadastroDeCarro tela) {
		this.telaCadastroDeCarro = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public void actionPerformedVoltar(ActionEvent e, String voltar) {
		
		if(voltar.equals("Voltar")) {
			new TelaDeMenu("TELA DE MENU");
			telaCadastroDeCarro.setVisible(false);
		}
	}

	public void actionPerformedSalvar(ActionEvent e, String salvar) {
			
		String marcaDoCarro = telaCadastroDeCarro.getCampoMarca().getText();
		int numeroDoCarro = Integer.parseInt(telaCadastroDeCarro.getCampoNumero().getText());
		int AnoDoCarro = Integer.parseInt(telaCadastroDeCarro.getCampoAno().getText());
			
		if(marcaDoCarro.isBlank()) {
			Mensagens.campoVazio();
			
		} else {
			
			Carro carro = new Carro(marcaDoCarro, numeroDoCarro, AnoDoCarro);
			
			central.cadastarCarro(carro);
			Mensagens.SalvoComSucesso();
			JOptionPane.showMessageDialog(telaCadastroDeCarro, carro.toString());
		
		}			
	}
}
