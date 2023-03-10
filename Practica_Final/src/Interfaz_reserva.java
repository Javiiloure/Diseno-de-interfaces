import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.toedter.calendar.JCalendar;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class Interfaz_reserva {

	private JFrame frame;
	protected static Font fuente = new Font("Tahoma", Font.PLAIN, 13);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_reserva window = new Interfaz_reserva();
					window.frame.setLocationRelativeTo(null);
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
	public Interfaz_reserva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 231, 226));
		frame.setResizable(false);
		frame.setTitle("Nueva reserva");
		frame.setBounds(100, 100, 706, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Calendario para elegir la fecha del evento
		JCalendar calendario = new JCalendar();
		calendario.setBackground(new Color(255, 231, 226));
		calendario.setBounds(175, 468, 330, 250);
		frame.getContentPane().add(calendario);
		
		
		// Botones para elegir el tipo de evento
		JRadioButton banquete = new JRadioButton("Banquete");
		banquete.setFont(fuente);
		banquete.setBackground(new Color(255, 231, 226));
		banquete.setBounds(175, 364, 133, 23);
		frame.getContentPane().add(banquete);
		JRadioButton congreso = new JRadioButton("Congreso");
		congreso.setFont(fuente);
		congreso.setBackground(new Color(255, 231, 226));
		congreso.setBounds(175, 278, 122, 23);
		frame.getContentPane().add(congreso);
		JRadioButton jornada = new JRadioButton("Jornada");
		jornada.setFont(fuente);
		jornada.setBackground(new Color(255, 231, 226));
		jornada.setBounds(175, 252, 133, 23);
		frame.getContentPane().add(jornada);
		
		// Boton para guardar la reserva 
		JButton guardar_reserva = new JButton("Guardar reserva");
		guardar_reserva.setFont(fuente);
		guardar_reserva.setBounds(256, 729, 175, 32);
		frame.getContentPane().add(guardar_reserva);
		guardar_reserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		
		// Spinner para obtener el numero de personas 
		SpinnerModel model = new SpinnerNumberModel(5, 1, 100, 1);
		JSpinner personas = new JSpinner(model);
		personas.setBounds(323, 195, 66, 20);
		
		frame.getContentPane().add(personas);
		
		JLabel numero_personas = new JLabel("Personas:");
		numero_personas.setFont(fuente);
		numero_personas.setBounds(175, 194, 145, 20);
		frame.getContentPane().add(numero_personas);
		
		// Seleccion del tipo de cocina
		Choice tipo_cocina = new Choice();
		tipo_cocina.setFont(fuente);
		tipo_cocina.setBounds(280, 160, 109, 20);
		tipo_cocina.addItem("Buffet");
		tipo_cocina.addItem("Carta");
		tipo_cocina.addItem("Pedir cita");
		tipo_cocina.addItem("No precisa");
		frame.getContentPane().add(tipo_cocina);
		
		JLabel tipo_cocina_label = new JLabel("Cocina:");
		tipo_cocina_label.setFont(fuente);
		tipo_cocina_label.setBounds(175, 160, 95, 23);
		frame.getContentPane().add(tipo_cocina_label);
		
		JLabel tipo_evento = new JLabel("Tipo de evento:");
		tipo_evento.setFont(fuente);
		tipo_evento.setBounds(175, 225, 152, 20);
		frame.getContentPane().add(tipo_evento);
		
		// Seleccionar el numero de jornadas en el caso de que sea congreso
		// y si requieren habitaciones
		JLabel jornadas = new JLabel("Numero de jornadas:");
		jornadas.setFont(fuente);
		jornadas.setBounds(205, 309, 162, 23);
		frame.getContentPane().add(jornadas);
		SpinnerModel model_2 = new SpinnerNumberModel(1, 1, 100, 1);
		JSpinner numero_jornadas = new JSpinner(model_2);
		numero_jornadas.setBounds(377, 311, 68, 20);
		frame.getContentPane().add(numero_jornadas);
		JCheckBox habitaciones = new JCheckBox("Requiere habitaciones");
		habitaciones.setFont(fuente);
		habitaciones.setBackground(new Color(255, 231, 226));
		habitaciones.setFont(fuente);
		habitaciones.setBounds(205, 338, 214, 23);
		frame.getContentPane().add(habitaciones);
		
		// Elegimos el tipo de mesa y el numero de comensales por mesa
		Choice tipo_mesa = new Choice();
		tipo_mesa.setBounds(352, 394, 117, 20);
		tipo_mesa.addItem("Rectangular");
		tipo_mesa.addItem("Redonda");
		frame.getContentPane().add(tipo_mesa);
		JLabel mesa = new JLabel("Tipo de mesa:");
		mesa.setFont(fuente);
		mesa.setBounds(205, 394, 107, 20);
		frame.getContentPane().add(mesa);
		SpinnerModel model_3 = new SpinnerNumberModel(1, 1, 100, 1);
		JSpinner comensales_mesa = new JSpinner(model_3);
		comensales_mesa.setBounds(401, 426, 68, 20);
		frame.getContentPane().add(comensales_mesa);
		JLabel comensales = new JLabel("Comensales por mesa:");
		comensales.setFont(fuente);
		comensales.setBounds(205, 425, 184, 20);
		frame.getContentPane().add(comensales);
		
		// Titulo e imagen del hotel
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("Hotel_mini.png");
		imagen.setIcon(icono);
		imagen.setBounds(464, 6, 216, 174);
		frame.getContentPane().add(imagen);
		JLabel nueva_reserva = new JLabel("Nueva reserva");
		nueva_reserva.setFont(new Font("Tahoma", Font.PLAIN, 22));
		nueva_reserva.setHorizontalAlignment(SwingConstants.CENTER);
		nueva_reserva.setBounds(208, 21, 237, 50);
		frame.getContentPane().add(nueva_reserva);
		
		// Entrada de texto para el nombre
		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(fuente);
		nombre.setBounds(175, 92, 66, 23);
		frame.getContentPane().add(nombre);
		JTextField input_nombre = new JTextField();
		input_nombre.setBounds(256, 94, 133, 20);
		frame.getContentPane().add(input_nombre);
		input_nombre.setColumns(10);
		
		// Entrada de texto para el telefono
		JLabel telefono = new JLabel("Telefono:");
		telefono.setFont(fuente);
		telefono.setBounds(175, 126, 71, 23);
		frame.getContentPane().add(telefono);
		JTextField input_telefono = new JTextField();
		input_telefono.setBounds(256, 126, 133, 20);
		frame.getContentPane().add(input_telefono);
		input_telefono.setColumns(10);
		
		// Controlamos que solo se pueda seleccionar un tipo de reserva (jornada, congreso o banquete)
		jornada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				banquete.setSelected(false);
				congreso.setSelected(false);
				numero_jornadas.setEnabled(false);
				jornadas.setEnabled(false);
				habitaciones.setEnabled(false);
				mesa.setEnabled(false);
				tipo_mesa.setEnabled(false);
				comensales.setEnabled(false);
				comensales_mesa.setEnabled(false);
			}
		});
		congreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jornada.setSelected(false);
				banquete.setSelected(false);
				numero_jornadas.setEnabled(true);
				jornadas.setEnabled(true);
				habitaciones.setEnabled(true);
				mesa.setEnabled(false);
				tipo_mesa.setEnabled(false);
				comensales.setEnabled(false);
				comensales_mesa.setEnabled(false);
			}
		});
		banquete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jornada.setSelected(false);
				congreso.setSelected(false);
				numero_jornadas.setEnabled(false);
				jornadas.setEnabled(false);
				habitaciones.setEnabled(false);
				mesa.setEnabled(true);
				tipo_mesa.setEnabled(true);
				comensales.setEnabled(true);
				comensales_mesa.setEnabled(true);
			}
		});
	}
}
