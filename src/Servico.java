
public class Servico extends Solicitacao {
	private String estado;
	private Fatura fatura;
	private Orcamento orcamento;
	public Servico(){
		super();
		fatura = new Fatura();
		estado = "NULL";
		orcamento = new Orcamento();
	}
	public Servico(Solicitacao solicitacao){
		super( solicitacao.getTipoProfissional(),solicitacao.getDescricao(), 
				solicitacao.getCliente(), solicitacao.getIdentificador());
		fatura = new Fatura();
		estado = "NULL";
		orcamento = new Orcamento();
	}
	public Servico(Solicitacao solicitacao, String estado, Fatura fatura, Orcamento orcamento){
		super( solicitacao.getTipoProfissional(),solicitacao.getDescricao(), 
				solicitacao.getCliente(), solicitacao.getIdentificador());
		this.fatura = fatura;
		this.estado = estado;
		this.orcamento = orcamento;
	}
	
	
	public String getEstado(){
		return estado;
	}
	public Orcamento getOrcamento(){
		return orcamento;
	}
	public Fatura getFatura(){
		return fatura;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}
	public void setOrcamento(Orcamento orcamento){
		this.orcamento = orcamento;
	}
	public void setFatura(Fatura fatura){
		this.fatura = fatura;
	}
}
