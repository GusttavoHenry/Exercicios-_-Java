import javax.swing.JOptionPane;

public class IfElseEncadeado {
    public static void main(String[] args){
        //long armazena  inteiros gastando 8bytes
        
        long notaDoAluno;
        notaDoAluno = Long.parseLong(JOptionPane.showInputDialog("Digite a nota"));
        
        //Esse é o encadeamento de if/else
        if (notaDoAluno >=90)
        JOptionPane.showMessageDialog(null, "Conceito A");
        else if (notaDoAluno>=80)
        JOptionPane.showMessageDialog(null, "Conceito B");
        else if (notaDoAluno>=70)
        JOptionPane.showMessageDialog(null, "Conceito C");

        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
    
}
