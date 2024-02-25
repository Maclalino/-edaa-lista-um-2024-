package LojadeLivro;
public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro("Diário de um Banana", "Thiago");
        System.out.println(livro);
        
        Pessoa pessoa = new Pessoa("Maria", 18);
        System.out.println(pessoa);
        
        Aluno aluno = new Aluno(pessoa.getNome(), pessoa.getIdade(), 12345); 
        System.out.println(aluno);

        aluno.lerLivro(livro);

        Professor professor= new Professor("Daniel", 37);
        professor.corrigir(aluno);

        Universidade universidade = new Universidade("Una", 10);
        universidade.darNota(pessoa);
    }
}
