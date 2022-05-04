import javax.swing.JOptionPane;

public class TesteLivroDeNotas{
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
       LivroDeNotas livroDeNotas1;
        livroDeNotas1 = new LivroDeNotas();
        livroDeNotas1.setNomeDaUc = nomeDaUC;
        System.out.println("nome do livro1");
        livroDeNotas1.exibirNotas();
        
        LivroDeNotas livro2 = new LivroDeNotas();
        livro2.nomeDaUC = "Matematica";
        livro2.exibirNotas(); 



    }
}

/* public class LivroDeNotas{
    //variável de instância = atributo
    private String nomeDaUC;

    //construtores
    public LivroDeNotas (String nomeDaUC) {
        this.setNomeDaUC(nomeDaUC);
    }
    public LivroDeNotas () {}
    //note a sobrecarga dos construtores
    //métodos de acesso = getters
    public String getNomeDaUC () {
        return this.nomeDaUC;
    }

    //métodos modificadores = setters
    public void setNomeDaUC (String nomeDaUC) {
        this.nomeDaUC = nomeDaUC;
    }

    //método específico
    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de notas da UC " + this.nomeDaUC);
    }
}*/ 

/*import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
        LivroDeNotas livro1;
        livro1 = new LivroDeNotas();
        System.out.println("nome do livro 1, depois do construtor padrao: " + livro1.getNomeDaUC());

        livro1.setNomeDaUC(nomeDaUC);
        System.out.println("nome do livro 1: " + livro1.getNomeDaUC());
        livro1.exibirMensagem();
        LivroDeNotas livro2 = new LivroDeNotas("Matematica");
        //livro2.setNomeDaUC("Matematica");
        System.out.println("nome do livro 2: " + livro2.getNomeDaUC());
        livro2.exibirMensagem();

        
andreia.machion@saojudas.br
    }
} */ 