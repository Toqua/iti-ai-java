package olympicdelegation;

import java.util.ArrayList;

public class Meadale {

	private int medalID;
	private ArrayList<Player> players;

	public Meadale(int medalID, ArrayList<Player> players) {
		this.medalID = medalID;
		this.players = players;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public int getMedalID() {
		return medalID;
	}

	public void setMedalID(int medalID) {
		this.medalID = medalID;
	}
	public void addPlayer(Player p){
		players.add(p);
	}
}
