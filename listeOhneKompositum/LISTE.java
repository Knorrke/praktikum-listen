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
    public void anfangEntfernen()
    {
        if (anfang != null){
            if (anfang.nachfolger != null){
                anfang = anfang.nachfolger;
            }
            else {
                anfang = null;
            }
        }
        return;
    }

    //anfangGeben

    //anzahlGeben

}
