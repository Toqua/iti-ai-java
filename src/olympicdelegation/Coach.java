package olympicdelegation;

import java.util.ArrayList;

public class Coach extends Person {

	private int coachID;
	private ArrayList<Player> players;

	public Coach(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public Coach(String name, String address, int coachID, ArrayList<Player> players) {
		super(name, address);
		this.coachID = coachID;
		this.players = players;
	}


	public int getCoachID() {
		return coachID;
	}

	public void setCoachID(int coachID) {
		this.coachID = coachID;
	}
	public void addPlayer(Player p){
		players.add(p);
	}

	
	
}
