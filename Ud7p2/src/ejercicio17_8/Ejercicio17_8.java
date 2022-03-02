package ejercicio17_8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class Ejercicio17_8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_8 frame = new Ejercicio17_8();
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
	public Ejercicio17_8() {
		setTitle("Idiomas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox IngBox = new JCheckBox("Ingl\u00E9s");
		IngBox.setBounds(6, 7, 97, 23);
		contentPane.add(IngBox);
		
		JCheckBox FrnBox = new JCheckBox("Franc\u00E9s");
		FrnBox.setBounds(6, 52, 97, 23);
		contentPane.add(FrnBox);
		
		JCheckBox DeuBox = new JCheckBox("Alem\u00E1n");
		DeuBox.setBounds(6, 101, 97, 23);
		contentPane.add(DeuBox);
		
		JLabel idiSelec = new JLabel("Idiomas Seleccionados:");
		idiSelec.setBounds(6, 202, 157, 33);
		contentPane.add(idiSelec);
		
		JLabel ingLabel = new JLabel("INGL\u00C9S-");
		ingLabel.setForeground(Color.BLUE);
		ingLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ingLabel.setBackground(Color.WHITE);
		ingLabel.setVisible(false);
		ingLabel.setBounds(173, 205, 63, 23);
		contentPane.add(ingLabel);
		
		IngBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ingLabel.isVisible()) {
					ingLabel.setVisible(false);
				} else {
					ingLabel.setVisible(true);
				}
			}
		});
		
		JLabel freLabel = new JLabel("FRANC\u00C9S-");
		freLabel.setForeground(Color.BLUE);
		freLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		freLabel.setVisible(false);
		freLabel.setBounds(234, 206, 74, 21);
		contentPane.add(freLabel);
		
		FrnBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freLabel.isVisible()) {
					freLabel.setVisible(false);
				} else {
					freLabel.setVisible(true);
				}
			}
		});
		
		JLabel deuLabel = new JLabel("ALEM\u00C1N");
		deuLabel.setForeground(Color.BLUE);
		deuLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		deuLabel.setVisible(false);
		deuLabel.setBounds(309, 206, 68, 21);
		contentPane.add(deuLabel);
		
		DeuBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(deuLabel.isVisible()) {
					deuLabel.setVisible(false);
				} else {
					deuLabel.setVisible(true);
				}
			}
		});
	}

}
