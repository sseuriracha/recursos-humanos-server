package co.edu.unbosque.model.persistence;

import java.io.IOException;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CandidateDTO;

/**
 * CandidateDAO class is the Data Access Object in charge of performing CRUD operations on the list of candidates.
 *
 */

public class CandidateDAO {
	
	private CandidateFile archivo;
	private ArrayList<CandidateDTO> list;
	
	/**
	 * Constructor of the CandidateDAO class. Creates a CandidateFile object that will be used on CRUD operations.
	 * @param archivo CandidateFile object that reads and writes on the candidate file.
	 */
	
	public CandidateDAO(CandidateFile archivo) {
		this.archivo = archivo;
	}
	
	
	/**
	 * Performs a search for candidates in the list, using their unique ID number.
	 * @param cedula ID number that will be used to perform the search
	 * @param candidatos list of candidates to search
	 * @return an object with the information of the found candidate. In case it cannot find a matching ID number, it will return an empty object.
	 */
	public CandidateDTO searchCandidate(String cedula, ArrayList<CandidateDTO> candidatos) {
		CandidateDTO candidatesearched = null;
		if (list.size() != 0) {
			for (int i = 0; i < candidatos.size(); i++) {
				if (cedula.equals(candidatos.get(i).getId())) {
					candidatesearched = candidatos.get(i);
					return candidatesearched;
				}
			}
		}
		return candidatesearched;
	}
	
	/**
	 * Adds a new candidate to the list, as well as writing it into the candidates' file.
	 * @param nombre name of the new candidate
	 * @param apellido last name of the new candidate
	 * @param cargo current position of the new candidate
	 * @param cedula ID number of the new candidate
	 * @param edad age of the new candidate
	 * @param lst list of candidates 
	 * @return true-or-false value on whether the candidate has been succesfully added or not.
	 */
	
	public boolean addCandidate(String nombre, String apellido, String cargo, String cedula, int edad) {

		CandidateDTO toadd = new CandidateDTO(nombre, apellido, cedula, cargo, edad);
		
		if (searchCandidate(cedula, list) == null && cedula.matches("[0-9]+") && cedula.length() > 2) {
			list.add(toadd);
			archivo.write(list);
			JOptionPane.showMessageDialog(null, "Agregado correctamente");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El candidato ya se encuentra registrado o la cedula tiene letras.");
			return false;
		}
	}
	
	/**
	 * Deletes the candidate with a matching ID number from input.
	 * @param cedula ID number of the candidate to delete
	 * @param lst list of candidates
	 */
	
	public void deleteCandidate(String cedula) {
		
		if (cedula.matches("[0-9]+") && cedula.length() > 2) {
			if (!cedula.equals("")) {
				if (searchCandidate(cedula, list) != null) {
					try {
						CandidateDTO todelete = searchCandidate(cedula, list);
						list.remove(todelete);
						archivo.getArchivo().delete();
						archivo.getArchivo().createNewFile();
						archivo.write(list);
						JOptionPane.showMessageDialog(null, "El candidato se elimino correctamente");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "El candidato ingresado no se encuentra registrado");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "La cedula solo debe tener numeros");
		}
		
	}
	
	/**
	 * Updates all the information of a candidate with a matching ID number.
	 * @param newname new name for the candidate
	 * @param newlast new last name for the candidate
	 * @param id unique ID number for a candidate
	 * @param newpos new position of the candidate
	 * @param newage new age of the candidate
	 * @param lst list of candidates
	 */
	
	public void updateCandidate (String newname, String newlast, String id, String newpos, int newage) {
		if (!id.equals("")) {
			if (searchCandidate(id, list) != null && id.matches("[0-9]+")) {
				try {
					CandidateDTO toupdate = searchCandidate(id, list);
					toupdate.setName(newname);
					toupdate.setLastname(newlast);
					toupdate.setPosition(newpos);
					toupdate.setId(id);
					toupdate.setAge(newage);
					JOptionPane.showMessageDialog(null, "Actualizado correctamente");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Revise el numero de cedula");
		}
	}


	public ArrayList<CandidateDTO> getList() {
		return list;
	}


	public void setList(ArrayList<CandidateDTO> list) {
		this.list = list;
	}
	
	
	
}