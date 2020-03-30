package listeOhneKompositum;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse LISTETest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTETest
{
    private listeOhneKompositum.LISTE liste;

    /**
     * Konstruktor fuer die Test-Klasse LISTETest
     */
    public LISTETest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        liste = new listeOhneKompositum.LISTE();
    }
    
    @Test 
    public void testIstLeer(){
     assertTrue(liste.istLeer());   
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
