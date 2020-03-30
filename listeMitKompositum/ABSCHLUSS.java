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
        
        //TODO
        return 0;
    }
    
    public boolean suchen(DATENELEMENT datenDrin){
        //TODO
        return true; 
    }
    
    public DATENKNOTEN anPlatzEinfügen(int platz, DATENELEMENT datenNeu) {
        return new DATENKNOTEN(this, datenNeu);
    }
}
