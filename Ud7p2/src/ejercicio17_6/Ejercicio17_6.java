package ejercicio17_6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio17_6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_6 frame = new Ejercicio17_6();
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
	public Ejercicio17_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxR = new JComboBox();
		comboBoxR.setBounds(154, 11, 72, 22);
		contentPane.add(comboBoxR);
		
		for (Integer i = 0; i < 256; i++) {
			comboBoxR.addItem(i);
		}
		
		JComboBox comboBoxV = new JComboBox();
		comboBoxV.setBounds(154, 44, 72, 22);
		contentPane.add(comboBoxV);
		
		for (Integer i = 0; i < 256; i++) {
			comboBoxV.addItem(i);
		}
		
		JComboBox comboBoxA = new JComboBox();
		comboBoxA.setBounds(154, 77, 72, 22);
		contentPane.add(comboBoxA);
		
		for (Integer i = 0; i < 256; i++) {
			comboBoxA.addItem(i);
		}
		
		JLabel LabelRojo = new JLabel("Rojo");
		LabelRojo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelRojo.setBounds(10, 15, 62, 18);
		contentPane.add(LabelRojo);
		
		JLabel LabelVerde = new JLabel("Verde");
		LabelVerde.setHorizontalAlignment(SwingConstants.LEFT);
		LabelVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelVerde.setBounds(10, 48, 62, 18);
		contentPane.add(LabelVerde);
		
		JLabel LabelAzul = new JLabel("Azul");
		LabelAzul.setHorizontalAlignment(SwingConstants.LEFT);
		LabelAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelAzul.setBounds(10, 81, 62, 18);
		contentPane.add(LabelAzul);
		
		JButton ButtonBG = new JButton("Color de fondo");
		ButtonBG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = comboBoxR.getSelectedIndex();
				int green = comboBoxV.getSelectedIndex();
				int blue = comboBoxA.getSelectedIndex();
				
				Color color = new Color(red, green, blue);
				
				contentPane.setBackground(color);
			}
		});
		ButtonBG.setBounds(10, 142, 103, 35);
		contentPane.add(ButtonBG);
		
	}
}
