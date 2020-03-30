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
    public void amEndeEinfuegen(DATENELEMENT neueDaten){
        if(!istLeer()){
            anfang.amEndeEinfuegen(neueDaten);
        } else{
            KNOTEN neuerAnfang = new Knoten(anfang, neueDaten);
            anfang = neuerAnfang;
        }
    }

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
    public KNOTEN anfangGeben() {
       return anfang; 
    }

    //anzahlGeben
    public int anzahlGeben() {
        return anfang.anzahlGeben();
    }
}
