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
    
    public void amEndeEinfuegen(KUNDE neuesEnde){
        ende.setNachfolger(neuesEnde);
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
