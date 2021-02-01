public class Door implements Interactable {

    private Boolean isOpen = false;

    public Door () {

    }

    @Override
    public void interact(Player player) {

    }

    @Override
    public String getName() {
        return null;
    }

    public void openDoor(Player player) {
        if (player.getHasKey()) {
            isOpen = true;
        }
        System.out.println("The door creaks when it opens");
    }
}
