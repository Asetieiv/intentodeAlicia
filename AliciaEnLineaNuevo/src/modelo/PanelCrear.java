package modelo;
import modelo.Mundo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCrear extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public PanelCrear(Mundo mundo) {
		
		
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JSpinner spLocura = new JSpinner();
		spLocura.setBounds(24, 348, 58, 20);
		add(spLocura);
		
		JSpinner secretos = new JSpinner();
		secretos.setBounds(24, 198, 58, 20);
		add(secretos);
		
		JSpinner ubicacion = new JSpinner();
		ubicacion.setBounds(24, 276, 58, 20);
		add(ubicacion);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setForeground(new Color(0, 255, 64));
		lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblAviso.setBounds(250, 226, 287, 46);
		add(lblAviso);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(24, 129, 111, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Crear Personaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int s = (int) secretos.getValue();
				int u = (int) ubicacion.getValue();
				int l = (int) spLocura.getValue();
				Personaje nuevo = new Personaje(txtNombre.getText(), l, s, u);
				mundo.agregarPersonajes(nuevo);
				lblAviso.setText("Personaje '" + nuevo + "' creado con éxito!");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(327, 122, 125, 32);
		add(btnNewButton);
		
		JLabel lblNombre = new JLabel("nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setForeground(new Color(0, 255, 64));
		lblNombre.setBounds(24, 86, 111, 46);
		add(lblNombre);
		

		JLabel lblSecretos = new JLabel("secretos:");
		lblSecretos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSecretos.setForeground(new Color(0, 255, 64));
		lblSecretos.setBounds(24, 153, 111, 46);
		add(lblSecretos);
		

		
		JLabel lblUbicacion = new JLabel("ubicación:");
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUbicacion.setForeground(new Color(0, 255, 64));
		lblUbicacion.setBounds(24, 229, 111, 46);
		add(lblUbicacion);
		

		
		JLabel lblLocura = new JLabel("locura:");
		lblLocura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocura.setForeground(new Color(0, 255, 64));
		lblLocura.setBounds(24, 307, 111, 46);
		add(lblLocura);
		

		JLabel lblTitulo = new JLabel("Crea un personaje");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTitulo.setForeground(new Color(0, 255, 64));
		lblTitulo.setBounds(24, 18, 224, 46);
		add(lblTitulo);
	}

}
