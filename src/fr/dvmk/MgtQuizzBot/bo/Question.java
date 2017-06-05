package fr.dvmk.MgtQuizzBot.bo;

import java.io.Serializable;

public class Question implements Serializable {
	
	/*** Attributes ***/
	private static final long serialVersionUID = 2972780239237634804L;
	private int id;
	private String statement;
	private String response;
	
	/*** Constructors ***/
	public Question(){
		
	}
	
	public Question(int id, String statement, String response){
		setId(id);
		setStatement(statement);
		setResponse(response);
	}
	
	public Question(Question q){
		setId(q.getId());
		setStatement(q.getStatement());
		setResponse(q.getResponse());
	}
	
	/*** Operations ***/
	public Question clone()
	{
		return new Question(this);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id+") ");
		sb.append(statement +" / ");
		sb.append(response);
		return sb.toString();
	}

	/*** Getters and setters ***/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
