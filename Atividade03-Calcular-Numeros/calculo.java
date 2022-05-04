import javax.swing.JOptionPane;
public class calculo{
    public static void main(String[] agrs){
        //declaração de variáveis
        //int= declaração de numeros inteiros
       int n1,n2,n3,n4;
       int q1,q2,q3,q4;
       int soma;


        //entrada
        //atribuição
        n1 = Integer.parseInt( JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo numero"));
        n3 = Integer.parseInt( JOptionPane.showInputDialog("Digite o terceiro numero"));
        n4 = Integer.parseInt( JOptionPane.showInputDialog("Digite o quarto numero"));
        
        //processamento
        q1 = n1 * n1;
        q2 = n2 * n2;
        q3 = n3 * n3;
        q4 = n4 * n4;
        soma = q1 + q2 + q3 + q4;

        //saida
        JOptionPane.showMessageDialog(null," resultado: " + soma);
       
    }
       
}