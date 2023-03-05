package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

/**
 * The DisplayFrame class creates a new window where all of the candidates' information will be displayed.
 *
 */

public class DisplayFrame extends JFrame {
	
	private DisplayPanel dP;
	
	/**
	 * The class' constructor sets the configuration of the window.  
	 * @param cont controller that will allow the objects in the window to perform operations.
	 */
	
	public DisplayFrame() {
		setSize(750, 500);
		setResizable(false);
		setTitle("Listado de Candidatos");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		dP = new DisplayPanel();
		add(dP);
		// TODO Auto-generated constructor stub
	}

	public DisplayPanel getdP() {
		return dP;
	}
	
	
	
	

}
