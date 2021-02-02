public class Table implements Interactable {

    @Override
    public void interact(Player player) {
        if(!player.getHasKey()) {
            System.out.println("You stare at a empty table");
        } else {
            player.setHasKey(true);
            System.out.println("You see a sparkly golden key on the table. You pick this up and put it in your pocket. " +
                                "Ouuuuu! ^ o ^, apperently you have pockets in this game");
        }
    }

    @Override
    public String getName() {
        return "a table";
    }
}
