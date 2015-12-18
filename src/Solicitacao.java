//TODO
public class Solicitacao {
	private int identificador;
	private String tipoProfissional;
	private String descricao;
	private Cliente cliente;
	public Solicitacao(){
		tipoProfissional = "NULL";
		descricao = "NULL";
		cliente = new Cliente();
		identificador = 0;
	}
	public Solicitacao(String tipoProfissional, String descricao, Cliente cliente, int identificador){
		this.tipoProfissional = tipoProfissional;
		this.descricao = descricao;
		this.cliente = cliente;
		this.identificador = identificador;
	
	}
	
	public int getIdentificador(){
		return identificador;
	}
	public String getTipoProfissional(){
		return tipoProfissional;
	}
	public String getDescricao(){
		return descricao;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setIdentificador(int identificador){
		this.identificador = identificador;
	}
	public void setTipoProfissional(String tipoProfissional){
		this.tipoProfissional = tipoProfissional;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
}
