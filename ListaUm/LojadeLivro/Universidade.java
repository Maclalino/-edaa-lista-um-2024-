package LojadeLivro;

public class Universidade {
    private String nome;
    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Universidade(String nome, int nota){
        this.nome=nome;
        this.nota=nota;
    }
    public void darNota(Pessoa pessoa){
        System.out.println("A Universidade "+ getNome()+ " deu nota " +getNota()+ ", para o/a Aluno " +pessoa.getNome());
    }
}
