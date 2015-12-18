public class Fatura {
	private double valor;
	private int numeroDoRecibo;
	private String tipoDePagamento;
	public Fatura(){
		valor = 0;
		numeroDoRecibo = 0;
		tipoDePagamento = "NULL";
	}
	public Fatura(double valor, int numeroDoRecibo,String tipoDePagamento){
		this.valor = valor;
		this.numeroDoRecibo = numeroDoRecibo;
		this.tipoDePagamento = tipoDePagamento;
	}
	public double getValor(){
		return valor;
	}
	public int getNumeroDoRecibo(){
		return numeroDoRecibo;
	}
	public String getTipoDePagamento(){
		return tipoDePagamento;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	public void setNumeroDoRecibo(int numeroDoRecibo){
		this.numeroDoRecibo = numeroDoRecibo;
	}
	public void setTipoDePagamento(String tipoDePagamento){
		this.tipoDePagamento = tipoDePagamento;
	}

}
