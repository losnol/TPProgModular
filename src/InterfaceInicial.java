

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceInicial {

	private JFrame frmPrograma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceInicial window = new InterfaceInicial();
					window.frmPrograma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrograma = new JFrame();
		frmPrograma.setTitle("Programa");
		frmPrograma.setBounds(100, 100, 450, 300);
		frmPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrograma.getContentPane().setLayout(null);
		
		JButton btnAreaDoCliente = new JButton("Area do Cliente");
		btnAreaDoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaceClienteApp areaCliente = new interfaceClienteApp();
				areaCliente.main(new String[0]);
				frmPrograma.dispose();
			}
		});
		btnAreaDoCliente.setBounds(128, 95, 178, 73);
		frmPrograma.getContentPane().add(btnAreaDoCliente);
		
		JButton btnAreaDoTecnico = new JButton("Area do Tecnico");
		btnAreaDoTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceTecnicoApp areaTecnico = new InterfaceTecnicoApp();
				areaTecnico.main(new String[0]);
				frmPrograma.dispose();
			}
		});
		btnAreaDoTecnico.setBounds(128, 11, 178, 73);
		frmPrograma.getContentPane().add(btnAreaDoTecnico);
		
		JButton btnNewButton = new JButton("Encerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrograma.dispose();
			}
		});
		btnNewButton.setBounds(128, 193, 178, 40);
		frmPrograma.getContentPane().add(btnNewButton);
	}

}
