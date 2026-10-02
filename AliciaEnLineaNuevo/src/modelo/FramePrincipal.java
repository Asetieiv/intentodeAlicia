package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		Mundo mundo = new Mundo();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 586, 33);
		contentPane.add(menuBar);
		
		JButton btnNewButton = new JButton("Crear");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mundo");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Personaje");
		menuBar.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 31, 596, 428);
		contentPane.add(panel);
	}
}
