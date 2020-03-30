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
    
    //amEndeEinfügen
    void amEndeEinfuegen(DATENELEMENT neueDaten){
        if(nachfolger == null){
            nachfolger = new KNOTEN(null, neueDaten);
        } else{
            nachfolger.amEndeEinfuegen(neueDaten);
        }
        
    }
    
    //letztesElementLöschen

}
