
public class Privada extends Universidade {
	private double valorMensalidade;


	public Privada(String n, int qA, int qP, double vM) {
		super(n, n, n, qA, qP);
		this.valorMensalidade = vM;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double vM) {
		valorMensalidade = vM;
	}


	public void maisCara () {

		if (valorMensalidade > 100) {
    System.out.println("\tUniversidade privada mais cara é: " + (this.getNome()) + " - " + (this.getValorMensalidade()));
		}
	}

	@Override
	public void imprimeInfo(){
		super.imprimeInfo();
		System.out.println("\tValor da mensalidade: R$ "+valorMensalidade);
	}

	@Override
    public void getClassName() {
        System.out.println("\tTipo de Univerdade: " + (this.getClass().getSimpleName()));
    }
	
}
