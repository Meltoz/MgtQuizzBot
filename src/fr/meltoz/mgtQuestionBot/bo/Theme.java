package fr.meltoz.mgtQuestionBot.bo;

public class Theme {

	private String name;
	private int id;
	
	
	
	public Theme(){
		
	}
	
	
	public Theme(String name, int id){
		setId(id);
		setName(name);
	}
	
	
	/**
	 * Return the name of the theme
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Use for set the theme's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Return the theme's id
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Set the theme's id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
}
