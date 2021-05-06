package olympicdelegation;

import java.util.ArrayList;

public class Delegate {

	private String country;
	private ArrayList<Player> players;
	private ArrayList<Coach> coaches;

	public Delegate(String country, ArrayList<Player> players, ArrayList<Coach> coaches) {
		this.country = country;
		this.players = players;
		this.coaches = coaches;
	}
	public Delegate() { 
		this.country = new String();
		this.players = new ArrayList<Player>();
		this.coaches = new ArrayList<Coach>();
	}

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean addPlayer(Player p){
		return players.add(p);
	}

	public boolean addCoach(Coach c){
		return coaches.add(c);
	}
	
	public int getNumOfPlayers(){
		return players.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
