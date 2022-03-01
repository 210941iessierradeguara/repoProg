package ejercicio17_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio17_3 extends JFrame {
  Container panel;
  JButton botonCalcular;
  JButton botonRest;
  JTextField base, altura, calculo;
  JLabel etiqueta1, etiqueta2;

  public Ejercicio17_3() {
	super("CálCULO");
    panel = getContentPane();
    panel.setLayout((null));
	etiqueta1=new JLabel("Num1");
	etiqueta2=new JLabel("Num2");
    etiqueta1.setBounds(10, 20, 60,20);
    panel.add(etiqueta1);
    etiqueta2.setBounds(10, 50, 60,20);
    panel.add (etiqueta2);
    base = new JTextField(5);
    base.setBounds(50, 20, 45, 20);
	panel.add(base);
	altura = new JTextField(6);
	altura.setBounds(50, 50, 45, 20);
	panel.add(altura);
	botonCalcular = new JButton("+");
	botonRest = new JButton("-");
	botonCalcular.setBounds(40, 90, 75, 20);
	botonRest.setBounds(120, 90, 75, 20);
	panel.add(botonCalcular);
	panel.add(botonRest);
	calculo=new JTextField(6);
	calculo.setBounds(120, 120, 75,20);
	 panel.add(calculo);
	calculo.setEditable(false);
	calculo.setForeground(Color.red);
	botonCalcular.addActionListener(new OyenteBoton());
	botonRest.addActionListener(new OyenteBoton());
	  
    setSize(300, 200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Ejercicio17_3 ventana = new Ejercicio17_3();
  }

  class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //Faltaría aquí la comprobación de datos reales de la base y de la altura
    	// de forma similar a cómo se ha hecho en el Ejercicio01.java
    	if(e.getSource() == botonCalcular) {
    		Double resultado =Double.parseDouble(base.getText()) + Double.parseDouble(altura.getText());
    		resultado=Math.rint(resultado*100)/100;
            calculo.setText(resultado.toString());
    	} else {
    		Double resultado =Double.parseDouble(base.getText()) - Double.parseDouble(altura.getText());
    		resultado=Math.rint(resultado*100)/100;
            calculo.setText(resultado.toString());
    	}
    }
  }
}