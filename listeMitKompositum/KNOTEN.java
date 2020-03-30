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

    public abstract DATENELEMENT datenGeben();

    public abstract KNOTEN nachfolgerGeben();

    public abstract int anzahlGeben();

    public abstract boolean suchen(DATENELEMENT datenDrin);

    public abstract KNOTEN bestimmtesEntfernen(DATENELEMENT daten);

    public abstract DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu); 

    public abstract boolean istLeer();

    public abstract String alleAusgeben();

    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element); 
}
