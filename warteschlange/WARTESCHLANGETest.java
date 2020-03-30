package warteschlange;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse WARTESCHLANGETest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WARTESCHLANGETest
{
    private WARTESCHLANGE schlange;
    private KUNDE helga;
    private KUNDE hans;
    /**
     * Konstruktor fuer die Test-Klasse WARTESCHLANGETest
     */
    public WARTESCHLANGETest()
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
        schlange = new warteschlange.WARTESCHLANGE();
        KUNDE hans = new KUNDE("Hans");
        KUNDE helga = new KUNDE("Helga");
    }
    
    @Test
    public void einfuegenTest() {
        schlange.amEndeEinfuegen(hans);
        schlange.amEndeEinfuegen(helga);
        schlange.AlleAusgeben();
        assertEquals(schlange.getAnfang(), hans);
        assertEquals(schlange.getEnde(), helga);
    }
    
    @Test
    public void entfernenTest(){
        schlange.amEndeEinfuegen(hans);
        schlange.amEndeEinfuegen(helga);
        schlange.vorneEntfernen();
        assertEquals(schlange.getAnfang(), helga);
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
