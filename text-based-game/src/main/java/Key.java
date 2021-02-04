public class Key implements Interactable {
    private String name = "a key";
    private String description = "As you search around in the room, a sparkle blinds you, as you "
    		+ "investigate the light, you discover a key made out of pure silver and a skull for a bow. "
    		+ "Perhaps it can help you with unlocking something.";
	private Boolean hasKey;
    /**
     * This function will take a player and interact with this "interactable-object" In the case of this class (key),
     * when interacting with the key the player picks it up and will be able to use it on the door.
     * @param player
     */
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
