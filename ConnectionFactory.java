package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
		
		String nomeUsuario = "postgres";
		String senhaUsuario = "12345";
		String enderecoServidor = "localhost";
		String nomeBanco = "Sprint";
		
		return DriverManager.getConnection("jdbc:postgresql://"+enderecoServidor+
				"/"+nomeBanco, nomeUsuario, senhaUsuario);
		} catch (SQLException ex) {
			System.out.println("error");
			throw new RuntimeException(ex);
		}
	
	}
}
		
		