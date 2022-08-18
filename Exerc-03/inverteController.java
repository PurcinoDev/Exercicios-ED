package inverteChar;
/**
 *
 * @author arthur.purcino
 */
public class inverteController {

    public inverteController() {
        super();
    }
    
    public String inverteString(String word, int tamanho){
        if (tamanho == 0){
            return "";
        } else {
            String reversao = word.substring(tamanho - 1, tamanho);
            return reversao + inverteString(word, tamanho - 1);
        }
    }
}
