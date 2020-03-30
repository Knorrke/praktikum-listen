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
    private warteschlange.WARTESCHLANGE schlange;

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
    }
    
    @Test
    public void einfuegenTest() {
        KUNDE hans = new KUNDE("Hans");
        KUNDE helga = new KUNDE("Helga");
        schlange.amEndeEinfuegen(hans);
        schlange.amEndeEinfuegen(helga);
        schlange.AlleAusgeben();
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
