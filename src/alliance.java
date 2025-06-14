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

    public alliance (String a, int p, int n, boolean w){
        allianceColor = a;
        numPoints = n;
        playoffRound = p;
        winMatch = w;
    }

    public int getNumPoints(){
        return numPoints;
    }

    public int getQualNum(){
        return qualNum;
    }

    public String getAllianceColor(){
        return allianceColor;
    }

    public void setQualNum(int s){
        s = qualNum;
    }

    




}