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
    public boolean istLeer(){
        if (anfang instanceof ABSCHLUSS){
            return true;
        }
        else {
            return false;
        }
    }

    public KNOTEN anfangGeben(){
        return anfang;
    }

    public int anzahlGeben(){
        return anfang.anzahlGeben();
    }

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
    public boolean suchen(DATENELEMENT datenDrin)
    {
        return anfang.suchen(datenDrin);
    }

    //alleAusgeben

}
