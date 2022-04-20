import javax.swing.JOptionPane;

public class TesteCalculadora {
   public static void main(String[] args){
   Calculadora c = new Calculadora();
int opcao;

do { 
   opcao= Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4-divisao\n5 - sair "));
} while (opcao < 1 || opcao > 5);
  
   if (opcao < 5){
      int valor1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro valor"));
      int valor2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo valor"));     
      
    switch (opcao) {
         
           case 1:
           JOptionPane.showMessageDialog(null, "soma = " +c.soma(valor1,valor2));
           break;
           case 2:
           JOptionPane.showMessageDialog(null, "subtracao = " +c.subtracao(valor1,valor2));
           break;
           case 3: 
           JOptionPane.showMessageDialog(null, "multiplicacao = " +c.multiplicacao(valor1,valor2));
           break;
           case 4:
           JOptionPane.showMessageDialog(null, "divisao = "+ c.divisao(valor1,valor2));
           break;
       }
      }
    else{
       JOptionPane.showMessageDialog(null, "obrigado, até mais","saida", JOptionPane.PLAIN_MESSAGE);

       }
    }

}
