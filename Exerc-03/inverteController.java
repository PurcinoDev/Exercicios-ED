package controller;
/**
 *
 * @author arthur.purcino
 */
public class inverteController {

    public inverteController() {
        super();
    }
    
    public String inverteString(String word, int tamanho){
        //  condição de parada
        if (tamanho == 0){
            return "";
        } else {
            String reversao = word.substring(tamanho - 1, tamanho);
            return reversao + inverteString(word, tamanho - 1);
            // retorna o termo em função do termo anterior
        }
    }
}
