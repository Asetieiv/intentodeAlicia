package modelo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.CardLayout;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje() {
		
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Seleccionar personaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(24, 94, 166, 46);
		add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Personaje");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTitulo.setForeground(new Color(0, 255, 64));
		lblTitulo.setBounds(24, 18, 224, 46);
		add(lblTitulo);
		
		JButton btnEmbellecer = new JButton("Embellecer");
		btnEmbellecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmbellecer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEmbellecer.setBounds(44, 166, 125, 32);
		add(btnEmbellecer);
		
		JButton btnenDndeEst = new JButton("¿En dónde está?");
		btnenDndeEst.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnenDndeEst.setBounds(44, 226, 125, 32);
		add(btnenDndeEst);
		
		JButton btnesLindo = new JButton("¿Es lindo?");
		btnesLindo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnesLindo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnesLindo.setBounds(44, 286, 125, 32);
		add(btnesLindo);
		
		JButton btnesNormal = new JButton("¿Es normal?");
		btnesNormal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnesNormal.setBounds(44, 346, 125, 32);
		add(btnesNormal);
		
		JLabel lblRespuesta = new JLabel("Secretos:");
		lblRespuesta.setForeground(new Color(0, 255, 64));
		lblRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblRespuesta.setBounds(226, 320, 224, 46);
		add(lblRespuesta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 106, 132, 25);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEscribaElNombre = new JLabel("Escriba el nombre de su personaje");
		lblEscribaElNombre.setForeground(new Color(0, 255, 64));
		lblEscribaElNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEscribaElNombre.setBounds(245, 76, 174, 32);
		add(lblEscribaElNombre);
		
		JLabel lblLocura = new JLabel("Locura:");
		lblLocura.setForeground(new Color(0, 255, 64));
		lblLocura.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblLocura.setBounds(226, 155, 224, 46);
		add(lblLocura);
		
		JLabel lblUbicacin = new JLabel("Ubicación:");
		lblUbicacin.setForeground(new Color(0, 255, 64));
		lblUbicacin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblUbicacin.setBounds(226, 236, 224, 46);
		add(lblUbicacin);

	}
}
