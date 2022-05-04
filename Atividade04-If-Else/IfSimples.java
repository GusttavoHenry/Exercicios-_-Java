import javax.swing.JOptionPane;

public class IfSimples{
    public static void main(String[] args){
     double nota;
     nota = Double.parseDouble(JOptionPane.showInputDialog("Digite Sua nota"));
     if (nota>=70){
         JOptionPane.showMessageDialog(null,"Parabens");
         JOptionPane.showMessageDialog(null,"aprovado");
     }     


    }
   
}