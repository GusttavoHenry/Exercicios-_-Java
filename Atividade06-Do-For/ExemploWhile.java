import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

public class ExemploWhile{
 public static void main(String[] args) {
     int nota1, nota2;
     double media; 
     int qtdeAlunos = parseInt(showInputDialog("Quantos alunos voce tem?"));

   int contador = 1;
   while(contador <= qtdeAlunos); { //condição de continuidade
     nota1 = parseInt("Digite uma nota");
     nota2 = parseInt("Digite a segunda nota");

    media = (nota1 + nota2) / 2.; 
    showMessageDialog(null, String.format ( "A media é %.2f: " + media));
    contador++ ;//incremento
 }
}
}

