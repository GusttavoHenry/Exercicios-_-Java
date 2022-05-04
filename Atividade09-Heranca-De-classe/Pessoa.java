public class Pessoa {
    //atributos de encpsuamento
    private String nome;
    private int idade;
    //construtor com parametros
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    // redefinir o construtor padrão
    public Pessoa() {}

    public String getNome() {
        return this.nome;    
    }
    public int getIdade() {
        return this.idade;
    }

    // metodos modificadores 

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override // sobrescrevendo o metódo da classe pai
    
    public String toString () {
        return  "/n[" + this.nome + ", "+ this.idade + "] ";
   }

}
