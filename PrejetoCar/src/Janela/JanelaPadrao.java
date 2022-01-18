package Janela;

import javax.swing.JFrame;

public class JanelaPadrao extends JFrame {

	public JanelaPadrao(String titulo) {

		setTitle(titulo);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

}
