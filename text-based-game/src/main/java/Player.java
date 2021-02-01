public class Player {
	
	private int healthPoints;
	private String name;

	public Player(int healthPoints, String name) {
		this.healthPoints = 100;
		this.name = name;
			
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	

	public String getName() {
		return name;
	}
	
	public void takeDamage(int damage) {
		this.healthPoints -= damage;
		
		if (this.healthPoints <= 0) {
			System.out.printf("Spelet är över");
			
		} 
	}
	
	public void doAction() {
		
	}
}