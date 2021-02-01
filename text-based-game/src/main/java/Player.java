import java.awt.print.Book;

public class Player {
	
	private int healthpoints;
	private String name;
	private Boolean hasKey;

	public Player(int healthpoints, String name) {
		this.healthpoints = 100;
		this.name = name;
			
	}
	

	
	public void takedamage(int damage) {
		this.healthpoints -= damage;
		
		if (this.healthpoints <= 0) {
			System.out.printf("Spelet är över");
			
		} 
	}
	
	public void doAction() {
		
	}


	public void setHasKey(Boolean hasKey) {
		this.hasKey = hasKey;
	}

	public boolean getHasKey() {
		return this.hasKey;
	}

	public int gethealthpoints() {
		return healthpoints;
	}


	public String getName() {
		return name;
	}


}