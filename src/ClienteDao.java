/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.List;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class ClienteDao {

    private Connection connection;

    public ClienteDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Boolean adicionar(Cliente cliente) {
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
            stmt.setString(5, cliente.getEmail());

            System.out.println(stmt);
            // executa
            stmt.execute();
            stmt.close();
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Cliente> getLista() {
        try {
            ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from clientes");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                Cliente cliente = new Cliente();

                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                // adicionando o objeto à lista
                clientes.add(cliente);
            }
            rs.close();
            stmt.close();
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
