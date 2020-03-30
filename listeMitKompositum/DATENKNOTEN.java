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
        return nachfolger.anzahlGeben() + 1;
    }

    public boolean suchen(DATENELEMENT datenDrin){
        if (daten == datenDrin){
            return true; 
        }
        else{
            return nachfolger.suchen(datenDrin);   
        }
    }

    public DATENELEMENT datenGeben(){
        return daten;
    }

    public KNOTEN nachfolgerGeben(){
        return nachfolger;
    }

    public DATENKNOTEN bestimmtesEntfernen(DATENELEMENT daten){
        if(this.daten=daten){
            return nachfolgerGeben();
        }
        else {
            nachfolger.bestimmtesEntfernen(daten);
            return this;
        }
    }
}
