package ejercicio17_7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio17_7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_7 frame = new Ejercicio17_7();
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
	public Ejercicio17_7() {
		setTitle("Confirmar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 154, 124, 54);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
					btnNewButton.setEnabled(false);
				} else {
					btnNewButton.setEnabled(true);
				}
			}
		});
		chckbxNewCheckBox.setBounds(10, 72, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		JLabel lblNewLabel = new JLabel("He leido el documento y estoy de acuerdo con las condiciones");
		lblNewLabel.setBounds(10, 11, 393, 54);
		contentPane.add(lblNewLabel);
	}
}
