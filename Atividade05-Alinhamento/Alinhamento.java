import javax.swing.JOptionPane;

public class Alinhamento{
    public static void main(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para pagar a vista ou pagamento a vista ou 2 para pagamento a prazo"));
        
        double valorCompra= Double.parseDouble(JOptionPane.showInputDialog("digite o valor da compra"));
        
        if (opcao == 1) {
            double desconto = 0.10 * valorCompra;
            JOptionPane.showMessageDialog(null, "voce ganhou R$" + desconto + "de desconto/Valor a pagar"+ (valorCompra - desconto));
        } 
        else{
            int numeroParcelas = Integer.parseInt(JOptionPane.showInputDialog("numero de parcelas: 2 ou 3"));
            
            if (numeroParcelas == 2){
              double valorParcela = valorCompra/2;
              JOptionPane.showMessageDialog(null, "Valor de cada parcela; R$ " + valorParcela);

            }
            else{
                double acrescimo = 0.10 * valorCompra;
                double valorParcela = (valorCompra + acrescimo) / 3;
                JOptionPane.showMessageDialog(null, "Valor de cada parecela: R$ " + valorParcela);

            }
        }
    }
}