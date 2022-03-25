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
import javax.swing.JPasswordField;

public class ControlAcceso extends JFrame {

	private static JPanel contentPane;
	private JTextField UsuTextField;
	static AccesoBaDatos abd = new AccesoBaDatos();
	private JPasswordField PassTextField;
	private JTextField textComp;

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
					JOptionPane.showMessageDialog(contentPane, "Error de clase", "ERROR 1",
							JOptionPane.INFORMATION_MESSAGE);
					e.printStackTrace();
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(contentPane, "Error de conexion", "ERROR 2",
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
		setTitle("Control de acceso DAM curso 21-22");
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
		PassLabel.setBounds(10, 36, 91, 20);
		contentPane.add(PassLabel);

		UsuTextField = new JTextField();
		UsuTextField.setBounds(111, 8, 86, 20);
		contentPane.add(UsuTextField);
		UsuTextField.setColumns(10);

		JLabel RedLockLabel = new JLabel("");
		RedLockLabel.setIcon(new ImageIcon(
				"C:\\Users\\DAM1Alu14\\Desktop\\Prog\\Ud10\\Sesion1\\Imagenes_Ejercicio2\\candado_cerrado.png"));
		RedLockLabel.setBounds(76, 121, 89, 129);
		contentPane.add(RedLockLabel);

		JLabel GreenLockLabel = new JLabel("");
		GreenLockLabel.setIcon(new ImageIcon(
				"C:\\Users\\DAM1Alu14\\Desktop\\Prog\\Ud10\\Sesion1\\Imagenes_Ejercicio2\\candado_abierto.png"));
		GreenLockLabel.setBounds(295, 121, 95, 129);
		contentPane.add(GreenLockLabel);
		
		PassTextField = new JPasswordField();
		PassTextField.setBounds(111, 36, 86, 20);
		contentPane.add(PassTextField);
		
		textComp = new JTextField();
		textComp.setEditable(false);
		textComp.setBounds(76, 94, 315, 20);
		contentPane.add(textComp);
		textComp.setColumns(10);
		textComp.setVisible(false);
		GreenLockLabel.setVisible(false);
		
		JButton btnAcept = new JButton("Aceptar");
		btnAcept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (UsuTextField.getText().isEmpty() || PassTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Campos incompletos", "Rellene todos los campos.",
							JOptionPane.INFORMATION_MESSAGE);
				} else { // else del if comprobador de campos.
					// abd.consultarLogin(UsuTextField.getText(), PassTextField.getText()) !=null
					String cre = abd.consultarLogin(UsuTextField.getText(), PassTextField.getText());
					if (cre != "") {// si ambos campos
																								// coinciden devolverá
																								// true
						textComp.setText("Bienvenid@ " + cre);
						textComp.setVisible(true);
						GreenLockLabel.setVisible(true);
						RedLockLabel.setVisible(false);
					} else { // en caso de false
						textComp.setText("usuario o contraseña erroneos");
						textComp.setVisible(true);
						GreenLockLabel.setVisible(false);
						RedLockLabel.setVisible(true);
					}
				}
			}
		});
		btnAcept.setBounds(301, 35, 89, 23);
		contentPane.add(btnAcept);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        try {
					abd.desconectar();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    }
		});
	}
}
