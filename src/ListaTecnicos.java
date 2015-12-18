import java.util.ArrayList;
import java.util.List;

public class ListaTecnicos extends Tecnico{
	private List<Tecnico> listaDeTecnicos;
	public ListaTecnicos(){
		super();
		listaDeTecnicos = new ArrayList<Tecnico>();
	}
	public void inserir(Tecnico tecnico){
		int elemento=listaDeTecnicos.indexOf(tecnico);
		if (elemento!=-1)
			System.out.println("Tecnico jah estah presente na lista");
		else{
			listaDeTecnicos.add(tecnico);
		}
	}
	public void consultar (Tecnico Tecnico){
		int elemento=listaDeTecnicos.indexOf(Tecnico);
		if (elemento==-1)
			System.out.println("Tecnico nao estah presente na lista");
		else{
			System.out.println("nome: " + listaDeTecnicos.get(elemento).getNome() +
					"matricula: " + listaDeTecnicos.get(elemento).getMatricula() ) ;
		}
	}
	public void remover(Tecnico Tecnico){
		int elemento=listaDeTecnicos.indexOf(Tecnico);
		if (elemento==-1)
			System.out.println("Tecnico nao estah presente na lista");
		else {
			listaDeTecnicos.remove(Tecnico);
		}

	}
	public void consultarTecnicos(){
		for (int i=0;i<listaDeTecnicos.size();i++){
			consultar(listaDeTecnicos.get(i));
		}
	}
	public boolean existeTecnico(Tecnico Tecnico){
		int elemento=listaDeTecnicos.indexOf(Tecnico);
		if (elemento==-1)
			return false;
		return true;
	}

}