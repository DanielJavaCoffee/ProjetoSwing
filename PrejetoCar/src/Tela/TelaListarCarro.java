package Tela;

import java.awt.Color;

import javax.swing.JLabel;

import Janela.JanelaPadrao;

public class TelaListarCarro extends JanelaPadrao{

	public TelaListarCarro(String titulo) {
		super(titulo);
		adicionarTitulo();
		
		setVisible(true);
	}
	
	private void adicionarTitulo() {
		
		JLabel titulo = new JLabel("Listar Carro", JLabel.CENTER);
		titulo.setBounds(0, 0, 600, 30);
		titulo.setBackground(Color.gray);
		titulo.setOpaque(true);
		add(titulo);
	}

}
