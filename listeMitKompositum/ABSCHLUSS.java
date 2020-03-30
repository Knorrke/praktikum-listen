package listeMitKompositum;

/**
 * Bildet das Ende der Liste ab, um rekursive Methoden zu vereinfachen
 */
class ABSCHLUSS extends KNOTEN
{
    ABSCHLUSS()
    {
    }

    public DATENKNOTEN endeEinfügen(DATENELEMENT datenNeu){
        return new DATENKNOTEN (this, datenNeu);
    }

    public int anzahlGeben(){
        return 0;
    }
    
    public boolean istLeer(){
        return true;
    }

    public boolean suchen(DATENELEMENT datenDrin){
        return false; 
    }
    
     public DATENELEMENT datenGeben(){
        return null;
    }
    
    public KNOTEN nachfolgerGeben(){
        return this;
    }
    
    public DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT datenNeu) {
        return new DATENKNOTEN(this, datenNeu);
    }
}
