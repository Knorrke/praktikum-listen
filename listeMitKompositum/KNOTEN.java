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
<<<<<<< HEAD
    
    public abstract DATENELEMENT datenGeben();
    public abstract KNOTEN nachfolgerGeben();
=======

    public abstract DATENELEMENT datenGeben();

    public abstract KNOTEN nachfolgerGeben();

>>>>>>> 4ac54799e329abcbbef1b301b1fadc9251c5afa6
    public abstract int anzahlGeben();

    public abstract boolean suchen(DATENELEMENT datenDrin);

    public abstract KNOTEN bestimmtesEntfernen(DATENELEMENT daten);

    public abstract DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu); 
<<<<<<< HEAD
<<<<<<< HEAD
    public abstract boolean istLeer();
    public abstract String alleAusgeben();
    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element); 
=======
    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element);
    public abstract boolean istLeer();    
>>>>>>> e9c9ece7290d0375b06581a05d5ce2410df52305
=======

    public abstract DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT element);

    public abstract boolean istLeer();    
>>>>>>> 4ac54799e329abcbbef1b301b1fadc9251c5afa6
}
