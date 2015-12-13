//Main:
public class Programa {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ListaClientes A = new ListaClientes();
		Cliente B = new Cliente();
		A.inserir(B);
		A.consultarClientes();
		interfaceClienteApp C = new interfaceClienteApp();
	}

}
