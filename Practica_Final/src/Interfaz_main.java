import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class Interfaz_main {

	private JFrame frame;
	protected static String tema = "javax.swing.plaf.metal.MetalLookAndFeel";					
					//javax.swing.plaf.metal.MetalLookAndFeel
					//com.sun.java.swing.plaf.motif.MotifLookAndFeel
					//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
					//javax.swing.plaf.nimbus.NimbusLookAndFeel

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UIManager.setLookAndFeel(tema); 
					Interfaz_main window = new Interfaz_main();
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
	public Interfaz_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 774);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Label para mostrar el logo de hotel
		JLabel imagen = new JLabel();
		imagen.setBounds(58, 196, 532, 506);
		imagen.setIcon(new ImageIcon("Hotel.png"));
		frame.getContentPane().add(imagen);
		
		// MenuBar contenedora de los submenus
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new GridLayout(1, 5, 0, 0));
		menuBar.setBounds(0, 0, 648, 56);
		frame.getContentPane().add(menuBar);
		
		// Submenu para añadir una reserva
		JMenu planificador = new JMenu();
		planificador.setText("Planificador");
		planificador.setBounds(58, 36, 166, 38);
		JMenuItem nueva_reserva = new JMenuItem("Nueva reserva");
		nueva_reserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_reserva.main(null);
			}
		});
		planificador.add(nueva_reserva);
		menuBar.add(planificador);
		
		// Submenu para modificar la interfaz
		JMenu accesibilidad = new JMenu();
		accesibilidad.setText("Accesibilidad");
		accesibilidad.setBounds(58, 36, 166, 38);
		
		// Menu para elegir entre los temas disponibles
		JMenu cambiar_temas = new JMenu("Temas");
		accesibilidad.add(cambiar_temas);
		JMenuItem metal = new JMenuItem("Metal");
		JMenuItem motif = new JMenuItem("Motif");
		JMenuItem nimbus = new JMenuItem("Nimbus");
		JMenuItem windows = new JMenuItem("Windows Classic");
		
		metal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tema = "javax.swing.plaf.metal.MetalLookAndFeel";
				try {
					UIManager.setLookAndFeel(tema); 
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		motif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tema = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
				try {
					UIManager.setLookAndFeel(tema);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		nimbus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tema = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
				try {
					UIManager.setLookAndFeel(tema);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});	
		windows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tema = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
				try {
					UIManager.setLookAndFeel(tema);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		cambiar_temas.add(metal);
		cambiar_temas.add(motif);
		cambiar_temas.add(nimbus);
		cambiar_temas.add(windows);
		
		// Menu para cambiar el tamaño de la letra
		JMenu cambiar_tamaños = new JMenu("Cambiar tamaño letra");		
		JMenuItem tamaño_11 = new JMenuItem("11");
		JMenuItem tamaño_13 = new JMenuItem("13");
		JMenuItem tamaño_15 = new JMenuItem("15");
		JMenuItem tamaño_17 = new JMenuItem("17");
		
		tamaño_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_reserva.fuente = new Font("Tahoma", Font.PLAIN, 11);
			}
		});
		
		tamaño_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_reserva.fuente = new Font("Tahoma", Font.PLAIN, 13);
			}
		});
		
		tamaño_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_reserva.fuente = new Font("Tahoma", Font.PLAIN, 15);
			}
		});
		
		tamaño_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_reserva.fuente = new Font("Tahoma", Font.PLAIN, 17);
			}
		});
		
		cambiar_tamaños.add(tamaño_11);
		cambiar_tamaños.add(tamaño_13);
		cambiar_tamaños.add(tamaño_15);
		cambiar_tamaños.add(tamaño_17);
		accesibilidad.add(cambiar_tamaños);
		menuBar.add(accesibilidad);
	}
}
