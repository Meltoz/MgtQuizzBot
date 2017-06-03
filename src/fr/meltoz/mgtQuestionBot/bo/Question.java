package fr.meltoz.mgtQuestionBot.bo;

public class Question {
	
	private int id;
	private String statement;
	private String answer;
	
	
	public Question(){
		
	}
	
	public Question(int id, String statement, String answer){
		setId(id);
		setStatement(statement);
		setAnswer(answer);
	}
	
	public Question(Question question){
		setId(question.getId());
		setStatement(question.getStatement());
		setAnswer(question.getAnswer());
	}
	
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
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	

}
