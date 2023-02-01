import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.JMenu;

import java.awt.Font;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Interfaz extends javax.swing.JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz interfaz = new Interfaz();
					//interfaz.setBounds(0, 0, 900, 900);
					interfaz.setVisible(true);
					interfaz.setResizable(false);
					interfaz.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz() {
		setDefaultCloseOperation(Interfaz.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 698);
		
		setTitle("Parsers XML");
		getContentPane().setLayout(null);
		
		// Creamos y añadimos boton de limpiar
		JButton limpiar = new JButton("Limpiar");
		limpiar.setBounds(468, 67, 133, 41);
		getContentPane().add(limpiar);
		
		// Creamos una MenuBar y le añadimos los diferentes menus
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new GridLayout(1, 5, 0, 0));
		menuBar.setBounds(0, 0, 626, 56);
		getContentPane().add(menuBar);
		
		// Menu con submenu Gestionar DOM
		JMenu gestionar_DOM = new JMenu("Gestionar_DOM");
		JMenuItem crear_nodo = new JMenuItem("Crear nodo");
		JMenuItem mostrar_nodo = new JMenuItem("Mostrar nodo");
		JMenuItem añadir_nodo = new JMenuItem("Añadir nodo");
		gestionar_DOM.add(crear_nodo);
		gestionar_DOM.add(mostrar_nodo);
		gestionar_DOM.add(añadir_nodo);
		menuBar.add(gestionar_DOM);
		
		// Menu con submenu Gestionar SAX
		JMenu gestionar_SAX = new JMenu("Gestionar_SAX");
		JMenuItem crear_evento = new JMenuItem("Crear evento");
		JMenuItem mostrar_evento = new JMenuItem("Mostrar evento");
		JMenuItem añadir_evento = new JMenuItem("Añadir evento");
		gestionar_SAX.add(crear_evento);
		gestionar_SAX.add(mostrar_evento);
		gestionar_SAX.add(añadir_evento);
		menuBar.add(gestionar_SAX);
		
		// Menu con submenu Gestionar StAX
		JMenu gestionar_StAX = new JMenu("Gestionar_StAX");
		JMenuItem crear = new JMenuItem("Crear");
		JMenuItem mostrar = new JMenuItem("Mostrar");
		JMenuItem APICursor = new JMenuItem("APICursor");
		JMenuItem APIEvents = new JMenuItem("APIEvents");
		gestionar_StAX.add(crear);
		gestionar_StAX.add(mostrar);
		gestionar_StAX.add(APICursor);
		gestionar_StAX.add(APIEvents);
		menuBar.add(gestionar_StAX);
		
		// Menu con submenu Validacion
		JMenu validacion = new JMenu("Validacion");
		JMenuItem xsd = new JMenuItem("XSD");
		JMenuItem dtd = new JMenuItem("DTD");
		validacion.add(xsd);
		validacion.add(dtd);
		menuBar.add(validacion);
		
		// Menu Gestion JAXB
		JMenu gestion_JAXB = new JMenu("Gestion JAXB");
		menuBar.add(gestion_JAXB);
		
		// Creamos un label para mostrar el estado del archivo
		JLabel label = new JLabel("Estado: Archivo no seleccionado");
		label.setBounds(43, 67, 415, 39);
		label.setFont(new Font(String.valueOf(label.getFont()), Font.PLAIN, 16));
		getContentPane().add(label);
		
		// Creamos un textArea y le añadimos un scroll
		JTextArea textArea = new JTextArea();
		textArea.setBounds(58, 180, 303, 169);
		JScrollPane scrollBar = new JScrollPane(textArea);
		scrollBar.setBounds(43, 144, 558, 480);
		getContentPane().add(scrollBar);
	}
}
