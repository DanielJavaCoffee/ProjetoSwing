package Tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JLabel;

import Janela.JanelaPadrao;
import OuvintesDeTelas.OuvinteTelaDeMenu;

public class TelaDeMenu extends JanelaPadrao {
	
	OuvinteTelaDeMenu ouvinte = new OuvinteTelaDeMenu(this);
	
	private JButton botaoCadastroDeCliente;
	private JButton botaoCadastroDeCarro;
	private JButton botaoListarCarro;

	public TelaDeMenu(String titulo) {
		super(titulo);
		adicionarTitulo();
		adicionarBotaoCadastroDeCleinte();
		adicionarBotaoCadastroDeCarro();
		adicionarBotaoListarCarro();
		setVisible(true);

	}

	private void adicionarTitulo() {

		JLabel titulo = new JLabel("TELA DE MENU", JLabel.CENTER);
		titulo.setBounds(0, 0, 600, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.gray);
		add(titulo);

	}
	
	private void adicionarBotaoCadastroDeCleinte() {
		
		botaoCadastroDeCliente = new JButton("Cadastrar Cliente"); // esquerda para direita, B, C, comprimento, altura
		botaoCadastroDeCliente.setBounds(20, 80, 150, 30);
		botaoCadastroDeCliente.addActionListener(cliente());
		add(botaoCadastroDeCliente);
	
	}
	
	public ActionListener cliente() {
		
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ouvinte.actionPerformedCliente(e, "Cadastrar Cliente");
				} catch (ParseException e1) {
					e1.printStackTrace();
				}		
			}
		}; 				
	}
	
	private void adicionarBotaoCadastroDeCarro() {
		
		botaoCadastroDeCarro = new JButton("Cadastrar Carro");
		botaoCadastroDeCarro.setBounds(20, 160, 150, 30);
		botaoCadastroDeCarro.addActionListener(carro());
		add(botaoCadastroDeCarro);
	}	
	
	public ActionListener carro() {
		
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedCarro(e, "Cadastrar Carro");
							
			}
		};
	}
	
	public void adicionarBotaoListarCarro() {
		
		botaoListarCarro = new JButton("Listar Carros");
		botaoListarCarro.setBounds(20, 240, 150, 30);
		botaoListarCarro.addActionListener(listarCarro());
		add(botaoListarCarro);
	}
	
	public ActionListener listarCarro() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedListarCarro(e, "Listar Carro");
			}
		};
	}
	
	public JButton geBotaoCadastroDeCliente() {
		return botaoCadastroDeCliente;
	}
	
	public JButton getBotaoCadastroDeCarro() {
		return botaoCadastroDeCarro;
	}
	
	public JButton getBotaoListarCarro() {
		return botaoListarCarro;
	}

}
