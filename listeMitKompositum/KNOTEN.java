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
    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element);
    public abstract boolean istLeer();    
}
