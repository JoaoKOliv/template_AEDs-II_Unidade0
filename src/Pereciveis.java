import java.text.NumberFormat;
import java.time.LocalDate;

public class Pereciveis extends Produto{
	
	private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;
    private LocalDate dataDeValidade;

    public Pereciveis(String desc, double precoCusto, double margemLucro, LocalDate dataDeValidade){
        super (desc, precoCusto, margemLucro);
        this.dataDeValidade = dataDeValidade;
    }

    public double valorDeVenda(){
        return (precoCusto + (1.0 * margemLucro));
    }

    @Override
    public String toString(){
        return super.toString() + "Data de Validade: ";
    }
	
}