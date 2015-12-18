import java.util.ArrayList;
import java.util.List;


//TODO
public class Tecnico {
	private int matricula;
	private String nome;
	private String email;
	private String telefone;
	private String habilidade;
	private List<Servico> listaDeServicos; //pega o ID do servico
	
	public Tecnico(int matricula, String nome, String email, String telefone, String habilidade){
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		listaDeServicos = new ArrayList<Servico>();
	}
	
	public int getMatricula(){
		return matricula;
	}
	public String getNome(){
		return nome;
	}
	public String getEmail(){
		return email;
	}
	public String getTelefone(){
		return telefone;
	}
	public String getHabilidade(){
		return habilidade;
	}
	public List<Servico> getServicosSobTutela(){
		return listaDeServicos;
	}

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setHabilidade(String habilidade){
		this.habilidade = habilidade;
	}
	public void setMatricula(String telefone){
		this.telefone = telefone;
	}
	public void addServicoSobreTutela(Servico tutela){
		try{
			MaisDeDuasTutelasExceptionRun.adicionarTutela(listaDeServicos,tutela);
		}catch(MaisdeDuasTutelasException e){System.out.println("Ocorreu uma exception: "+ e);}	
	}
	public void limpaTutelas(){
		for (int i=0; i<listaDeServicos.size();i++){
			listaDeServicos.remove(i);
		}
		
	}
	public void removeTutela(Servico tutela){
		int elemento=listaDeServicos.indexOf(tutela);
		if (elemento==-1)
			System.out.println("Tecnico nao eh responsavel pelo servico em questao");
		else {
			listaDeServicos.remove(tutela);
		}
	}
}
