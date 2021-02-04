
public class Window implements Interactable {
	private String name = "a window";
	private String description = "You look out the window at a star-filled sky.";
	/**
	 * This function will take a player and interact with this "interactable-object" In the case of this class (window),
	 * when interacting with the window the player will just get a description of what he can see, printed to the terminal.
	 * @param player
	 */
	@Override
	public void interact(Player player) {
		System.out.println(description);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
