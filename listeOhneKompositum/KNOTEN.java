package listeOhneKompositum;

/**
 * Knoten der rekursiven Listenstruktur ohne Kompositum,
 * hat 0 oder 1 Nachfolgerknoten und ein Datenelement.
 */
class KNOTEN
{
    KNOTEN nachfolger;
    DATENELEMENT daten;

    KNOTEN()
    {
        //todo
    }

    KNOTEN(KNOTEN neuerNachfolger, DATENELEMENT neueDaten)
    {
        //todo
    }

    //nachfolgerSetzen

    //nachfolgerGeben

    //datenSetzen

    //datenGeben
    
    //anzahlGeben
    public int anzahlGeben() {
        if (nachfolger == null) {
            return 1;
        } else {
            return 1 + nachfolger.anzahlGeben();
        }
    }
    
    //amEndeEinfügen
    
    //letztesElementLöschen

}
