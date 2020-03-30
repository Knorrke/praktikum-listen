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
    public KUNDE vorneEntfernen(){
        KUNDE alterAnfang;
        alterAnfang = anfang;       
        anfang = alterAnfang.getNachfolger();
        return alterAnfang;
        
    }
    
    //alleausgeben
}
