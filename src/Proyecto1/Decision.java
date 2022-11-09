package Proyecto1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Decision {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @param i 
	 */
	public static void main(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Decision window = new Decision( xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD,  xmontoE);
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
	public Decision(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {
		initialize(xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD, xmontoE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE) {

		
		frame = new JFrame();
		frame.setBounds(100, 100, 347, 209);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Desea Evaluar otra Ruta??");
		lblNewLabel.setBounds(102, 53, 182, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Si");
		btnNewButton.setBounds(28, 104, 89, 23);
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
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(126, 104, 89, 23);
		frame.getContentPane().add(btnNo);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				Resultado result = new Resultado(xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD, xmontoE);
				result.main(xcantA,  xcantB,  xcantC,  xcantD,  xcantE,  xmontoA,  xmontoB,  xmontoC,  xmontoD, xmontoE);
				frame.dispose();

			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Cancelar");
		btnNewButton_1_1.setBounds(225, 104, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnVolverAtrasachtionbutton(evt);
			}
			private void btnVolverAtrasachtionbutton(ActionEvent evt) {
				
				frame.dispose();

			}
		});
	}

}
