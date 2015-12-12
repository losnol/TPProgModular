public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String rg;
	private String aniversario;
	private String email;
	
	public Cliente(String nome,String cpf,String telefone,String rg,
			String aniversario,String email){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rg = rg;
		this.aniversario = aniversario;
		this.email = email;
	}
	
	public Cliente() {
		this.nome = "NULL";
		this.cpf = "NULL";
		this.telefone = "NULL";
		this.rg = "NULL";
		this.aniversario = "NULL";
		this.email = "NULL";
	}

	public String getNome(){
		return nome;
	}
	public String getCpf(){
		return cpf;
	}
	public String getTelefone(){
		return telefone;
	}
	public String getRg(){
		return rg;
	}
	public String getAniversario(){
		return aniversario;
	}
	public String getemail(){
		return email;
	}
}
