public class Player {
	
	private int healthpoints;
	private String name;

	public Player(int healthpoints, String name) {
		this.healthpoints = 100;
		this.name = name;
			
	}
	
	public int gethealthpoints() {
		return healthpoints;
	}
	

	public String getName() {
		return name;
	}
	
	public void takedamage(int damage) {
		this.healthpoints -= damage;
		
		if (this.healthpoints <= 0) {
			System.out.printf("Spelet är över");
			
		} 
	}
	
	public void doAction() {
		
	}
}