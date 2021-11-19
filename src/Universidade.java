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

	public void imprimeUniversidades() {

		System.out.println("\tNome: " + nome);
		System.out.println("\tQuantidade de alunos: " + quantAlunos);
		System.out.println("\tQuantidade de professores: " + quantProfessores);

	}

	public void getClassName() {
	}

	public Double getValorMensalidade() {
		return getValorMensalidade();
	}

	public String getEstado() {
		return getNome();
	}

	public void universidadeDoSul(List<Universidade> university) {
		
		for (int i = 0; i < university.size(); i++) {
			Universidade u = university.get(i); 
			
			String e1 = new String("RS");
			String e2 = new String("SC");
			String e3 = new String("PR");

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


