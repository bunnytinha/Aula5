//importa
import javax.swing.JOptionPane;
//declara classe
public class Numero
{
   //main
   public static void main (String [] args)
   {
   //pega int
   int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
   //exibe
   JOptionPane.showMessageDialog(null,numero);
   }
}
