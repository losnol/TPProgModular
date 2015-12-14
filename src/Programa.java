//Main:
public class Programa {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		InterfaceInicial C = new InterfaceInicial();
		C.main(new String[0]);
		ListaClientes A = new ListaClientes();
		Cliente B = new Cliente();
		A.inserir(B);
		A.consultarClientes();
		//JanelaAdicaoCliente D =  new JanelaAdicaoCliente();
		//D.setVisible(true);
	}

}
