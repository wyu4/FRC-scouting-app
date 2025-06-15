import java.util.ArrayList;

public class Dataholder {
    private ArrayList<team> ScoutedTeams = new ArrayList<>();

    public void addTeam(team teams){
        ScoutedTeams.add(teams);
    }

    public team getTeam(int index){
        return ScoutedTeams.get(index);
    }

    public int getTeamCount(){
        return ScoutedTeams.size();
    }

}
