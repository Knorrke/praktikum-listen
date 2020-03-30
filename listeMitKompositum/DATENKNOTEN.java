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

    public boolean istLeer(){
        return false;
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
<<<<<<< HEAD
<<<<<<< HEAD

    public String alleAusgeben(){
        return daten.toString.concat(nachfolger.alleAusgeben());
    }

    public DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT daten) {
        if (platz == 0) {
            return new DATENKNOTEN(this, daten);
        } else {
            nachfolger = nachfolger.anPlatzEinfügen(platz - 1, daten);
            return this;
        }

=======
    
    public DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT daten) {
        if (platz == 0) {
            return new DATENKNOTEN(this, daten);
        } else {
            nachfolger = nachfolger.anPlatzEinfügen(platz - 1, daten);
            return this;
        }
>>>>>>> e9c9ece7290d0375b06581a05d5ce2410df52305
=======

    public KNOTEN bestimmtesEntfernen(DATENELEMENT daten){
        if(this.daten==daten){
            return nachfolgerGeben();
        }
        else {
            nachfolger.bestimmtesEntfernen(daten);
            return this;
        }
    }

    public DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT daten) {
        if (platz == 0) {
            return new DATENKNOTEN(this, daten);
        } else {
            nachfolger = nachfolger.anPlatzEinfügen(platz - 1, daten);
            return this;
        }
>>>>>>> 4ac54799e329abcbbef1b301b1fadc9251c5afa6
    }
}
