public class Solicitacao { //TODO
	private String tipoProfissional;
	private String descricao;
	private Cliente cliente;
	public Solicitacao(){
		tipoProfissional = "NULL";
		descricao = "NULL";
		cliente = new Cliente();
	}
	public Solicitacao(String tipoProfissional, String descricao, Cliente cliente){
		this.tipoProfissional = tipoProfissional;
		this.descricao = descricao;
		this.cliente = cliente;
	
	}

}
