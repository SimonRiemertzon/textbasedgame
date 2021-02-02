public class Door implements Interactable {
    private Boolean isOpen = false;
    private String name = "a door";

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

    @Override
    public String getName() {
        return this.name;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void openDoor(Player player) {
        if (player.getHasKey()) {
            isOpen = true;
        }

        System.out.println("The door creaks when it opens");
    }
}

