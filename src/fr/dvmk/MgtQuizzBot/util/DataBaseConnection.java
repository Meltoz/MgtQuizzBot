package fr.dvmk.MgtQuizzBot.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DataBaseConnection {
	
	/*** ATTRIBUTES ***/
	private static DataBaseConnection instance =null;
	private Connection cnx;
	
	
	/*** CONSTRUCTORS ***/
	private DataBaseConnection() throws Exception{
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			
			ResourceBundle rb = ResourceBundle.getBundle("fr.dvmk.MgtQuizzBot.properties.config");
			String uri = rb.getString("sgbd.uri");
			String login = rb.getString("sgbd.login");
			String pass = rb.getString("sgbd.password");
			
			cnx = DriverManager.getConnection(uri, login, pass);
			
		}catch(ClassNotFoundException cnfe){
			throw new Exception();
		}catch(Exception e) {
			throw e;
		}
	}
	
	/**** GETTERS and SETTERS ***/
	public static DataBaseConnection getInstance() throws Exception{
	
		if(instance == null)
		{
			instance = new DataBaseConnection();
		}
		return instance;
	}
	
	
	public Connection getConnection(){
		return cnx;
	}

}
