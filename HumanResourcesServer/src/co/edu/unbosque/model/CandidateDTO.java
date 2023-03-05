// 
// Decompiled by Procyon v0.5.36
// 

package co.edu.unbosque.model;

import java.io.Serializable;

public class CandidateDTO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastname;
    private String id;
    private String position;
    private int age;
    
    public CandidateDTO(final String name, final String lastname, final String id, final String position, final int age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.position = position;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(final String position) {
        this.position = position;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(final int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Candidate [Name: " + this.name + ", Last Name: " + this.lastname + ", ID: " + this.id + ", Position: " + this.position + ", Age: " + this.age + "]\n";
    }
}
