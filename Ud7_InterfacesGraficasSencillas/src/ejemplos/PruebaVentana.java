package ejemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class PruebaVentana {
	private JFrame frmSi;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaVentana window = new PruebaVentana();
					window.frmSi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PruebaVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSi = new JFrame();
		frmSi.setTitle("\u00AA\u00AA\u00AA\u00AA\u00AA\u00AA\u00AA");
		frmSi.getContentPane().setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("Bot\u00F3n");
		btnNewButton.setBounds(0, 167, 434, 94);
		btnNewButton.setAction(action);
		GroupLayout groupLayout = new GroupLayout(frmSi.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(178, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
		);
		frmSi.getContentPane().setLayout(groupLayout);
		frmSi.setBounds(100, 100, 450, 300);
		frmSi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Botón");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
