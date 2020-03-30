package listeOhneKompositum;
/**
 * Rekursive Datenstruktur mit rekursiven Methoden
 */
public class LISTE
{
    KNOTEN anfang;

    public LISTE()
    {
        anfang = null;
    }

    //istLeer
    public boolean istLeer(){
        if (anfang==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //endeEinfügen

    //anfangEntfernen

    //anfangGeben

    //anzahlGeben
    public int anzahlGeben() {
        return anfang.anzahlGeben();
    }
}
