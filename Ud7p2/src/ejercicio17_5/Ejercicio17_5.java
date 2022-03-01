package ejercicio17_5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio17_5 extends JFrame {

	Container panel;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel imagenCalculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_5 frame = new Ejercicio17_5();
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
	public Ejercicio17_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imagenCalculadora = new JLabel();
		imagenCalculadora.setBounds(102, 2, 200, 80);
		ImageIcon iconoCalculadora =new ImageIcon("imagenes/calculadora.jpg");
		imagenCalculadora.setIcon(iconoCalculadora);
		getContentPane().add(imagenCalculadora);
		
		JLabel LabelDato1 = new JLabel("Dato 1:");
		LabelDato1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelDato1.setBounds(10, 114, 55, 20);
		contentPane.add(LabelDato1);
		
		JLabel LabelDato2 = new JLabel("Dato 2:");
		LabelDato2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelDato2.setBounds(10, 145, 55, 20);
		contentPane.add(LabelDato2);
		
		JLabel LabelResult = new JLabel("Resultado:");
		LabelResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelResult.setHorizontalAlignment(SwingConstants.TRAILING);
		LabelResult.setBounds(10, 176, 65, 20);
		contentPane.add(LabelResult);
		
		textField = new JTextField();
		textField.setBounds(95, 116, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 147, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton ButtonSUM = new JButton("+");
		ButtonSUM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Result = Double.parseDouble(textField.getText()) + Double.parseDouble(textField_1.getText());
				textField_2.setText(Result.toString());
			}
		});
		ButtonSUM.setBounds(216, 115, 89, 23);
		contentPane.add(ButtonSUM);
		
		JButton ButtonRES = new JButton("-");
		ButtonRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Result = Double.parseDouble(textField.getText()) - Double.parseDouble(textField_1.getText());
				textField_2.setText(Result.toString());
			}
		});
		ButtonRES.setBounds(216, 146, 89, 23);
		contentPane.add(ButtonRES);
		
		JButton ButtonMULT = new JButton("*");
		ButtonMULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Result = Double.parseDouble(textField.getText()) * Double.parseDouble(textField_1.getText());
				textField_2.setText(Result.toString());
			}
		});
		ButtonMULT.setBounds(216, 177, 89, 23);
		contentPane.add(ButtonMULT);
		
		JButton ButtonDIV = new JButton("/");
		ButtonDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Result = Double.parseDouble(textField.getText()) / Double.parseDouble(textField_1.getText());
				textField_2.setText(Result.toString());
			}
		});
		ButtonDIV.setBounds(216, 211, 89, 23);
		contentPane.add(ButtonDIV);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(95, 178, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		ImageIcon iconoSalir =new ImageIcon("imagenes/puerta.jpg");
		JButton ButtonExit = new JButton("");
		ButtonExit.setIcon(iconoSalir);
		ButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ButtonExit.setBounds(95, 211, 49, 60);
		contentPane.add(ButtonExit);
		
		ImageIcon iconoCreds =new ImageIcon("imagenes/hombre.png");
		JButton ButtonCreds = new JButton("");
		ButtonCreds.setIcon(iconoCreds);
		ButtonCreds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel,
					      "hecho por: DME",
					      "Creditos",
					       JOptionPane.INFORMATION_MESSAGE);
			}
		});
		ButtonCreds.setBounds(95, 285, 49, 60);
		contentPane.add(ButtonCreds);
	}

}
