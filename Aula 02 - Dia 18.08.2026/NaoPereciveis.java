
class NaoPereciveis extends Produto {
	
	public NaoPereciveis (String desc, double precoCusto, double margemLucro){
		super(desc, precoCusto, margemLucro);
	}

	public NaoPereciveis (String desc, double precoCusto){
		super(desc, precoCusto);
	}

	@Override
	public double valorDeVenda(){
		return (this.precoCusto + (1.0 * this.margemLucro));
	}
	
	@Override
    public String gerarDadosTexto() {
    return null;
    }
}