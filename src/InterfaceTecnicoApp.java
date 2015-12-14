

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceTecnicoApp {

	private JFrame frmInterfaceTcnico;
	private JTextField txtNmeroDeMatrcula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceTecnicoApp window = new InterfaceTecnicoApp();
					window.frmInterfaceTcnico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceTecnicoApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfaceTcnico = new JFrame();
		frmInterfaceTcnico.setTitle("Interface T\u00E9cnico");
		frmInterfaceTcnico.setBounds(100, 100, 278, 231);
		frmInterfaceTcnico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfaceTcnico.getContentPane().setLayout(null);
		
		txtNmeroDeMatrcula = new JTextField();
		txtNmeroDeMatrcula.setText("N\u00FAmero de Matr\u00EDcula:");
		txtNmeroDeMatrcula.setBounds(74, 88, 123, 20);
		frmInterfaceTcnico.getContentPane().add(txtNmeroDeMatrcula);
		txtNmeroDeMatrcula.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInterfaceTcnico.dispose();
			}
		});
		btnNewButton.setBounds(20, 142, 89, 23);
		frmInterfaceTcnico.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInterfaceTcnico.dispose();
			}
		});
		btnNewButton_1.setBounds(150, 142, 89, 23);
		frmInterfaceTcnico.getContentPane().add(btnNewButton_1);
		
		JLabel lblInsiraAMatrcula = new JLabel("Insira a Matr\u00EDcula:");
		lblInsiraAMatrcula.setBounds(87, 49, 95, 14);
		frmInterfaceTcnico.getContentPane().add(lblInsiraAMatrcula);
	}

}
