package Proyecto1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Resultado {
	int decimal1 ;
	double decimal2;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultado window = new Resultado(xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD, xmontoE);
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
	public Resultado(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {
		initialize(xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD, xmontoE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {

		
		decimal1 = decimal1 + xcantA+xcantB+xcantC+xcantD+xcantE;
		decimal2 = decimal2 + xmontoA+ xmontoB + xmontoC + xmontoD+ xmontoE;
		frame = new JFrame();
		frame.setBounds(100, 100, 336, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("("+decimal1+")");
		lblNewLabel.setBounds(66, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMontoTotalRecaudado = new JLabel("Monto Total Recaudado = B/.");
		lblMontoTotalRecaudado.setBounds(91, 33, 170, 14);
		frame.getContentPane().add(lblMontoTotalRecaudado);
		
		JLabel lblRutaAb = new JLabel("Ruta A=B/.");
		lblRutaAb.setBounds(91, 58, 68, 14);
		frame.getContentPane().add(lblRutaAb);
		
		JLabel lblNewLabel_1 = new JLabel("("+xcantA+")");
		lblNewLabel_1.setBounds(66, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMontoTotalRecaudado_1_1 = new JLabel("Ruta B=B/.");
		lblMontoTotalRecaudado_1_1.setBounds(91, 83, 68, 14);
		frame.getContentPane().add(lblMontoTotalRecaudado_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("("+xcantB+")");
		lblNewLabel_1_1.setBounds(66, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblMontoTotalRecaudado_1_1_1 = new JLabel("Ruta C=B/.");
		lblMontoTotalRecaudado_1_1_1.setBounds(91, 108, 68, 14);
		frame.getContentPane().add(lblMontoTotalRecaudado_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("("+xcantC+")");
		lblNewLabel_1_1_1.setBounds(66, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblMontoTotalRecaudado_1_1_1_1 = new JLabel("Ruta D=B/.");
		lblMontoTotalRecaudado_1_1_1_1.setBounds(91, 133, 68, 14);
		frame.getContentPane().add(lblMontoTotalRecaudado_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("("+xcantD+")");
		lblNewLabel_1_1_1_1.setBounds(66, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblMontoTotalRecaudado_1_1_1_1_1 = new JLabel("Ruta E=B/.");
		lblMontoTotalRecaudado_1_1_1_1_1.setBounds(91, 158, 68, 14);
		frame.getContentPane().add(lblMontoTotalRecaudado_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("("+xcantE+")");
		lblNewLabel_1_1_1_1_1.setBounds(66, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("("+xmontoA+")");
		lblNewLabel_1_2.setBounds(147, 58, 203, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("("+xmontoB+")");
		lblNewLabel_1_2_1.setBounds(147, 83, 183, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("("+xmontoC+")");
		lblNewLabel_1_2_1_1.setBounds(147, 108, 215, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("("+xmontoD+")");
		lblNewLabel_1_2_1_1_1.setBounds(147, 133, 203, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("("+xmontoE+")");
		lblNewLabel_1_2_1_1_1_1.setBounds(147, 158, 183, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(120, 194, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				
				Taximetro_entrada tx = new Taximetro_entrada();
				tx.main(null);
				frame.dispose();
				
				
			}
		});
		
		
		
		
		
		JLabel lblNewLabel_1_2_2 = new JLabel("("+decimal2+")");
		lblNewLabel_1_2_2.setBounds(248, 33, 102, 14);
		frame.getContentPane().add(lblNewLabel_1_2_2);
	}

}
