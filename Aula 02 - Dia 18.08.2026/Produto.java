import java.text.NumberFormat;

public abstract class Produto {
	
	private static final double MARGEM_PADRAO = 0.2;
	private String descricao;
	public double precoCusto;
	public double margemLucro;
	
	private void init(String desc, double precoCusto, double margemLucro) {
		
		if ((desc.length() >= 3) && (precoCusto > 0.0) && (margemLucro > 0.0)) {
			this.descricao = desc;
			this.precoCusto = precoCusto;
			this.margemLucro = margemLucro;
		} else {
			throw new IllegalArgumentException("Valores inválidos para os dados do produto.");
		}
	}
	
	public Produto(String desc, double precoCusto, double margemLucro) {
		init(desc, precoCusto, margemLucro);
	}
	
	public Produto(String desc, double precoCusto) {
		init(desc, precoCusto, MARGEM_PADRAO);
	}
	
	public double valorDeVenda() {
		return (precoCusto * (1.0 + margemLucro));
	}
	
    @Override
	public String toString() {
    
    NumberFormat moeda = NumberFormat.getCurrencyInstance();
    
		return String.format("NOME: " + descricao + ": " + moeda.format(valorDeVenda()));
	}

	public boolean equals(Produto outoProduto){
		String desc1 = this.descricao.toLowerCase();
		String desc2 = outoProduto.descricao.toLowerCase();

		return(desc1.equals(desc2));
	}

	public abstract String gerarDadosTexto(); // assinatura do metodo abstrato

	static Produto criarDoTexto(String linha){

		if(linha == null || linha.trim().isEmpty()){
		return null;
	}

		return null;
	}

}