package Class;
public class Carro {

	private String marca;
	private int numeroDaPlaca;
	private int ano;
	private long id;

	public Carro() {
		
		this.id = System.currentTimeMillis();
	}
	
	public Carro(String marca, int numeroDaPlaca, int ano) {
		setMarca(marca);
		setNumeroDePlaca(numeroDaPlaca);
		setAno(ano);
		this.id = System.currentTimeMillis();
	}
	
	public String toString() {
		return "marca: " + this.marca + "\n" + "numero da placa: " + this.numeroDaPlaca +  "\n" + "ano " + this.ano;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumeroDaPlaca() {
		return numeroDaPlaca;
	}

	public int getAno() {
		return ano;
	}

	public long getId() {
		return id; // não vai possuir o método set, pois não queremos modificar o id do carro.
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setNumeroDePlaca(int numeroDePlaca) {
		this.numeroDaPlaca = numeroDePlaca;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
