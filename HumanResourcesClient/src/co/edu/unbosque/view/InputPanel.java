package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * The class InputPanel is the container with all text fields to input information, and buttons to perform CRUD operations.
 *
 */

public class InputPanel extends JPanel {
	
	private JLabel name;
	private JTextField nameinput;
	private JLabel lastname;
	private JTextField lastnameinput;
	private JLabel position;
	private JTextField positioninput;
	private JLabel id;
	private JTextField idinput;
	private JLabel age;
	private JTextField ageinput;
	private JButton create;
	private JButton read;
	private JButton update;
	private JButton delete;
	private Font fontlabel;
	private Font fontinput;
	public static final String CREATE = "Crear";
	public static final String READ = "Leer";
	public static final String UPDATE = "Actualizar";
	public static final String DELETE = "Eliminar";
	private static final int ANCHO = 5;
	private static final int ALTO = 10;
	
	/**
	 * The class' constructor sets the configuration of the panel, and adds all the fields and buttons to it.
	 */
	
	public InputPanel() {
		
		setBackground(new Color(236, 199, 255));
		setLayout(new GridLayout(7, 2, 5, 5));
	    setBorder(new EmptyBorder(10, 10, 10, 10));
		name = new JLabel ("Nombre");
		nameinput = new JTextField();
		lastname = new JLabel ("Apellido");
		lastnameinput = new JTextField();
		lastnameinput.setSize(ANCHO, ALTO);
		position = new JLabel ("Cargo");
		positioninput = new JTextField();
		positioninput.setSize(ANCHO, ALTO);
		id = new JLabel ("C.C.");
		idinput = new JTextField();
		idinput.setSize(ANCHO, ALTO);
		age = new JLabel ("Edad");
		ageinput = new JTextField ();
		ageinput.setSize(ANCHO, ALTO);
		create = new JButton ("Crear");
		read = new JButton("Leer");
		update = new JButton("Actualizar");
		delete = new JButton("Borrar");
		create.setActionCommand(CREATE);
		read.setActionCommand(READ);
		update.setActionCommand(UPDATE);
		delete.setActionCommand(DELETE);
		
		fontlabel = new Font ("Arial", Font.ITALIC | Font.BOLD, 20);
		fontinput = new Font ("Arial", Font.ITALIC, 18);
		
		name.setFont(fontlabel);
		nameinput.setFont(fontinput);
		lastname.setFont(fontlabel);
		lastnameinput.setFont(fontinput);
		position.setFont(fontlabel);
		positioninput.setFont(fontinput);
		id.setFont(fontlabel);
		idinput.setFont(fontinput);
		age.setFont(fontlabel);
		ageinput.setFont(fontinput);
		
		create.setBackground(new Color(168, 255, 164));
		read.setBackground(new Color(255, 253, 143));
		update.setBackground(new Color(143, 175, 255));
		delete.setBackground(new Color (255, 143, 143));
		
		add(name);
		add(nameinput);
		add(lastname);
		add(lastnameinput);
		add(position);
		add(positioninput);
		add(id);
		add(idinput);
		add(age);
		add(ageinput);
		add(create);
		add(read);
		add(update);
		add(delete);
		
	}

	public JTextField getNameinput() {
		return nameinput;
	}

	public JTextField getLastnameinput() {
		return lastnameinput;
	}

	public JTextField getPositioninput() {
		return positioninput;
	}

	public JTextField getIdinput() {
		return idinput;
	}

	public JTextField getAgeinput() {
		return ageinput;
	}

	public JButton getCreate() {
		return create;
	}

	public JButton getRead() {
		return read;
	}

	public JButton getUpdate() {
		return update;
	}

	public JButton getDelete() {
		return delete;
	}

}
