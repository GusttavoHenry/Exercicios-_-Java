import javax.swing.JOptionPane;

public class TesteLivroDeNotas{
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
       LivroDeNotas livroDeNotas;
        livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDaUC = nomeDaUC;
        livroDeNotas.exibirNotas();
        
        LivroDeNotas livro2 = new LivroDeNotas();
        livro2.nomeDaUC = "Matematica";
        livro2.exibirNotas(); 



    }
}