/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//INCOMPLETO! FALTA COISAS
import java.sql.*;    
import java.sql.PreparedStatement; 

/**
 *
 * @author Vini
 */
public class TecnicoDao {

    private Connection connection;

    public TecnicoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Tecnico tecnico) {
        String sql = "INSERT INTO tecnicos "
                + "(nome, cpf, telefone, rg, email)"
                + "values (?, ?, ?, ?, ?)";
        
        /*private int matricula;
	private String nome;
	private String email;
	private String telefone;
	private String habilidade;*/
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, tecnico.getMatricula());
            stmt.setString(2, tecnico.getNome());
            stmt.setString(3, tecnico.getTelefone());
            stmt.setString(4, tecnico.getHabilidade());
            //stmt.setDate(5, cliente.getAniversario());
            stmt.setString(5, tecnico.getEmail());
            
            System.out.println(stmt);
            // executa
            if (stmt.execute()) {
               System.out.println("Dados inseridos com sucesso");
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível inserir os dados do cliente");
            throw new RuntimeException(e);
        }
    }
}
