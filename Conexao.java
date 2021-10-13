import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexao {

	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	Conexao(){
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "root";
		senha = "12345";
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão Realizada com Sucesso");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int executaSQL(String sql) {
		try {
			Statement stm = (Statement) con.createStatement();
			int res = ((java.sql.Statement) stm).executeUpdate(sql);
			con.close();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) stm).executeQuery(sql);
			con.close();
			return rs;
			
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
