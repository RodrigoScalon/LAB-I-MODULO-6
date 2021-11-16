
public class Publica extends Universidade {
	private String estado, cidade;

	public Publica(String n, int qA, int qP, String e, String c) {
		super(n, c, c, qA, qP);
		estado = e;
		cidade = c;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String e) {
		estado = e;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String c) {
		cidade = c;
	}

	@Override
    public void getClassName() {
        System.out.println("\tTipo de Universidade: " + (this.getClass().getSimpleName()));
    }
	
	@Override
	public void imprimeInfo(){
		super.imprimeInfo();
		System.out.println("\tEstado: "+estado);
		System.out.println("\tCidade: "+cidade);
	}
}