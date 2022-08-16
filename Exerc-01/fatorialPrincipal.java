package fatorial;
/**
 *
 * @author arthur.purcino
 */
import javax.swing.*;

public class fatorialPrincipal {
    
    public static void main(String[] args) {
        fatorialController calcFat = new fatorialController();
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero menor que 12 para calculo de fatorial:"));
        if (n < 13){
            int resultado = calcFat.fat(n);
            System.out.println(resultado);
        } else {
            System.out.println("Insira um numero menor ou igual a 12");
        }
    }
}