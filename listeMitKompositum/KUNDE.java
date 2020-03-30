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
    
    //ausgeben
    void Ausgeben() {
        System.out.println("Ich bin " + name);
    }
    
    void Beschweren() {
        System.out.println("Ich habe jetzt ewig warten müssen. Sowas Ärgerliches!");
    }
}
