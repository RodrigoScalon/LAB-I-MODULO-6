
public class Privada extends Universidade {
	private Double valorMensalidade;


	public Privada(String n, int qA, int qP, double vM) {
		super(n, n, n, qA, qP);
		this.valorMensalidade = vM;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double vM) {
		valorMensalidade = vM;
	}

	@Override
	public void imprimeUniversidades(){
		super.imprimeUniversidades();
		System.out.println("\tValor da mensalidade: R$ "+valorMensalidade);
	}

	@Override
    public void getClassName() {
        System.out.println("\tTipo de Univerdade: " + (this.getClass().getSimpleName()));
    }
	
}
