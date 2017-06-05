package fr.dvmk.MgtQuizzBot.bo;

import java.io.Serializable;

public class Theme implements Serializable {
	
	
	/*** Attributes ***/
	private static final long serialVersionUID = 5513424650479163411L;
	private int id;
	private String name;
	
	
	/***Constructor ***/
	public Theme(){
		
	}
	
	public Theme(int id, String name){
		setId(id);
		setName(name);
	}
	
	public Theme(Theme t){
		setId(t.getId());
		setName(t.getName());
	}
	
	

	/***Getter and Setter***/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
