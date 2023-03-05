package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * CandidateDTO is the Data Transfer Object containing the information from a single candidate. It is serialized in order to store every single CandidateDTO object.
 *
 */

public class CandidateDTO implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastname;
	private String id;
	private String position;
	private int age;
	
	/**
	 * <p>Constructor for the CandidateDTO class. The parameters mentioned will be used to build the object representing every candidate.
	 * @param name candidate's name
	 * @param lastname candidate's last name
	 * @param id candidate's ID number
	 * @param position candidate's current position
	 * @param age candidates's age
	 */
	public CandidateDTO(String name, String lastname, String id, String position, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.position = position;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [Name: " + name + ", Last Name: " + lastname + ", ID: " + id + ", Position: " + position
				+ ", Age: " + age + "]\n";
	}
	
	
	
	

}
