public class pecas {
	private String nome;
	private double custo;
	public pecas(){
		nome = "NULL";
		custo = 0;
	}
	public pecas(String nome, double custo){
		this.nome = nome;
		this.custo = custo;
	}
	public String getNome(){
		return nome;
	}
	public double getCusto(){
		return custo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCusto(double custo){
		this.custo = custo;
	}
}
