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
    
    //endeEinfügen
    public amEndeEinfuegen(DATENELEMENT neueDaten){
        if(!istLeer()){
            anfang.amEndeEinfuegen(neueDaten);
        } else{
            KNOTEN neuerAnfang = new Knoten(anfang, neueDaten);
            anfang = neuerAnfang;
        }
    }
    //anfangEntfernen
    
    //anfangGeben
        
    //anzahlGeben
   
}
