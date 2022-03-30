import javax.swing.JOptionPane;
public class conversao{
    public static void main(String[] agrs){
        //declaração de variáveis
        double cotacao;
        double quantidade;
        double valorConvertido;

        //entrada
        //atribuição
        cotacao = Double.parseDouble( JOptionPane.showInputDialog("Digite a cotação"));
        quantidade = Double.parseDouble( JOptionPane.showInputDialog("Digite a quantidade"));
      
        //processamento
        valorConvertido = cotacao * quantidade;

        //saida
        JOptionPane.showMessageDialog(null, valorConvertido);
    }
       
}