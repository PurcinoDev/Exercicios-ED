package vetorRecursivo;

import javax.swing.*;
/**
 *
 * @author arthur.purcino
 */
public class vetorController {
    
    public vetorController() {
        super();
    }
    
    public int[] geraVetor(int n) {
        int[] vet = new int[n];
        for (int i = 0; i < n; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro para preencher o vetor:"));
        }
        return vet;
    }
    
    public int contaNegaVet(int[] vet, int contador, int size) {
            if (size == 0) {
                return 0;
            } else {
                int lastPst = size - 1;
                int valor = vet[lastPst];
                if (valor < 0) {
                    contador++;
                }
                size -= 1;
                return contaNegaVet(vet, contador, size);
            }
    }
}
