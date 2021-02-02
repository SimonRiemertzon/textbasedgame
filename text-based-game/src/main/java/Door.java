public class Door implements Interactable {
    private Boolean isOpen = false;
    private String name = "a door";
    private String description = "An really old door made out of murky dark wood. On the right side of the door, there is a handle in pure gold. " +
            "The sparkling handle seems out of place in comparisson to the rest of the door.";

    @Override
    public void interact(Player player) {
        player.setHasKey(true);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void openDoor(Player player) {
        if (player.getHasKey()) {
            isOpen = true;
        }

        System.out.println("The door creaks when it opens");
    }
}
