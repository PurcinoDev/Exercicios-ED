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
//          Escrever um valor de termo n para cada posição do Vetor
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro para preencher o vetor:"));
        }
        return vet;
    }
    
    public int contaNegaVet(int[] vet, int size) {
//          condição de parada
        if (size == 0) {
                return 0;
        } else {
            int lastPst = size - 1;
            int valor = vet[lastPst];
            if (valor < 0) {
                size -= 1;
                return 1 + contaNegaVet(vet, size);
                //  retorna size em função do termo anterior, se negativo
            }
            size -= 1;
            return contaNegaVet(vet, size);
            //  retorna size em função do termo anterior, se positivo
            }
    }
}
