package listeOhneKompositum;

/**
 * Knoten der rekursiven Listenstruktur ohne Kompositum,
 * hat 0 oder 1 Nachfolgerknoten und ein Datenelement.
 */
class KNOTEN
{
    KNOTEN nachfolger;
    DATENELEMENT daten;

    //Konstruktoren
    KNOTEN()
    {
        nachfolger = null;
        daten = null;
    }

    KNOTEN(KNOTEN neuerNachfolger, DATENELEMENT neueDaten)
    {
        nachfolger = neuerNachfolger;
        daten = neueDaten;
    }

    //Setter
    public void nachfolgerSetzen (KNOTEN neuerNachfolger)
    {
        nachfolger = neuerNachfolger;
        return;
    }

    public void datenSetzen (DATENELEMENT neueDaten)
    {
        daten = neueDaten;
        return;
    }

    //Getter
    public KNOTEN nachfolgerGeben()
    {
        return nachfolger;
    }

    public DATENELEMENT datenGeben()
    {
        return daten;
    }

    //anzahlGeben
    public int anzahlGeben() {
        if (nachfolger == null) {
            return 1;
        } else {
            return 1 + nachfolger.anzahlGeben();
        }
    }
    //amEndeEinfügen
<<<<<<< HEAD
    void amEndeEinfuegen(DATENELEMENT neueDaten){
        if(nachfolger == null){
            nachfolger = new KNOTEN(null, neueDaten);
        } else{
            nachfolger.amEndeEinfuegen(neueDaten);
        }
        
    }
    
    //letztesElementLöschen
=======
>>>>>>> 64cb6a8330e849e8be33ddd76d4dd2915c169dc0

    //letztesElementLöschen
    public KNOTEN letztesElementLöschen(){
        if(nachfolger==null){
            return null;
        }
        else{
            return nachfolger.letztesElementLöschen();
        }
    }
}
