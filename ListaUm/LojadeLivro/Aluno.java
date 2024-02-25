package LojadeLivro;
public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade); 
        this.ra = ra;
    }

    public int getRA() {
        return ra;
    }

    public void setRA(int ra) {
        this.ra = ra;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | RA: " + ra;
    }

    public void lerLivro(Livro livro){
        System.out.println(getNome()+" leu o livro " + livro.getNome());
    }

    
}
