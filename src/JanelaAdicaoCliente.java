

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAdicaoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtRg;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void exec() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAdicaoCliente frame = new JanelaAdicaoCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaAdicaoCliente() {
		setTitle("Adicionar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaAdicaoSolicitacao.exec();
				dispose();
			}
		});
		btnConfirmar.setBounds(55, 290, 99, 31);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(345, 290, 99, 31);
		contentPane.add(btnCancelar);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		txtNome.setBounds(68, 76, 313, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setText("CPF");
		txtCpf.setColumns(10);
		txtCpf.setBounds(68, 107, 313, 20);
		contentPane.add(txtCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(68, 138, 313, 20);
		contentPane.add(txtTelefone);
		
		txtRg = new JTextField();
		txtRg.setText("RG");
		txtRg.setColumns(10);
		txtRg.setBounds(68, 169, 313, 20);
		contentPane.add(txtRg);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setColumns(10);
		txtEmail.setBounds(68, 200, 313, 20);
		contentPane.add(txtEmail);
		
		JLabel lblInsiraAsInformaes = new JLabel("Insira as informa\u00E7\u00F5es do cliente:");
		lblInsiraAsInformaes.setBounds(62, 28, 164, 14);
		contentPane.add(lblInsiraAsInformaes);
	}

}
