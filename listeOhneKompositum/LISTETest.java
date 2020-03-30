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
        KNOTEN k1= new KNOTEN();
        assertTrue(liste.istLeer()); 
        liste.anfangSetzen(k1);
        assertFalse(liste.istLeer());
    }

    @Test
    public void testLetztesElementEntfernen(){
        KNOTEN k2= new KNOTEN();
        KNOTEN k1= new KNOTEN(k2, null);
        liste.anfangSetzen(k1);
        liste.letztesElementLöschen();
        assertEquals(liste.anzahlGeben(),1);
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
