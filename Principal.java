
public class Principal {

	public static void main(String[] args) {
	Conexao con = new Conexao();
	String sql = "INSERT into Produto (id, nome, descricao, desconto, dataInicio, dataFim)"+
				 "values (default, Samsung, Samsung Galaxy, 20, 20/10/2000, 20/11/2000)";
	
	int res = con.executaSQL(sql);
	if(res > 0) {
		System.out.println("Cdastrado com Sucesso");
	}else {
		System.out.println("Erro durante o cadastro");
	}
	
	}

}
