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
