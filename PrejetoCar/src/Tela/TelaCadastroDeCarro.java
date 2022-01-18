package Tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Janela.JanelaPadrao;
import OuvintesDeTelas.OuvinteTelaDeCadastroCarro;

public class TelaCadastroDeCarro extends JanelaPadrao{
	
	OuvinteTelaDeCadastroCarro ouvinte = new OuvinteTelaDeCadastroCarro(this);
	
	private JTextField campoMarca;
	private JTextField campoNumero;
	private JTextField campoAno;
	private JButton botaoVoltar;
	private JButton botaoSalvar;

	public TelaCadastroDeCarro(String titulo) {
		super(titulo);
		adicionarTitulo();
		adicionarJLabel();
		adicionarCampoDeTexto();
		adicionarBotaoVoltar();
		adicionarBotaoSalvar();
		setVisible(true);
	}
	
	
	private void adicionarTitulo() {
		JLabel titulo = new JLabel("CADASTRO DE CARRO", JLabel.CENTER);
		titulo.setBounds(0, 0, 600, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.gray);
		add(titulo);
	}
	
	private void adicionarJLabel() {
		
		JLabel marcarDoCarro = new JLabel("Marca Do Carro:");
		marcarDoCarro.setBounds(20, 60, 130, 30);
		add(marcarDoCarro);
		
		JLabel numeroDaPlaca = new JLabel("Numero Da Placa:");
		numeroDaPlaca.setBounds(20, 100, 130, 30);
		add(numeroDaPlaca);
		
		JLabel anoDoCarro = new JLabel("Ano Do Carro:");
		anoDoCarro.setBounds(20, 140, 130, 30);
		add(anoDoCarro);
		
		
	}
	
	private void adicionarCampoDeTexto() {
		
		campoMarca = new JTextField();
		campoMarca.setBounds(200, 60, 200, 30);
		add(campoMarca);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(200, 100, 200, 30);
		add(campoNumero);
		
		try {
			campoAno = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
		campoAno.setBounds(200, 140, 200, 30);
		add(campoAno);
		
	}
	
	public void adicionarBotaoVoltar() {
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(20, 500, 100, 30);
		botaoVoltar.addActionListener(voltar());
		add(botaoVoltar);
	}
	
	public ActionListener voltar() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedVoltar(e, "Voltar");
				
			}
		};
	}
	
	
	public void adicionarBotaoSalvar() {
		
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(450, 500, 100, 30);
		botaoSalvar.addActionListener(salvar());
		add(botaoSalvar);
	}
	
	public ActionListener salvar() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ouvinte.actionPerformedSalvar(e, "Salvar");
			}
		};
	}
	
	public JTextField getCampoMarca() {
		return campoMarca;
	}
	public JTextField getCampoNumero() {
		return campoNumero;
	}
	public JTextField getCampoAno() {
		return campoAno;
	}

}
