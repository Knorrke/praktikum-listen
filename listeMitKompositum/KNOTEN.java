package listeMitKompositum;

/**
 * Knoten der rekursiven Listenstruktur mit Kompositum.
 * Abstrakte Klasse mit Implementierungen Abschluss und Datenknoten.
 */
abstract class KNOTEN
{    
    KNOTEN()
    {
    }
    
    public abstract int anzahlGeben();
    public abstract boolean suchen(DATENELEMENT datenDrin);
    public abstract DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu); 
    public abstract boolean istLeer();
    public abstract KNOTEN nachfolgerGeben();
    public abstract DATENELEMENT datenGeben();
    public abstract String alleAusgeben();
    
    
}
