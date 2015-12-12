import java.util.ArrayList;
import java.util.List;

public class ListaClientes extends Cliente{
	private List<Cliente> listaDeClientes;
	public ListaClientes(){
		super();
		listaDeClientes = new ArrayList<Cliente>();
	}
	public void inserir(Cliente cliente){
		int elemento=listaDeClientes.indexOf(cliente);
		if (elemento!=-1)
			System.out.println("Cliente jah estah presente na lista");
		else{
			listaDeClientes.add(cliente);
		}
	}
	public void consultar (Cliente cliente){
		int elemento=listaDeClientes.indexOf(cliente);
		if (elemento==-1)
			System.out.println("Cliente nao estah presente na lista");
		else{
			listaDeClientes.get(elemento).consultarDados();
		}
	}
	public void remover(Cliente cliente){
		int elemento=listaDeClientes.indexOf(cliente);
		if (elemento==-1)
			System.out.println("Cliente nao estah presente na lista");
		else {
			listaDeClientes.remove(cliente);
		}
			
	}
	public void consultarClientes(){
		for (int i=0;i<listaDeClientes.size();i++){
			consultar(listaDeClientes.get(i));
		}
	}

}
