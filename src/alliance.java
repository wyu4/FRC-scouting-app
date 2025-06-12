public class alliance{
    public String allianceColor;
    private int qualNum;
    private int playoffRound;
    private team[] thisAlliance;
    private boolean winMatch;
    private int numPoints;
    private int numPenalties; 
    

    public alliance(){

    }

    public alliance(int q, int n, String a){
        qualNum = q;
        numPoints = n;
        allianceColor = a;
    }

}