package listeMitKompositum;
/**
 * Rekursive Datenstruktur mit rekursiven Methoden und dem 
 * Entwurfsmuster Kompositum.
 */
public class LISTE
{
    KNOTEN anfang;
    
    public LISTE()
    {
        anfang = new ABSCHLUSS();
    }
    
    //GetterSetter
    //istLeer
    
    //anfangGeben
    
    //anzahlGeben
    
    //EinfügenEntfernen
    //letztesElementLöschen
    
    //anfangEntfernen
    public DATENELEMENT anfangEntfernen(DATENELEMENT daten){
        DATENELEMENT entfernt;
        entfernt = anfang.datenGeben();
        anfang = anfang.nachfolgerGeben();
        return entfernt;
        
    }
        
    //bestimmtesEntfernen
    
    //anPlatzEinfügen
    
    //sortiertEinfügen
    
    public void endeEinfügen(DATENELEMENT datenNeu)
    {
        anfang = anfang.endeEinfügen(datenNeu);
    }
    
    //andere
    //suchen
    
    //alleAusgeben
    
    
}
