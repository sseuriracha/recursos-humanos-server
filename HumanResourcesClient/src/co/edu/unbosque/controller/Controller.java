package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CandidateDTO;
import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.view.DisplayFrame;
import co.edu.unbosque.view.InputFrame;

/**
 * The Controller class, implementing ActionListener, is where all the methods are triggered according to which part of the GUI the user interacts with. The ActionListener is the interface that allows the software to perform an operation after some input from the user in the input windo.
 */

public class Controller implements ActionListener {
	private InputFrame gui;
	private DisplayFrame display;
	private Cliente cliente;
	
/**
 * The class' constructor creates all the objects necessary to perform the operations that the user requires.
 */
	
	public Controller() {
		gui = new InputFrame(this);
		display = new DisplayFrame();
		gui.setVisible(true);
		cliente = new Cliente(5000, "localhost");
		// TODO Auto-generated constructor stub
	}

	/**
	 * The actionPerformed method is implemented from the ActionListener interface. It allows for methods to run after an interaction with the user(an event) happens. 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(gui.getiP().CREATE)) {
			try {
				String name = gui.getiP().getNameinput().getText();
				String lastname = gui.getiP().getLastnameinput().getText();
				String position = gui.getiP().getPositioninput().getText();
				String id = gui.getiP().getIdinput().getText();
				String edad = gui.getiP().getAgeinput().getText();
				
				String aux = "ADD " + name + " " + lastname + " " + position + " " + id + " " + edad;
				cliente.agregar(aux);
				
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Por favor, no ingrese letras para la edad");
			}
		}
		if (e.getActionCommand().equals(gui.getiP().READ)) {
			
		}
		if (e.getActionCommand().equals(gui.getiP().UPDATE)) {
			String name = gui.getiP().getNameinput().getText();
			String lastname = gui.getiP().getLastnameinput().getText();
			String position = gui.getiP().getPositioninput().getText();
			String id = gui.getiP().getIdinput().getText();
			String edad = gui.getiP().getAgeinput().getText();
			
			String aux = "UPD " + name + " " + lastname + " " + position + " " + id + " " + edad;
			cliente.agregar(aux);
		}
		if (e.getActionCommand().equals(gui.getiP().DELETE)) {
			String name = gui.getiP().getNameinput().getText();
			String lastname = gui.getiP().getLastnameinput().getText();
			String position = gui.getiP().getPositioninput().getText();
			String id = gui.getiP().getIdinput().getText();
			String edad = gui.getiP().getAgeinput().getText();
			
			String aux = "DEL " + name + " " + lastname + " " + position + " " + id + " " + edad;
			cliente.agregar(aux);
		}
	}

}
