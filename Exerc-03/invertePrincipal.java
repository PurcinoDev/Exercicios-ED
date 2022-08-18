package inverteChar;
/**
 *
 * @author arthur.purcino
 */
import javax.swing.*;

public class invertePrincipal {
    
    public static void main(String[] args) {
        inverteController invCont = new inverteController();
        
        String word = JOptionPane.showInputDialog("Insira uma palavra para ser invertida");
        int tamanho = word.length();

        String resultado = invCont.inverteString(word, tamanho);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}