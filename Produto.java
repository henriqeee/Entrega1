import java.sql.Date;

public class Produto {
	private int id;
	private String nome;
    private String descricao;
    private double desconto;
    private Date datainicio;
    private Date datafim;
    
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getDesconto() {
        return desconto;
    }

    public Date getDatainicio() {
        return datainicio;
    }
    
    public Date getDatafim() {
        return datafim;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }
    
    
    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }
    
    public void mostraProduto() {
    	System.out.println("ID : "+getId());
    	System.out.println("Nome : "+getNome());
    	System.out.println("Descrição : "+getDescricao());
    	System.out.println("Desconto : "+getDesconto());
    	System.out.println("Data Inicio : "+getDatainicio());
    	System.out.println("Data Fim : "+getDatafim());
    }
}
