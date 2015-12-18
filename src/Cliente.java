/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vini
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String rg;
    private String aniversario;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String rg,
            String aniversario, String email) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAniversario() {
        return aniversario;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    

    public void consultarDados() {
        System.out.println(toString());
    }

    public String toString() {
        return "Cliente - Dados: \nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: "
                + telefone + "\nIdantidade: " + rg + "\nAniversaio: " + aniversario + "\nEmail: "
                + email;
    }
}
