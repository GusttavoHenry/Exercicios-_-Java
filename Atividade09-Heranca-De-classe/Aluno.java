public class Aluno  extends Pessoa{
    private int ra;
    public Aluno(String nome, int idade, int ra){
        super(nome,idade);
        this.ra = ra;

    }
    public Aluno(){}
    public int getRa(){
        return this.ra;
    }
}
