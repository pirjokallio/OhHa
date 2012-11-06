/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import memory.Card;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author hkimajanpi
 */
public class CardTest {
    
    public CardTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {}

    @Test
    public void constructorCreatesCard() {
        Card card = new Card("Doll"); 
        String symbol = card.turnCard();
        assertEquals( "Doll", symbol ); } 
    
    }




