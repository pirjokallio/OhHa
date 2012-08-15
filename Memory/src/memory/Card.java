/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author hkimajanpi
 */
public class Card {
    private String card;

    public Card(String symbol) {
        this.card = symbol;
    }

    /**
     * 
     * @return symbol
     */
    public String turnCard() {
    return card;
    }

    /**
     * 
     * @return symbol
     */
    @Override
    public String toString(){
        return card;
    }
       
}
