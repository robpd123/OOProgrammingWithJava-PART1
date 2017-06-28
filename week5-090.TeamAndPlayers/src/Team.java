
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return this.name;
    }

    public int size() {
        return players.size();
       
    }
    
    public int goals(){
        int numGoals = 0;
        for (Player player: players){
            numGoals+=player.goals();
        }
        return numGoals;
    }

    public void addPlayer(Player newPlayer) {
        if (this.size() < this.maxSize) {
            this.players.add(newPlayer);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

}
