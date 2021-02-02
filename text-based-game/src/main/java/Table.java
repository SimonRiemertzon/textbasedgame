public class Table implements Interactable {

    @Override
    public void interact(Player player) {
        if(!player.getHasKey()) {
            Key key = new Key();
            key.interact(player);

        } else {
            System.out.println("You stare at a empty table");
        }
    }

    @Override
    public String getName() {
        return "a table";
    }
}
