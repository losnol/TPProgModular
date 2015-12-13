package interfaceCliente;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JanelaAdicaoCliente extends JPanel {

	private static final long serialVersionUID = 4921942710145391302L;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtRg;
	private JTextField txtIversarioddmmaaaa;
	private JTextField txtEmail;

	/**
	 * Create the panel.
	 */
	public JanelaAdicaoCliente() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(79, 301, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(303, 301, 89, 23);
		add(btnNewButton_1);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		txtNome.setBounds(79, 36, 266, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setBounds(79, 81, 266, 20);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setText("RG");
		txtRg.setBounds(79, 132, 266, 20);
		add(txtRg);
		txtRg.setColumns(10);
		
		txtIversarioddmmaaaa = new JTextField();
		txtIversarioddmmaaaa.setText("Aniversario (dd/mm/aaaa)");
		txtIversarioddmmaaaa.setToolTipText("");
		txtIversarioddmmaaaa.setBounds(79, 177, 266, 20);
		add(txtIversarioddmmaaaa);
		txtIversarioddmmaaaa.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(79, 221, 266, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblInsiraOsDados = new JLabel("Insira os dados do cliente:");
		lblInsiraOsDados.setBounds(82, 11, 229, 14);
		add(lblInsiraOsDados);

	}
}
