/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;    
import java.sql.PreparedStatement; 

/**
 *
 * @author Vini
 */
public class ClienteDao {

    private Connection connection;

    public ClienteDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Cliente cliente) {
        String sql = "INSERT INTO clientes "
                + "(nome, cpf, telefone, rg, email)"
                + "values (?, ?, ?, ?, ?)";
        
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getRg());
            //stmt.setDate(5, cliente.getAniversario());
            stmt.setString(5, cliente.getemail());
            
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
