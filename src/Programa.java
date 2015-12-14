//Main:

import java.sql.*;

public class Programa {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		InterfaceInicial.exec();
		ListaClientes A = new ListaClientes();
		Cliente B = new Cliente();
		A.inserir(B);
		A.consultarClientes();
		//JanelaAdicaoCliente D =  new JanelaAdicaoCliente();
		//D.setVisible(true);
		
        ConnectionFactory.getConnection();
        System.out.println(ConnectionFactory.status); //imprime o valor de status

        Cliente cliente = new Cliente("nome teste", "086.669.686-56", "3476-3915", "mg-14.853.816", "TESTE", "vini22004@gmail.com");
        
        System.out.println(cliente.getNome());
        
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.adicionar(cliente);
        System.out.println(ConnectionFactory.status); //imprime o valor de status
		
	}

}
