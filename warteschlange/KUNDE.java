package warteschlange;

/**
 *  Die Kunden verwalten hier rekursiv eine Listenstruktur, 
 *  d.h. jeder Kunde hat eine Referenz auf seinen Nachfolger
 */
class KUNDE
{
    KUNDE nachfolger;
    String name;

    KUNDE(String newName) {
        name= newName;
    }

    //getter
    String getName(){
        return name;
    }

    KUNDE getNachfolger(){
        return nachfolger;
    }
    //setter
    void setNachfolger(KUNDE newNachfolger){
        nachfolger= newNachfolger;
    }

    void setName(String newName){
        name= newName;
    }
    //ausgeben
}
