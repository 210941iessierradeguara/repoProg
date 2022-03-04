package ejercicio17_9;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Ejercicio17_9 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_9 frame = new Ejercicio17_9();
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
	public Ejercicio17_9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218);
		setTitle("Ejemplo de grupos de opción");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton LinuxButton = new JRadioButton("Linux");
		LinuxButton.setBounds(25, 60, 109, 23);
		contentPane.add(LinuxButton);
		LinuxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (LinuxButton.isSelected()) {
					JOptionPane.showMessageDialog(contentPane, "Has seleccionado Linux", "Mensaje ",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JRadioButton WinButton = new JRadioButton("Windows");
		WinButton.setBounds(156, 60, 109, 23);
		contentPane.add(WinButton);
		WinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WinButton.isSelected()) {
					JOptionPane.showMessageDialog(contentPane, "Has seleccionado Windows", "Mensaje ",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JRadioButton MacButton = new JRadioButton("Macintosh");
		MacButton.setBounds(296, 60, 109, 23);
		contentPane.add(MacButton);
		MacButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MacButton.isSelected()) {
					JOptionPane.showMessageDialog(contentPane, "Has seleccionado Macintosh", "Mensaje ",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}
}
