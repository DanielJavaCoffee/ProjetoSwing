package Tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Janela.JanelaPadrao;
import OuvintesDeTelas.OuvinteTelaDeCadastroCliente;

public class TelaDeCadastroCliente extends JanelaPadrao {
	
	OuvinteTelaDeCadastroCliente ouvinte = new OuvinteTelaDeCadastroCliente(this);
		
	private JTextField campoNome;
	private JTextField campoData;
	private JTextField campoEmail;
	private JButton botaoVoltar;
	private JButton botaoSalvar;

	public TelaDeCadastroCliente(String titulo) throws ParseException {
		super(titulo);
		adicionarTitulo();
		adicionarJLabel();
		adicionarCampo();
		adicionarBotaoVoltar();
		adicionarBotaoSalvar();
		setVisible(true);
	}
	
	private void adicionarTitulo() {
		
		JLabel titulo =  new JLabel("CADASTRO DE CLIENTE", JLabel.CENTER);
		titulo.setBounds(0,0,600,30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.gray);
		add(titulo);
	}
	
	private void adicionarJLabel() {
		
		JLabel nomeCliente = new JLabel("Nome Da Pessoa: ");
		nomeCliente.setBounds(20, 60, 140, 30);
		add(nomeCliente);
		
		JLabel numeroTelefone = new JLabel("Numero De Telefone: ");
		numeroTelefone.setBounds(20, 120, 140, 30);
		add(numeroTelefone);
		
		JLabel email = new JLabel("Email: ");
		email.setBounds(20, 180, 140, 30);
		add(email);
	}
	
	private void adicionarCampo() throws ParseException {
		
		campoNome = new JTextField();
		campoNome.setBounds(200, 60, 200, 30);
		add(campoNome);
		
		campoData = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		campoData.setBounds(200, 120, 200, 30);
		add(campoData);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(200, 180, 200, 30);
		add(campoEmail);
				
	}
	
	private void adicionarBotaoVoltar() {
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(20, 500, 100, 30);
		botaoVoltar.addActionListener(voltar());
		add(botaoVoltar);
	}
	
	public ActionListener voltar() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedVoltar(e,"Voltar");
				
			}
		};
	}
	
	private void adicionarBotaoSalvar() {
		
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(450, 500, 100, 30);
		botaoSalvar.addActionListener(salvar());
		add(botaoSalvar);
	}
	
	public ActionListener salvar() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedSalvar(e,"Salvar");
				
			}
		};
	}
		
	public JTextField getCampoNome() {
		return campoNome;
	}
	
	public JTextField getCampoData() {
		return campoData;
	}
	
	public JTextField getCampoEmail() {
		return campoEmail;
	}
	
	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}
	
	public JButton getBotaoSalvar() {
		return botaoSalvar;
	}
	
	
 

	
	
	

}
