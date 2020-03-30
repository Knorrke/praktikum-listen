package listeMitKompositum;


/**
 * Bildet einen Knoten mit einem Kunden ab. Ein Datenknoten hat immer 
 * genau einen Nachfolger (der auch ein Abschluss sein kann) und
 * einen Datenknoten.
 */
class DATENKNOTEN extends KNOTEN
{
    KNOTEN nachfolger;
    DATENELEMENT daten;
    
    DATENKNOTEN(KNOTEN nachfolgerNeu, DATENELEMENT datenNeu)
    {
        nachfolger = nachfolgerNeu;
        daten = datenNeu;
    }
    
    public DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu){
        nachfolger = nachfolger.endeEinfügen(datenNeu);
        return this;
    }
    
    public int anzahlGeben(){
        //TODO
        return 0;
    }
    
    public boolean suchen(DATENELEMENT datenDrin){
        //TODO
        return true; 
    }
}
