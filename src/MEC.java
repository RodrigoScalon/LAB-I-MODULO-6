import java.util.List;

public abstract class MEC {
    private String nome;
    private int quantAlunos, quantProfessores;
    private Double valorMensalidade;
    private String estado, cidade;

    public MEC(String nome, int quantAlunos, int quantProfessores, Double valorMensalidade, String estado,
            String cidade) {
        this.nome = nome;
        this.quantAlunos = quantAlunos;
        this.quantProfessores = quantProfessores;
        this.valorMensalidade = valorMensalidade;
        this.estado = estado;
        this.cidade = cidade;
    }

    public MEC() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantAlunos() {
        return this.quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantProfessores() {
        return this.quantProfessores;
    }

    public void setQuantProfessores(int quantProfessores) {
        this.quantProfessores = quantProfessores;
    }

    public Double getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void imprimeUniversidades() {
        System.out.println("\tNome: " + nome);
        System.out.println("\tQuantidade de alunos: " + quantAlunos);
        System.out.println("\tQuantidade de professores: " + quantProfessores);
    }

    public void maisCara() { //utilizado expressão lambda 
    }

    public void universidadeDoSul(List<Universidade> university) {
        System.out.println("\tNome da Universidade: " + nome);
        System.out.println("\tEstado: " + estado);
    }
}
