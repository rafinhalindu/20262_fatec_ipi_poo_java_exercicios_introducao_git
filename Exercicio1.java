import javax.swing.JOptionPane;
public class Exercicio1 {
   public static void main(String args[]) {
      String entrada = 
         JOptionPane.showInputDialog("Digite a temperatura em celsius:");
         //classe empacotadora (wrapper)
      double celsius = Double.parseDouble(entrada);
      double fahrenheit = celsius * 1.8 + 32;
      JOptionPane.showMessageDialog(
         null,
         String.format("Temperatura em fahrenheit: %.2f", fahrenheit));
   }
}
