import javax.swing.JOptionPane;

public class Soma1aN {
    public static void main(String[] args){
        //ler um valor n e somar os valores 1 a n, exibir a somar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da soma"));
        
        int cont = 1;
        int soma = 0;
        
        while( cont <= n) {
            soma = soma +cont;
            cont++;
        }
        JOptionPane.showMessageDialog(null, "soma com while crescente" + soma);

        // forma decrescente
        for (cont = n, soma = 0; cont > 0;cont--){
            soma = soma + cont;
        }
        JOptionPane.showMessageDialog(null, "soma com for decrescente" + soma);
    }
}
