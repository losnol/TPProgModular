import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	private double valor;
	private int horas;
	private double custoHora;
	private double valorTotal;
	private int validade;
	private List<pecas> pecas_;
	public Orcamento(){
		valor = 0;
		horas = 0;
		custoHora = 0;
		valorTotal = 0;
		validade =0;
		pecas_ = new ArrayList<pecas>();
	}
	public Orcamento(double valor, int horas, double custoHora, double valorTotal, int validade){
		this.valor = valor;
		this.horas = horas;
		this.custoHora = custoHora;
		this.valorTotal = valorTotal;
		this.validade = validade;
		pecas_ = new ArrayList<pecas>();
	}
	public Orcamento(double valor, int horas, double custoHora, double valorTotal, 
			int validade, List<pecas> pecas_){
		this.valor = valor;
		this.horas = horas;
		this.custoHora = custoHora;
		this.valorTotal = valorTotal;
		this.validade = validade;
		this.pecas_ = pecas_;
	}
	public void descartar() throws Throwable{
		finalize();
	}
	public double getValor(){
		return valor;
	}
	public int getHoras(){
		return horas;
	}
	public double getCustoHora(){
		return custoHora;
	}
	public double getValorTotal(){
		return valorTotal;
	}
	public int getValidade(){
		return validade;
	}
	public List<pecas> getPecas_(){
		return pecas_;
	}
	public void setPecas(List<pecas> pecas_){
		this.pecas_ = pecas_;
	}
	
	public void addPeca(pecas peca){
		pecas_.add(peca);
		}
	
	public void removePecas(){
		for (int i=0; i<pecas_.size();i++){
			pecas_.remove(i);
		}
		
	}
	public void removePeca(pecas peca){
		int elemento=pecas_.indexOf(peca);
		if (elemento==-1)
			System.out.println("orcamento nao consta peca em questao");
		else {
			pecas_.remove(peca);
		}
	}
	public void setValor(double valor){
		this.valor=valor;
	}
	public void setHoras(int horas){
		this.horas = horas;
	}
	public void setCustoHora(double custoHora){
		this.custoHora = custoHora;
	}
	
	public void setValorTotal(double valorTotal){
		this.valorTotal = valorTotal;
	}
	public void setValidade(int validade){
		this.validade = validade;
	}

	
}
