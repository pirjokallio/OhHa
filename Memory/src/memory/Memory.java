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
public class Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
               
        Board memory = new Board();
        
        System.out.println(memory);
        memory.shuffleCards();
        System.out.println(memory);
    }
}
