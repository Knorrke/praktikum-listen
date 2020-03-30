package warteschlange;

/**
 * Rekursive Liste ohne Rekursive Methoden
 */
public class WARTESCHLANGE
{
    KUNDE anfang;
    KUNDE ende;
    
    public WARTESCHLANGE()
    {
        //TODO
    }
    
    //AmEndeeinfügen
    
    //vorneentfernen
    
    //alleausgeben
    void AlleAusgeben() {
        KUNDE aktuellerKunde = anfang;
        while (aktuellerKunde != null) {
            aktuellerKunde.Ausgeben();
            aktuellerKunde = aktuellerKunde.getNachfolger();
        }
    }
}
