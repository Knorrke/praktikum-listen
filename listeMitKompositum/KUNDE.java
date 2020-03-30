package listeMitKompositum;

/**
 * Ein Supermarktkunde
 */
class KUNDE implements DATENELEMENT
{
    String name;

    KUNDE(String newName) {
        name= newName;
    }

    String getName(){
        return name;
    }
    
    public int Vergleichen(DATENELEMENT vergleichsObjekt) {
        if (!(vergleichsObjekt instanceof KUNDE)) {
            return 0;
        }
        
        KUNDE andererKunde = (KUNDE) vergleichsObjekt;
        return name.compareToIgnoreCase(andererKunde.getName());
    }
    
    //ausgeben
    public String Ausgeben() {
        return ("Ich bin " + name + "\n");
    }
    
    void Beschweren() {
        System.out.println("Ich habe jetzt ewig warten müssen. Sowas Ärgerliches!");
    }
}
