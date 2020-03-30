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
    public abstract DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu); 
<<<<<<< HEAD
    public abstract boolean istLeer();
    public abstract String alleAusgeben();
    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element); 
=======
    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element);
    public abstract boolean istLeer();    
>>>>>>> e9c9ece7290d0375b06581a05d5ce2410df52305
}
