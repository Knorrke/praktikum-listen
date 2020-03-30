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
        return anfang.istLeer();
    }

    public KNOTEN anfangGeben(){
        return anfang;
    }

    public int anzahlGeben(){
        return anfang.anzahlGeben();
    }

    //EinfügenEntfernen
    //anfangEntfernen
    public DATENELEMENT anfangEntfernen(DATENELEMENT daten){
        DATENELEMENT entfernt;
        entfernt = anfang.datenGeben();
        anfang = anfang.nachfolgerGeben();
        return entfernt;

    }

    //bestimmtesEntfernen

    public void bestimmtesEntfernen(DATENELEMENT daten){
        anfang=anfang.bestimmtesEntfernen(daten);
    }

    //anPlatzEinfügen
    public void anPlatzEinfügen(int platz, DATENELEMENT datenNeu) {
        anfang = anfang.anPlatzEinfügen(platz, datenNeu);
    }
<<<<<<< HEAD
=======

>>>>>>> 4ac54799e329abcbbef1b301b1fadc9251c5afa6
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

    public String alleAusgeben()
    {
        return anfang.alleAusgeben();
    }

}
