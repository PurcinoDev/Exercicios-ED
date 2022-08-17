package controller;

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
    
    public int contaNegaVet(int[] vet, int size) {
        //  Condição de parada
        if (size == 0) {
                return 0;
        } else {
            int lastPosition = size - 1;
            int valor = vet[lastPosition];
            if (valor < 0) {
                size -= 1;
                return 1 + contaNegaVet(vet, size);
            }
            size -= 1;
            return contaNegaVet(vet, size);
            }
    }
}
