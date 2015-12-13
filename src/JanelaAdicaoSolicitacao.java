

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ButtonGroup;

public class JanelaAdicaoSolicitacao extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAdicaoSolicitacao frame = new JanelaAdicaoSolicitacao();
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
	public JanelaAdicaoSolicitacao() {
		setTitle("Adi\u00E7\u00E3o de Servi\u00E7o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoProfissional = new JLabel("Tipo de profissional:");
		lblTipoProfissional.setBounds(22, 11, 131, 14);
		contentPane.add(lblTipoProfissional);
		
		JLabel lblDescrioDoProblema = new JLabel("Descri\u00E7\u00E3o do Problema:");
		lblDescrioDoProblema.setBounds(22, 123, 121, 14);
		contentPane.add(lblDescrioDoProblema);
		
		JTextArea Textao = new JTextArea();
		Textao.setBounds(22, 151, 431, 138);
		contentPane.add(Textao);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnConfirmar.setBounds(56, 321, 97, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(373, 321, 97, 23);
		contentPane.add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 35, 170, 85);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Eletricista");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBounds(35, 5, 85, 23);
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bombeiro");
		rdbtnNewRadioButton_2.setBounds(36, 33, 84, 23);
		buttonGroup.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pedreiro");
		rdbtnNewRadioButton.setBounds(35, 59, 85, 23);
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
	}
}
