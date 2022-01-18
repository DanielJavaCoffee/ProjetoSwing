package Class;
import java.util.ArrayList;

public class Central {
	
	private ArrayList<Carro> todosOsCarros = new ArrayList<>();
	private ArrayList<Pessoa> todasAsPessoas = new ArrayList<>();
	
	public ArrayList<Carro> getTodosOsCarros(){
		return todosOsCarros;
	}
	public ArrayList<Pessoa> todasAsPessoas(){
		return todasAsPessoas;
	}
	
	public boolean cadastrarCliente(Pessoa pessoa) {
		for(int i = 0; i < todasAsPessoas.size(); i++) {
			if(todasAsPessoas.get(i).getEmail().equals(pessoa.getEmail())) {
				return false;
			} 
		}
		todasAsPessoas.add(pessoa);
		return true;
	}
	
	public boolean excluirCleinte(Pessoa pessoa) {
		if(todasAsPessoas.contains(pessoa)) {
			todasAsPessoas.remove(pessoa);
			return true;
		}
		return false;
	}
	
	public Pessoa recuperarClintePorEmail(String email) {
		for(int i = 0; i < todasAsPessoas.size(); i++) {
			if(todasAsPessoas.get(i).getEmail().equals(email)) {
				return todasAsPessoas.get(i);
			}
		}
		return null;
	}
	
	public boolean cadastarCarro(Carro carro) {
		Carro carros = recuperarCarroPorID(carro.getId());
		if(carros != null) {
			return false;
		} 
		todosOsCarros.add(carro);
		return true;
	}
	
	public Carro recuperarCarroPorID(long id) {
		for(int i = 0; i < todosOsCarros.size(); i++) {
			if(todosOsCarros.get(i).getId() == id) {
				return todosOsCarros.get(i);
			}		
		}
		return null;
	}
	
	public boolean excluirCarro(Carro carro) {
		if(todosOsCarros.contains(carro)) {
			todosOsCarros.remove(carro);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
