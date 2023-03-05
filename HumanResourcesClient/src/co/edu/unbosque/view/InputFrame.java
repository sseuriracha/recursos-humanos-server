package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

/**
 * The class InputFrame creates the window where the user will type in a candidate's information.
 *
 */

public class InputFrame extends JFrame {
	
	private InputPanel iP;
	
	/**
	 * The class' constructor sets the configuration of the window.
	 * @param cont controller that will allow the objects in the window perform operations.
	 */
	
	public InputFrame (Controller cont) {
		setSize(750, 500);
		setResizable(false);
		setTitle("Gestion de Candidatos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		iP = new InputPanel();
		add(iP);
		iP.getCreate().addActionListener(cont);
		iP.getRead().addActionListener(cont);
		iP.getUpdate().addActionListener(cont);
		iP.getDelete().addActionListener(cont);
	}

	public InputPanel getiP() {
		return iP;
	}
	

}
