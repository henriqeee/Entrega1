import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		
		
		System.out.println("Escolha uma opção: 0-Finalizar Aplicação  1-Cadastrar Produtos 2-Atualizar o primeiro produto cadastrado  3-Excluir o primeiro produto cadastrado");
		opcao = sc.nextInt();
		
		
	
		
		if (opcao == 1) {
			System.out.println("Estamos Cadastrando Produtos");
			Produto p = new Produto();
			i=0
			for(i < 3) {
			p.setNome("Mesa");
			p.setDescricao("Escritório");
			p.setDesconto("5");
			p.setDatainicio("2021-02-02");
			p.setDatafim("2021-02-05");
			
			ProdutoDAO = new ProdutoDAO();
			return i++;
			
			}
		}
	
		if (opcao == 2) {
			System.out.println("Estamos atualizando primeiro produto cadastrado");
			Produto p = new Produto();
			
			p.setId(21L);
			p.setNome("");
			p.setDescricao("");
			p.setDesconto("");
			p.setDatainicio("");
			p.setDatafim("");
			
			ProdutoDAO dao = new ProdutoDAO();
			if(dao.update(p)) {
				System.out.println("Atualizado");
				
			}else {
				System.out.println("Não Atualizado");
			}
			
			
		}
		
		if (opcao == 3) {
			System.out.println("Estamos excluindo segundo produto cadastrado");
			if(dao.delete(p)) {
				System.out.println("Deletado");
			}
		}  
		
		if (opcao == 0){
			System.out.println("Finalizada Aplicação");
			sc.close();
			}
	
	
	}
	

}
