package olympicdelegation;

public class Player extends Person {

	private int playerID;
	private int numMedal;
	
	public Player(String name, String address, int playerID, int numMedal) {
		super(name, address);
		this.playerID = playerID;
		this.numMedal = numMedal;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getNumMedal() {
		return numMedal;
	}

	public void setNumMedal(int numMedal) {
		this.numMedal = numMedal;
	}
	
	public void addMedal(Meadale m){
		m.addPlayer(this);
		this.numMedal++;
	}
	public void assignTeam(Team t){
		t.addPlayer(this);
	}
	public void assignCoach(Coach c){
		c.addPlayer(this);
	}
}
