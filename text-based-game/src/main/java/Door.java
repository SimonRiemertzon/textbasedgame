public class Door implements Interactable {
    private Boolean isOpen = false;
    private String name = "a door";

    /**
     * This function will take a player and interact with this "interactable-object" In case of door, it checks if the player has the key.
     * @param player
     */
    @Override
    public void interact(Player player) {
        if(player.getHasKey()) {
            System.out.println("You turn the key in the keyhole.");
            openDoor(player);
        } else {
            System.out.println("It's a really old door made out of murky dark wood. On the right side of the door, there is a handle in pure gold. \n " +
                    "The sparkling handle seems out of place in comparisson to the rest of the door. You try to turn it, but the door seems locked. \n " +
                    "Underneath the handle you spot a keyhole. ....*NÖFF*.... something... or someone seems to be on the other side");
        }
    }

    /**
     * Opening door if player has a key.
     * @param player
     */
    private void openDoor(Player player) {
        if (player.getHasKey()) {
            isOpen = true;
            System.out.println("The door creaks when it opens");
        } else {
            System.out.println("The door is locked, you probably need a key of some sort...");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean getIsOpen() {
        return isOpen;
    }


}
