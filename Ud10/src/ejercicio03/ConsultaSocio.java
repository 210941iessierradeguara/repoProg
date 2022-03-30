package ejercicio03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaSocio extends JFrame {

	private JPanel contentPane;
	private JTextField SidField;
	private JTextField SnameField;
	private JTextField SalturaField;
	private JTextField SedadField;
	private JTextField SlocalidadField;
	private JTextField BuscarField;
	static AccesoBDatos2 abd = new AccesoBDatos2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaSocio frame = new ConsultaSocio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					abd.conectar();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaSocio() {
		setTitle("Busqueda de socios por localidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SocioLabel = new JLabel("Socio");
		SocioLabel.setBounds(10, 21, 60, 22);
		contentPane.add(SocioLabel);
		
		JLabel NombreLabel = new JLabel("Nombre");
		NombreLabel.setBounds(10, 46, 60, 22);
		contentPane.add(NombreLabel);
		
		JLabel EstaturaLabel = new JLabel("Estatura");
		EstaturaLabel.setBounds(10, 69, 70, 25);
		contentPane.add(EstaturaLabel);
		
		JLabel EdadLabel = new JLabel("Edad");
		EdadLabel.setBounds(10, 94, 60, 25);
		contentPane.add(EdadLabel);
		
		JLabel LocalidadLabel = new JLabel("Localidad");
		LocalidadLabel.setBounds(10, 120, 60, 25);
		contentPane.add(LocalidadLabel);
		
		JLabel CmLabel = new JLabel("cm.");
		CmLabel.setBounds(119, 74, 46, 14);
		contentPane.add(CmLabel);
		
		JLabel AnyosLabel = new JLabel("a\u00F1os");
		AnyosLabel.setBounds(141, 99, 46, 14);
		contentPane.add(AnyosLabel);
		
		SidField = new JTextField();
		SidField.setEditable(false);
		SidField.setBounds(66, 22, 86, 20);
		contentPane.add(SidField);
		SidField.setColumns(10);
		
		SnameField = new JTextField();
		SnameField.setEditable(false);
		SnameField.setBounds(66, 47, 86, 20);
		contentPane.add(SnameField);
		SnameField.setColumns(10);
		
		SalturaField = new JTextField();
		SalturaField.setEditable(false);
		SalturaField.setBounds(66, 71, 43, 20);
		contentPane.add(SalturaField);
		SalturaField.setColumns(10);
		
		SedadField = new JTextField();
		SedadField.setEditable(false);
		SedadField.setBounds(66, 96, 65, 20);
		contentPane.add(SedadField);
		SedadField.setColumns(10);
		
		SlocalidadField = new JTextField();
		SlocalidadField.setEditable(false);
		SlocalidadField.setBounds(66, 122, 86, 20);
		contentPane.add(SlocalidadField);
		SlocalidadField.setColumns(10);
		
		JButton Buscarbtn = new JButton("Buscar");
		Buscarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		Buscarbtn.setBounds(335, 65, 89, 23);
		contentPane.add(Buscarbtn);
		
		BuscarField = new JTextField();
		BuscarField.setBounds(335, 34, 89, 20);
		contentPane.add(BuscarField);
		BuscarField.setColumns(10);
		
		JButton Siguientebtn = new JButton("Siguiente");
		Siguientebtn.setEnabled(false);
		Siguientebtn.setBounds(239, 227, 89, 23);
		contentPane.add(Siguientebtn);
		
		JButton Anteriorbtn = new JButton("Anterior");
		Anteriorbtn.setEnabled(false);
		Anteriorbtn.setBounds(131, 227, 89, 23);
		contentPane.add(Anteriorbtn);
		
		JLabel cantidadLabel = new JLabel("Oculto");
		cantidadLabel.setBounds(191, 179, 46, 14);
		contentPane.add(cantidadLabel);
		cantidadLabel.setVisible(false);
		
		
		
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
