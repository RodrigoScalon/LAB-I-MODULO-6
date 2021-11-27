import java.util.List;

public class Universidade extends MEC {
	private String nome;
	private int quantAlunos, quantProfessores;

	public Universidade(String n, String e, String c, int qA, int qP) {
		super();
		nome = n;
		quantAlunos = qA;
		quantProfessores = qP;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int qA) {
		quantAlunos = qA;
	}

	public int getQuantProfessores() {
		return quantProfessores;
	}

	public void setQuantProfessores(int qP) {
		quantProfessores = qP;
	}

	public void getClassName() { // acesso ao mÃ©todo nome da classe 
	}

	public Double getValorMensalidade() {
		return getValorMensalidade();
	}

	public String getEstado() {
		return getNome();
	}

	public void imprimeUniversidades() {
		System.out.println("\tNome: " + nome);
		System.out.println("\tQuantidade de alunos: " + quantAlunos);
		System.out.println("\tQuantidade de professores: " + quantProfessores);
	}

	public void universidadeDoSul(List<Universidade> university) {
		
		String e1 = new String("RS");
		String e2 = new String("SC");
		String e3 = new String("PR");

		for (Universidade u : university) {

			if (e1.equals(u.getEstado())) {
				
				System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
			} else if (e2.equals(u.getEstado())) {
				System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
			} else if (e3.equals(u.getEstado())) {
				System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
			}
		}
	}
}
