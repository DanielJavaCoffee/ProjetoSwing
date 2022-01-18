package OuvintesDeTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Class.Central;
import Class.Persistencia;
import Class.Pessoa;
import PacoteDeMensagem.Mensagens;
import Tela.TelaDeCadastroCliente;
import Tela.TelaDeMenu;

public class OuvinteTelaDeCadastroCliente implements ActionListener {
	
	
	private TelaDeCadastroCliente telaDeCadastroCliente;
	
	Persistencia persistencia = new Persistencia();
	Central central = persistencia.recuperarCentral();
	
	public TelaDeCadastroCliente getTelaDeCadastroCliente() {
		return telaDeCadastroCliente;
	}
	
	public OuvinteTelaDeCadastroCliente(TelaDeCadastroCliente tela) {
		this.telaDeCadastroCliente = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public void actionPerformedVoltar(ActionEvent e, String voltar) {
		
		if(voltar.equals("Voltar")) {
			telaDeCadastroCliente.setVisible(false);
			new TelaDeMenu("TELA DE MENU");
		}
		
	}

	public void actionPerformedSalvar(ActionEvent e, String salvar) {
				
		if(salvar.equals("Salvar")) {
						
		 String nomeCliente = telaDeCadastroCliente.getCampoNome().getText();
		 String numeroDeTelefone = telaDeCadastroCliente.getCampoData().getText();
		 String emailCliente = telaDeCadastroCliente.getCampoEmail().getText();
		 
		 if(nomeCliente.isBlank() || numeroDeTelefone.isBlank() || emailCliente.isBlank()){
			 
			 Mensagens.campoVazio();
			 
		 } else {
			 
			 Pessoa pessoa = new Pessoa(nomeCliente, numeroDeTelefone, emailCliente);
			 central.cadastrarCliente(pessoa);
			 persistencia.salvarCentral(central);
			 JOptionPane.showMessageDialog(telaDeCadastroCliente,"Salvo com sucesso!");
			 JOptionPane.showMessageDialog(telaDeCadastroCliente, pessoa.toString() );
			 
		 } // end else
						
		} // end if
			
	} // end public void actionPerformedSalvar
}
