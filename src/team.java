public class team extends alliance{
    private String teamNum;
    private String teamName;
    private String alliance;
    private boolean disabled = false;
    private int l1coral;
    private int l2coral;
    private int l3coral;
    private int l4coral;
    private int missedCoral;
    private int bargeAlgae;
    private int processorAlgae;
    private boolean deepClimb;
    private boolean shallowClimb;
    private boolean park;
    private int numMissedCoral;
    private int numMissedAlgae;
    private String qualNum;
    private String comments;

    
 

    public team (String t, String a){
        teamNum = t;
        alliance = a;
    }

    public team (String t, String tn, String a){
        this(t, "null");
        teamName = tn;
    }

     public team (String line){
        String[] seperateSection = line.split(",");
        teamName = seperateSection[0];
        qualNum = seperateSection[1];
        l1coral = Integer.parseInt(seperateSection[2]);
        l2coral = Integer.parseInt(seperateSection[3]);
        l3coral = Integer.parseInt(seperateSection[4]);
        l4coral = Integer.parseInt(seperateSection[5]);
        missedCoral = Integer.parseInt(seperateSection[6]); 
        bargeAlgae = Integer.parseInt(seperateSection[7]);
        processorAlgae = Integer.parseInt(seperateSection[8]);
        deepClimb = Boolean.parseBoolean(seperateSection[9]);
        shallowClimb = Boolean.parseBoolean(seperateSection[10]);
        park = Boolean.parseBoolean(seperateSection[11]);
        alliance = seperateSection[12];
        comments = seperateSection[13];
    } 

    public String getTeamNum(){
        return teamNum;
    }

    public String getTeamName(){
        return teamName;
    }

    public boolean getDeepClimb(){
        return deepClimb;
    }
    public boolean getShallowClimb(){
        return shallowClimb;
    }

    public boolean getpark(){
        return park;
    }

    public String getComments(){
        return comments;
    }

    public boolean getDisabled(){
        return disabled;
    }


    public int getCoral(int i){
        switch (i){
            case 1: 
                return l1coral;
            case 2:
                return l2coral;
            case 3:
                return l3coral;
            case 4:
                return l4coral;
            case 5:
                return missedCoral;
            default:
                return 0; 
        }
    }


    public void processorAlgae(){
        processorAlgae++;
    }

    public void bargeAlgae(){
        bargeAlgae++;
    }

    public void setTeamNum(String tn){
        teamNum = tn;
    }

    public void setTeamName(String tn){
        teamName = tn;
    }

    public void setAlliance(String a){
        alliance = a;
    }



    public void coral(int l){
        switch (l){
            case 1:
                l1coral++;
                break;
            
            case 2:
                l2coral++;
                break;
            
            case 3:
                l3coral++;
                break;

            case 4: 
                l4coral++;
                break;

            case 5:
                missedCoral++;
                break;
        }

    }

    public void endgame(int e){
        switch (e){
            case 1:
                deepClimb = true;
                break;
            case 2:
                shallowClimb = true;
                break;
            case 3:
                park = true;
                break;

            default:
                break;
        }
        
    }

    public void disable (){
        disabled = true;
    }

    public String getstats(){
        return "l1 : " + l1coral + "|| l2 : " + l2coral + "|| l3 : " + l3coral + "||l4" + l4coral;
    }

    public String toString(){
        return teamNum + ", " + qualNum + ", " +  l1coral + ", " + l2coral + ", " + l3coral + ", " + l4coral + ", " + missedCoral + ", " + bargeAlgae + ", " + processorAlgae + ", " + deepClimb + ", " + shallowClimb + ", " + park + ", " + alliance + ", " + comments; 
    }
}
