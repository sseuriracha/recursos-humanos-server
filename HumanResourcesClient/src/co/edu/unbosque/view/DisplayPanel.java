package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * The class DisplayPanel is the visual container that will show the list of candidates,
 *
 */

public class DisplayPanel extends JPanel {
	
	private JTextArea list;
	
	/**
	 * The class' constructor creates the text area where the list will be displayed.
	 */
	
	public DisplayPanel() {
		list = new JTextArea();
		list.setSize(700, 450);
		list.setEditable(false);
		add(list);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns the TextArea object where the list is displayed. From here, it is possible to access the string of text with all the candidate information.
	 * @return
	 */

	public JTextArea getList() {
		return list;
	}

	
	
	
}
