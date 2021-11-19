public class Universidade {

	private String nome;
	private int quantAlunos, quantProfessores;
	
	public Universidade(String n, String e, String c, int qA, int qP) {
		nome = n;
		quantAlunos = qA;
		quantProfessores = qP;
	}

	public Universidade() {
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

	public void imprimeInfo(){
		System.out.println("\tNome: "+nome);
		System.out.println("\tQuantidade de alunos: "+quantAlunos);
		System.out.println("\tQuantidade de professores: "+quantProfessores);
	}
	
	public void getClassName(){
	}

	public Double getValorMensalidade() {
		return getValorMensalidade();
	}

    public String getEstado() {
        return getNome();
    }

   


       

}
