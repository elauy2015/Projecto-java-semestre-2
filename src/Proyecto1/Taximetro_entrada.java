package Proyecto1;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Taximetro_entrada {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taximetro_entrada window = new Taximetro_entrada();
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
	public Taximetro_entrada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Rutas ruta = new Rutas("1");
		frame = new JFrame();
		frame.setBounds(100, 100, 364, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Uni\u00F3n de Taxis La Misericordia");
		lblNewLabel.setBounds(94, 27, 198, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(20, 63, 313, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTarifab = new JLabel("TARIFA(B/.)");
		lblTarifab.setBounds(210, 88, 82, 14);
		frame.getContentPane().add(lblTarifab);
		
		JLabel lblB = new JLabel("B/.2.50");
		lblB.setBounds(210, 114, 62, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblB_1 = new JLabel("B/.3.25");
		lblB_1.setBounds(210, 138, 52, 14);
		frame.getContentPane().add(lblB_1);
		
		JLabel lblB_2 = new JLabel("B/.4.35");
		lblB_2.setBounds(210, 165, 52, 14);
		frame.getContentPane().add(lblB_2);
		
		JLabel lblRutaB_1_1_2 = new JLabel("B/.1.75");
		lblRutaB_1_1_2.setBounds(210, 191, 52, 14);
		frame.getContentPane().add(lblRutaB_1_1_2);
		
		JLabel lblRutaB_1_1_1_2 = new JLabel("B/.5.00");
		lblRutaB_1_1_1_2.setBounds(210, 218, 52, 14);
		frame.getContentPane().add(lblRutaB_1_1_1_2);
		
		JLabel lblRutaB_1_1_1_1 = new JLabel("6. Salir ->>Exit");
		lblRutaB_1_1_1_1.setBounds(71, 244, 83, 14);
		frame.getContentPane().add(lblRutaB_1_1_1_1);
		
		JLabel lblRutaB_1_1_1 = new JLabel("5. Ruta E");
		lblRutaB_1_1_1.setBounds(71, 217, 52, 14);
		frame.getContentPane().add(lblRutaB_1_1_1);
		
		JLabel lblRutaB_1_1 = new JLabel("4. Ruta D");
		lblRutaB_1_1.setBounds(71, 190, 52, 14);
		frame.getContentPane().add(lblRutaB_1_1);
		
		JLabel lblRutaC = new JLabel("3. Ruta C");
		lblRutaC.setBounds(71, 164, 52, 14);
		frame.getContentPane().add(lblRutaC);
		
		JLabel lblRutaB = new JLabel("2. Ruta B");
		lblRutaB.setBounds(71, 137, 52, 14);
		frame.getContentPane().add(lblRutaB);
		
		JLabel lblRutaA = new JLabel("1. Ruta A");
		lblRutaA.setBounds(71, 113, 62, 14);
		frame.getContentPane().add(lblRutaA);
		
		JLabel lblDisponibilidad = new JLabel("DISPONIBILIDAD");
		lblDisponibilidad.setBounds(61, 88, 93, 14);
		frame.getContentPane().add(lblDisponibilidad);
		
		JLabel lblNewLabel_1_1 = new JLabel("----------------------------------------------------------------------------");
		lblNewLabel_1_1.setBounds(20, 274, 313, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblParaQueRuta = new JLabel("Para que Ruta se dirige?[1-6]");
		lblParaQueRuta.setBounds(61, 311, 178, 14);
		frame.getContentPane().add(lblParaQueRuta);
		
		textField = new JTextField();
		textField.setBounds(61, 347, 222, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(75, 391, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				String rutaa = textField.getText();
				
				if(rutaa.equals("1")) {
					Rutas.main("1");
					frame.dispose();
				}
				else if(rutaa.equals("2")) {
					Rutas.main("2");
					frame.dispose();
				}
				else if(rutaa.equals("3")) {
					Rutas.main("3");
					frame.dispose();
				}
				else if(rutaa.equals("4")) {
					Rutas.main("4");
					frame.dispose();
				}
				else if(rutaa.equals("5")) {
					Rutas.main("5");
					frame.dispose();
				}
				else if(rutaa.equals("6")) {
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Ingrese un numero correcto");
				}

			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(178, 391, 89, 23);
		frame.getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				
				frame.dispose();

			}
		});
		
		
	}
}
