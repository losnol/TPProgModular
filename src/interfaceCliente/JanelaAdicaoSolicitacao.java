package interfaceCliente;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class JanelaAdicaoSolicitacao extends JPanel {
	private static final long serialVersionUID = 1665724070339055274L;

	/**
	 * Create the panel.
	 */
	public JanelaAdicaoSolicitacao() {
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 176, 504, 145);
		add(textArea);
		
		JRadioButton rdbtnBombeiro = new JRadioButton("Bombeiro");
		rdbtnBombeiro.setBounds(37, 47, 109, 23);
		add(rdbtnBombeiro);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Eletricista");
		rdbtnNewRadioButton.setBounds(37, 73, 109, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pedreiro");
		rdbtnNewRadioButton_1.setBounds(37, 99, 109, 23);
		add(rdbtnNewRadioButton_1);
		
		JLabel lblTipoDeTecnico = new JLabel("Tipo de Tecnico:");
		lblTipoDeTecnico.setBounds(37, 26, 120, 14);
		add(lblTipoDeTecnico);
		
		JLabel lblDescricaoDaSolicitacao = new JLabel("Descricao da solicitacao:");
		lblDescricaoDaSolicitacao.setBounds(37, 142, 139, 14);
		add(lblDescricaoDaSolicitacao);

	}
}
