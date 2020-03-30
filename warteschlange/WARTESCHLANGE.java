package warteschlange;

/**
 * Rekursive Liste ohne Rekursive Methoden
 */
public class WARTESCHLANGE
{
    KUNDE anfang;
    KUNDE ende;

    //neue leere Warteschlange
    public WARTESCHLANGE()
    {
        anfang = null;
        ende = null;
    }
    
    //getter
    public KUNDE getAnfang(){
        return anfang;
    }
    
    public KUNDE getEnde(){
      return ende;   
    }
    
    
    //am Ende einfügen
    public void amEndeEinfuegen(KUNDE neuesEnde){
        if (ende != null){
            ende.setNachfolger(neuesEnde);
        }
        else {
            anfang = neuesEnde;
        }
        ende = neuesEnde;
        return;
    }

    //vorneentfernen
    public KUNDE vorneEntfernen(){
        KUNDE alterAnfang;
        alterAnfang = anfang;       
        anfang = alterAnfang.getNachfolger();
        return alterAnfang;

    }

    //alleausgeben
    void AlleAusgeben() {
        KUNDE aktuellerKunde = anfang;
        while (aktuellerKunde != null) {
            aktuellerKunde.Ausgeben();
            aktuellerKunde = aktuellerKunde.getNachfolger();
        }
    }
}
