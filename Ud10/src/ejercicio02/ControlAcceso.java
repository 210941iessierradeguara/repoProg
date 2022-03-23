package ejercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejercicio01.AccesoBDatos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlAcceso extends JFrame {

	private static JPanel contentPane;
	private JTextField UsuTextField;
	private JTextField PassTextField;
	static AccesoBaDatos abd = new AccesoBaDatos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					ControlAcceso frame = new ControlAcceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					abd.conectar();
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(contentPane,
						      "Error de clase",
						      "ERROR 1",
						       JOptionPane.INFORMATION_MESSAGE);
					e.printStackTrace();
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(contentPane,
						      "Error de conexion",
						      "ERROR 2",
						       JOptionPane.INFORMATION_MESSAGE);
					e2.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControlAcceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UsuLabel = new JLabel("Usuario");
		UsuLabel.setBounds(10, 11, 56, 14);
		contentPane.add(UsuLabel);
		
		JLabel PassLabel = new JLabel("Contrase\u00F1a");
		PassLabel.setBounds(10, 36, 56, 20);
		contentPane.add(PassLabel);
		
		UsuTextField = new JTextField();
		UsuTextField.setBounds(76, 8, 86, 20);
		contentPane.add(UsuTextField);
		UsuTextField.setColumns(10);
		
		PassTextField = new JTextField();
		PassTextField.setBounds(76, 36, 86, 20);
		contentPane.add(PassTextField);
		PassTextField.setColumns(10);
		
		JButton btnAcept = new JButton("Aceptar");
		btnAcept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(UsuTextField.)
				abd.consultarLogin(UsuTextField.getText(), PassTextField.getText());
			}
		});
		btnAcept.setBounds(301, 35, 89, 23);
		contentPane.add(btnAcept);
		
		JLabel RedLockLabel = new JLabel("");
		RedLockLabel.setIcon(new ImageIcon("C:\\Users\\DAM1Alu14\\Desktop\\Prog\\Ud10\\Sesion1\\Imagenes_Ejercicio2\\candado_cerrado.png"));
		RedLockLabel.setBounds(76, 121, 89, 129);
		contentPane.add(RedLockLabel);
		
		JLabel GreenLockLabel = new JLabel("");
		GreenLockLabel.setIcon(new ImageIcon("C:\\Users\\DAM1Alu14\\Desktop\\Prog\\Ud10\\Sesion1\\Imagenes_Ejercicio2\\candado_abierto.png"));
		GreenLockLabel.setBounds(295, 121, 95, 129);
		contentPane.add(GreenLockLabel);
		GreenLockLabel.setVisible(false);
	}
}
