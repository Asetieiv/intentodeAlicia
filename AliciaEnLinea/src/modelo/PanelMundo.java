package modelo;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nombre;

	/**
	 * Create the panel.
	 */
	public PanelMundo() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		nombre = new JTextField();
		nombre.setBounds(164, 96, 86, 20);
		add(nombre);
		nombre.setColumns(10);
		
		JSpinner secretos = new JSpinner();
		secretos.setBounds(281, 96, 60, 20);
		add(secretos);
		
		JSpinner locura = new JSpinner();
		locura.setBounds(369, 96, 60, 20);
		add(locura);
		
		JSpinner ubicacion = new JSpinner();
		ubicacion.setBounds(463, 96, 60, 20);
		add(ubicacion);
		
		JLabel txtNombre = new JLabel("Nombre");
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setForeground(new Color(0, 255, 64));
		txtNombre.setBounds(164, 68, 67, 28);
		add(txtNombre);
		
		JButton crearPersonaje = new JButton("Crear personaje\r\n");
		crearPersonaje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int s = (int) secretos.getValue();
				int u = (int) ubicacion.getValue();
				int l = (int) locura.getValue();
				Personaje nuevo = new Personaje(nombre.getText(), s, u, l);
				mundo.agregarPersonajes(nuevo);
			}
		});
		crearPersonaje.setFont(new Font("Arial", Font.PLAIN, 12));
		crearPersonaje.setBounds(10, 88, 130, 36);
		add(crearPersonaje);
		
		JLabel txtLocura = new JLabel("Locura");
		txtLocura.setForeground(new Color(0, 255, 64));
		txtLocura.setFont(new Font("Arial", Font.PLAIN, 12));
		txtLocura.setBounds(369, 68, 130, 28);
		add(txtLocura);
		
		JLabel txtUbicacion = new JLabel("Ubicación");
		txtUbicacion.setForeground(new Color(0, 255, 64));
		txtUbicacion.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUbicacion.setBounds(464, 68, 130, 28);
		add(txtUbicacion);
		
		
		JLabel txtSecretos = new JLabel("Secretos");
		txtSecretos.setForeground(new Color(0, 255, 64));
		txtSecretos.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSecretos.setBounds(281, 68, 67, 28);
		add(txtSecretos);
		
		JLabel txtPersonaje = new JLabel("Personaje");
		txtPersonaje.setForeground(new Color(0, 255, 64));
		txtPersonaje.setFont(new Font("Arial", Font.PLAIN, 22));
		txtPersonaje.setBounds(22, 29, 110, 28);
		add(txtPersonaje);

	}

}
