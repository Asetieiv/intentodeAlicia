package modelo;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Crear Personaje");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 94, 125, 32);
		add(btnNewButton);
		
		JLabel txtnombre = new JLabel("nombre:");
		txtnombre.setForeground(new Color(0, 255, 64));
		txtnombre.setBounds(173, 63, 111, 46);
		add(txtnombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 101, 113, 20);
		add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("secretos:");
		lblNewLabel_1_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_1_1.setBounds(310, 63, 111, 46);
		add(lblNewLabel_1_1);
		
		JSpinner secretos = new JSpinner();
		secretos.setBounds(310, 101, 58, 20);
		add(secretos);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ubicación:");
		lblNewLabel_1_1_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_1_1_1.setBounds(394, 63, 111, 46);
		add(lblNewLabel_1_1_1);
		
		JSpinner ubicacion = new JSpinner();
		ubicacion.setBounds(394, 101, 58, 20);
		add(ubicacion);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("locura:");
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_1_1_1_1.setBounds(493, 63, 111, 46);
		add(lblNewLabel_1_1_1_1);
		
		JSpinner locura = new JSpinner();
		locura.setBounds(493, 101, 58, 20);
		add(locura);
		

	

}
