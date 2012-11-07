/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.*;
import java.io.*;

/**
 *
 * @author hkimajanpi
 */
public class Board {
    private static Scanner input = new Scanner(System.in);
    private ArrayList<Card> memory;
    private Card firstTurnedCard;
    private Card secondTurnedCard;

    public Board() throws Exception {
        this.memory = new ArrayList<>();
        Scanner file = new Scanner(new File("Symbols.txt"));
        while (file.hasNextLine()) {
            memory.add(new Card(file.nextLine()));
            }
    }

    public void addCard(Card card) {
    memory.add(card);
    }

    @Override
    public String toString(){
        for (Card card : memory) {
            System.out.println(card);
        }
        System.out.println("Amount of cards: " + memory.size());
        return("\n");
    }

    public ArrayList<Card> shuffleCards(){
        for (Card card : memory) {
            Collections.shuffle(memory);
        }
        System.out.println("lol");
        return memory;
    }
//
 //   public String kaannaKortti() {
 //       int pelin status = 1;

 //       System.out.println("Minkä kortin haluat kääntää? ");
  //      int ekaKortti = Integer.parseInt(input.nextLine());
  //      ekaKaannettyKortti = muistipeli.get(ekaKortti);

  //  }

    
}
