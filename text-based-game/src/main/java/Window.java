
public class Window implements Interactable {
	private String name = "a window";
	private String description = "You look out the window at a star-filled sky.";
	
	@Override
	public void interact(Player player) {
		System.out.println(description);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
