package controller;
/**
 *
 * @author arthur.purcino
 */
public class fatorialController {
    
    public fatorialController() {
        super();
    }
    
    public int fat (int n) {
    //  condição de parada
        if (n == 1) {
            return 1;
        } else {
        //  termo n em função do termo anterior
            return n * fat (n - 1);
        }
    }
}
