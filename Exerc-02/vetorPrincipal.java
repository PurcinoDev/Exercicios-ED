package vetorRecursivo;

import javax.swing.*;
/**
 *
 * @author arthur.purcino
 */
public class vetorPrincipal {
    public static void main(String[] args) {
        int contador = 0;
        
        vetorController vetCon = new vetorController();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para definir o tamanho do vetor"));
        int[] vetGer = vetCon.geraVetor(n);
        
        int size = vetGer.length;
        int resultado = vetCon.contaNegaVet(vetGer, contador, size);
        
        System.out.println("A quantidade de numeros negativos neste vetor e de: " + resultado);
    }
}
