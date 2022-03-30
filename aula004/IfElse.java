import javax.swing.JOptionPane;
public class IfElse {
    public static void main(String[] args){
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
        if (nota>=70){
            JOptionPane.showMessageDialog(null,"Aprovado");

        }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado");

        }
    }
    
}
