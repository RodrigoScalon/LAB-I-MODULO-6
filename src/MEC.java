public class MEC {

    private String imprimeUniversidades;
    private String maisCara;
    private String universidadesDoSul;
    
    public MEC() {
    }

    public String getImprimeUniversidades() {
        return this.imprimeUniversidades;
    }

    public void setImprimeUniversidades(String imprimeUniversidades) {
        this.imprimeUniversidades = imprimeUniversidades;
    }

    public String getMaisCara() {
        return this.maisCara;
    }

    public void setMaisCara(String maisCara) {
        this.maisCara = maisCara;
    }

    public String getUniversidadesDoSul() {
        return this.universidadesDoSul;
    }

    public void setUniversidadesDoSul(String universidadesDoSul) {
        this.universidadesDoSul = universidadesDoSul;
    }

    public void imprimeInfoMEC(){
		System.out.println("Universidades: "+imprimeUniversidades);
		System.out.println("Quantidade de alunos: "+maisCara);
		System.out.println("Quantidade de professores: "+universidadesDoSul);
	}

}
