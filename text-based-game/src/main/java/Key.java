public class Key implements Interactable {
    private String name = "a key";
    private String description = "As you search around in the room, a sparkle blinds you, as you "
    		+ "investigate the light, you discover a key made out of pure silver and a skull for a bow. "
    		+ "Perhaps it can help you with unlocking something.";
	private Boolean hasKey;

    @Override
    public void interact(Player player) {
        System.out.println(description);
        player.setHasKey(true);
    }

	@Override
	public String getName() {
		return name;
	}
}
