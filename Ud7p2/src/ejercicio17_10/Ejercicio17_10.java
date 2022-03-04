package ejercicio17_10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

public class Ejercicio17_10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField Dato1;
	private JTextField Dato2;
	private JTextField result;
	private JMenuBar mb;
	private JMenu OperaMenu, otroMen;
	private JMenuItem sum, res, mul, div, sal, cre;
	private JLabel imagenCalculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_10 frame = new Ejercicio17_10();
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
	public Ejercicio17_10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dato 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 128, 56, 31);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dato 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 169, 56, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Resultado: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 243, 87, 31);
		contentPane.add(lblNewLabel_2);

		Dato1 = new JTextField();
		Dato1.setBounds(75, 135, 86, 20);
		contentPane.add(Dato1);
		Dato1.setColumns(10);

		Dato2 = new JTextField();
		Dato2.setBounds(76, 176, 86, 20);
		contentPane.add(Dato2);
		Dato2.setColumns(10);

		result = new JTextField();
		result.setEditable(false);
		result.setBounds(107, 250, 86, 20);
		contentPane.add(result);
		result.setColumns(10);

		imagenCalculadora = new JLabel();
		imagenCalculadora.setBounds(82, 0, 200, 80);
		ImageIcon iconoCalculadora =new ImageIcon("imagenes/calculadora.jpg");
		imagenCalculadora.setIcon(iconoCalculadora);
		getContentPane().add(imagenCalculadora);
		
		// menuses

		mb = new JMenuBar();
		setJMenuBar(mb);
		OperaMenu = new JMenu("Operaciones");
		otroMen = new JMenu("Aplicación");
		OperaMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mb.add(OperaMenu);
		mb.add(otroMen);

		sum = new JMenuItem("Sumar");
		sum.addActionListener(this);
		OperaMenu.add(sum);

		res = new JMenuItem("Restar");
		res.addActionListener(this);
		OperaMenu.add(res);

		mul = new JMenuItem("Multiplicar");
		res.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Double resultado = Double.parseDouble(Dato1.getText()) * Double.parseDouble(Dato2.getText());
					result.setText(resultado.toString());
				} catch (Exception e1) {
					result.setText("NO");
				}
			}
		});
		OperaMenu.add(mul);

		div = new JMenuItem("Dividir");
		div.addActionListener(this);
		OperaMenu.add(div);
		OperaMenu.setBounds(0, 0, 115, 26);

		sal = new JMenuItem("Salir");
		sal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		otroMen.add(sal);

		cre = new JMenuItem("About");
		cre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "hecho por: DME", "Creditos",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		otroMen.add(cre);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container f = this.getContentPane();
		Double resultado;

		if (e.getSource() == sum) {
			try {
				resultado = Double.parseDouble(Dato1.getText()) + Double.parseDouble(Dato2.getText());
				result.setText(resultado.toString());
			} catch (Exception e1) {
				result.setText("NO");
			}
		}

		if (e.getSource() == res) {
			try {
				resultado = Double.parseDouble(Dato1.getText()) - Double.parseDouble(Dato2.getText());
				result.setText(resultado.toString());
			} catch (Exception e1) {
				result.setText("NO");
			}
		}

//		if (e.getSource() == mul) {
//			try {
//				resultado = Double.parseDouble(Dato1.getText()) * Double.parseDouble(Dato2.getText());
//				result.setText(resultado.toString());
//			} catch (Exception e1) {
//				result.setText("NO");
//			}
//		}

		if (e.getSource() == div) {
			try {
				resultado = Double.parseDouble(Dato1.getText()) / Double.parseDouble(Dato2.getText());
				result.setText(resultado.toString());
			} catch (Exception e1) {
				result.setText("NO");
			}
		}
	}
}
