import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class interfaceClienteApp {

	private JFrame frmInterfaceCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceClienteApp window = new interfaceClienteApp();
					window.frmInterfaceCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaceClienteApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfaceCliente = new JFrame();
		frmInterfaceCliente.setTitle("Interface Cliente");
		frmInterfaceCliente.setBounds(100, 100, 450, 300);
		frmInterfaceCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Consultar Requisicao");
		btnNewButton.setBounds(135, 145, 145, 56);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frmInterfaceCliente.getContentPane().setLayout(null);
		frmInterfaceCliente.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consultar Cliente");
		btnNewButton_1.setBounds(135, 78, 145, 56);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmInterfaceCliente.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Adicionar Requisicao");
		btnNewButton_2.setBounds(135, 11, 145, 56);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaAdicaoSolicitacao janNovoServico = new JanelaAdicaoSolicitacao();
				frmInterfaceCliente.setVisible(false);
				janNovoServico.setVisible(true);
			}
		});
		frmInterfaceCliente.getContentPane().add(btnNewButton_2);
		
		JButton btnEncerrar = new JButton("Encerrar");
		btnEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInterfaceCliente.dispose();
			}
		});
		btnEncerrar.setBounds(135, 227, 145, 23);
		frmInterfaceCliente.getContentPane().add(btnEncerrar);
	}

}
