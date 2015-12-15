import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceConfirmacaoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void exec(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceConfirmacaoCliente frame = new InterfaceConfirmacaoCliente();
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
	public InterfaceConfirmacaoCliente() {
		setTitle("Consulta Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsiraCpfDo = new JLabel("Insira CPF do cliente:");
		lblInsiraCpfDo.setBounds(44, 41, 129, 14);
		contentPane.add(lblInsiraCpfDo);
		
		textField = new JTextField();
		textField.setToolTipText("xx.xxx.xxx-50");
		textField.setBounds(21, 66, 194, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaAdicaoCliente.exec();
				
			}
		});
		btnNewButton.setBounds(43, 193, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancela = new JButton("Cancela");
		btnCancela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancela.setBounds(299, 193, 89, 23);
		contentPane.add(btnCancela);
	}
}
