package olympicdelegation;

import java.util.ArrayList;

public class Team {

	private int teamID;
	private ArrayList<Player> players;

	public Team(int teamID, ArrayList<Player> players) {
		this.teamID = teamID;
		this.players = players;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player p){
		players.add(p);
	}
	
}
