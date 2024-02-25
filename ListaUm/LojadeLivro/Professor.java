package LojadeLivro;

public class Professor extends Pessoa {

    public Professor(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    public void corrigir(Aluno aluno){
        System.out.println("O professor "+ getNome()+ " deu nota para a/o aluno "+ aluno.getNome());
    }
    
}
