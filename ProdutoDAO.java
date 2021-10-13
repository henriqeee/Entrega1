package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import JDBC.ConnectionFactory;

public class ProdutoDAO<Produto> {
	private Connection con;
	
	public ProdutoDAO() {
		this.con = new ConnectionFactory().getConnection();
		
	}
	
	public boolean add (Produto p) {
		String sql = "INSERT INTO produtos(nome, descricao, desconto, datainicio, datafim) VALUES('?, ?, ?, ?, ?')";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			           
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getDescricao());
			stmt.setString(3, p.getDesconto());
			stmt.setString(4, p.getDatainicio());
			stmt.setString(5, p.getDatafinal());
			stmt.execute();
			return true;
			
	
	} catch (SQLException ex) {
		Logger,getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex_);	
		return false;
	}
				
		public boolean delete(Produto p) {
				String sql = "DELETE * FROM produtos WHERE id+?;";
				
			try {
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setLong(1, p.getId());
					stmt.execute();
					return true;
					
			
			}catch (SQLException ex) {
				Logger,getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex_);	
				return false;
			}
			
			
		public List<Produto>  getList(){
			List<Pessoa> pessoas = new ArrayList<>();
			String sql = "SELECT * FROM PRODUTO"
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					Produto p = new Produto();
					p.setId(rs.getSerial("id"));
					p.setNome(rs.getString("nome"));
					p.setDescricao(rs.getString("descricao"));
					p.setDesconto(rs.getInt("desconto"));
					p.setDatainicio(rs.getDate("data inicio"));
					p.setDatafim(rs.getDate("Data fim"));
					produto.add(p);
				}
				stmt.close();
				rs.close();
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
				System.out.println("Erro");
				return null;
			}
			return produto;
			
		}
		public boolean update (Produto p) {
			String sql = "UPDATE  produtos SET nome = ?, descricao = ?, desconto = ?, datainicio = ?, datafim = ? id = ?";
			
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				           
				stmt.setString(1, p.getNome());
				stmt.setString(2, p.getDescricao());
				stmt.setString(3, p.getDesconto());
				stmt.setString(4, p.getDatainicio());
				stmt.setString(5, p.getDatafinal());
				stmt.setSerial(6, p.getId());
				stmt.execute();
				return true;
				
		
		} catch (SQLException ex) {
			Logger,getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex_);	
			return false;
		}
		
		
		
}