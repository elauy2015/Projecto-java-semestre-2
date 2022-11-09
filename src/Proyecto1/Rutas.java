package Proyecto1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Rutas {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String xa) {
		String a = xa;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rutas window = new Rutas(a);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rutas(String a) {
		initialize(a);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(String a) {
		acumulador acumula = new acumulador();  /* ACUMULADORRRRRRRRRRRRRRRRR */
		Decision decs = new Decision( 0,  0,  0,  0,  0,  0,  0,  0,  0, 0);
		frame = new JFrame();
		frame.setBounds(100, 100, 351, 207);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Pasajeros:");
		lblNewLabel.setBounds(106, 23, 137, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(50, 58, 232, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(66, 110, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				if (!textField.getText().isEmpty()) {
					
				
				String cant = textField.getText();
				int cantn = Integer.parseInt(cant);
				double monto1 = 2.50+(cantn*0.50);
				double monto2 = 3.25+(cantn*0.65);
				double monto3 = 4.35+(cantn*0.70);
				double monto4 = 1.75+(cantn*0.60);
				double monto5 = 5.00+(cantn*0.75);
				
				if(a.equals("1")) {

					JOptionPane.showMessageDialog(null, "El monto a pagar es: " + monto1);
					decs.main(1, 0, 0, 0, 0, monto1, 0, 0, 0, 0);
					frame.dispose();
				}
				else if(a.equals("2")) {

					JOptionPane.showMessageDialog(null, "El monto a pagar es: " + monto2);
					decs.main(0, 1, 0, 0, 0, 0, monto2, 0, 0, 0);
					frame.dispose();
				}
				else if(a.equals("3")) {

					JOptionPane.showMessageDialog(null, "El monto a pagar es: " + monto3);
					decs.main(0, 0, 1, 0, 0, 0, 0, monto3, 0, 0);
					frame.dispose();
				}
				else if(a.equals("4")) {

					JOptionPane.showMessageDialog(null, "El monto a pagar es: " + monto4);
					decs.main(0, 0, 0, 1, 0, 0, 0, 0, monto4, 0);
					frame.dispose();
				}
				else if(a.equals("5")) {

					JOptionPane.showMessageDialog(null, "El monto a pagar es: " + monto5);
					decs.main(0, 0, 0, 0, 1, 0, 0, 0, 0, monto5);
					frame.dispose();
				}
				}else {
					JOptionPane.showMessageDialog(null, "No puede dejar los campos vacios");
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(165, 110, 89, 23);
		frame.getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				
				Taximetro_entrada tx = new Taximetro_entrada();
				tx.main(null);
				frame.dispose();

			}
		});
		
		
	}

}
